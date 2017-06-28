package com.example.mcnight.scroll_question;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView t_red = (TextView) findViewById(R.id.b_red);

        final TextView t_green = (TextView) findViewById(R.id.b_green);

        final TextView t_blue = (TextView) findViewById(R.id.b_blue);

        final TextView t_white = (TextView) findViewById(R.id.b_white);

        final TextView t_black = (TextView) findViewById(R.id.b_black);

        final TextView t_pink = (TextView) findViewById(R.id.b_pink);

        t_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t_red.setBackgroundResource(R.color.red);

            }
        });

        t_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                       t_green.setBackgroundResource(R.color.green);

            }
        });

        t_white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t_white.setBackgroundResource(R.color.white);


            }
        });

        t_black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t_black.setBackgroundResource(R.color.black);
                t_black.setTextColor(Color.parseColor("#FFFFFF"));

            }
        });

        t_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t_pink.setBackgroundResource(R.color.pink);


            }
        });

        t_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t_blue.setBackgroundResource(R.color.blue);


            }
        });


    }
}
