package com.example.Recipes.repositories.IngredientRepository;

import com.example.Recipes.models.Ingredient;
import com.example.Recipes.projections.IngredientProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = IngredientProjection.class)
public interface IngredientRepository extends JpaRepository<Ingredient, Long>, IngredientRepositoryCustom {
}
