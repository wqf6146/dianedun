package cn.dianedun.activity;

import android.content.Intent;
import android.os.Bundle;

import com.umeng.analytics.MobclickAgent;
import com.vise.xsnow.event.EventSubscribe;


import butterknife.Bind;
import cn.dianedun.R;
import cn.dianedun.base.BaseActivity;
import cn.dianedun.event.MainTabSelectEvent;
import cn.dianedun.fragment.DetectionFragment;
import cn.dianedun.fragment.HomeFragment;
import cn.dianedun.fragment.MineFragment;
import cn.dianedun.fragment.VideoFragment;
import cn.dianedun.tools.App;
import cn.dianedun.tools.AppManager;
import cn.dianedun.tools.OtherService;
import cn.dianedun.view.BottomBarView.BottomBar;
import cn.dianedun.view.BottomBarView.BottomBarTab;
import me.yokeyword.fragmentation.SupportFragment;

public class MainActivity extends BaseActivity {

    @Bind(R.id.am_bottombar)
    BottomBar mBottomBar;

    SupportFragment[] mFragments = new SupportFragment[4];

    private int mTabIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setOnResumeRegisterBus(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        com.vise.xsnow.manager.AppManager.getInstance().addActivity(this);
        Intent intent = new Intent(getApplicationContext(), OtherService.class);
        startService(intent);
    }

    @Override
    protected void initView() {
        super.initView();
        mBottomBar.addItem(new BottomBarTab(this, R.mipmap.home_home1, R.mipmap.home_home, ""))
                .addItem(new BottomBarTab(this, R.mipmap.home_jc1, R.mipmap.home_jc, ""))
                .addItem(new BottomBarTab(this, R.mipmap.home_video1, R.mipmap.home_video, ""))
                .addItem(new BottomBarTab(this, R.mipmap.home_mine1, R.mipmap.home_mine, ""));
    }

    @Override
    protected void bindEvent() {
        super.bindEvent();
    }

    @EventSubscribe
    public void tabSelect(MainTabSelectEvent tabSelectEvent) {
        mBottomBar.setCurrentItem(tabSelectEvent.tab);
    }

    @Override
    protected void initData() {
        super.initData();
        mFragments[0] = HomeFragment.getInstance();
        mFragments[1] = DetectionFragment.getInstance();
        mFragments[2] = VideoFragment.getInstance();
        mFragments[3] = MineFragment.getInstance();

        loadMultipleRootFragment(R.id.am_contanier, 0, mFragments);

        mBottomBar.setOnTabSelectedListener(new BottomBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position, int prePosition) {
                showHideFragment(mFragments[position], mFragments[prePosition]);
            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {
            }
        });
    }

    public void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);       //统计时长
    }

    public void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }
}
