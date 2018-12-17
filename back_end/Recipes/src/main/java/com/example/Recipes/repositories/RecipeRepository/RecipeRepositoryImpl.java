package com.example.Recipes.repositories.RecipeRepository;

import com.example.Recipes.models.Recipe;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class RecipeRepositoryImpl implements RecipeRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    

}
