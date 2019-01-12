package com.be.ui;

import android.support.multidex.MultiDexApplication;

import lombok.Getter;
import lombok.Setter;

public abstract class BaseApplication extends MultiDexApplication {

    // @formatter:off
    @Getter
    @Setter
    private BaseActivity currentActivity = null;
}
