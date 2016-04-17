package com.overman.smellslikebakin;

/**
 * Created by Michael on 4/16/2016.
 */
public class IngredientsFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.ingredients[index].split("`");
    }
}
