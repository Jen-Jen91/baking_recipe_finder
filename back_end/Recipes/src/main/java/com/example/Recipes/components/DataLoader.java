package com.example.Recipes.components;

import com.example.Recipes.models.Ingredient;
import com.example.Recipes.models.Recipe;
import com.example.Recipes.repositories.IngredientRepository.IngredientRepository;
import com.example.Recipes.repositories.RecipeRepository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    IngredientRepository ingredientRepository;

    @Autowired
    RecipeRepository recipeRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Ingredient nutella = new Ingredient("nutella");
        ingredientRepository.save(nutella);

        Ingredient sRFlour = new Ingredient("self-raising flour");
        ingredientRepository.save(sRFlour);

        Ingredient egg = new Ingredient("egg");
        ingredientRepository.save(egg);

        Ingredient casterSugar = new Ingredient("caster sugar");
        ingredientRepository.save(casterSugar);

        Ingredient goldenCasterSugar = new Ingredient("golden caster sugar");
        ingredientRepository.save(goldenCasterSugar);

        Ingredient icingSugar = new Ingredient("icing sugar");
        ingredientRepository.save(icingSugar);

        Ingredient peanutButter = new Ingredient("peanut butter");
        ingredientRepository.save(peanutButter);

        Ingredient unsaltedButter = new Ingredient("unsalted butter");
        ingredientRepository.save(unsaltedButter);

        Ingredient darkChocolate = new Ingredient("dark chocolate");
        ingredientRepository.save(darkChocolate);

        Ingredient vegOil = new Ingredient("vegetable oil");
        ingredientRepository.save(vegOil);

        Ingredient milk = new Ingredient("milk");
        ingredientRepository.save(milk);

        Ingredient salt = new Ingredient("salt");
        ingredientRepository.save(salt);

        Ingredient bakingPowder = new Ingredient("baking powder");
        ingredientRepository.save(bakingPowder);

        Ingredient vanilla = new Ingredient("vanilla essence");
        ingredientRepository.save(vanilla);

        Ingredient strawJam = new Ingredient("strawberry jam");
        ingredientRepository.save(strawJam);

        Ingredient banana = new Ingredient("banana");
        ingredientRepository.save(banana);

        Recipe recipe1 = new Recipe("Flourless Chocolate Cake", "8 large eggs, cold: 1 lb. dark, semisweet or bittersweet chocolate, coarsely chopped: 16 Tbsp. (2 sticks) unsalted butter, cut into 16 pieces: optional toppings: powdered sugar and/or berries + Adjust an oven rack to the lower-middle position and heat the oven to 325°F.: Line the bottom of an 8-inch springform pan with parchment paper or waxed paper and grease the sides of the pan. (Be sure to grease the sides really well!) Wrap the outside of the pan with 2 sheets of heavy-duty aluminum foil and set it in a large roasting pan, or any pan that’s larger than the springform.: Bring a kettle or pot of water to boil.: In a stand mixer using the whisk attachment, beat the eggs at high speed until the volume doubles. This usually takes about 5 minutes.: Meanwhile, melt the chocolate and butter together. You can either do this in a double boiler on the stove (by placing the chocolate and butter in a large heatproof bowl, set over a pan of almost-simmering water, and stirring until melted and smooth). Or you can do this in the microwave (by heating the chocolate and butter in a microwave-safe bowl in 30-second intervals, stirring in between, until the chocolate and butter are melted and smooth).: Then fold about a third of the beaten eggs into the chocolate mixture using a large rubber spatula until only a few streaks of egg are visible.: Fold in half of the remaining egg foam, and then the last half of the foam, until the mixture is totally homogenous.: Scrape the batter into the prepared springform pan and smooth the surface with a rubber spatula. Place the roasting pan on the oven rack and VERY carefully pour in enough boiling water to come about halfway up the sides of the springform pan.: Bake until the cake has risen slightly, the edges are just beginning to set, a thin-glazed crust (like a brownie) has formed on the surface, and an instant-read thermometer inserted halfway into the center reads 140° F, 22-25 minutes.: Remove the springform pan from the water bath and set on a wire rack; cool to room temperature. Cover and refrigerate until cool. (The cake can be refrigerated for up to 4 days.): About 30 minutes prior to serving, carefully remove the sides of the springform pan, invert the cake onto a sheet of waxed paper, peel off the parchment paper, and reinvert the cake onto a serving platter.: If desired, lightly dust the cake with powdered sugar and top with berries. To slice, use a sharp, thin-bladed knife, dipping the knife into a pitcher of hot water and wiping the blade before each cut.", "https://www.gimmesomeoven.com/wp-content/uploads/2011/03/slice-of-flourless-chocolate-cake2.jpg", 40, 0);
        recipeRepository.save(recipe1);

        Recipe recipe2 = new Recipe("Nutella Brownie", "1 1/4 cup Nutella: 2 large eggs: 1/2 cup all purpose flour + Preheat oven to 350°F.: Grease a 9 inch x 9 inch metal baking pan.: Add all ingredients into a large bowl and mix until batter is smooth.: Pour into baking pan and smooth top with spatula.: Bake for about 15 minutes until toothpick inserted comes out clean. Be careful not to bake too long otherwise brownies will dry out.: Let brownies cool and set before cutting and serving.", "https://lh3.googleusercontent.com/-U0npKrmjYEg/VXzc_ZiCs-I/AAAAAAAFEg8/avq3Sy1mYBU/s800/3-ingredient-nutella-brownies-5.jpg", 30, 0);
        recipeRepository.save(recipe2);

        Recipe recipe3 = new Recipe("Peanut Butter Cookies", "200g peanut butter (crunchy or smooth is fine): 175g golden caster sugar: ¼ tsp fine table salt: 1 large egg + Heat oven to 180C/160C fan/gas 4 and line 2 large baking trays with baking parchment.: Measure the peanut butter and sugar into a bowl. Add ¼ tsp fine table salt and mix well with a wooden spoon. Add the egg and mix again until the mixture forms a dough.: Break off cherry tomato sized chunks of dough and place, well spaced apart, on the trays. Press the cookies down with the back of a fork to squash them a little. The cookies can now be frozen for 2 months, cook from frozen adding an extra min or 2 to the cooking time.: Bake for 12 mins, until golden around the edges and paler in the centre. Cool on the trays for 10 mins, then transfer to a wire rack and cool completely. Store in a cookie jar for up to 3 days.", "https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/user-collections/my-colelction-image/2015/12/peanut-butter-cookies.jpg?itok=xVHkYr59", 25, 0);
        recipeRepository.save(recipe3);

        Recipe recipe4 = new Recipe("Basic Muffins", "2 medium eggs: 125ml vegetable oil: 250ml semi-skimmed milk: 250g golden caster sugar: 400g self-raising flour (or same quantity plain flour and 3 tsp baking powder): 1 tsp salt: 100g chocolate chips or dried fruit such as sultanas or dried cherries (optional) + Heat oven to 200C/180C fan/gas 6.: Line 2 muffin trays with paper muffin cases.: In a large bowl beat 2 medium eggs lightly with a handheld electric mixer for 1 min.: Add 125ml vegetable oil and 250ml semi-skimmed milk and beat until just combined then add 250g golden caster sugar and whisk until you have a smooth batter.: Sift in 400g self-raising flour and 1 tsp salt (or 400g plain flour and 3 tsp baking powder if using) then mix until just smooth. Be careful not to over-mix the batter as this will make the muffins tough.: Stir in 100g chocolate chips or dried fruit if using.: Fill muffin cases two-thirds full and bake for 20-25 mins, until risen, firm to the touch and a skewer inserted in the middle comes out clean. If the trays will not fit on 1 shelf, swap the shelves around after 15 mins of cooking.: Leave the muffins in the tin to cool for a few mins and transfer to a wire rack to cool completely.", "https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/user-collections/my-colelction-image/2015/12/basic-muffin-recipe.jpg?itok=cEroC3pE", 55, 0);
        recipeRepository.save(recipe4);

        Recipe recipe5 = new Recipe("Classic Victoria Sandwich", "200g caster sugar: 200g softened butter: 4 eggs (beaten): 200g self-raising flour: 1 tsp baking powder: 2 tbsp milk: For the filling: 100g butter (softened): 140g icing sugar (sifted): 1 drop vanilla extract (optional): half a 340g jar good-quality strawberry jam (we used Tiptree Little Scarlet): icing sugar, to decorate + Heat oven to 190C/fan 170C/gas 5.: Butter two 20cm sandwich tins and line with non-stick baking paper.: In a large bowl, beat 200g caster sugar, 200g softened butter, 4 beaten eggs, 200g self-raising flour, 1 tsp baking powder and 2 tbsp milk together until you have a smooth, soft batter.: Divide the mixture between the tins, smooth the surface with a spatula or the back of a spoon.: Bake for about 20 mins until golden and the cake springs back when pressed.: Turn onto a cooling rack and leave to cool completely.: To make the filling, beat the 100g softened butter until smooth and creamy, then gradually beat in 140g sifted icing sugar and a drop of vanilla extract (if you’re using it).: Spread the buttercream over the bottom of one of the sponges.: Top it with 170g strawberry jam and sandwich the second sponge on top.: Dust with a little icing sugar before serving.: Keep in an airtight container and eat within 2 days.", "https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/recipe_images/recipe-image-legacy-id--1001468_10.jpg?itok=A_ULoxzJ", 40, 0);
        recipeRepository.save(recipe5);

        Recipe recipe6 = new Recipe("Banana Loaf", "140g butter, softened, plus extra for the tin: 140g caster sugar: 2 large eggs, beaten: 140g self-raising flour: 1 tsp baking powder: 2 very ripe bananas, mashed: 50g icing sugar: handful dried banana chips, for decoration + Heat oven to 180C/160C fan/gas 4.: Butter a 2lb loaf tin and line the base and sides with baking parchment.: Cream 140g softened butter and 140g caster sugar until light and fluffy, then slowly add 2 beaten large eggs with a little of the 140g flour.: Fold in the remaining flour, 1 tsp baking powder and 2 mashed bananas.: Pour into the tin and bake for about 30 mins until a skewer comes out clean.: Cool in the tin for 10 mins, then remove to a wire rack.: Mix 50g icing sugar with 2-3 tsp water to make a runny icing.: Drizzle the icing across the top of the cake and decorate with a handful of banana chips.", "https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/recipe_images/recipe-image-legacy-id--1273522_8.jpg?itok=P8cLT0gJ", 55, 0);
        recipeRepository.save(recipe6);

        recipe1.addIngredient(egg);
        recipe1.addIngredient(darkChocolate);
        recipe1.addIngredient(unsaltedButter);
        recipeRepository.save(recipe1);

        recipe2.addIngredient(egg);
        recipe2.addIngredient(nutella);
        recipe2.addIngredient(sRFlour);
        recipeRepository.save(recipe2);

        recipe3.addIngredient(egg);
        recipe3.addIngredient(goldenCasterSugar);
        recipe3.addIngredient(peanutButter);
        recipe3.addIngredient(salt);
        recipeRepository.save(recipe3);

        recipe4.addIngredient(egg);
        recipe4.addIngredient(vegOil);
        recipe4.addIngredient(milk);
        recipe4.addIngredient(goldenCasterSugar);
        recipe4.addIngredient(sRFlour);
        recipe4.addIngredient(salt);
        recipeRepository.save(recipe4);

        recipe5.addIngredient(casterSugar);
        recipe5.addIngredient(unsaltedButter);
        recipe5.addIngredient(egg);
        recipe5.addIngredient(sRFlour);
        recipe5.addIngredient(bakingPowder);
        recipe5.addIngredient(milk);
        recipe5.addIngredient(icingSugar);
        recipe5.addIngredient(vanilla);
        recipe5.addIngredient(strawJam);
        recipeRepository.save(recipe5);

        recipe6.addIngredient(unsaltedButter);
        recipe6.addIngredient(casterSugar);
        recipe6.addIngredient(egg);
        recipe6.addIngredient(sRFlour);
        recipe6.addIngredient(bakingPowder);
        recipe6.addIngredient(banana);
        recipe6.addIngredient(icingSugar);
        recipeRepository.save(recipe6);

    }

}
