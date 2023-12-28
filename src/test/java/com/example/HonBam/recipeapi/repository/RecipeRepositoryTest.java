package com.example.HonBam.recipeapi.repository;

import com.example.HonBam.recipeapi.entity.Recipe;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback(false)
class RecipeRepositoryTest {

    @Autowired
    RecipeRepository recipeRepository;

    @Test
    @DisplayName("Recipe List")
    void testFindAll() {
        //given

        //when
        List<Recipe> recipes = recipeRepository.findAll();
        //then
        recipes.forEach(System.out::println);
        System.out.println("recipes = " + recipes);
    }

}