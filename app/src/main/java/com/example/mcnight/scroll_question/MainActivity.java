package com.example.mcnight.scroll_question;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t_red = (TextView) findViewById(R.id.b_red);

        TextView t_green = (TextView) findViewById(R.id.b_blue);

        TextView t_blue = (TextView) findViewById(R.id.b_black);

        TextView t_white = (TextView) findViewById(R.id.b_white);

        TextView t_black = (TextView) findViewById(R.id.b_black);

        TextView t_pink = (TextView) findViewById(R.id.b_pink);

        t_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

    }
}
