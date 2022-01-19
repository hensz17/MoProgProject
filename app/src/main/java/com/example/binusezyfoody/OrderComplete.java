package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderComplete extends AppCompatActivity {
    RecyclerView completeorderlist;
    Button mainmenu_but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_complete);

        completeorderlist = findViewById(R.id.completeorderlist);
        RecyclerAdapter orderAdapter = new RecyclerAdapter(this, false);
        completeorderlist.setAdapter(orderAdapter);
        completeorderlist.setLayoutManager(new LinearLayoutManager(this));

        mainmenu_but = findViewById(R.id.mainmenubut);

        mainmenu_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderComplete.this,MainActivity.class);
                MainActivity.Items.clear();
                startActivity(intent);
            }
        });
    }


}