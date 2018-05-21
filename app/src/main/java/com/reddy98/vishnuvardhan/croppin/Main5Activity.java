package com.reddy98.vishnuvardhan.croppin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    Spinner spr ;



    //DEFINE TEXT VIEW

    TextView Tv ;

    //make string Array

    String season[] = {"Kharif","Rabi","Summer"};

    //defines array adapter of string type

    ArrayAdapter<String> adt;

    //define string variable for record

    String record= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main5);



        spr = (Spinner)findViewById(R.id.spinner);

        adt = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,season);

        Tv = (TextView)findViewById(R.id.textView);

        //set adapter to spinner

        spr.setAdapter(adt);

        //set spinner method

        spr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //use postion value

                switch (position)

                {

                    case 0:

                        record = "Kharif";

                        break;

                    case 1:

                        record = "Rabi";

                        break;

                    case 2:

                        record = "Summer";

                        break;
                }

            }

            @Override

            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

    }

    public void tv(View view)

    {

        if(record=="Kharif")
        {
            Intent intent=new Intent(Main5Activity.this,Main8Activity.class);
            startActivity(intent);
        }
        else if(record=="Rabi")
        {
            Intent intent=new Intent(Main5Activity.this,Main13Activity.class);
            startActivity(intent);
        }
        else if(record=="Summer")
        {
            Intent intent=new Intent(Main5Activity.this,Main18Activity.class);
            startActivity(intent);
        }
    }
}
