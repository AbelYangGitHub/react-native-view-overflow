package com.entria.views;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.views.view.ReactViewGroup;

public class RNViewOverflowLayout extends ReactViewGroup {

    public RNViewOverflowLayout(Context context) {
        super(context);
    }

    protected boolean isClipChildren;
    public RNViewOverflowLayout setIsClipChildren(boolean isClipChildren) {
        this.isClipChildren = isClipChildren;
        return this;
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);

        try {
            ((ViewGroup) getParent()).setClipChildren(isClipChildren);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
