package com.school.humanbodymonitor.model.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.school.humanbodymonitor.R;
import com.school.humanbodymonitor.common.BaseActivity;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onRegisterListener(View view) {
        startActivity(new Intent(this,RegisterActivity.class));
    }
}