package com.equipomiguelyluis.organizador.views.clasificacion;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.equipomiguelyluis.organizador.R;
import com.equipomiguelyluis.organizador.models.Classificacion;
import com.equipomiguelyluis.organizador.models.dummy.DummyContent;
import com.equipomiguelyluis.organizador.source.Source;
import com.equipomiguelyluis.organizador.source.views.ClasificacionView;

import java.util.ArrayList;
import java.util.List;


/**
 * A fragment representing a list of Items.
 */
public class ClasificacionFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ClasificacionFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static ClasificacionFragment newInstance(int columnCount) {
        ClasificacionFragment fragment = new ClasificacionFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_clasificacion_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            List<Classificacion> list = new ArrayList<>();
            ClasificacionRecyclerViewAdapter recycler = new ClasificacionRecyclerViewAdapter(list);
            new ClasificacionView().getAll(new com.equipomiguelyluis.organizador.source.views.View.getListCallback() {
                @Override
                public void onGetList(List list) {
                    list.addAll(list);
                    System.out.println(list.size());
                    recycler.notifyDataSetChanged();
                }
            });
            recyclerView.setAdapter(recycler);
        }
        return view;
    }
}