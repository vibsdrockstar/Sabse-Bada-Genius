package com.example.vibhor.sabsebadagenius;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Q6 extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb;
    Button b_nq8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6);
        rg = (RadioGroup) findViewById(R.id.rgroup);
    }

    public  void  rbclick(View v)
    {
        int radiobuttonid = rg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(radiobuttonid);
        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(rb.getText().toString().equals("VSS Mani"))
                {
                    Toast.makeText(Q6.this, "Correct answer +5", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(Q6.this,"Incorrect answer 0 points",Toast.LENGTH_SHORT).show();
                }
                Intent nextPage = new Intent(Q6.this,Q7.class);
                startActivity(nextPage);
            }
        });
    }
}
