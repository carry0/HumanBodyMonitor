package com.school.humanbodymonitor.model.mine.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.school.humanbodymonitor.R;
import com.school.humanbodymonitor.common.BaseActivity;

/**
 * 收藏
 */
public class CollectActivity extends BaseActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect);
        initView();
    }

    private void initView() {
        toolbar = findViewById(R.id.tbMain);
        toolbar.setTitle("我的收藏");
        toolbar.setNavigationOnClickListener(v -> onBackPressed());
    }
}