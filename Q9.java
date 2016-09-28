package com.example.vibhor.sabsebadagenius;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Q9 extends AppCompatActivity {

    EditText stuans;
    Button b_nq10 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q9);
    }

    public void checkanswer(View v)
    {
        EditText stuans = (EditText) findViewById(R.id.stuans);
        if(stuans.getText().toString().toLowerCase().equals("sindhu"))
        {
            Toast.makeText(Q9.this, "Correct answer +5", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(Q9.this, "Incorrect answer O points", Toast.LENGTH_SHORT).show();
        }
        Intent nextPage = new Intent(Q9.this,Q10.class);
        startActivity(nextPage);
    }
}
