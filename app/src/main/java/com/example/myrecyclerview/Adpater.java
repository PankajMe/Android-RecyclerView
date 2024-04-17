package com.example.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adpater extends RecyclerView.Adapter<Adpater.MyViewHolder> {

    List<NewUser> listUser;
    Context context;

    public Adpater(List<NewUser> listUser, Context context) {
        this.listUser = listUser;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View myview = LayoutInflater.from(context).inflate(R.layout.listitem,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(myview);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        NewUser user = listUser.get(position);

        holder.name.setText(user.getName());
        holder.gmail.setText(user.getEmail());
        holder.id.setText(user.getId());
    }

    @Override
    public int getItemCount() {
        return listUser.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView name,id,gmail;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.textView);
            id = itemView.findViewById(R.id.textView2);
            gmail = itemView.findViewById(R.id.textView3);
        }
    }
}
