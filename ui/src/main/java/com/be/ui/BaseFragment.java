package com.be.ui;


import android.support.v4.app.Fragment;


public class BaseFragment extends Fragment {

    protected boolean showBack = true;
    protected boolean showNavigation = true;

    @Override
    public void onResume() {
        super.onResume();
        if (!(this instanceof BaseViewPagerFragment)) {
            if (showBack) {
                showBack();
            } else {
                hideBack();
            }
            if (showNavigation) {
                showBottomNavigation();
            } else {
                hideBottomNavigation();
            }
        }
        //getAppActivity().hideProgress();
    }

    public BaseActivity getBaseActivity() {
        return (BaseActivity) getActivity();
    }

    protected void showBack() {
        getBaseActivity().showBack();
    }

    /*protected BottomNavigationView getBottomNavigation() {
        return getAppActivity().getBottomNavigationView();
    }*/

    protected void hideBottomNavigation() {
        //getBottomNavigation().setVisibility(View.GONE);
    }

    protected void showBottomNavigation() {
        //getBottomNavigation().setVisibility(View.VISIBLE);
    }


    protected void hideBack() {
        getBaseActivity().hideBack();
    }

}
