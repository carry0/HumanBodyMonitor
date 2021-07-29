package com.school.humanbodymonitor.model.login;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.school.humanbodymonitor.R;
import com.school.humanbodymonitor.common.BaseActivity;

public class RegisterActivity extends BaseActivity {

    private Toolbar tbMain;
    private CheckBox checkbox;
    private LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
        initViewListener();
    }

    private void initView() {
        tbMain = findViewById(R.id.tbMain);
        checkbox = findViewById(R.id.checkbox);
        layout = findViewById(R.id.ll_select);
    }

    private void initViewListener() {
        tbMain.setNavigationOnClickListener(v -> onBackPressed());
    }

    public void consentListener(View view) {
        if (!checkbox.isChecked()){
            layout.setAnimation(AnimationUtils.loadAnimation(this,R.anim.transla_checkbox));
            return;
        }
        onBackPressed();
    }
}