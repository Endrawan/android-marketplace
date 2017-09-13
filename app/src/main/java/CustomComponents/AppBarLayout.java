package CustomComponents;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;

import com.endrawan.marketplace.behaviors.AppBarBehavior;

/**
 * Endrawan made this on 2017-08-19.
 */

@CoordinatorLayout.DefaultBehavior(AppBarBehavior.class)
public class AppBarLayout extends android.support.design.widget.AppBarLayout {
    public AppBarLayout(Context context) {
        super(context);
    }

    public AppBarLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void animatePutToBottom(int duration) {
        this.animate().translationY(this.getHeight()).setDuration(duration);
    }

    public void animatePutToNormal(int duration) {
        this.animate().translationY(0).setDuration(duration);
    }
}
