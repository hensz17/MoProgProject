package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Snacks extends AppCompatActivity {

    Button myorder_but, citatoOrder_but, laysOrder_but, doritosOrder_but, cheetosOrder_but, orderMore_but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);
        citatoOrder_but = findViewById(R.id.order_citato);
        laysOrder_but = findViewById(R.id.order_lays);
        doritosOrder_but = findViewById(R.id.order_doritos);
        cheetosOrder_but = findViewById(R.id.order_cheetos);
        myorder_but = findViewById(R.id.myorder_but);
        orderMore_but = findViewById(R.id.order_more);

        orderMore_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Snacks.this, MainActivity.class);
                startActivity(intent);
            }
        });
        myorder_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Snacks.this, MyOrder.class);
                startActivity(intent);
            }
        });

        citatoOrder_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Snacks.this, Order.class);
                intent.putExtra("Name","Chitato");
                intent.putExtra("Price",10000);

                startActivity(intent);
            }
        });

        laysOrder_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Snacks.this, Order.class);
                intent.putExtra("Name","Lays");
                intent.putExtra("Price",11000);

                startActivity(intent);
            }
        });

        doritosOrder_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Snacks.this, Order.class);
                intent.putExtra("Name","Doritos");
                intent.putExtra("Price",15000);

                startActivity(intent);
            }
        });

        cheetosOrder_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Snacks.this, Order.class);
                intent.putExtra("Name","Cheetos");
                intent.putExtra("Price",8000);

                startActivity(intent);
            }
        });
    }
}