package com.maninder18.hoverrobotix.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.maninder18.hoverrobotix.R;
import com.maninder18.hoverrobotix.databinding.HoverboardCategoriesBinding;
import com.maninder18.hoverrobotix.model.Category;

import java.util.ArrayList;
import java.util.Locale;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>{

    Context context;
    ArrayList<Category> categories;

    public CategoryAdapter(Context context, ArrayList<Category> categories){
        this.context =context;
        this.categories = categories;

    }


    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CategoryViewHolder(LayoutInflater.from(context).inflate(R.layout.hoverboard_categories,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        Category category = categories.get(position);
        holder.binding.label.setText(category.getName());
        Glide.with(context)
                .load(category.getIcon())
                .into(holder.binding.image);

        holder.binding.image.setBackgroundColor(Color.parseColor(category.getColor()));
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        HoverboardCategoriesBinding binding;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = HoverboardCategoriesBinding.bind(itemView);
        }
    }
}




//
//public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>{
//
//    Context context;
//    ArrayList<Category> categories;
//
//    public CategoryAdapter(Context context, ArrayList<Category> categories){
//        this.context =context;
//        this.categories = categories;
//
//    }
//
//
//    @NonNull
//    @Override
//    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return new CategoryViewHolder(LayoutInflater.from(context).inflate(R.layout.hoverboard_categories,parent,false));
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
//        Category category = categories.get(position);
//        holder.binding.label.setText(category.getName());
//        Glide.with(context)
//                .load(category.getIcon())
//                .into(holder.binding.image);
//
//        holder.binding.image.setBackgroundColor(Color.parseColor(category.getColor()));
//    }
//
//    @Override
//    public int getItemCount() {
//        return categories.size();
//    }
//
//    public class CategoryViewHolder extends RecyclerView.ViewHolder {
//
//        HoverboardCategoriesBinding binding;
//
//        public CategoryViewHolder(@NonNull View itemView) {
//            super(itemView);
//            binding = HoverboardCategoriesBinding.bind(itemView);
//        }
//    }
//}