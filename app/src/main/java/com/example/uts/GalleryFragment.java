package com.example.uts;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GalleryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GalleryFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView3;
    ArrayList<GalleryModel> dataHolder3;

    public GalleryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GalleryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GalleryFragment newInstance(String param1, String param2) {
        GalleryFragment fragment = new GalleryFragment();
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
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        RecyclerView recyclerView3 = view.findViewById(R.id.gallery_rv);
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView3.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        );
        dataHolder3 = new ArrayList<>();

        GalleryModel gob1 = new GalleryModel(R.drawable.myself);
        dataHolder3.add(gob1);

        GalleryModel gob2 = new GalleryModel(R.drawable.myself1);
        dataHolder3.add(gob2);

        GalleryModel gob3 = new GalleryModel(R.drawable.myself2);
        dataHolder3.add(gob3);

        GalleryModel gob4 = new GalleryModel(R.drawable.myself3);
        dataHolder3.add(gob4);

        GalleryModel gob5 = new GalleryModel(R.drawable.myself4);
        dataHolder3.add(gob5);

        GalleryModel gob6 = new GalleryModel(R.drawable.myself5);
        dataHolder3.add(gob6);

        GalleryModel gob7 = new GalleryModel(R.drawable.myself6);
        dataHolder3.add(gob7);

        GalleryModel gob8 = new GalleryModel(R.drawable.myself7);
        dataHolder3.add(gob8);
        recyclerView3.setAdapter(new GalleryRvAdapter(dataHolder3));

        return view;
    }
}