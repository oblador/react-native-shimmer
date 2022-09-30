package com.oblador.shimmer;

import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.shimmer.Shimmer;

public class RNShimmerManagerImpl {
    public static final String NAME = "RNShimmeringView";

    public static RNShimmeringView createViewInstance(ThemedReactContext context) {
        return new RNShimmeringView(context);
    }

    public static void setAnimating(RNShimmeringView view, boolean value) {
        view.getBuilder().setAutoStart(value);
        view.updateShimmer();
    }

    public static void setShimmeringOpacity(RNShimmeringView view, float value) {
        if (value > 1.0f) {
            value = 1.0f;
        }
        if (value < 0.0f) {
            value = 0.0f;
        }

        view.getBuilder().setBaseAlpha(value);
        view.updateShimmer();
    }

    public static void setAnimationOpacity(RNShimmeringView view, float value) {
         if (value > 1.0f) {
            value = 1.0f;
        }
        if (value < 0.0f) {
            value = 0.0f;
        }

        view.getBuilder().setHighlightAlpha(value);
        view.updateShimmer();
    }

    public static void setShimmeringDirection(RNShimmeringView view, @Nullable String value) {
        int direction = Shimmer.Direction.LEFT_TO_RIGHT;
        switch (value) {
            case "up":
                direction = Shimmer.Direction.BOTTOM_TO_TOP;
                break;
            case "left":
                direction = Shimmer.Direction.RIGHT_TO_LEFT;
                break;
            case "down":
                direction = Shimmer.Direction.TOP_TO_BOTTOM;
                break;
            case "right":
            default:
                break;
        }

        view.getBuilder().setDirection(direction);
        view.updateShimmer();
    }

    public static void setDuration(RNShimmeringView view, int value) {
        if (value < 0) {
            value = 0;
        }

        view.getBuilder().setDuration(value);
        view.updateShimmer();
    }

    public static void setPauseDuration(RNShimmeringView view, int value) {
        if (value < 0) {
            value = 0;
        }

        view.getBuilder().setRepeatDelay(value);
        view.updateShimmer();
    }

    public static void setTilt(RNShimmeringView view, float value) {
        view.getBuilder().setTilt(value);
        view.updateShimmer();
    }

    public static void setIntensity(RNShimmeringView view, float value) {
        if (value > 1.0f) {
            value = 1.0f;
        }
        if (value < 0.0f) {
            value = 0.0f;
        }

        view.getBuilder().setIntensity(value);
        view.updateShimmer();
    }

    public static void setHighlightLength(RNShimmeringView view, float value) {
        // Do nothing. iOS only property
    }

    public static void setBeginFadeDuration(RNShimmeringView view, float value) {
        // Do nothing. iOS only property
    }

    public static void setEndFadeDuration(RNShimmeringView view, float value) {
        // Do nothing. iOS only property
    }
}