package com.anynews.newsheadlines;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EntFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EntFragment extends Fragment {
    private ViewFlipper viewFlipper;
    private ImageView s1, s2, s3, s4, s5, s6, s7, s8;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EntFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EntFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EntFragment newInstance(String param1, String param2) {
        EntFragment fragment = new EntFragment();
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
        View view= inflater.inflate(R.layout.fragment_ent, container, false);
        setFlipper(view);
        return  view;
    }

    private void setFlipper(View view) {
        viewFlipper = (ViewFlipper) view.findViewById(R.id.flipper1);
        s1 = (ImageView)view. findViewById(R.id.s1);
        s2 = (ImageView)view. findViewById(R.id.s2);
        s3 = (ImageView)view. findViewById(R.id.s3);
        s4 = (ImageView)view. findViewById(R.id.s4);
        s5 = (ImageView) view.findViewById(R.id.s5);
        s6 = (ImageView)view. findViewById(R.id.s6);

        viewFlipper.setInAnimation(getActivity(), R.anim.slide_in_right);
        viewFlipper.setOutAnimation(getActivity(), R.anim.slide_out_left);
        viewFlipper.startFlipping();

    }
}