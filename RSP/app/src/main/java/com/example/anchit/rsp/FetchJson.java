package com.example.anchit.rsp;

import android.os.AsyncTask;

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

public class FetchJson extends AsyncTask<Void,Void,Void> {
    String data="";
    String dataParsed="";

    //variables for Blast Furnace 5
    String slno="";
    String charges="";
    String cast="";
    String hb_volume="";
    String hb_temp="";
    String hb_pres="";
    String cb_vol="";
    String error="";

    @Override
    protected Void doInBackground(Void... voids) {


        URL url= null;
        try {
            url = new URL("https://api.myjson.com/bins/swzmu");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line="";
            while(line!=null){
                line = bufferedReader.readLine();
                data = data + line;

            }

            JSONObject JO = new JSONObject(data);//parsing the whole JSON object string
            JSONObject bf5 = JO.getJSONObject("bf5_data"); //parsing the bf5_data in a group of others

            slno = (String) bf5.get("slno");
            charges = (String) bf5.get("charges");
            cast = (String) bf5.get("cast");
            hb_volume = (String) bf5.get("hb_volume");
            hb_temp = (String) bf5.get("hb_temp");
            hb_pres = (String) bf5.get("hb_pres");
            cb_vol = (String ) bf5.get("cb_vol");
            error = (String) bf5.get("error");
//           dataParsed = dataParsed+ slno + charges +cast +hb_volume +hb_temp+ hb_pres+ cb_vol + error;


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid){
        super.onPostExecute(aVoid);

        BlastFurnace5.slno.setText(this.slno);
        BlastFurnace5.charges.setText(this.charges);
        BlastFurnace5.cast.setText(this.cast);
        BlastFurnace5.hb_volume.setText(this.hb_volume);
        BlastFurnace5.hb_temp.setText(this.hb_temp);
        BlastFurnace5.hb_pres.setText(this.hb_pres);
        BlastFurnace5.cb_vol.setText(this.cb_vol);
        BlastFurnace5.error.setText(this.error);
    }
}
