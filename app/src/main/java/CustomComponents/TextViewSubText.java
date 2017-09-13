package CustomComponents;

import android.content.Context;
import android.util.AttributeSet;

import com.endrawan.marketplace.R;

/**
 * Endrawan made this on 2017-07-26.
 */
public class TextViewSubText extends TextView {
    public TextViewSubText(Context context) {
        super(context);
        init();
    }

    public TextViewSubText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextViewSubText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTextColor(getResources().getColor(R.color.cGrey));
            setTextSize(12);
        }
    }
}
