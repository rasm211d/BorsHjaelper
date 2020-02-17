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
        TextView koebsKurs = findViewById(R.id.koebskurs);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = antalAktier.getText().toString();
                int value = 0;
                if (!"".equals(temp)) {
                    value = Integer.parseInt(temp);
                }
                kursVeksler.setAntalAktier(value);
                Log.d("detgodegyldnenummer", "onClick:" + value);
                
            }
        });
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
