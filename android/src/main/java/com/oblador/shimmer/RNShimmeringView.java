package com.oblador.shimmer;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;

import com.facebook.shimmer.Shimmer;
import com.facebook.shimmer.ShimmerFrameLayout;


public class RNShimmeringView extends ShimmerFrameLayout {
    private Shimmer.Builder builder = new Shimmer.AlphaHighlightBuilder();

    public RNShimmeringView(Context context) {
        super(context);
        this.setDefaultProps();
    }

    public RNShimmeringView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setDefaultProps();
    }

    public RNShimmeringView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.setDefaultProps();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public RNShimmeringView(
        Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.setDefaultProps();
    }

    public Shimmer.Builder getBuilder() {
        return builder;
    }

    public void updateShimmer() {
        setShimmer(builder.build());
    }

    public void setDefaultProps() {
        getBuilder().setAutoStart(true);
        getBuilder().setBaseAlpha(0.5f);
        getBuilder().setHighlightAlpha(1);
        getBuilder().setDirection(Shimmer.Direction.LEFT_TO_RIGHT);
        getBuilder().setDuration(1000);
        getBuilder().setRepeatDelay(400);
        getBuilder().setTilt(0);
        getBuilder().setIntensity(0);

        updateShimmer();
    }
}
