package com.oblador.shimmer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNShimmeringViewManagerInterface;
import com.facebook.react.viewmanagers.RNShimmeringViewManagerDelegate;

@ReactModule(name = RNShimmerManagerImpl.NAME)
public class RNShimmerManager extends ViewGroupManager<RNShimmeringView> implements RNShimmeringViewManagerInterface<RNShimmeringView> {

    private final ViewManagerDelegate<RNShimmeringView> mDelegate;

    public RNShimmerManager(ReactApplicationContext context) {
        mDelegate = new RNShimmeringViewManagerDelegate<>(this);
    }

    @NonNull
    @Override
    protected ViewManagerDelegate<RNShimmeringView> getDelegate() {
        return mDelegate;
    }

    @NonNull
    @Override
    public String getName() {
        return RNShimmerManagerImpl.NAME;
    }

    @NonNull
    @Override
    protected RNShimmeringView createViewInstance(@NonNull ThemedReactContext context) {
       return RNShimmerManagerImpl.createViewInstance(context);
    }

    @Override
    @ReactProp(name = "animating", defaultBoolean = true)
    public void setAnimating(RNShimmeringView view, boolean value) {
        RNShimmerManagerImpl.setAnimating(view, value);
    }

    @Override
    @ReactProp(name = "shimmeringOpacity", defaultFloat = 0.5f)
    public void setShimmeringOpacity(RNShimmeringView view, float value) {
        RNShimmerManagerImpl.setShimmeringOpacity(view, value);
    }

    @Override
    @ReactProp(name = "animationOpacity", defaultFloat = 1.0f)
    public void setAnimationOpacity(RNShimmeringView view, float value) {
        RNShimmerManagerImpl.setAnimationOpacity(view, value);
    }

    @Override
    @ReactProp(name = "shimmeringDirection")
    public void setShimmeringDirection(RNShimmeringView view, @Nullable String value) {
        RNShimmerManagerImpl.setShimmeringDirection(view, value);
    }

    @Override
    @ReactProp(name = "duration", defaultInt = 1000)
    public void setDuration(RNShimmeringView view, int value) {
        RNShimmerManagerImpl.setDuration(view, value);
    }

    @Override
    @ReactProp(name = "pauseDuration", defaultInt = 400)
    public void setPauseDuration(RNShimmeringView view, int value) {
        RNShimmerManagerImpl.setPauseDuration(view, value);
    }

    @Override
    @ReactProp(name = "tilt", defaultFloat = 0.0f)
    public void setTilt(RNShimmeringView view, float value) {
        RNShimmerManagerImpl.setTilt(view, value);
    }

    @Override
    @ReactProp(name = "intensity", defaultFloat = 0.0f)
    public void setIntensity(RNShimmeringView view, float value) {
        RNShimmerManagerImpl.setIntensity(view, value);
    }

    @Override
    @ReactProp(name = "highlightLength", defaultFloat = 0.0f)
    public void setHighlightLength(RNShimmeringView view, float value) {
        RNShimmerManagerImpl.setHighlightLength(view, value);
    }

    @Override
    @ReactProp(name = "beginFadeDuration", defaultFloat = 0.0f)
    public void setBeginFadeDuration(RNShimmeringView view, float value) {
        RNShimmerManagerImpl.setBeginFadeDuration(view, value);
    }

    @Override
    @ReactProp(name = "endFadeDuration", defaultFloat = 0.0f)
    public void setEndFadeDuration(RNShimmeringView view, float value) {
        RNShimmerManagerImpl.setEndFadeDuration(view, value);
    }
}