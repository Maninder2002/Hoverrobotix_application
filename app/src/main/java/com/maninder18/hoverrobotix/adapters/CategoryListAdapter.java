package com.maninder18.hoverrobotix.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.maninder18.hoverrobotix.R;
import com.maninder18.hoverrobotix.databinding.CatListItemBinding;
import com.maninder18.hoverrobotix.databinding.HoverboardCategoriesBinding;
import com.maninder18.hoverrobotix.model.CategoryItem;

import java.util.ArrayList;

public class CategoryListAdapter extends RecyclerView.Adapter<CategoryListAdapter.MyViewHolder> {

    Context context;
    ArrayList<CategoryItem> categoryArrayList;


    public CategoryListAdapter(Context context , ArrayList<CategoryItem> categoryArrayList) {
        this.context = context;
        this.categoryArrayList = categoryArrayList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = (LayoutInflater.from(context).inflate(R.layout.cat_list_item,parent,false));

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        CategoryItem categoryItem = categoryArrayList.get(position);
        holder.binding.label.setText(categoryItem.getName());
        Glide.with(context)
                .load(categoryItem.getIcon())
                .into(holder.binding.image);



    }

    @Override
    public int getItemCount() {
        return categoryArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        CatListItemBinding binding;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = CatListItemBinding.bind(itemView);
        }
    }
}
