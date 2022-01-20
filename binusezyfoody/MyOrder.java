package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MyOrder extends AppCompatActivity {

    Button paynow_but,deleteorder_but,orderMore_but;
    RecyclerView orderlist;
    TextView totalharga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myorder);

        orderlist = findViewById(R.id.orderlist);
        RecyclerAdapter orderAdapter = new RecyclerAdapter(this, true);
        orderlist.setAdapter(orderAdapter);
        orderlist.setLayoutManager(new LinearLayoutManager(this));

        totalharga = findViewById(R.id.totalharga);
        int total = 0;
        for(int i = 0 ; i < MainActivity.Items.size() ; i++){
            total += MainActivity.Items.get(i).quantity * MainActivity.Items.get(i).price;
        }

        totalharga.setText(Integer.toString(total));


        paynow_but = findViewById(R.id.paybutton);
        orderlist = findViewById(R.id.orderlist);
        deleteorder_but = findViewById(R.id.deleteorderbut);
        orderMore_but = findViewById(R.id.order_more);

        orderMore_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyOrder.this, MainActivity.class);
                startActivity(intent);
            }
        });

        paynow_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyOrder.this, OrderComplete.class);
                startActivity(intent);
            }
        });



    }
}