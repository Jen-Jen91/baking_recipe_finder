package com.example.Recipes.projections;

import com.example.Recipes.models.Ingredient;
import com.example.Recipes.models.Recipe;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedAllIngredient", types = Ingredient.class)
public interface IngredientProjection {
    Long getId();
    String getName();
    List<Recipe> getRecipes();
}
