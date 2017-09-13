package CustomComponents;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import com.endrawan.marketplace.R;

/**
 * Endrawan made this on 2017-07-19.
 */
public class RoundedButton extends CustomComponents.Button {

    public RoundedButton(Context context) {
        super(context);
        init();
    }

    public RoundedButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RoundedButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTextColor(getResources().getColor(R.color.cWhite));
            setBackgroundResource(R.drawable.rounded_button);
        }
    }
}
