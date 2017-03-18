package com.example.ur15975outlookcom.geoquiz;

import android.support.v4.app.Fragment;

/**
 * Created by ur15975@outlook.com on 2017/3/18.
 */

public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
