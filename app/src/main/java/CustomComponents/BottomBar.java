package CustomComponents;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Endrawan made this on 2017-09-15.
 */
public class BottomBar extends com.roughike.bottombar.BottomBar {
    protected boolean showed = true;
    private myAnimatorListener animatorListener = new myAnimatorListener();

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
        showed = false;
        this.animate().translationY(this.getHeight()).setDuration(duration).setListener(animatorListener);
    }

    public void animatePutToNormal(int duration) {
        this.setVisibility(View.VISIBLE);
        showed = true;
        this.animate().translationY(0).setDuration(duration).setListener(animatorListener);
    }

    private class myAnimatorListener extends AnimatorListenerAdapter {
        @Override
        public void onAnimationEnd(Animator animation) {
            super.onAnimationEnd(animation);
            if (showed)
                BottomBar.this.setVisibility(View.VISIBLE);
             else
                BottomBar.this.setVisibility(GONE);
        }
    }

}
