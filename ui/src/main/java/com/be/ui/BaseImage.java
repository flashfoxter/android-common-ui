package com.be.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

public class BaseImage extends AppCompatImageView {

    public BaseImage(Context context) {
        super(context);
        init(context, null);
    }

    public BaseImage(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public BaseImage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    public void init(Context context, @Nullable AttributeSet attrs) {

    }

   /* public void load(String notFullUrl, PlaceholderType placeholderType) {
        String fullUrl = MessageFormat.format("{0}{1}", ApiClient.urlImages, notFullUrl);
        Picasso.get().load(fullUrl).placeholder(placeholder).fit().centerCrop().into(this);
    }*/
}