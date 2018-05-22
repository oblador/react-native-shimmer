package com.oblador.shimmer;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.shimmer.Shimmer;

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
        view.setShimmer(view.getBuilder().setAutoStart(value).build());
    }

    @ReactProp(name = "shimmeringOpacity", defaultFloat = 0.5f)
    public void setShimmeringOpacity(RNShimmeringView view, float value) {
        if (value > 1.0f) {
            value = 1.0f;
        }
        if (value < 0.0f) {
            value = 0.0f;
        }

        view.setShimmer(view.getBuilder().setBaseAlpha(value).build());
    }

    @ReactProp(name = "intensity", defaultFloat = 0.0f)
    public void setAnimationOpacity(RNShimmeringView view, float value) {
        if (value > 1.0f) {
            value = 1.0f;
        }
        if (value < 0.0f) {
            value = 0.0f;
        }

        view.setShimmer(view.getBuilder().setIntensity(value).build());
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

        view.setShimmer(view.getBuilder().setDirection(angle).build());
    }

    @ReactProp(name = "duration", defaultInt = 1000)
    public void setDuration(RNShimmeringView view, int value) {
        if (value < 0) {
            value = 0;
        }

        view.setShimmer(view.getBuilder().setDuration(value).build());
    }

    @ReactProp(name = "pauseDuration", defaultInt = 400)
    public void setPauseDuration(RNShimmeringView view, int value) {
        if (value < 0) {
            value = 0;
        }

        view.setShimmer(view.getBuilder().setRepeatDelay(value).build());
    }

    @ReactProp(name = "tilt", defaultFloat = 0.0f)
    public void setTilt(RNShimmeringView view, int value) {
        view.setShimmer(view.getBuilder().setTilt(value).build());
    }

    @ReactProp(name = "speed", defaultInt = 230)
    public void setSpeed(RNShimmeringView view, int value) {
    }
}
