package com.example.yingyu.yue_ji.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.yingyu.yue_ji.R;
import com.example.yingyu.yue_ji.ui.adapter.ViewPagerFragmentAdapter;
import com.example.yingyu.yue_ji.ui.base.BasePresentter;
import com.example.yingyu.yue_ji.ui.base.MVPBaseActivity;
import com.example.yingyu.yue_ji.ui.base.MVPBaseFragment;
import com.example.yingyu.yue_ji.ui.fragment.DailyFragment;
import com.example.yingyu.yue_ji.ui.fragment.GanHuoFragment;
import com.example.yingyu.yue_ji.ui.fragment.ZhiHuRiBaoFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.yingyu.yue_ji.R.id.content_viewPager;


/**
 * Created by yingyu on 2016/11/6.
 */

public class MainActivity extends MVPBaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.app_bar_layout)
    AppBarLayout appBarLayout;
    @BindView(content_viewPager)
    ViewPager contentViewPager;
    @BindView(R.id.navigation_view)
    NavigationView navigationView;
    @BindView(R.id.drawerlayout)
    DrawerLayout drawerlayout;

    private List<MVPBaseFragment> fragmentList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initBarAndDrawlayout();
        initTabView();
    }

    private void initBarAndDrawlayout() {
        setSupportActionBar(toolbar);
        //顶部侧滑栏，打开和关闭
        ActionBarDrawerToggle actionBarDrawerToggle =
                new ActionBarDrawerToggle(this, drawerlayout, toolbar, R.string.open, R.string.close) {
                    @Override
                    public void onDrawerOpened(View drawerView) {
                        super.onDrawerOpened(drawerView);
                    }
                    @Override
                    public void onDrawerClosed(View drawerView) {
                        super.onDrawerClosed(drawerView);
                    }
                };
        actionBarDrawerToggle.syncState();//进去后为三杠，必须要有
        drawerlayout.addDrawerListener(actionBarDrawerToggle);
        //解决NavigationView中的图标是灰色的问题
        //mNavigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                drawerlayout.closeDrawers();
                switch (item.getItemId()) {
                    case R.id.zhihu:
                        goToPage(0);
                        return true;
                    case R.id.ganhuo:
                        goToPage(1);
                        return true;
                    case R.id.haoqixin:
                        goToPage(2);
                        return true;
                    case R.id.about_me:
                        startActivity(new Intent(MainActivity.this,AboutMeActivity.class));
                        return true;
                }
                return false;
            }
        });
    }

    private void initTabView() {

        fragmentList = new ArrayList<>();
        fragmentList.add(new ZhiHuRiBaoFragment());
        fragmentList.add(new GanHuoFragment());
        fragmentList.add(new DailyFragment());
        contentViewPager.setOffscreenPageLimit(3);
        final ViewPagerFragmentAdapter adapter = new ViewPagerFragmentAdapter(
                getSupportFragmentManager(), fragmentList);
        contentViewPager.setAdapter(adapter);
        contentViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                toolbar.setTitle( adapter.getPageTitle(position) );
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    private void goToPage(int pageCount) {
        contentViewPager.setCurrentItem(pageCount, true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about_me:
                startActivity(new Intent(this,AboutMeActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected BasePresentter createPresenter() {
        return null;
    }

    @OnClick({R.id.about_me, R.id.exit})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.about_me:
                //关于我
                drawerlayout.closeDrawers();
                startActivity(new Intent(this,AboutMeActivity.class));
                break;
            case R.id.exit:
                //退出应用
                finish();
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
