package com.example.radiobutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RadioButton red,green,blue;
    RelativeLayout rl1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rl1=findViewById(R.id.layout);
        red=findViewById(R.id.red);
        blue=findViewById(R.id.blue);
        green=findViewById(R.id.green);
    }
    public void OnClick(View v)
    {
        boolean checked=((RadioButton)v).isChecked();
        switch (v.getId())
        {
            case R.id.red:
                if (checked)
                    rl1.setBackgroundColor(Color.RED) ;
                break;
            case R.id.blue:
                if (checked)
                    rl1.setBackgroundColor(Color.BLUE);
                break;
            case R.id.green:
                if (checked)
                    rl1.setBackgroundColor(Color.GREEN);
                break;
        }
    }
}