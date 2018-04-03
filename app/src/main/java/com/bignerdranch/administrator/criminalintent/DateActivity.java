package com.bignerdranch.administrator.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2018/3/31 0031.
 */

public class DateActivity extends SingleFragmentActivity {

    /**
     * 继承SingleFragmentActivity用来托管DatePickerFragment()
     * @return
     */
    protected Fragment createFragment(){
        return new DatePickerFragment();
    }

}
