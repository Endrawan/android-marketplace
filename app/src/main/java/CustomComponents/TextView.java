package CustomComponents;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import com.endrawan.marketplace.R;

/**
 * Endrawan made this on 2017-07-21.
 */
public class TextView extends android.widget.TextView {
    public TextView(Context context) {
        super(context);
        init();
    }

    public TextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSans-Regular.ttf");
            setTypeface(tf);
            //setTextColor(getResources().getColor(R.color.cBlack));
        }
    }
}
