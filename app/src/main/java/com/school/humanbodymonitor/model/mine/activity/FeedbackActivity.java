package com.school.humanbodymonitor.model.mine.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.school.humanbodymonitor.R;
import com.school.humanbodymonitor.common.BaseActivity;

/**
 * 服务反馈
 */
public class FeedbackActivity extends BaseActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        initView();
    }

    private void initView() {
        toolbar = findViewById(R.id.tbMain);
        toolbar.setTitle("服务反馈");
        toolbar.setNavigationOnClickListener(v -> onBackPressed());
    }
}