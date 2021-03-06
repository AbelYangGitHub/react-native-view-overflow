package com.entria.views;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;

public class RNViewOverflowManager extends ViewGroupManager<RNViewOverflowLayout> {

    public static final String REACT_CLASS = "RNViewOverflow";

    @ReactProp(name = "isClipChildren", defaultBoolean = false)
    public void setIsClipChildren(RNViewOverflowLayout rnViewOverflowLayout, Boolean prop) {
        rnViewOverflowLayout.setIsClipChildren(prop);
    }

    @Override
     protected RNViewOverflowLayout createViewInstance(ThemedReactContext reactContext) {
        return new RNViewOverflowLayout(reactContext);
     }

    @Override
    public String getName() {
        return REACT_CLASS;
    }

}
