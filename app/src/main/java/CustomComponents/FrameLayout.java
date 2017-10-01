package CustomComponents;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;

import com.endrawan.marketplace.behaviors.ViewUpSnackbar;

/**
 * Endrawan made this on 2017-09-25.
 */

@CoordinatorLayout.DefaultBehavior(ViewUpSnackbar.class)
public class FrameLayout extends android.widget.FrameLayout{
    public FrameLayout(Context context) {
        super(context);
    }

    public FrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void animatePutToBottom(int duration) {
        this.animate().translationY(this.getHeight()).setDuration(duration);
    }

    public void animatePutToNormal(int duration) {
        this.animate().translationY(0).setDuration(duration);
    }
}
