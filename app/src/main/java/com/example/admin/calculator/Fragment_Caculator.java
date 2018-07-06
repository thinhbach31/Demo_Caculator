package com.example.admin.calculator;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.Format;

public class Fragment_Caculator extends android.app.Fragment {

    TextView txt_caculate;
    Button btn_AC, btn_reveal, btn_percent, btn_divide, btn_7, btn_8, btn_9, btn_multiply,
            btn_4, btn_5, btn_6, btn_minus, btn_1, btn_2, btn_3, btn_plus, btn_0,
            btn_dot, btn_equal;
    private float num = 0;
    private double num_2;

    private static final char plus = '+';
    private static final char minus = '-';
    private static final char multi = '*';
    private static final char div = '/';
    private char Current_Action;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_fragment__caculator, container, false);

        txt_caculate = v.findViewById(R.id.txt_caculate);
        btn_0 = v.findViewById(R.id.btn_0);
        btn_1 = v.findViewById(R.id.btn_1);
        btn_2 = v.findViewById(R.id.btn_2);
        btn_3 = v.findViewById(R.id.btn_3);
        btn_4 = v.findViewById(R.id.btn_4);
        btn_5 = v.findViewById(R.id.btn_5);
        btn_6 = v.findViewById(R.id.btn_6);
        btn_7 = v.findViewById(R.id.btn_7);
        btn_8 = v.findViewById(R.id.btn_8);
        btn_9 = v.findViewById(R.id.btn_9);
        btn_AC = v.findViewById(R.id.btn_AC);
        btn_divide = v.findViewById(R.id.btn_divide);
        btn_dot = v.findViewById(R.id.btn_dot);
        btn_reveal = v.findViewById(R.id.btn_Reveal);
        btn_percent = v.findViewById(R.id.btn_Percent);
        btn_multiply = v.findViewById(R.id.btn_Multiply);
        btn_minus = v.findViewById(R.id.btn_Minus);
        btn_equal = v.findViewById(R.id.btn_Equal);
        btn_plus = v.findViewById(R.id.btn_plus);


        setHasOptionsMenu(true);
        inputNum();
        action();

        return v;
    }

    private void action() {

        // on click plus
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Current_Action = plus;
                txt_caculate.setText(txt_caculate.getText() + "+");
                //calculation();
            }
        });

        //on click minus
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Current_Action = minus;
                txt_caculate.setText(txt_caculate.getText() + "-");
            }
        });

        //on click multiply
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Current_Action = multi;
                txt_caculate.setText(txt_caculate.getText() + "*");
            }
        });

        //on click divide
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Current_Action = div;
                txt_caculate.setText(txt_caculate.getText() + "/");
            }
        });

        //on click equal
        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //plus
                if (Current_Action == plus) {
                    String[] s = txt_caculate.getText().toString().split("\\+");
                    float b, c;
                    b = Float.parseFloat(s[0]);
                    c = Float.parseFloat(s[1]);
                    num = b + c;
                }

                //minus
                if (Current_Action == minus) {
                    String[] s = txt_caculate.getText().toString().split("-");
                    float b, c;
                    b = Float.parseFloat(s[0]);
                    c = Float.parseFloat(s[1]);
                    num = b - c;
                }

                //multi
                if (Current_Action == multi) {
                    String[] s = txt_caculate.getText().toString().split("\\*");
                    float b, c, d;
                    b = Float.parseFloat(s[0]);
                    c = Float.parseFloat(s[1]);
                    d = b * c;
                    num = d;
                }

                //divide
                if (Current_Action == div) {
                    String[] s = txt_caculate.getText().toString().split("/");
                    float b, c, d;
                    b = Float.parseFloat(s[0]);
                    c = Float.parseFloat(s[1]);
                    d = b / c;
                    num = d;
                }

                txt_caculate.setText((int) num + "");
                num = 0;
                Current_Action = 0;
            }
        });
    }


    //numble button
    private void inputNum() {
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_caculate.setText(txt_caculate.getText() + "0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_caculate.setText(txt_caculate.getText() + "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_caculate.setText(txt_caculate.getText() + "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_caculate.setText(txt_caculate.getText() + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_caculate.setText(txt_caculate.getText() + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_caculate.setText(txt_caculate.getText() + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_caculate.setText(txt_caculate.getText() + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_caculate.setText(txt_caculate.getText() + "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_caculate.setText(txt_caculate.getText() + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_caculate.setText(txt_caculate.getText() + "9");
            }
        });

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    //menu items
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            //Clear item
            case R.id.menu_clear:
                txt_caculate.setText("");
                num = 0;
                break;
            //Save item
            case R.id.menu_save:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
