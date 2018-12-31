package com.theah64.auto_skype.ui.activities.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.theah64.auto_skype.R;
import com.theah64.auto_skype.databinding.ActivityLogInBinding;
import com.theah64.auto_skype.ui.activities.base.BaseBindingActivity;

public class LogInActivity extends BaseBindingActivity<ActivityLogInBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindContentView(R.layout.activity_log_in);
    }
}
