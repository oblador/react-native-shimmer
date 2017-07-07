package com.oblador.shimmer;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;

public class RNShimmerManager extends ViewGroupManager<RNShimmeringView> {

    public static final String REACT_CLASS = "RNShimmeringView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public RNShimmeringView createViewInstance(ThemedReactContext context) {
        return new RNShimmeringView(context);
    }

    @ReactProp(name = "animating", defaultBoolean = true)
    public void setAnimating(RNShimmeringView view, boolean value) {
        if (value != view.isAutoStart()) {
            view.setAutoStart(value);
            view.invalidate();
        }
    }

    @ReactProp(name = "shimmeringOpacity", defaultFloat = 0.5f)
    public void setShimmeringOpacity(RNShimmeringView view, float value) {
        if (value > 1.0f) {
            value = 1.0f;
        }
        if (value < 0.0f) {
            value = 0.0f;
        }

        if (value != view.getBaseAlpha()) {
            view.setBaseAlpha(value);
            view.invalidate();
        }
    }

    @ReactProp(name = "intensity", defaultFloat = 0.0f)
    public void setAnimationOpacity(RNShimmeringView view, float value) {
        if (value > 1.0f) {
            value = 1.0f;
        }
        if (value < 0.0f) {
            value = 0.0f;
        }

        if (value != view.getIntensity()) {
            view.setIntensity(value);
            view.invalidate();
        }
    }

    @ReactProp(name = "shimmeringDirection")
    public void setAnimating(RNShimmeringView view, String value) {
        RNShimmeringView.MaskAngle angle = RNShimmeringView.MaskAngle.CW_0;
        switch (value) {
            case "up":
                angle = RNShimmeringView.MaskAngle.CW_270;
                break;
            case "left":
                angle = RNShimmeringView.MaskAngle.CW_180;
                break;
            case "down":
                angle = RNShimmeringView.MaskAngle.CW_90;
                break;
            case "right":
            default:
                break;
        }

        if (angle != view.getAngle()) {
            view.setAngle(angle);
            view.invalidate();
        }
    }

    @ReactProp(name = "duration", defaultInt = 1000)
    public void setDuration(RNShimmeringView view, int value) {
        if (value < 0) {
            value = 0;
        }

        if (value != view.getDuration()) {
            view.setDuration(value);
            view.invalidate();
        }
    }

    @ReactProp(name = "pauseDuration", defaultInt = 400)
    public void setPauseDuration(RNShimmeringView view, int value) {
        if (value < 0) {
            value = 0;
        }

        if (value != view.getRepeatDelay()) {
            view.setRepeatDelay(value);
            view.invalidate();
        }
    }

    @ReactProp(name = "tilt", defaultFloat = 0.0f)
    public void setTilt(RNShimmeringView view, int value) {
        if (value != view.getTilt()) {
            view.setTilt(value);
            view.invalidate();
        }
    }

    @ReactProp(name = "speed", defaultInt = 230)
    public void setSpeed(RNShimmeringView view, int value) {
        if (value < 0) {
            value = 0;
        }

        if (value != view.getSpeed()) {
            view.setSpeed(value);
            view.invalidate();
        }
    }
}
