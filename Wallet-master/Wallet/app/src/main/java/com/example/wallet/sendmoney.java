package com.example.wallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sendmoney extends AppCompatActivity {
    Button sendMoney;
    EditText sendValue;
    String ssend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendmoney);
        sendMoney = (Button) findViewById(R.id.sendmoney);
        sendValue = (EditText) findViewById(R.id.sendvalue);
        ssend = sendValue.getText().toString();
        sendMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(sendmoney.this, MainActivity.class);
                i.putExtra("sendvalue", ssend);
                //startActivity(i);
                setResult(1,i);
                finish();
            }
        });
    }
}
