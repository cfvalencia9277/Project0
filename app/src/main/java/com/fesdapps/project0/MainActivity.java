package com.fesdapps.project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button popularMovies;
    Button stockHawk;
    Button buildBigger;
    Button makeMaterial;
    Button goUbi;
    Button capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        popularMovies = (Button)findViewById(R.id.btn1);
        stockHawk = (Button)findViewById(R.id.btn2);
        buildBigger = (Button)findViewById(R.id.btn3);
        makeMaterial = (Button)findViewById(R.id.btn4);
        goUbi = (Button)findViewById(R.id.btn5);
        capstone = (Button)findViewById(R.id.btn6);

        popularMovies.setOnClickListener(this);
        stockHawk.setOnClickListener(this);
        buildBigger.setOnClickListener(this);
        makeMaterial.setOnClickListener(this);
        goUbi.setOnClickListener(this);
        capstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn1:
                Toast.makeText(this, "Click on Popular Movies",Toast.LENGTH_LONG).show();
                break;

            case R.id.btn2:
                Toast.makeText(this, "Click on Stock Hawk",Toast.LENGTH_LONG).show();
                break;

            case R.id.btn3:
                Toast.makeText(this, "Click on Build It Bigger",Toast.LENGTH_LONG).show();
                break;
            case R.id.btn4:
                Toast.makeText(this, "Click on Make App Material",Toast.LENGTH_LONG).show();
                break;

            case R.id.btn5:
                Toast.makeText(this, "Click on Go Ubiquitous",Toast.LENGTH_LONG).show();
                break;

            case R.id.btn6:
                Toast.makeText(this, "Click on Capstone",Toast.LENGTH_LONG).show();
                break;

            default:
                break;
        }
    }
}
