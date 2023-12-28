package com.example.HonBam.userapi.dto.response;

import com.example.HonBam.userapi.entity.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.time.LocalDateTime;

@Setter @Getter
@ToString
public class NaverUserDTO {

    private long id;

    @JsonProperty("connected_at")
    private LocalDateTime connectedAt;

    @JsonProperty("naver_account")
    private naverAccount naverAccount;

    @Setter @Getter @ToString
    public static class naverAccount {

        private String email;
        private Profile profile;

        @Getter @Setter @ToString
        public static class Profile {
            private String nickname;

            @JsonProperty("profile_image_url")
            private String profileImageUrl;
        }

    }


    public User toEntity(String accessToken) {
        return User.builder()
                .email(this.naverAccount.email)
                .userName(this.naverAccount.profile.nickname)
                .password("password!")
                .profileImg(this.naverAccount.profile.profileImageUrl)
                .accessToken(accessToken)
                .build();
    }



}