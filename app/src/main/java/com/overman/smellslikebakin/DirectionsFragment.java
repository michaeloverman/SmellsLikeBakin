package com.overman.smellslikebakin;

/**
 * Created by Michael on 4/16/2016.
 */
public class DirectionsFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.directions[index].split("`");
    }
}
