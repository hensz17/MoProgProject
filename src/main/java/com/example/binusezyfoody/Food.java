package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Food extends AppCompatActivity {

    Button myorder_but, sateOrder_but, ayamOrder_but, gorengOrder_but, kuahOrder_but, orderMore_but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        sateOrder_but = findViewById(R.id.order_sate);
        ayamOrder_but = findViewById(R.id.order_ayam);
        gorengOrder_but = findViewById(R.id.order_miegoreng);
        kuahOrder_but = findViewById(R.id.order_miekuah);
        myorder_but = findViewById(R.id.myorder_but);
        orderMore_but = findViewById(R.id.order_more);

        orderMore_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food.this, MainActivity.class);
                startActivity(intent);
            }
        });

        myorder_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food.this, MyOrder.class);
                startActivity(intent);
            }
        });

        sateOrder_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food.this, Order.class);
                intent.putExtra("Name","Sate Padang");
                intent.putExtra("Price",12000);

                startActivity(intent);
            }
        });

        ayamOrder_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food.this, Order.class);
                intent.putExtra("Name","Ayam Goreng");
                intent.putExtra("Price",10000);

                startActivity(intent);
            }
        });

        gorengOrder_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food.this, Order.class);
                intent.putExtra("Name","Indomie Goreng");
                intent.putExtra("Price",8000);

                startActivity(intent);
            }
        });

        kuahOrder_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food.this, Order.class);
                intent.putExtra("Name","Indomie Kuah");
                intent.putExtra("Price",8000);

                startActivity(intent);
            }
        });
    }
}