package com.equipomiguelyluis.organizador.views.recordatorio;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.equipomiguelyluis.organizador.R;

import com.equipomiguelyluis.organizador.models.Recordatorio;
import com.equipomiguelyluis.organizador.models.dummy.DummyContent;
import com.equipomiguelyluis.organizador.source.Source;
import com.equipomiguelyluis.organizador.source.views.RecordatorioView;

import java.util.ArrayList;
import java.util.List;


/**
 * A fragment representing a list of Items.
 */
public class RecordatorioFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public RecordatorioFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static RecordatorioFragment newInstance(int columnCount) {
        RecordatorioFragment fragment = new RecordatorioFragment();
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
        View view = inflater.inflate(R.layout.fragment_recordatorio_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            List<Recordatorio> list = new ArrayList<>();
            RecordatorioRecyclerViewAdapter recycler = new RecordatorioRecyclerViewAdapter(list);
            new  RecordatorioView().getAll(list1 -> {
                list.addAll(list1);
                recycler.notifyDataSetChanged();
            });
            recyclerView.setAdapter(recycler);
        }
        return view;
    }
}