package com.afollestad.silk.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * A TextView that automatically sets its typeface to Roboto Light (a thinner version of Roboto). The font is loaded
 * from the library's assets so it will work on any version of Android.
 *
 * @author Aidan Follestad
 */
public class SilkTextView extends TextView {

    public SilkTextView(Context context) {
        super(context);
        init();
    }

    public SilkTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SilkTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "Roboto-Light.ttf");
        setTypeface(tf);
    }
}