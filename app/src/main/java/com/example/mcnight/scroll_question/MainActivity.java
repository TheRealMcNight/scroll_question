package com.example.mcnight.scroll_question;

import android.content.res.ColorStateList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    String myString = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView t_red = (TextView) findViewById(R.id.b_red);

        final TextView t_green = (TextView) findViewById(R.id.b_green);

        final TextView t_blue = (TextView) findViewById(R.id.b_blue);

        final TextView t_white = (TextView) findViewById(R.id.b_white);

        final TextView t_black = (TextView) findViewById(R.id.b_black);

        final ColorStateList oldBlack = t_black.getTextColors();

        final TextView t_pink = (TextView) findViewById(R.id.b_pink);

        final CheckBox t_check = (CheckBox) findViewById(R.id.check_this);

        final CheckBox t_check2 = (CheckBox) findViewById(R.id.check_this2);

        final CheckBox t_check3 = (CheckBox) findViewById(R.id.check_this3);

        final CheckBox t_check4 = (CheckBox) findViewById(R.id.check_this4);

        final CheckBox t_check5 = (CheckBox) findViewById(R.id.check_this5);

        final RadioButton t_radio = (RadioButton) findViewById(R.id.click_me);

        final RadioButton t_radio2 = (RadioButton) findViewById(R.id.click_me2);

        final RadioButton t_radio3 = (RadioButton) findViewById(R.id.click_me3);

        final RadioButton t_radio4 = (RadioButton) findViewById(R.id.click_me4);

        final RadioButton t_radio5 = (RadioButton) findViewById(R.id.click_me5);

        TextView t_print = (TextView) findViewById(R.id.b_print);

        final RadioGroup t_radioGroup = (RadioGroup) findViewById(R.id.rad_group);

        TextView t_reset = (TextView) findViewById(R.id.b_reset);

        TextView t_submit = (TextView) findViewById(R.id.b_submit);

        final EditText t_myText = (EditText) findViewById(R.id.my_write);


        //reset all values in scroll questions
        t_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t_red.setBackgroundResource(R.color.turquoise);
                t_green.setBackgroundResource(R.color.turquoise);
                t_blue.setBackgroundResource(R.color.turquoise);
                t_white.setBackgroundResource(R.color.turquoise);
                t_black.setBackgroundResource(R.color.turquoise);
                t_black.setTextColor(oldBlack);
                t_pink.setBackgroundResource(R.color.turquoise);

                t_check.setChecked(false);
                t_check2.setChecked(false);
                t_check3.setChecked(false);
                t_check4.setChecked(false);
                t_check5.setChecked(false);

               t_radioGroup.clearCheck();

                t_myText.setText("");

                count = 0;

                myString = "";


            }
        });

        t_print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myString = t_myText.getText().toString();

                Toast.makeText(getApplicationContext(), myString, Toast.LENGTH_SHORT).show();

            }
        });

        t_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t_check.isChecked() & t_radio.isChecked()) {
                    Toast.makeText(getApplicationContext(), "You is RIGHT", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getApplicationContext(), "You is WRONG", Toast.LENGTH_SHORT).show();

                }
            }
        });


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
