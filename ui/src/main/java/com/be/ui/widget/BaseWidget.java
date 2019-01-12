package com.be.ui.widget;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;

public abstract class BaseWidget extends LinearLayoutCompat {

    private boolean baseInitCalled = false;

    public BaseWidget(@NonNull Context context) {
        super(context);
        init(context, null);
        checkBaseInit();
    }

    public BaseWidget(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
        checkBaseInit();
    }

    public BaseWidget(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
        checkBaseInit();
    }

    private void checkBaseInit() {
        if (!baseInitCalled) {
            throw new IllegalStateException();
        }
    }

    @CallSuper
    protected void init(Context context, AttributeSet attrs) {
        setOrientation(VERTICAL);
        baseInitCalled = true;
    }

}
