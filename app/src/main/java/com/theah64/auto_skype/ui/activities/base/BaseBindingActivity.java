package com.theah64.auto_skype.ui.activities.base;

import android.annotation.SuppressLint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

@SuppressLint("Registered")
public class BaseBindingActivity<B extends ViewDataBinding> extends BaseAppCompatActivity {

    private B binding;

    public void bindContentView(int layoutResID) {
        binding = DataBindingUtil.setContentView(this, layoutResID);
    }

    public B getBinding() {
        return binding;
    }
}
