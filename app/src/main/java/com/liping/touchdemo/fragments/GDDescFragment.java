package com.liping.touchdemo.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.liping.touchdemo.DragLayout;
import com.liping.touchdemo.R;
import com.liping.touchdemo.fragments.child.BtmFragment;
import com.liping.touchdemo.fragments.child.TopFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class GDDescFragment extends Fragment {


    public GDDescFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gddesc, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        DragLayout dragLayout = view.findViewById(R.id.dragLayout);
        dragLayout.setNextPageListener(new DragLayout.ShowNextPageNotifier() {
            @Override
            public void onDragNext() {

            }
        });

        TopFragment top = new TopFragment();
        BtmFragment btm = new BtmFragment();
        getFragmentManager().beginTransaction()
                .add(R.id.top_lat, top, "top")
                .add(R.id.btm_lat, btm, "btm")
                .commit();
    }
}
