package com.reddy98.vishnuvardhan.croppin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {

    Spinner sp2 ;
    Spinner sp3 ;

    Button b2;

    //DEFINE TEXT VIEW

    TextView tv1 ;

    //make string Arrary

    String season[] = {"Kharif","Rabi","Summer"};
    String soil[] = {"Alluvial","Desert","Black","red","Laterite"};

    //defins array adapter of string type

    ArrayAdapter<String> adapter2;
    ArrayAdapter<String> adapter3;

    //define string variable for record

    String record= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        sp2 = (Spinner) findViewById(R.id.spinner);
        sp3 = findViewById(R.id.spinner2);

        b2=findViewById(R.id.button2);

        adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, season);
        adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, soil);

        tv1=findViewById(R.id.textView8);

        //set adapter to spinner

        sp2.setAdapter(adapter2);
        sp3.setAdapter(adapter3);



        //set spinner method

        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {

            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {

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

            public void onNothingSelected(AdapterView<?> parent)
            {

            }

        });

        sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position2, long id) {

                //use position value

                switch (position2)

                {

                    case 0:

                        record = "Alluvial";

                        break;

                    case 1:

                        record = "Desert";

                        break;

                    case 2:

                        record = "Black";

                        break;

                    case 3:

                        record = "Red";

                        break;

                    case 4:

                        record = "Laterite";

                        break;
                }

            }

            @Override

            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

        public void tv1(View view)

        {
            if ((sp2.toString().equals("Kharif")) && (sp3.toString().equals("Alluvial")))
            {
                Intent intent = new Intent(Main6Activity.this, Main7Activity.class);
                startActivity(intent);
            }
            else if((sp2.toString().equals("Kharif")) && (sp3.toString().equals("Desert")))
            {
                Intent intent = new Intent(Main6Activity.this, Main8Activity.class);
                startActivity(intent);
            }
            else if((sp2.toString().equals("Kharif")) && (sp3.toString().equals("Black")))
            {
                Intent intent = new Intent(Main6Activity.this, Main9Activity.class);
                startActivity(intent);
            }
        }
    }
