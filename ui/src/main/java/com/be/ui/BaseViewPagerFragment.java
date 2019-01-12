package com.be.ui;

import lombok.Getter;


public abstract class BaseViewPagerFragment extends BaseFragment implements ViewPagerFragment {

    @Getter
    private String viewPagerTitle;

    //@StringRes int viewPagerTitle
    public void setViewPagerTitle(String str) {
        this.viewPagerTitle = str;
        //Ui.getString(viewPagerTitle);
    }

    @Override
    public void onSelected() {

    }
}