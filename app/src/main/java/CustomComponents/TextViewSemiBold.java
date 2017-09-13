package CustomComponents;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * Endrawan made this on 2017-07-21.
 */
public class TextViewSemiBold extends android.widget.TextView {
    public TextViewSemiBold(Context context) {
        super(context);
        init();
    }

    public TextViewSemiBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextViewSemiBold(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSans-SemiBold.ttf");
            setTypeface(tf);
            //setTextColor(getResources().getColor(R.color.cBlack));
        }
    }
}
