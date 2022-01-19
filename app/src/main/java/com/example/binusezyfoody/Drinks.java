package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Drinks extends AppCompatActivity {

    Button myorder_but,orangeOrder_but,waterOrder_but,teaOrder_but,coffeeOrder_but,orderMore_but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
        orangeOrder_but = findViewById(R.id.order_orange);
        waterOrder_but = findViewById(R.id.order_water);
        teaOrder_but = findViewById(R.id.order_tea);
        coffeeOrder_but = findViewById(R.id.order_coffee);
        myorder_but = findViewById(R.id.myorder_but);
        orderMore_but = findViewById(R.id.order_more);

        orderMore_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drinks.this, MainActivity.class);
                startActivity(intent);
            }
        });

        myorder_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drinks.this, MyOrder.class);
                startActivity(intent);
            }
        });

        orangeOrder_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drinks.this, Order.class);
                intent.putExtra("Name","Orange Juice");
                intent.putExtra("Price",7000);

                startActivity(intent);
            }
        });

        waterOrder_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drinks.this, Order.class);
                intent.putExtra("Name","Water");
                intent.putExtra("Price",4000);

                startActivity(intent);
            }
        });

        teaOrder_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drinks.this, Order.class);
                intent.putExtra("Name","Tea");
                intent.putExtra("Price",5000);

                startActivity(intent);
            }
        });

        coffeeOrder_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drinks.this, Order.class);
                intent.putExtra("Name","Coffee");
                intent.putExtra("Price",5000);

                startActivity(intent);
            }
        });

    }
}