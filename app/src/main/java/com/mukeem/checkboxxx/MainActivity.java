package com.mukeem.checkboxxx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox Maths,Hindi,English;
    Button bt;
    Spinner spiner;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spiner= findViewById(R.id.spinner11);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Countries,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner.setAdapter(adapter);
        addListnerOnButton ();
    }
    public void addListnerOnButton () {
        Maths= findViewById(R.id.maths);
        Hindi= findViewById(R.id.english);
      //  spiner= findViewById(R.id.spinnn);
        English= findViewById(R.id.hindi);
        bt=findViewById(R.id.butt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("Welcome Maths: ").append(Maths.isChecked());
                result.append("Welcome Hindi: ").append(Hindi.isChecked());
                result.append("Welcome English: ").append(English.isChecked());
                Toast.makeText(MainActivity.this, result.toString(),
                        Toast.LENGTH_SHORT).show();
                Intent i =new Intent(getApplicationContext(), homepage.class);
                startActivity(i);
            }
        });
    }
    public void addListnerOnbutton1() {
        final RadioGroup radioGroup;
        radioGroup = findViewById(R.id.rdg);
        bt = findViewById(R.id.butt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectdID = radioGroup.getCheckedRadioButtonId();
                bt = findViewById(R.id.butt);
                Toast.makeText(MainActivity.this,bt.getText(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
