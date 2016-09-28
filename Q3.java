package com.example.vibhor.sabsebadagenius;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Q3 extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb;
    Button b_nq4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);
        rg = (RadioGroup) findViewById(R.id.rgroup);
    }

    public  void  rbclick(View v)
    {
        int radiobuttonid = rg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(radiobuttonid);
        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(rb.getText().toString().equals("Boxing"))
                {
                    Toast.makeText(Q3.this, "Correct answer +5", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(Q3.this,"Incorrect answer 0 points",Toast.LENGTH_SHORT).show();
                }
                Intent nextPage = new Intent(Q3.this,Q2.class);
                startActivity(nextPage);
            }
        });
    }
}


