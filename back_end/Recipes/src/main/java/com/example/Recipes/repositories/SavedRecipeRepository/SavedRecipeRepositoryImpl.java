package com.example.Recipes.repositories.SavedRecipeRepository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class SavedRecipeRepositoryImpl implements SavedRecipeRepositoryCustom {

    @Autowired
    EntityManager entityManager;

}
