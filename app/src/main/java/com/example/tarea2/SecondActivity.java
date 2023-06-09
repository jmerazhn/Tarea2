package com.example.tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    TextView txt1, txt2, txt3, txt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txt1 = findViewById(R.id.editTextText);
        txt2 = findViewById(R.id.editTextText2);
        txt3 = findViewById(R.id.editTextText3);
        txt4 = findViewById(R.id.editTextText4);

        Bundle datos=this.getIntent().getExtras();


        if (datos != null){
            ArrayList<String> data = new ArrayList<String>();
            data=datos.getStringArrayList("datos");
            txt1.setText(data.get(0));
            txt2.setText(data.get(1));
            txt3.setText(data.get(2));
            txt4.setText(data.get(3));
        }
    }
}