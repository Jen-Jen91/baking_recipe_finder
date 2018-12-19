package com.example.Recipes.repositories.RecipeRepository;

import com.example.Recipes.models.Recipe;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class RecipeRepositoryImpl implements RecipeRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Recipe> getRecipeWithName(String name) {
        List<Recipe> results = null;

        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Recipe.class);
            cr.add(Restrictions.eq("name", name));
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return results;
    }

}
