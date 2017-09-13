package CustomComponents;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import com.endrawan.marketplace.R;

/**
 * Endrawan made this on 2017-07-26.
 */
public class Button extends android.widget.Button {
    public Button(Context context) {
        super(context);
        init();
    }

    public Button(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Button(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setAllCaps(false);
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSans-Regular.ttf");
            setTypeface(tf);
        }
    }
}
