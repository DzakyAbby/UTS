package com.example.uts;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;


public class DailyRvAdapter extends RecyclerView.Adapter<DailyRvAdapter.DailyViewHolder> {

    ArrayList<DailyModel> dataHolder;

    public DailyRvAdapter(ArrayList<DailyModel> dataHolder) {
        this.dataHolder = dataHolder;
    }

    @NonNull
    @Override
    public DailyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_item,parent,false);
        return new DailyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DailyViewHolder holder, int position) {

        holder.img.setImageResource(dataHolder.get(position).getImg());

        holder.txt.setText(dataHolder.get(position).getTxt());


    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

    class DailyViewHolder extends RecyclerView.ViewHolder{

        CircleImageView img, img2;
        TextView txt, txt2;

        public DailyViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.daily_image);
            img2 = itemView.findViewById(R.id.friends_image);
            txt = itemView.findViewById(R.id.daily_content);
            txt2 = itemView.findViewById(R.id.friends_nama);
        }
    }

}