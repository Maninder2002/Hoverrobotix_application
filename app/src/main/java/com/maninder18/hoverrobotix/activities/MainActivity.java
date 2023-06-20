package com.maninder18.hoverrobotix.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.maninder18.hoverrobotix.AboutFragment;
import com.maninder18.hoverrobotix.ContactFragment;
import com.maninder18.hoverrobotix.HomeFragment;
import com.maninder18.hoverrobotix.Menu2Fragment;
import com.maninder18.hoverrobotix.ProductFragment;
import com.maninder18.hoverrobotix.R;
import com.maninder18.hoverrobotix.SettingsFragment;
import com.maninder18.hoverrobotix.adapters.CategoryAdapter;
import com.maninder18.hoverrobotix.adapters.ProductAdapter;
import com.maninder18.hoverrobotix.databinding.ActivityMainBinding;
import com.maninder18.hoverrobotix.model.Category;
import com.maninder18.hoverrobotix.model.Product;

import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    CategoryAdapter categoryAdapter;
    ArrayList<Category> categories;


    ProductAdapter productAdapter;
    ArrayList<Product> products;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    return true;
                case R.id.about:
                    startActivity(new Intent(getApplicationContext(), AboutActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;

                case R.id.contact:
                    startActivity(new Intent(getApplicationContext(), ContactActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
            }
            return false;
        });

//        replaceFragment(new HomeFragment());
//
//
//        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
//
//            switch (item.getItemId()){
//                case R.id.home:
//                    replaceFragment(new HomeFragment());
//                    break;
//                case R.id.about:
//                    replaceFragment(new AboutFragment());
//                    break;
//                case R.id.setting:
//                    replaceFragment(new SettingsFragment());
//                    break;
//                case R.id.contact:
//                    replaceFragment(new ContactFragment());
//                    break;
////                case R.id.product:
////                    replaceFragment(new ProductFragment());
////                    break;
//
//
//            }
//
//
//            return true;
//        });



        initCategories();
        initProducts();
        initSlider();


    }



//    private void replaceFragment(Fragment fragment){
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.frame_layout,fragment);
//        fragmentTransaction.commit();
//    }



    private void initSlider(){
        binding.carousel.addData(new CarouselItem("https://hoverrobotix.com/wp-content/uploads/2019/08/slider2.png","Believe you can and you are Halfway there"));
        binding.carousel.addData(new CarouselItem("https://hoverrobotix.com/wp-content/uploads/2019/11/slider1-1.png","Success is where Prepration and Opportunity meet "));

    }

    void initCategories(){
        categories = new ArrayList<>();
        categories.add(new Category("Hover-Board","https://hoverrobotix.com/wp-content/uploads/2019/10/X-Bot-Hoverboard-400x400-removebg-preview.png","#FFFF00","Hoverboards ",1));
        categories.add(new Category("Hover-Kart","https://hoverrobotix.com/wp-content/uploads/2019/08/Hoverboard-Drift-Kart-3-e1573136725495-400x400.png","#FF0000","HoverKarts",1));
        categories.add(new Category("Hover-board Accessories","https://hoverrobotix.com/wp-content/uploads/2019/08/Hoverboard-Power-Charger-e1573136672881-400x400.png","#0000FF","Accessories of Hover boards ",1));


        categoryAdapter = new CategoryAdapter(this,categories);

        GridLayoutManager layoutManager = new GridLayoutManager(this,3);
        binding.categoriesList.setLayoutManager(layoutManager);
        binding.categoriesList.setAdapter(categoryAdapter);
    }

    void initProducts(){
        products = new ArrayList<>();
        products.add(new Product(" Basic Hoverboard ","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","",1,1));
        products.add(new Product(" Basic Hoverboard ","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","",1,1));
        products.add(new Product(" Basic Hoverboard ","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","",1,1));
        products.add(new Product(" Basic Hoverboard ","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","",1,1));
        products.add(new Product(" Basic Hoverboard ","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","",1,1));
        products.add(new Product(" Basic Hoverboard ","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","",1,1));
        products.add(new Product(" Basic Hoverboard ","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","",1,1));
        products.add(new Product(" Basic Hoverboard ","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","",1,1));
        products.add(new Product(" Basic Hoverboard ","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","",1,1));


        productAdapter = new ProductAdapter(this , products);

        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        binding.productList.setLayoutManager(layoutManager);
        binding.productList.setAdapter(productAdapter);


    }

 }

