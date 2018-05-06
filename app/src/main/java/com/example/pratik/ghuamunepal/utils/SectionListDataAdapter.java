package com.example.pratik.ghuamunepal.utils;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pratik.ghuamunepal.R;

import java.util.ArrayList;

public class SectionListDataAdapter extends RecyclerView.Adapter<SectionListDataAdapter.SingleItemRowHolder>{

    private ArrayList<SingleItemModel> itemModels;
    private Context mContext;

    public SectionListDataAdapter(ArrayList<SingleItemModel> itemModels, Context mContext) {
        this.itemModels = itemModels;
        this.mContext = mContext;
    }

    @Override
    public SingleItemRowHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_single_place, null);
        SingleItemRowHolder singleItemRowHolder = new SingleItemRowHolder(v);
        return singleItemRowHolder;
    }

    @Override
    public void onBindViewHolder(SingleItemRowHolder holder, int position) {
        SingleItemModel itemModel = itemModels.get(position);
        holder.tvName.setText(itemModel.getName());
        holder.tvAddress.setText(itemModel.getAddress());
        holder.tvInfo.setText(itemModel.getInfo());
        holder.imageView.setImageResource(itemModel.getImage());
    }

    @Override
    public int getItemCount() {
        return (null != itemModels ? itemModels.size() : 0);
    }

    public class SingleItemRowHolder extends RecyclerView.ViewHolder {

        protected TextView tvName,tvAddress,tvInfo;
        protected ImageView imageView;

        public SingleItemRowHolder(View itemView) {
            super(itemView);
            this.tvName = itemView.findViewById(R.id.tv_name);
            this.tvAddress = itemView.findViewById(R.id.tv_address);
            this.tvInfo = itemView.findViewById(R.id.tv_info);
            this.imageView = itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(), "Item clicked"+tvName.getText(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}