package com.example.Recipes.repositories.IngredientRepository;

import com.example.Recipes.models.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long>, IngredientRepositoryCustom {
}
