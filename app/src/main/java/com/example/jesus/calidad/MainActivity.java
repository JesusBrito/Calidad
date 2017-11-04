package com.example.jesus.calidad;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import java.net.URL;

public class MainActivity extends AppCompatActivity {
    Button btnAceptar;
    Button btnRechazar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAceptar=(Button)findViewById(R.id.btnMCAceptar);
        btnRechazar=(Button)findViewById(R.id.btnMCRechazar);

        btnAceptar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        aceptar();
                    }
                }
        );

        btnRechazar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        rechazar();
                    }
                }
        );
    }

    public void aceptar(){
        final Toast toastA = Toast.makeText(getApplicationContext(),"Aceptado", Toast.LENGTH_SHORT);
        toastA.show();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run(){toastA.cancel();
            }
        }, 500);
    }

    public void rechazar(){
        final Toast toastR = Toast.makeText(getApplicationContext(),"Rechazado", Toast.LENGTH_SHORT);
        toastR.show();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toastR.cancel();
            }
        }, 500);
    }
}

