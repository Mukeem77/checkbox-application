package com.mukeem.checkboxxx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class spinneer extends AppCompatActivity {
Spinner spin;
ArrayAdapter<CharSequence>adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinneer);
        spin = findViewById(R.id.spinnn);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Countries,android.R.layout.simple_spinner_item);
      //  adapter.setDropDownViewResource(android.R.layout.);
    }
}
