package com.bignerdranch.administrator.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2018/3/31 0031.
 */

public class DateActivity extends SingleFragmentActivity {

    protected Fragment createFragment(){
        return new DatePickerFragment();
    }

}
