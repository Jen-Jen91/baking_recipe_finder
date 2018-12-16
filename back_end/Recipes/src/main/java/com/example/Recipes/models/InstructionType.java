package com.example.Recipes.models;

public enum InstructionType {

    FLOURLESS_CHOC_CAKE("Make cake"),
    NUTELLA_BROWNIE("Make brownie"),
    PEANUT_BUTTER_COOKIES("Make cookies"),
    BASIC_MUFFINS("Make muffins"),
    VICTORIA_SANDWICH("Make sandwich"),
    BANANA_LOAF("Make loaf");

    private final String value;

    InstructionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
