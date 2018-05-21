package com.reddy98.vishnuvardhan.croppin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {

    Spinner sp2;
    Spinner sp3;
    Intent intent;

    Button b2;

    //DEFINE TEXT VIEW

    TextView tv1;

    //make string Arrary

    String season[] = {"Kharif", "Rabi", "Summer"};
    String soil[] = {"Alluvial", "Desert", "Black", "red", "Laterite"};

    //defins array adapter of string type

    ArrayAdapter<String> adapter2;
    ArrayAdapter<String> adapter3;

    //define string variable for record

    String chosen_season = "";
    String chosen_soil = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        sp2 = (Spinner) findViewById(R.id.spinner);
        sp3 = findViewById(R.id.spinner2);

        b2 = findViewById(R.id.button2);

        adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, season);
        adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, soil);

        tv1 = findViewById(R.id.textView8);

        //set adapter to spinner

        sp2.setAdapter(adapter2);
        sp3.setAdapter(adapter3);


        //set spinner method

        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //use postion value

                switch (position)

                {

                    case 0:

                        chosen_season = "Kharif";

                        break;

                    case 1:

                        chosen_season = "Rabi";

                        break;

                    case 2:

                        chosen_season = "Summer";

                        break;
                }

            }

            @Override

            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position2, long id) {

                //use position value

                switch (position2)

                {

                    case 0:

                        chosen_soil = "Alluvial";

                        break;

                    case 1:

                        chosen_soil = "Desert";

                        break;

                    case 2:

                        chosen_soil = "Black";

                        break;

                    case 3:

                        chosen_soil = "Red";

                        break;

                    case 4:

                        chosen_soil = "Laterite";

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
        if ((chosen_season.equals("Kharif")) && chosen_soil.equals("Alluvial"))
        {
            intent = new Intent(Main6Activity.this, Main7Activity.class);
            startActivity(intent);
        }
        else if (chosen_season.equals("Kharif") && chosen_soil.equals("Desert"))
        {
            intent = new Intent(Main6Activity.this, Main8Activity.class);
            startActivity(intent);
        }
        else if (chosen_season.equals("Kharif") && chosen_soil.equals("Black"))
        {
            intent = new Intent(Main6Activity.this, Main9Activity.class);
            startActivity(intent);
        }
        else if (chosen_season.equals("Kharif") && chosen_soil.equals("Red"))
        {
            intent = new Intent(Main6Activity.this, Main10Activity.class);
            startActivity(intent);
        }
        else if (chosen_season.equals("Kharif") && chosen_soil.equals("Laterite"))
        {
            intent = new Intent(Main6Activity.this, Main11Activity.class);
            startActivity(intent);
        }
        else if (chosen_season.equals("Rabi") && chosen_soil.equals("Alluvial"))
        {
            intent = new Intent(Main6Activity.this, Main12Activity.class);
            startActivity(intent);
        }
        else if (chosen_season.equals("Rabi") && chosen_soil.equals("Desert"))
        {
            intent = new Intent(Main6Activity.this, Main13Activity.class);
            startActivity(intent);
        }
        else if (chosen_season.equals("Rabi") && chosen_soil.equals("Black"))
        {
            intent = new Intent(Main6Activity.this, Main14Activity.class);
            startActivity(intent);
        }
        else if (chosen_season.equals("Rabi") && chosen_soil.equals("Red"))
        {
            intent = new Intent(Main6Activity.this, Main15Activity.class);
            startActivity(intent);
        }
        else if (chosen_season.equals("Rabi") && chosen_soil.equals("Laterite"))
        {
            intent = new Intent(Main6Activity.this, Main16Activity.class);
            startActivity(intent);
        }
        else if (chosen_season.equals("Summer") && chosen_soil.equals("Alluvial"))
        {
            intent = new Intent(Main6Activity.this, Main17Activity.class);
            startActivity(intent);
        }
        else if (chosen_season.equals("Summer") && chosen_soil.equals("Desert"))
        {
            intent = new Intent(Main6Activity.this, Main18Activity.class);
            startActivity(intent);
        }
        else if (chosen_season.equals("Summer") && chosen_soil.equals("Black"))
        {
            intent = new Intent(Main6Activity.this, Main19Activity.class);
            startActivity(intent);
        }
        else if (chosen_season.equals("Summer") && chosen_soil.equals("Red"))
        {
            intent = new Intent(Main6Activity.this, Main20Activity.class);
            startActivity(intent);
        }
        else if (chosen_season.equals("Summer") && chosen_soil.equals("Laterite"))
        {
            intent = new Intent(Main6Activity.this, Main21Activity.class);
            startActivity(intent);
        }
    }
}