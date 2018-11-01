package com.example.firoz.recycler_view_card_view.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.firoz.recycler_view_card_view.BanglaActivity;
import com.example.firoz.recycler_view_card_view.EnglishActivity;
import com.example.firoz.recycler_view_card_view.R;
import com.example.firoz.recycler_view_card_view.activity.MainActivity;
import com.example.firoz.recycler_view_card_view.model.Mcq;
import com.example.firoz.recycler_view_card_view.model.Mcq;

import java.util.List;

public class MCqAdapter extends RecyclerView.Adapter<MCqAdapter.ViewHolder> {

    private Context context;
    private List<Mcq> mcqList;


    public MCqAdapter(Context context, List<Mcq> mcqList) {
        this.mcqList = mcqList;
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)  {

        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_layout, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.imageView.setImageResource(mcqList.get(i).getImage());
        viewHolder.imageView2.setImageResource(mcqList.get(i).getImage());

        viewHolder.imageView3.setImageResource(mcqList.get(i).getImage());

        viewHolder.imageView4.setImageResource(mcqList.get(i).getImage());

        viewHolder.bangla.setText(mcqList.get(i).getName());
        viewHolder.english.setText(mcqList.get(i).getName());

        viewHolder.math.setText(mcqList.get(i).getName());

        viewHolder.ict.setText(mcqList.get(i).getName());


    }

    @Override
    public int getItemCount() {

        return mcqList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView,imageView2,imageView3,imageView4;
        TextView bangla,english,math,ict;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id._imageView);
            imageView2 = itemView.findViewById(R.id._imageView2);

            imageView3 = itemView.findViewById(R.id._imageView3);

            imageView4= itemView.findViewById(R.id._imageView4);

            bangla = itemView.findViewById(R.id.banglaId);
            english = itemView.findViewById(R.id.englishId);
            math = itemView.findViewById(R.id.mathId);
            ict = itemView.findViewById(R.id.ictId);

          /*  bangla.setOnClickListener(this);
            english.setOnClickListener(this);
            math.setOnClickListener(this);
            ict.setOnClickListener(this);
*/



        }
    }
}
