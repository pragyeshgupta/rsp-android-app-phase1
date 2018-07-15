package com.example.anchit.rsp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private TextView textView;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.etName);
        password = findViewById(R.id.etPass);
        textView = findViewById(R.id.textView);
        Login = findViewById(R.id.button);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Validate(username.getText().toString(),password.getText().toString());
            }
        });
    }


    private void  Validate(String userName,String userPassword){

        if(userName.equals("admin") && userPassword.equals("1234")){
            textView.setText("");
            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intent);
        }
        else {
            textView.setText("Incorrect Username or Password");
        }
    }
}
