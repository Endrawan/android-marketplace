package CustomComponents;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import com.endrawan.marketplace.R;

/**
 * Endrawan made this on 2017-07-26.
 */
public class TextViewH4 extends TextView {
    public TextViewH4(Context context) {
        super(context);
        init();
    }

    public TextViewH4(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextViewH4(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTextSize(14);
            setTextColor(getResources().getColor(R.color.cBlack));
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSans-SemiBold.ttf"));
        }
    }
}
