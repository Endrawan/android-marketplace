package CustomComponents;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Endrawan made this on 2017-09-25.
 */
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
