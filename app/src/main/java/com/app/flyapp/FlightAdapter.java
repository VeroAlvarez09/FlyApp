package com.app.flyapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FlightAdapter extends RecyclerView.Adapter<FlightAdapter.ViewHolder>{
    private List<Flights> misDatos;
    private LayoutInflater myInflater;
    private Context myContext;

    public FlightAdapter(List<Flights> itemList, Context context) {
        this.misDatos = itemList;
        this.myInflater = LayoutInflater.from(context);
        this.myContext = context;
    }

    @NonNull
    @Override
    public FlightAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = myInflater.inflate(R.layout.fligith_list, null);
        return new ViewHolder(vista, myContext);
    }

    @Override
    public void onBindViewHolder(@NonNull FlightAdapter.ViewHolder holder, int position) {
        holder.bindData(misDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return misDatos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView departureStation, arrivalStation;
        Context context;

        public ViewHolder(View itemView, Context context) {
            super(itemView);
            departureStation = itemView.findViewById(R.id.departureTextView);
            arrivalStation = itemView.findViewById(R.id.arrivalTextView);
            this.context = context;
        }

        void bindData(final Flights item){
            departureStation.setText(item.getDepartureStation());
            arrivalStation.setText(item.getArrivalStation());
        }

    }
}

