package com.school.humanbodymonitor.model.home.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.school.humanbodymonitor.R;
import com.school.humanbodymonitor.model.home.fragment.doctor.*;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private TabLayout tabLayout;
    private ViewPager2 viewPager;
    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        viewPager = view.findViewById(R.id.view_pager);
        tabLayout = view.findViewById(R.id.tab_layout);

//        FragmentStateAdapter adapter = new FragmentStateAdapter(this) {
//
//            @Override
//            public int getItemCount() {
//                return 3;
//            }
//
//            @NonNull
//            @Override
//            public Fragment createFragment(int position) {
//                Fragment fragment = null;
//                switch (position) {
//                    case 0:
//                        fragment = new DeviceFragment();
//                        break;
//                    case 1:
//                        fragment = new BreatheDataFragment();
//                        break;
//                    default:
//                        fragment = new DiagnoseFragment();
//                        break;
//                }
//                return fragment;
//            }
//        };
        FragmentStateAdapter adapter = new FragmentStateAdapter(this) {

            @Override
            public int getItemCount() {
                return 2;
            }

            @NonNull
            @Override
            public Fragment createFragment(int position) {
                Fragment fragment = null;
                if (position == 0) {
                    fragment = new CaseFragment();
                } else {
                    fragment = new HistoryFragment();
                }
                return fragment;
            }
        };
        viewPager.setCurrentItem(0, false);
        viewPager.setAdapter(adapter);


        //用户端
//        new TabLayoutMediator(tabLayout,viewPager,(tab, position) -> {
//            switch (position) {
//                case 0:
//                    tab.setText("设备管理");
//                    break;
//                case 1:
//                    tab.setText("呼吸生理数据");
//                    break;
//                default:
//                    tab.setText("医生诊断");
//                    break;
//            }
//        }).attach();

        //医生端
//        new TabLayoutMediator(tabLayout,viewPager,(tab, position) -> {
//            if (position == 0) {
//                tab.setText("病例列表");
//            } else {
//                tab.setText("历史诊断记录");
//            }
//        }).attach();

        //管理端
        new TabLayoutMediator(tabLayout,viewPager,(tab, position) -> {
            if (position == 0) {
                tab.setText("用户管理");
            } else {
                tab.setText("数据管理");
            }
        }).attach();
    }
}