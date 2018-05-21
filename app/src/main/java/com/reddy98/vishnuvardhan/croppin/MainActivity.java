package com.reddy98.vishnuvardhan.croppin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    // define spinner

    Spinner sp ;

    //DEFINE TEXT VIEW

    TextView display_data ;

    //make string Arrary

    String names[] = {"AndhraPradesh","Rajastan","Gujarat","Punjab"};

    //defins array adapter of string type

    ArrayAdapter<String> adapter;

    //define string variable for record

    String record= "";

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        sp = (Spinner)findViewById(R.id.spinner);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);

        display_data = (TextView)findViewById(R.id.textView);

        //set adapter to spinner

        sp.setAdapter(adapter);

        //set spinner method

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //use postion value

                switch (position)

                {

                    case 0:

                        record = "AndhraPradesh";

                        break;

                    case 1:

                        record = "Rajasthan";

                        break;

                    case 2:

                        record = "Gujarat";

                        break;

                    case 3:

                        record="Punjab";

                        break;
                }

            }

            @Override

            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

    }

    //set display button click to show result

    public void diplay_result(View view)

    {

        display_data.setTextSize(18);

        if(record=="AndhraPradesh")
        {
            display_data.setText("AndhraPradesh is present southeren part of india in deccan plateau region. AP mainly based up on soils like alluvial,black and red");
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }

        else if(record=="Rajasthan")
        {
            display_data.setText("Rajastan is present on the northwestern side of the India mainly comprises desert soils");
            Intent intent=new Intent(MainActivity.this,Main6Activity.class);
            startActivity(intent);
        }

        else if(record=="Gujarat")
        {
            display_data.setText("Gujarat is a state in Western India and Northwest India having desert type of land as source of crops");
            Intent intent=new Intent(MainActivity.this,Main3Activity.class);
            startActivity(intent);
        }

        else if(record=="Punjab")
        {
            display_data.setText("Punjab is a state in northern India with desert soil as land of fertility");
            Intent intent=new Intent(MainActivity.this,Main4Activity.class);
            startActivity(intent);
        }
    }

}
