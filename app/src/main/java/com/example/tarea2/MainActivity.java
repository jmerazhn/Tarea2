package com.example.tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView txtNombre, txtApellido, txtEdad, txtCorreo;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNombre = findViewById(R.id.txtName);
        txtApellido = findViewById(R.id.txtLastName);
        txtEdad = findViewById(R.id.txtEdad);
        txtCorreo = findViewById(R.id.txtEmail);
        btnEnviar = findViewById(R.id.btnSend);




        btnEnviar.setOnClickListener(new View.OnClickListener() {

            ArrayList<String> lista = new ArrayList<String>();

            @Override
            public void onClick(View v) {
                lista.add(""+txtNombre.getText().toString());
                lista.add(""+txtApellido.getText().toString());
                lista.add(""+txtEdad.getText().toString());
                lista.add(""+txtCorreo.getText().toString());

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("datos", lista);
                startActivity(intent);
            }
        });
    }
}