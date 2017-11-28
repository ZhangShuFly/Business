package com.ilyzs.business.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.ilyzs.basecompat.util.LeakCanaryTest;
import com.ilyzs.business.R;
import com.ilyzs.business.base.BussinessBaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LeakCanaryActivity extends BussinessBaseActivity {

    @BindView(R.id.tv_leak_test)
    TextView leakTestTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void initPara() {

    }

    @Override
    public void loadView() {
        setContentView(R.layout.activity_leak_canary);
        ButterKnife.bind(this);

        boolean hasTwoPanes = getResources().getBoolean(R.bool.has_two_panes);
        leakTestTv.setText(getString(R.string.leak_tip)+"\nhasTwoPanes:"+hasTwoPanes);

        LeakCanaryTest.getInstance(this);
    }

    @Override
    public void loadData() {

    }
}
