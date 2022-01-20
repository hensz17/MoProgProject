package com.example.binusezyfoody;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    Context context;
    boolean hasDelete;

    public RecyclerAdapter (Context context, boolean hasDelete){
        this.context = context;
        this.hasDelete = hasDelete;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_itemview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
        ItemView item = MainActivity.Items.get(position);
        holder.itemName.setText(item.getName());
        holder.itemPrice.setText(Integer.toString(item.getPrice()));
        holder.itemQty.setText(Integer.toString(item.getQuantity()));
        if (hasDelete) {
            holder.deleteOrder_but.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int p = MainActivity.Items.indexOf(item);
                    MainActivity.Items.remove(p);
                    notifyItemRemoved(p);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return MainActivity.Items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView itemName, itemPrice, itemQty;
        Button deleteOrder_but;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemName = itemView.findViewById(R.id.itemviewname);
            itemPrice = itemView.findViewById(R.id.itemviewprice);
            itemQty = itemView.findViewById(R.id.itemviewqty);
            deleteOrder_but = itemView.findViewById(R.id.deleteorderbut);
            if (!hasDelete) {
                deleteOrder_but.setVisibility(View.GONE);
            }
        }
    }


}
