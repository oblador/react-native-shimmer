package com.oblador.shimmer;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.bridge.ReactApplicationContext;

public class RNShimmerManager extends ViewGroupManager<RNShimmeringView> {
    ReactApplicationContext mCallerContext;

    public RNShimmerManager(ReactApplicationContext reactContext) {
        mCallerContext = reactContext;
    }

    @Override
    public String getName() {
        return RNShimmerManagerImpl.NAME;
    }

    @Override
    public RNShimmeringView createViewInstance(ThemedReactContext context) {
        return RNShimmerManagerImpl.createViewInstance(context);
    }

    @ReactProp(name = "animating", defaultBoolean = true)
    public void setAnimating(RNShimmeringView view, boolean value) {
        RNShimmerManagerImpl.setAnimating(view, value);
    }

    @ReactProp(name = "shimmeringOpacity", defaultFloat = 0.5f)
    public void setBaseOpacity(RNShimmeringView view, float value) {
        RNShimmerManagerImpl.setShimmeringOpacity(view, value);
    }

    @ReactProp(name = "animationOpacity", defaultFloat = 1.0f)
    public void setHighlightOpacity(RNShimmeringView view, float value) {
        RNShimmerManagerImpl.setAnimationOpacity(view, value);
    }

    @ReactProp(name = "shimmeringDirection")
    public void setDirection(RNShimmeringView view, String value) {
        RNShimmerManagerImpl.setShimmeringDirection(view, value);
    }

    @ReactProp(name = "duration", defaultInt = 1000)
    public void setDuration(RNShimmeringView view, int value) {
        RNShimmerManagerImpl.setDuration(view, value);
    }

    @ReactProp(name = "pauseDuration", defaultInt = 400)
    public void setPauseDuration(RNShimmeringView view, int value) {
        RNShimmerManagerImpl.setPauseDuration(view, value);
    }

    @ReactProp(name = "tilt", defaultFloat = 0.0f)
    public void setTilt(RNShimmeringView view, float value) {
        RNShimmerManagerImpl.setTilt(view, value);
    }

    @ReactProp(name = "intensity", defaultFloat = 0.0f)
    public void setIntensity(RNShimmeringView view, float value) {
        RNShimmerManagerImpl.setIntensity(view, value);
    }
}