package com.liping.touchdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.liping.touchdemo.fragments.GDComtFragment;
import com.liping.touchdemo.fragments.GDDescFragment;
import com.liping.touchdemo.fragments.GDUrlFragment;
import com.liping.touchdemo.fragments.child.TopFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private String [] titles=new String[]{"商品","评价","详情"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new PagerFragment(getSupportFragmentManager(), addFragments(),titles));
        viewPager.setOffscreenPageLimit(2);
        tabLayout.setupWithViewPager(viewPager);
    }

    private List<Fragment> addFragments() {
        List<Fragment> data= new ArrayList<>();
        data.add(new GDDescFragment());
        data.add(new GDComtFragment());
        data.add(new GDUrlFragment());
        return data;
    }
}
