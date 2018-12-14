package com.example.Recipes.repositories.IngredientRepository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class IngredientRepositoryImpl implements IngredientRepositoryCustom {

    @Autowired
    EntityManager entityManager;

}
