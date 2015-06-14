package com.example.sunshine.app.Activities;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.transition.TransitionManager;
import android.view.Menu;
import android.view.MenuItem;
import com.example.sunshine.app.Fragments.PlaceHolderFragment;
import com.example.sunshine.app.R;

public class MainActivity extends Activity {

    PlaceHolderFragment fragment;

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment = new PlaceHolderFragment();

        FragmentTransaction manager = getFragmentManager().beginTransaction();
        manager.add(R.id.main_layout_frame,fragment);
        manager.commit();


    }
}
