package com.example.layoutproblem2;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity
{
    double counter;
    TextView counterTV;
    TextView trueFalseTV;
    TextView num1TV;
    TextView num2TV;
    int num1;
    int num2;
    Random r;
    boolean started;
    double totalCounter;
    double percent;
    Button lessButton, equalsButton, moreButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter=0;
        totalCounter=0;
        started=false;
        r=new Random();

        counterTV=(TextView)findViewById(R.id.textView);
        trueFalseTV=(TextView)findViewById(R.id.textView2);
        num1TV=(TextView)findViewById(R.id.textView4);
        num2TV=(TextView)findViewById(R.id.textView5);

        lessButton=(Button)findViewById(R.id.button3);
        equalsButton=(Button)findViewById(R.id.button2);
        moreButton=(Button)findViewById(R.id.button4);

        lessButton.setText("<");
        equalsButton.setText("=");
        moreButton.setText(">");

        randomNumbers();
    }

    public void reset(View view)
    {
        counter=0;
        totalCounter=0;
        counterTV.setText("0%");
        started=false;

        num1TV.setText("1st number");
        num2TV.setText("2nd number");
        trueFalseTV.setText("True/False");

        randomNumbers(view);
    }

    public void randomNumbers(View view)
    {
        num1=r.nextInt();
        num2=r.nextInt();
        started=true;

        num1TV.setText("1st number");
        num2TV.setText("2nd number");
        trueFalseTV.setText("True/False");
    }

    public void less(View view)
    {
        totalCounter++;
        showNumbers();
        if (started)
        {
            if (num1 < num2)
            {
                counter++;
                trueFalseTV.setText("TRUE");
            }
            else
            {
                trueFalseTV.setText("FALSE");
            }
            percent=counter/totalCounter*100;
            counterTV.setText(percent+"%");
            started=false;
        }
        else
        {
            trueFalseTV.setText("Press random numbers");
        }
    }

    public void equals(View view)
    {
        totalCounter++;
        showNumbers();
        if (started)
        {
            if (num1 == num2)
            {
                counter++;
                trueFalseTV.setText("TRUE");
            }
            else
            {
                trueFalseTV.setText("FALSE");
            }
            started=false;
            percent=counter/totalCounter*100;
            counterTV.setText(percent+"%");
        }
        else
        {
            trueFalseTV.setText("Press random numbers");
        }
    }

    public void more(View view)
    {
        totalCounter++;
        showNumbers();
        if (started)
        {
            if (num1 > num2)
            {
                counter++;
                trueFalseTV.setText("TRUE");
            }
            else
            {
                trueFalseTV.setText("FALSE");
            }
            started=false;
            percent=counter/totalCounter*100;
            counterTV.setText(percent+"%");
        }
        else
        {
            trueFalseTV.setText("Press random numbers");
        }
    }

    private void showNumbers()
    {
        if (started)
        {
            num1TV.setText("" + num1);
            num2TV.setText("" + num2);
        }
    }

    public void randomNumbers()
    {
        num1=r.nextInt();
        num2=r.nextInt();
        started=true;

        num1TV.setText("1st number");
        num2TV.setText("2nd number");
        trueFalseTV.setText("True/False");
    }
}
