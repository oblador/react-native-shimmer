package com.oblador.shimmer;

import android.content.Context;
import android.util.AttributeSet;

import com.facebook.shimmer.Shimmer;
import com.facebook.shimmer.ShimmerFrameLayout;

public class RNShimmeringView extends ShimmerFrameLayout {
    Shimmer.Builder shimmerBuilder = new Shimmer.AlphaHighlightBuilder();

    public RNShimmeringView(Context context) {
        super(context);
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
}
