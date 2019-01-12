package com.be.ui;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by Levashkin Konstantin on 3/29/18
 */

public class Navigator {

    private @IdRes
    Integer fragmentContainer;

    public Navigator(@IdRes Integer fragmentContainer) {
        this.fragmentContainer = fragmentContainer;
    }

    //Use for ViewPager back
    public void popTransaction(Fragment fragment, int popCount) {
        android.support.v4.app.FragmentManager fm = fragment.getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.remove(fragment);
        transaction.commit();
        for (int i = 0; i < popCount; i++) {
            fm.popBackStack();
        }
    }

    //TODO: Use later for Generic provider classes
    /*
    public void setFragment(BaseFragment fromFragment, Class<? extends BaseFragment> toFragmentClass, BaseActivity activity) {
        setFragment(fromFragment, Provider.getFragment(toFragmentClass), activity);
    }*/

    public void setFragment(BaseFragment fromFragment, BaseFragment toFragment, BaseActivity activity) {
        FragmentTransaction fragmentTransaction = activity.getSupportFragmentManager().beginTransaction();
        if (fromFragment != null) {
            fragmentTransaction.addToBackStack(fromFragment.getClass().getName());
        }
        fragmentTransaction.replace(activity.findViewById(fragmentContainer).getId(), toFragment);
        fragmentTransaction.commit();
    }

    public void popBackStack(BaseActivity activity) {
        activity.getSupportFragmentManager().popBackStack();
    }

    private void notSupported() {
        throw new UnsupportedOperationException();
    }

}
