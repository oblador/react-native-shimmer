package com.oblador.shimmer;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.shimmer.ShimmerFrameLayout;


public class RNShimmeringView extends ShimmerFrameLayout {

    public RNShimmeringView(Context context) {
        super(context);
    }

    public RNShimmeringView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RNShimmeringView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    private float mSpeed = 0.0f; // The speed of shimmering, in points per second.

    public float getSpeed() {
        return mSpeed;
    }

    public void setSpeed(float speed) {
        mSpeed = speed;
        this.setDuration(this.getDuration());
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (mSpeed > 0) {
            int length = 0;
            switch (this.getAngle()) {
                case CW_90:
                case CW_270:
                    length = bottom - top;
                    break;
                case CW_0:
                case CW_180:
                default:
                    length = right - left;
                    break;
            }
            int duration = (int)(1000 * length / mSpeed);
            if (duration != this.getDuration()) {
                this.setDuration(duration);
            }
        }
        super.onLayout(changed, left, top, right, bottom);
    }
}
