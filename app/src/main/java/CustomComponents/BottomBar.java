package CustomComponents;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

/**
 * Endrawan made this on 2017-09-15.
 */
public class BottomBar extends com.roughike.bottombar.BottomBar {
    public BottomBar(Context context) {
        super(context);
    }

    public BottomBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BottomBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public BottomBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void animatePutToBottom(int duration) {
        this.animate().translationY(this.getHeight()).setDuration(duration);
    }

    public void animatePutToNormal(int duration) {
        this.animate().translationY(0).setDuration(duration);
    }
}
