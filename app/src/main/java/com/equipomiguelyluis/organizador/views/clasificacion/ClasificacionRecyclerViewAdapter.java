package com.equipomiguelyluis.organizador.views.clasificacion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.equipomiguelyluis.organizador.R;
import com.equipomiguelyluis.organizador.models.Classificacion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Classificacion}.
 * TODO: Replace the implementation with code for your data type.
 */
public class ClasificacionRecyclerViewAdapter extends RecyclerView.Adapter<ClasificacionRecyclerViewAdapter.ViewHolder> {

    private final List<Classificacion> mValues;


    public ClasificacionRecyclerViewAdapter(List<Classificacion> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_clasificacion, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mContenidoView.setText(mValues.get(position).nombre);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mContenidoView;
        public Classificacion mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mContenidoView = (TextView) view.findViewById(R.id.label_clasificacion);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContenidoView.getText() + "'";
        }
    }
}