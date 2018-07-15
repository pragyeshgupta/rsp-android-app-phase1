package com.example.anchit.rsp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnBF5 = (Button) findViewById(R.id.buttonBF5);
        Button btnHSM = (Button) findViewById(R.id.buttonHSM);
        Button btn3 = (Button) findViewById(R.id.button4);
        Button btn4 = (Button) findViewById(R.id.button5);
        Button btn5 = (Button) findViewById(R.id.button6);
        Button btn6 = (Button) findViewById(R.id.button7);
        Button btn7 = (Button) findViewById(R.id.button8);
        Button btn8 = (Button) findViewById(R.id.button9);
        Button btn9 = (Button) findViewById(R.id.button10);
        Button btn10 = (Button) findViewById(R.id.button11);
        Button btn11 = (Button) findViewById(R.id.button12);
        Button btn12 = (Button) findViewById(R.id.button13);

        btnBF5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // FetchJson process = new FetchJson();
                //process.execute();
                Intent intent = new Intent(MainActivity.this,BlastFurnace5.class);
                startActivity(intent);

            }
        });

        btnHSM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
