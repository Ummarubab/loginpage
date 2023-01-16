package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtView=findViewById(R.id.txtregisternow);

        Intent i=new Intent(this,Activity2.class);


        txtView.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
startActivity(i);
                                       }
                                   }
        );
    }
}