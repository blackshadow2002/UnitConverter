package com.micheal.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button pound,kg,miles,km,gallon,litre,acre,sq_m,feet,cm,clear;
    TextView result;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pound = findViewById(R.id.pound);
        kg = findViewById(R.id.kg);
        miles = findViewById(R.id.miles);
        km = findViewById(R.id.km);
        gallon = findViewById(R.id.gallon);
        litre = findViewById(R.id.litre);
        acre = findViewById(R.id.acre);
        sq_m = findViewById(R.id.sq_m);
        feet = findViewById(R.id.feet);
        cm = findViewById(R.id.cm);
        clear=findViewById(R.id.clear);

        e1=findViewById(R.id.editTextNumberDecimal);
        result = findViewById(R.id.textView);

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                to_pound();
            }
        });
        kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                to_kg();
            }
        });
        miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                to_miles();
            }
        });
        km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { to_km();
            }
        });
        gallon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { to_imp_gallon(); }
        });
        litre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { to_litre(); }
        });
        acre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { to_acre(); }
        });
        sq_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { to_sq_m(); }
        });
        feet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { to_feet(); }
        });
        cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { to_cm(); }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                e1.setText("");
                result.setText("");
            }
        });
    }
    public void to_pound(){//
        Toast.makeText(MainActivity.this, "Success!", Toast.LENGTH_SHORT).show();
        double kg= Double.parseDouble(e1.getText().toString());
        double pound = kg * 2.205;
        result.setText(String.format("%.4f",pound)+" lbs");
    }
    public void to_kg(){ //
        Toast.makeText(MainActivity.this, "Success!", Toast.LENGTH_SHORT).show();
        double pound= Double.parseDouble(e1.getText().toString());
        double kg= pound * 0.454;
        result.setText(String.format("%.4f",kg)+" kg");
    }
    public void to_miles(){ //
        Toast.makeText(MainActivity.this, "Success!", Toast.LENGTH_SHORT).show();
        double km= Double.parseDouble(e1.getText().toString());
        double miles= km * 0.621  ;
        result.setText(String.format("%.4f",miles)+" miles");
    }
    public void to_km(){ //
        Toast.makeText(MainActivity.this, "Success!", Toast.LENGTH_SHORT).show();
        double miles= Double.parseDouble(e1.getText().toString());
        double km= miles * 1.60934  ;
        result.setText(String.format("%.4f",km)+" km");
    }
    public void to_imp_gallon(){ //
        Toast.makeText(MainActivity.this, "Success!", Toast.LENGTH_SHORT).show();
        double litre= Double.parseDouble(e1.getText().toString());
        double gallon= litre * 0.219969  ;
        result.setText(String.format("%.4f",gallon)+" gallon");
    }
    public void to_litre(){ //
        Toast.makeText(MainActivity.this, "Success!", Toast.LENGTH_SHORT).show();
        double gallon= Double.parseDouble(e1.getText().toString());
        double litre= gallon * 4.54609  ;
        result.setText(String.format("%.4f",litre)+" L");
    }
    public void to_acre(){ //
        Toast.makeText(MainActivity.this, "Success!", Toast.LENGTH_SHORT).show();
        double sq_m= Double.parseDouble(e1.getText().toString());
        double acre= sq_m * 0.000247105  ;
        result.setText(String.format("%.4f",acre)+" acre");
    }
    public void to_sq_m(){ //
        Toast.makeText(MainActivity.this, "Success!", Toast.LENGTH_SHORT).show();
        double acre= Double.parseDouble(e1.getText().toString());
        double sq_m= acre * 4046.86  ;
        result.setText(String.format("%.4f",sq_m)+" sq.m");
    }
    public void to_feet(){ //
        Toast.makeText(MainActivity.this, "Success!", Toast.LENGTH_SHORT).show();
        double cm= Double.parseDouble(e1.getText().toString());
        double feet= cm * 0.0328084  ;
        result.setText(String.format("%.4f",feet)+" ft");
    }
    public void to_cm(){ //
        Toast.makeText(MainActivity.this, "Success!", Toast.LENGTH_SHORT).show();
        double feet= Double.parseDouble(e1.getText().toString());
        double cm = feet * 30.48  ;
        result.setText(String.format("%.4f",cm)+" cm");
    }
}