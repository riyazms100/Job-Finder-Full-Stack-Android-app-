package com.example.studystint;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.Filter;
import android.widget.Filterable;


public class My_Adapter extends RecyclerView.Adapter<My_Adapter.MyViewHolder> {


    Context context;

    ArrayList<DataClass> list;

    

    public My_Adapter(Context context, ArrayList<DataClass> list) {
        this.context = context;
        this.list = list;

    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.recycler_item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        DataClass dataClass = list.get(position);
        holder.companyname.setText(dataClass.getName());
        holder.work.setText(dataClass.getJobposting());
        holder.workdetails.setText(dataClass.getWorkdetails());
        holder.compensation.setText(dataClass.getCompensation());
        holder.contacty.setText(dataClass.getContact());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class  MyViewHolder extends RecyclerView.ViewHolder{


        TextView companyname, work, workdetails, compensation, contacty;





           public MyViewHolder (@NonNull View itemView){
               super(itemView);

               companyname = itemView.findViewById(R.id.companyname);
               work        = itemView.findViewById(R.id.work);
               workdetails = itemView.findViewById(R.id.workdetails);
               compensation = itemView.findViewById(R.id.compensation);
               contacty = itemView.findViewById(R.id.contacty);





           }





       }


}


