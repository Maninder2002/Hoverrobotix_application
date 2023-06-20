package com.maninder18.hoverrobotix;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.maninder18.hoverrobotix.adapters.CategoryListAdapter;
import com.maninder18.hoverrobotix.model.CategoryItem;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProductFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProductFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private RecyclerView categoryItemList;

    CategoryListAdapter CategoryListAdapter;

    ArrayList<CategoryItem> categoryArrayList;

    public ProductFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProductFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProductFragment newInstance(String param1, String param2) {
        ProductFragment fragment = new ProductFragment();
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


        View view = inflater.inflate(R.layout.fragment_product, container, false);


        categoryArrayList = new ArrayList<>();
        categoryArrayList.add(new CategoryItem("Hover-Board", "https://hoverrobotix.com/wp-content/uploads/2019/10/X-Bot-Hoverboard-400x400-removebg-preview.png", "", "Hoverboards ", 1));
        categoryArrayList.add(new CategoryItem("Hover-Kart", "https://hoverrobotix.com/wp-content/uploads/2019/08/Hoverboard-Drift-Kart-3-e1573136725495-400x400.png", "", "HoverKarts", 2));
        categoryArrayList.add(new CategoryItem("Hover-board Accessories", "https://hoverrobotix.com/wp-content/uploads/2019/08/Hoverboard-Power-Charger-e1573136672881-400x400.png", "", "Accessories of Hover boards ", 3));

        CategoryListAdapter =new CategoryListAdapter(getActivity(),categoryArrayList);

        categoryItemList = view.findViewById(R.id.categoryItemList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        categoryItemList.setLayoutManager(layoutManager);
        categoryItemList.setAdapter(CategoryListAdapter);

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),0);
//        categoryItemList = view.findViewById(R.id.categoryItemList);
//        categoryItemList.setLayoutManager(gridLayoutManager);


        return view;
    }
}