package com.example.Recipes.repositories.RecipeRepository;

import com.example.Recipes.models.Recipe;
import com.example.Recipes.projections.RecipeProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = RecipeProjection.class)
public interface RecipeRepository extends JpaRepository<Recipe, Long>, RecipeRepositoryCustom {
    List<Recipe> getRecipeWithName(String name);
}
