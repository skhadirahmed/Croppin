package com.reddy98.vishnuvardhan.croppin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Spinner sp1 ;



    //DEFINE TEXT VIEW

    TextView tv ;

    //make string Array

    String region[] = {"NorthAndhra","CoastalAndhra","SouthAndhra"};

    //defines array adapter of string type

    ArrayAdapter<String> adapter1;

    //define string variable for record

    String record= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);



        sp1 = (Spinner)findViewById(R.id.spinner);

        adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,region);

        tv = (TextView)findViewById(R.id.textView);

        //set adapter to spinner

        sp1.setAdapter(adapter1);

        //set spinner method

        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //use postion value

                switch (position)

                {

                    case 0:

                        record = "NorthAndhra";

                        break;

                    case 1:

                        record = "CoastalAndhra";

                        break;

                    case 2:

                        record = "SouthAndhra";

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
        tv.setTextSize(18);

        if(record=="NorthAndhra")
        {
            tv.setText("North Andhra mainly consists of Alluvial, laterite and red soils");
            Intent intent=new Intent(Main2Activity.this,Main6Activity.class);
            startActivity(intent);
        }
        else if(record=="CoastalAndhra")
        {
            tv.setText("Coastal Andhra is comprises lands with most of red, black, alluvial soils");
            Intent intent=new Intent(Main2Activity.this,Main6Activity.class);
            startActivity(intent);
        }
        else if(record=="SouthAndhra")
        {
            tv.setText("South Andhra is comprises lands with most of red, black, alluvial soils");
            Intent intent=new Intent(Main2Activity.this,Main6Activity.class);
            startActivity(intent);
        }
    }
}