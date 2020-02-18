package com.example.brshjlper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.EventListener;
import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity implements Observer {
    KursVeksler kursVeksler = new KursVeksler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.button);

        final EditText antalAktier = findViewById(R.id.antalAktier);
        final EditText koebsKurs = findViewById(R.id.koebskurs);
        final EditText kurtage = findViewById(R.id.kurtage);
        final EditText startKurtage = findViewById(R.id.kurtageStart);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String antalAktierTemp = antalAktier.getText().toString();
                double value;
                if (!"".equals(antalAktierTemp)) {
                    value = Double.parseDouble(antalAktierTemp);
                } else {
                    value = 1;
                }
                kursVeksler.setAntalAktier(value);
                Log.d("guldAntalAktier", "onClick:" + value);



                String koebsKursTemp = koebsKurs.getText().toString();
                double value1;
                if (!"".equals(koebsKursTemp)) {
                    value1 = Double.parseDouble(koebsKursTemp);
                } else {
                    value1 = 1;
                }

                kursVeksler.setKoebskurs(value1);
                Log.d("guldKøbskurs", "onClick:" + value1);



                String kurtageTemp = kurtage.getText().toString();
                double value2;
                if (!"".equals(kurtageTemp)) {
                    value2 = Double.parseDouble(kurtageTemp);
                } else {
                    value2 = 0;
                }
                kursVeksler.setKurtage(value2);
                Log.d("guldKurtage", "onClick:" + value2);


                String startKurtageTemp = startKurtage.getText().toString();
                double value3;
                if (!"".equals(startKurtageTemp)) {
                    value3 = Double.parseDouble(startKurtageTemp);
                } else {
                    value3 = 29;
                }
                kursVeksler.setKurtageStart(value3);
                Log.d("guldStartKurtage", "onClick:" + value3);
            }
        });
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
