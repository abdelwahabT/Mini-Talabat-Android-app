package com.example.pizzahut;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PizzaAdapter extends RecyclerView.Adapter<PizzaAdapter.ViewHolder> {

    PizzaData[] pizzaData;
    Context context;

    public PizzaAdapter(PizzaData[] pizzaData,MainActivity activity) {
        this.pizzaData = pizzaData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.pizza_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final PizzaData pizzaDataList = pizzaData[position];
        holder.textViewName.setText(pizzaDataList.getPizzaName());
        holder.textViewPrice.setText(pizzaDataList.getPizzaPrice());
        holder.pizzaImage.setImageResource(pizzaDataList.getPizzaImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,pizzaDataList.getPizzaName(), Toast.LENGTH_SHORT  ).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView pizzaImage;
        TextView  textViewName;
        TextView   textViewPrice;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
               pizzaImage = itemView.findViewById(R.id.imageView);
               textViewName = itemView.findViewById(R.id.textName);
            textViewPrice = itemView.findViewById(R.id.textPrice);

        }
    }
}
