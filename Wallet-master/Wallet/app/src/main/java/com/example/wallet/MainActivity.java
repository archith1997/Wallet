package com.example.wallet;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView sendMoney,addMoney,Request;
    TextView amountValue;
    int b,c;
    int a=5000;
    String amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendMoney = (CardView)findViewById(R.id.sendmoney);
        addMoney = (CardView)findViewById(R.id.addmoney);
        Request = (CardView)findViewById(R.id.request);

        /*add=getIntent().getExtras().getString("addvalue","0");
        send=getIntent().getExtras().getString("sendvalue","0");
        b = new Integer(add).intValue();
        c = new Integer(send).intValue();*/


        sendMoney.setOnClickListener(this);
        addMoney.setOnClickListener(this);
        Request.setOnClickListener(this);
        show();

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId())
        {
            case R.id.addmoney:
                i= new Intent(this,addmoney.class);
                startActivityForResult(i,0);
                break;
            case R.id.sendmoney:
                i=new Intent(this,sendmoney.class);
                startActivityForResult(i,1);
                break;
            case R.id.request:
                i=new Intent(this,request.class);
                startActivity(i);
                break;

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 0)
        {
            int b =0;
            String add;
            if (b == 0){
                /*add= data.getStringExtra("addvalue");
                b = Integer.parseInt(add)+b;*/
                b = 50;
                a = a+b;
                show();
            }
        }
        if (requestCode == 1){
            int c = 0;
            String send;
            /*send=data.getStringExtra("sendvalue");
            c = new Integer(send).intValue();*/
            c=100;
            a= a-c;
            show();
        }

    }
    public void show(){
        amount = Integer.toString(a);
        amountValue= (TextView) findViewById(R.id.amountvalue);
        amountValue.setText(amount);
    }
}
