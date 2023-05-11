package com.app.flyapp;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FligthAdapter extends RecyclerView.Adapter<FligthAdapter.ViewHolder>{
    private List<Flights> flithgs;
    private LayoutInflater myInflater;
    private Context myContext;

    public FligthAdapter(List<Flights> flithgs, Context context) {
        this.flithgs = flithgs;
        this.myInflater = LayoutInflater.from(context);
        this.myContext = context;
    }

    @NonNull
    @Override
    public FligthAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = myInflater.inflate(R.layout.fligith_list, null);
        return new ViewHolder(vista, myContext);
    }

    @Override
    public void onBindViewHolder(@NonNull FligthAdapter.ViewHolder holder, int position) {
        holder.bindData(flithgs.get(position));
    }

    @Override
    public int getItemCount() {
        return flithgs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView departureStation, arrivalStation;
        Context context;

        public ViewHolder(@NonNull View itemView, Context context) {
            super(itemView);
            departureStation = itemView.findViewById(R.id.departureTextView);
            arrivalStation = itemView.findViewById(R.id.arrivalTextView);
            this.context = context;

            // Agrega el onClickListener al itemView
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        // Obtiene el objeto ListElements de la posición en la que se hizo clic
                        Flights clickedItem = flithgs.get(position);

                        // Iniciar la actividad de visualización de correo electrónico y pasar los datos
                        Intent intent = new Intent(context, viewFligths.class);
                        intent.putExtra("departureTextView", clickedItem.getDepartureStation());
                        intent.putExtra("arrivalTextView", clickedItem.getArrivalStation());
                        intent.putExtra("flightCarrier", clickedItem.getFlightCarrier());
                        intent.putExtra("flightNumber", clickedItem.getFlightNumber());
                        intent.putExtra("arrivalTextView", clickedItem.getprice());
                        context.startActivity(intent);
                    }
                }
            });
        }

        void bindData(final Flights item){
            departureStation.setText(item.getDepartureStation());
            arrivalStation.setText(item.getArrivalStation());
        }
    }
}

