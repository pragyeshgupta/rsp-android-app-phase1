package com.example.anchit.rsp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.os.AsyncTask;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class BlastFurnace5 extends AppCompatActivity {

    public static TextView slno;
    public static TextView charges;
    public static TextView cast;
    public static TextView hb_volume;
    public static TextView hb_temp;
    public static TextView hb_pres;
    public static TextView cb_vol;
    public static TextView error;


//    public static TextView textViewBF5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blast_furnace5);

        slno = findViewById(R.id.tvslno);
        charges = findViewById(R.id.tvcharges);
        cast = findViewById(R.id.tvcast);
        hb_volume = findViewById(R.id.tvhb_volume);
        hb_temp = findViewById(R.id.tvhb_temp);
        hb_pres = findViewById(R.id.tvhb_pres);
        cb_vol = findViewById(R.id.tvcb_vol);
        error = findViewById(R.id.tverror);
        FetchJson process = new FetchJson();
        process.execute();
    }
}
