package com.app.flyapp;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class getFlightDataFromApi extends AsyncTask<Void, Void, List<Flights>> {

    @Override
    protected List<Flights> doInBackground(Void... voids) {
        List<Flights> flightList = new ArrayList<>();

        try {
            Log.i("respuestaAPI","SI ENTRO");
            URL url = new URL("https://recruiting-api.newshore.es/api/flights/2");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }

            Gson gson = new Gson();
            FlightsResponse flightsResponse = gson.fromJson(stringBuilder.toString(), FlightsResponse.class);
            flightList = flightsResponse.getFlights();


        } catch (Exception e) {
            e.printStackTrace();
            Log.i("errorAPI","texto"+e);
        }

        return flightList;
    }
}
