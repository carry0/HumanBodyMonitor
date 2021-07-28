package com.school.humanbodymonitor.model.home;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.school.humanbodymonitor.R;
import com.school.humanbodymonitor.common.BaseActivity;
import com.school.humanbodymonitor.model.home.fragment.HomeFragment;
import com.school.humanbodymonitor.model.mine.MineFragment;
import com.school.humanbodymonitor.model.query.QueryFragment;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends BaseActivity {
    private BottomNavigationView bottomNavigationView;
    private List<Fragment> fragmentList;
    private HomeFragment homeFragment;
    private QueryFragment queryFragment;
    private MineFragment mineFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoem);
        initView();
        initListener();
    }

    private void initView() {
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        fragmentList = new ArrayList<>();
        homeFragment = new HomeFragment();
        fragmentList.add(homeFragment);
        hide(homeFragment,true);
    }

    private void initListener() {
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            int i = item.getItemId();
            if (i == R.id.page_1) {
                hide(homeFragment,false);
                return true;
            } else if (i == R.id.page_2) {
                if (queryFragment==null){
                    queryFragment = new QueryFragment();
                    fragmentList.add(queryFragment);
                    hide(queryFragment,true);
                }else {
                    hide(queryFragment,false);
                }
                return true;
            } else if (i == R.id.page_3) {
                if (mineFragment==null){
                    mineFragment = new MineFragment();
                    fragmentList.add(mineFragment);
                    hide(mineFragment,true);
                }else {
                    hide(mineFragment,false);
                }
                return true;
            }
            return false;
        });
    }

    private void hide(Fragment fragment,boolean add) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (add){
            fragmentTransaction.add(R.id.frame_layout, fragment);
        }
        for (Fragment fragments : fragmentList) {
            if (fragment.equals(fragments)) {
                fragmentTransaction.show(fragments);
            } else {
                fragmentTransaction.hide(fragments);
            }
        }
        fragmentTransaction.commit();
    }

}