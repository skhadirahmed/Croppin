package com.reddy98.vishnuvardhan.croppin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    Spinner spi ;



    //DEFINE TEXT VIEW

    TextView tv ;

    //make string Array

    String region[] = {"Northern Gujarat","Southern Gujarat"};

    //defines array adapter of string type

    ArrayAdapter<String> adapterv;

    //define string variable for record

    String record= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);



        spi = (Spinner)findViewById(R.id.spinner);

        adapterv = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,region);

        tv = (TextView)findViewById(R.id.textView);

        //set adapter to spinner

        spi.setAdapter(adapterv);

        //set spinner method

        spi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //use postion value

                switch (position)

                {

                    case 0:

                        record = "Northern Gujarat";

                        break;

                    case 1:

                        record = "Southern Gujarat";

                        break;

                }

            }

            @Override

            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

    }

    public void gone(View view)

    {
        tv.setTextSize(18);

        if(record=="Northern Gujarat")
        {
            tv.setText("Most of the desert soils are present");
            Intent intent=new Intent(Main3Activity.this,Main5Activity.class);
            startActivity(intent);
        }
        else if(record=="Southern Gujarat")
        {
            tv.setText("Comprises most of the soils");
            Intent intent=new Intent(Main3Activity.this,Main6Activity.class);
            startActivity(intent);
        }
    }
}
