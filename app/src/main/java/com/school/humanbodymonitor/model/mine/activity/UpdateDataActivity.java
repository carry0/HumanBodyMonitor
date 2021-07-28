package com.school.humanbodymonitor.model.mine.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.school.humanbodymonitor.R;
import com.school.humanbodymonitor.common.BaseActivity;

public class UpdateDataActivity extends BaseActivity {

    private MaterialButton butSave;
    private EditText etUserName,etIdentityCard,etPhoneNo,etAge,etPassword,etConfirmPassword;
    private MaterialCheckBox sex1,sex2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_data);
        initView();
        initListener();
    }

    private void initView() {
        butSave = findViewById(R.id.but_save);
        etUserName = findViewById(R.id.et_user_name);
        etIdentityCard = findViewById(R.id.et_identity_card);
        etPhoneNo = findViewById(R.id.et_phone_no);
        etAge = findViewById(R.id.et_age);
        etPassword = findViewById(R.id.et_password);
        etConfirmPassword = findViewById(R.id.et_confirm_password);
        sex1 = findViewById(R.id.sex_1);
        sex2 = findViewById(R.id.sex_2);
    }

    private void initListener() {
        butSave.setOnClickListener(v ->save());
        sex1.setOnClickListener(v -> {
            if (sex1.isChecked()){
                sex2.setChecked(false);
            }
        });
        sex2.setOnClickListener(v -> {
            if (sex1.isChecked()){
                sex1.setChecked(false);
            }
        });
    }

    private void save() {
        if (TextUtils.isEmpty(etUserName.getText())){
            Toast.makeText(this, "用户名字不能为空！", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(etIdentityCard.getText())){
            Toast.makeText(this, "证件号码不能为空！", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(etPhoneNo.getText())){
            Toast.makeText(this, "手机号码不能为空！", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(etAge.getText())){
            Toast.makeText(this, "年龄不能为空！", Toast.LENGTH_SHORT).show();
            return;
        }
        if (etPassword.getText().toString().equals(etConfirmPassword.getText().toString())){
            Toast.makeText(this, "密码不一致，请重新输入！", Toast.LENGTH_SHORT).show();
            return;
        }
        onBackPressed();
    }
}