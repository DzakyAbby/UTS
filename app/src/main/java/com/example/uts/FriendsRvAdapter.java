package com.example.uts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;



public class FriendsRvAdapter extends RecyclerView.Adapter<FriendsRvAdapter.FriendsViewHolder> {

    ArrayList<FriendsModel> dataHolder2;

    public FriendsRvAdapter(ArrayList<FriendsModel> dataHolder2) {
        this.dataHolder2 = dataHolder2;
    }

    @NonNull
    @Override
    public FriendsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_item2,parent,false);
        return new FriendsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendsViewHolder holder2, int position) {

        holder2.img2.setImageResource(dataHolder2.get(position).getImg2());
        holder2.txt2.setText(dataHolder2.get(position).getTxt2());

    }

    @Override
    public int getItemCount() {
        return dataHolder2.size();
    }

    class FriendsViewHolder extends RecyclerView.ViewHolder{

        CircleImageView img2;
        TextView txt2;

        public FriendsViewHolder(@NonNull View itemView) {
            super(itemView);
            img2 = itemView.findViewById(R.id.friends_image);
            txt2 = itemView.findViewById(R.id.friends_nama);
        }
    }

}