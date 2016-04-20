package com.overman.smellslikebakin;

/**
 * Created by Michael on 4/10/2016.
 */
public class ListAdapter extends RecycleAdapter {
    private final ListFragment.OnRecipeSelectedInterface mListener;

    public ListAdapter(ListFragment.OnRecipeSelectedInterface listener) {
        mListener = listener;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.list_item;
    }

    @Override
    protected void onRecipeSelected(int index) {
        mListener.onListRecipeSelected(index);
    }
}
