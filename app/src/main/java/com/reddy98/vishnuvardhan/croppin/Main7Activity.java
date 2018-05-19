package com.reddy98.vishnuvardhan.croppin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity {

    TextView tv2;
    ImageView iv;
    TextView tv3;
    TextView tv4;
    ImageView iv2;
    TextView tv5;
    TextView tv6;
    ImageView iv3;
    TextView tv7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        tv2=findViewById(R.id.textView2);
        iv=findViewById(R.id.imageview);
        tv3=findViewById(R.id.textView3);
        tv4=findViewById(R.id.textView4);
        iv2=findViewById(R.id.imageview2);
        tv5=findViewById(R.id.textView5);
        tv6=findViewById(R.id.textView6);
        iv3=findViewById(R.id.imageview3);
        tv7=findViewById(R.id.textView7);
    }
}
