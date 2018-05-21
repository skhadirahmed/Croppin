package com.reddy98.vishnuvardhan.croppin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    Spinner spn ;



    //DEFINE TEXT VIEW

    TextView tV ;

    //make string Array

    String region[] = {"Northern Punjab","Southern Punjab"};

    //defines array adapter of string type

    ArrayAdapter<String> adapteri;

    //define string variable for record

    String record= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main4);



        spn = (Spinner)findViewById(R.id.spinner);

        adapteri = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,region);

        tV = (TextView)findViewById(R.id.textView);

        //set adapter to spinner

        spn.setAdapter(adapteri);

        //set spinner method

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //use postion value

                switch (position)

                {

                    case 0:

                        record = "Northern Punjab";

                        break;

                    case 1:

                        record = "Southern Punjab";

                        break;

                }

            }

            @Override

            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

    }

    public void mv(View view)

    {
        tV.setTextSize(18);

        if(record=="Northern Punjab")
        {
            tV.setText("Comprises most of the soils");
            Intent intent=new Intent(Main4Activity.this,Main6Activity.class);
            startActivity(intent);
        }
        else if(record=="Southern Punjab")
        {
            tV.setText("Most of the desert soils are present");
            Intent intent=new Intent(Main4Activity.this,Main5Activity.class);
            startActivity(intent);
        }
    }
}
