package com.example.ur15975outlookcom.geoquiz;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by ur15975@outlook.com on 2017/3/18.
 */

public abstract class SingleFragmentActivity extends FragmentActivity {
    protected abstract Fragment createFragment();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fragmentActivity = getSupportFragmentManager();
        Fragment fragment = fragmentActivity.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = createFragment();
            fragmentActivity.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}
