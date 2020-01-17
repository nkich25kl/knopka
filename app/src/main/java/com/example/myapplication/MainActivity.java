package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    SensorManager sensorManager;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        textView = findViewById(R.id.textView);
        List<Sensor> listSensor = sensorManager.getSensorList(Sensor.TYPE_ALL);
        for(int i=0;i < listSensor.size();i++){
            textView.setText(textView.getText() +listSensor.get(i).getName() +"\n");



        }

    }
}
