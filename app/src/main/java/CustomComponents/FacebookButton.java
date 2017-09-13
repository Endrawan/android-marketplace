package CustomComponents;

import android.content.Context;
import android.util.AttributeSet;

import com.endrawan.marketplace.R;

/**
 * Endrawan made this on 2017-07-23.
 */
public class FacebookButton extends RoundedButton {
    public FacebookButton(Context context) {
        super(context);
        init();
    }

    public FacebookButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public FacebookButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setBackgroundResource(R.drawable.facebook_button);
        }
    }
}
