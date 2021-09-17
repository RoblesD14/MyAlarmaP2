package com.example.myalarma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.alarma);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View view){
                asignarAlarma("Contenido de alarma", 9, 30);


            }

        });
    }

    public void asignarAlarma(String mensaje, int hora, int minutos){
        Intent intent=new Intent (AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE,mensaje)
                .putExtra(AlarmClock.EXTRA_HOUR,hora)
                .putExtra(AlarmClock.EXTRA_MINUTES,minutos);
        if (intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
           }

    }

    public void asignarAlarma(View view) {
    }
}