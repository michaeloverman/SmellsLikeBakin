package com.overman.smellslikebakin;

/**
 * Created by Michael on 4/19/2016.
 */
public class GridAdapter extends RecycleAdapter {
    private final GridFragment.OnRecipeSelectedInterface mListener;

    public GridAdapter(GridFragment.OnRecipeSelectedInterface listener) {
        mListener = listener;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.grid_item;
    }

    @Override
    protected void onRecipeSelected(int index) {
        mListener.onGridRecipeSelected(index);
    }
}