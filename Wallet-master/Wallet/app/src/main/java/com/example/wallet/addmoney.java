package com.example.wallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class addmoney extends AppCompatActivity {
    Button addMoney;
    EditText addValue;
    String sadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmoney);

        addMoney = (Button)findViewById(R.id.addmoney);
        addValue = (EditText)findViewById(R.id.addvalue);
        sadd = addValue.getText().toString();
        addMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(addmoney.this, MainActivity.class);
                i.putExtra("addvalue", sadd);
                setResult(0,i);
                finish();

            }
        });

    }
}
