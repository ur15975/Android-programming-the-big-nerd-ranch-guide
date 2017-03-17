package com.example.ur15975outlookcom.geoquiz;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CrimeActivity extends FragmentActivity {

    private Button mTrueButton;
    private Button mFalseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        FragmentManager fragmentActivity = getSupportFragmentManager();
        Fragment fragment = fragmentActivity.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new CrimeFragment();
            fragmentActivity.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}
