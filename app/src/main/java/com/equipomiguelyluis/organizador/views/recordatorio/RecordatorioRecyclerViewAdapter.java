package com.equipomiguelyluis.organizador.views.recordatorio;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.equipomiguelyluis.organizador.models.Recordatorio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import com.equipomiguelyluis.organizador.R;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Recordatorio}.
 * TODO: Replace the implementation with code for your data type.
 */
public class RecordatorioRecyclerViewAdapter extends RecyclerView.Adapter<RecordatorioRecyclerViewAdapter.ViewHolder> {

    private final List<Recordatorio> mValues;
    private final DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");


    public RecordatorioRecyclerViewAdapter(List<Recordatorio> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_recordatorio, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mContenidoView.setText(mValues.get(position).contenido);
        holder.mFechaView.setText(dateFormat.format(mValues.get(position).fecha));
        holder.mCategoriaView.setText(mValues.get(position).classificacion.nombre);
        holder.mCheckbox.setActivated(mValues.get(position).revisada);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final CheckBox mCheckbox;
        public final TextView mContenidoView;
        public final TextView mFechaView;
        public final TextView mCategoriaView;
        public Recordatorio mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mCheckbox = (CheckBox) view.findViewById(R.id.checkbox);
            mContenidoView = (TextView) view.findViewById(R.id.label);
            mFechaView = (TextView) view.findViewById(R.id.time);
            mCategoriaView = (TextView) view.findViewById(R.id.category);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContenidoView.getText() + "'";
        }
    }
}