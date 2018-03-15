package com.binarylab.mplayer.fragments;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.binarylab.mplayer.AudioPagerAdapter;
import com.binarylab.mplayer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AudioFragment extends Fragment {

    private static final String TAG = AudioFragment.class.getSimpleName();
    private TabLayout tabLayout;
    private ViewPager viewPager;

    public AudioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_audio, container, false);
        tabLayout = view.findViewById(R.id.tabs);
        viewPager = view.findViewById(R.id.view_pager);
        viewPager.setAdapter(new AudioPagerAdapter(getChildFragmentManager(), getContext()));
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }

}
