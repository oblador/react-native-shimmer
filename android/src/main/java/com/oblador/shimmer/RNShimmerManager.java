package com.oblador.shimmer;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.shimmer.Shimmer;

public class RNShimmerManager extends ViewGroupManager<RNShimmeringView> {

    public static final String REACT_CLASS = "RNShimmeringView";
    private Shimmer.Builder shimmerBuilder = new Shimmer.AlphaHighlightBuilder();

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public RNShimmeringView createViewInstance(ThemedReactContext context) {
        return new RNShimmeringView(context, shimmerBuilder);
    }

    @ReactProp(name = "animating", defaultBoolean = true)
    public void setAnimating(RNShimmeringView view, boolean value) {
        shimmerBuilder.setAutoStart(value);
    }

    @ReactProp(name = "shimmeringOpacity", defaultFloat = 0.5f)
    public void setShimmeringOpacity(RNShimmeringView view, float value) {
        if (value > 1.0f) {
            value = 1.0f;
        }
        if (value < 0.0f) {
            value = 0.0f;
        }

        view.getBuilder().setBaseAlpha(value);
    }

    @ReactProp(name = "intensity", defaultFloat = 0.0f)
    public void setAnimationOpacity(RNShimmeringView view, float value) {
        if (value > 1.0f) {
            value = 1.0f;
        }
        if (value < 0.0f) {
            value = 0.0f;
        }

        view.getBuilder().setIntensity(value);
    }

    @ReactProp(name = "shimmeringDirection")
    public void setAnimating(RNShimmeringView view, String value) {
        int angle = Shimmer.Direction.LEFT_TO_RIGHT;
        switch (value) {
            case "up":
                angle = Shimmer.Direction.BOTTOM_TO_TOP;
                break;
            case "left":
                angle = Shimmer.Direction.RIGHT_TO_LEFT;
                break;
            case "down":
                angle = Shimmer.Direction.TOP_TO_BOTTOM;
                break;
            case "right":
            default:
                break;
        }

        view.getBuilder().setDirection(angle);
    }

    @ReactProp(name = "duration", defaultInt = 1000)
    public void setDuration(RNShimmeringView view, int value) {
        if (value < 0) {
            value = 0;
        }

        view.getBuilder().setDuration(value);
        view.invalidate();
    }

    @ReactProp(name = "pauseDuration", defaultInt = 400)
    public void setPauseDuration(RNShimmeringView view, int value) {
        if (value < 0) {
            value = 0;
        }

        view.getBuilder().setRepeatDelay(value);
    }

    @ReactProp(name = "tilt", defaultFloat = 0.0f)
    public void setTilt(RNShimmeringView view, int value) {
        view.getBuilder().setTilt(value);
    }

    @ReactProp(name = "speed", defaultInt = 230)
    public void setSpeed(RNShimmeringView view, int value) {
    }
}