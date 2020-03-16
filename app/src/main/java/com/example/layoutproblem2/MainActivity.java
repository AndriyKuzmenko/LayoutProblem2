package com.example.layoutproblem2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int counter;
    TextView counterTV;
    TextView trueFalseTV;
    TextView num1TV;
    TextView num2TV;
    int num1;
    int num2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter=0;
        counterTV=(TextView)findViewById(R.id.textView);
        trueFalseTV=(TextView)findViewById(R.id.textView2);
        num1TV=(TextView)findViewById(R.id.textView4);
        num2TV=(TextView)findViewById(R.id.textView5);
    }

    public void reset(View view)
    {
        counter=0;
        counterTV.setText("Counter: "+counter);
    }
}
