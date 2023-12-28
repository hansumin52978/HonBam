package com.example.HonBam.recipeapi.repository;

import com.example.HonBam.recipeapi.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

}
