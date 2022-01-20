package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Order extends AppCompatActivity {

    TextView orderName, orderPrice;
    EditText orderQty;

    Button myorder_but, order_but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        int price = intent.getIntExtra("Price",0);

        orderName = findViewById(R.id.namaorder);
        orderPrice = findViewById(R.id.hargaorder);
        orderQty = findViewById(R.id.qtyorder);
        order_but = findViewById(R.id.orderbutton);
        myorder_but = findViewById(R.id.myorder_but);

        orderName.setText(name);
        orderQty.setText("1");
        orderPrice.setText(Integer.toString(price));

        myorder_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Order.this, MyOrder.class);
                startActivity(intent);
            }
        });

        order_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.Items.add(new ItemView(name, price, Integer.parseInt(orderQty.getText().toString())));
                Toast.makeText(Order.this , "Order Successfully Added", Toast.LENGTH_SHORT).show();

            }
        });
    }

}