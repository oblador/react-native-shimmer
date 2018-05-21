package com.oblador.shimmer;

import android.content.Context;
import android.util.AttributeSet;

import com.facebook.shimmer.Shimmer;
import com.facebook.shimmer.ShimmerFrameLayout;


public class RNShimmeringView extends ShimmerFrameLayout {
    Shimmer.Builder shimmerBuilder;

    public RNShimmeringView(Context context, Shimmer.Builder shimmerBuilder) {
        super(context);
        this.shimmerBuilder = shimmerBuilder;
        this.setShimmer(this.shimmerBuilder.build());
    }

    public RNShimmeringView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RNShimmeringView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public Shimmer.Builder getBuilder() {
        return shimmerBuilder;
    }

    @Override
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }
}
