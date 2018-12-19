package com.example.Recipes.repositories.SavedRecipeRepository;

import com.example.Recipes.models.SavedRecipe;
import com.example.Recipes.projections.SavedRecipeProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = SavedRecipeProjection.class)
public interface SavedRecipeRepository extends JpaRepository<SavedRecipe, Long>, SavedRecipeRepositoryCustom{
}
