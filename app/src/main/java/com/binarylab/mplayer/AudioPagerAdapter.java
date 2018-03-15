package com.binarylab.mplayer;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.binarylab.mplayer.fragments.AlbumsFragment;

public class AudioPagerAdapter extends FragmentPagerAdapter {

    private static final String TAG = AudioPagerAdapter.class.getSimpleName();
    private static final int FRAGMENT_COUNT = 4;
    private Context context;

    public AudioPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AlbumsFragment();
            case 1:
                return new AlbumsFragment();
            case 2:
                return new AlbumsFragment();
            case 3:
                return new AlbumsFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.albums);
            case 1:
                return context.getString(R.string.artists);
            case 2:
                return context.getString(R.string.songs);
            case 3:
                return context.getString(R.string.genres);
            case 4:
                return context.getString(R.string.playlists);
        }
        return null;
    }
}
