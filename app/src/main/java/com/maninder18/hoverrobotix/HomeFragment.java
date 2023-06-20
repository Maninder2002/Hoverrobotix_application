package com.maninder18.hoverrobotix;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.maninder18.hoverrobotix.adapters.CategoryAdapter;
import com.maninder18.hoverrobotix.adapters.ProductAdapter;
//import com.maninder18.hoverrobotix.databinding.ActivityMainBinding;
import com.maninder18.hoverrobotix.model.Category;
import com.maninder18.hoverrobotix.model.Product;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private RecyclerView categoryList;
    private RecyclerView productList;



    ProductAdapter productAdapter;
    ArrayList<Product> products;

    public HomeFragment() {

    }


    private CategoryAdapter categoryAdapter;

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        categoryList = view.findViewById(R.id.categoriesList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        categoryList.setLayoutManager(layoutManager);

        ArrayList<Category> categories;

        categories = new ArrayList<>();
        categories.add(new Category("Hover-Board", "https://hoverrobotix.com/wp-content/uploads/2019/10/X-Bot-Hoverboard-400x400-removebg-preview.png", "#FFFF00", "Hoverboards ", 1));
        categories.add(new Category("Hover-Kart", "https://hoverrobotix.com/wp-content/uploads/2019/08/Hoverboard-Drift-Kart-3-e1573136725495-400x400.png", "#FF0000", "HoverKarts", 2));
        categories.add(new Category("Hover-board Accessories", "https://hoverrobotix.com/wp-content/uploads/2019/08/Hoverboard-Power-Charger-e1573136672881-400x400.png", "#0000FF", "Accessories of Hover boards ", 3));


        categoryAdapter = new CategoryAdapter(getActivity(), categories);

        categoryList.setAdapter(categoryAdapter);
        categoryAdapter.notifyDataSetChanged();

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),3);
        categoryList.setLayoutManager(gridLayoutManager);
        categoryList.setAdapter(categoryAdapter);

        ImageCarousel carousel = view.findViewById(R.id.carousel);
        carousel.addData(new CarouselItem("https://hoverrobotix.com/wp-content/uploads/2019/08/slider2.png","Believe you can and you are Halfway there"));
        carousel.addData(new CarouselItem("https://hoverrobotix.com/wp-content/uploads/2019/11/slider1-1.png","Success is where Prepration and Opportunity meet "));


//        products = new ArrayList<>();
//        products.add(new Product(" Basic Hoverboard ","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","",1,1));
//        products.add(new Product(" Basic Hoverboard ","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","",1,1));
//        products.add(new Product(" Basic Hoverboard ","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","",1,1));
//        products.add(new Product(" Basic Hoverboard ","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","",1,1));
//        products.add(new Product(" Basic Hoverboard ","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","",1,1));
//        products.add(new Product(" Basic Hoverboard ","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","",1,1));
//        products.add(new Product(" Basic Hoverboard ","https://hoverrobotix.com/wp-content/uploads/2019/08/Basic-Hoverboard.png","",1,1));
//
//        productAdapter = new ProductAdapter(getActivity(), products);
//
//
//        GridLayoutManager layoutManager2 = new GridLayoutManager(getActivity(),2);
//        productList = view.findViewById(R.id.productList);
//        productList.setLayoutManager(layoutManager2);
//        productList.setAdapter(productAdapter);

        return view;


    }

}


