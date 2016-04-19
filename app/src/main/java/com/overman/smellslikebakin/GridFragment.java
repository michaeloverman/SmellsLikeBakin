package com.overman.smellslikebakin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Michael on 4/19/2016.
 */
public class GridFragment extends Fragment {

    public interface OnRecipeSelectedInterface {
        void onGridRecipeSelected(int index);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        OnRecipeSelectedInterface listener = (OnRecipeSelectedInterface) getActivity();

        View view = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.RecyclerView);
        GridAdapter gridAdapter = new GridAdapter(listener);
        recyclerView.setAdapter(gridAdapter);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(), numColumns);
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }
}
