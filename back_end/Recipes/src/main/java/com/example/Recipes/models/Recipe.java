package com.example.Recipes.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "instructions", columnDefinition = "TEXT")
    private String instructions;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "time")
    private int time;

    @Column(name = "likes")
    private int likes;

    @Column(name = "favourite")
    private boolean favourite;

    @JsonIgnoreProperties("recipes")
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            joinColumns = {@JoinColumn(
                    name = "recipe_id",
                    nullable = false,
                    updatable = false)},
            inverseJoinColumns = {@JoinColumn(
                    name = "ingredient_id",
                    nullable = false,
                    updatable = false)}
    )
    private List<Ingredient> ingredients;

    public Recipe(String name, String instructions, String image_url, int time, int likes) {
        this.name = name;
        this.instructions = instructions;
        this.image_url = image_url;
        this.time = time;
        this.likes = likes;
        this.favourite = false;
        this.ingredients = new ArrayList<>();
    }

    public Recipe() {
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getInstructions() {
        return this.instructions;
    }

    public String getImage_url() {
        return this.image_url;
    }

    public int getTime() {
        return this.time;
    }

    public int getLikes() {
        return likes;
    }

    public boolean isFavourite() {
        return this.favourite;
    }

    public List<Ingredient> getIngredients() {
        return this.ingredients;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

}
