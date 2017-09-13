package CustomComponents;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * Endrawan made this on 2017-07-23.
 */
public class EditText extends android.widget.EditText {
    public EditText(Context context) {
        super(context);
        init();
    }

    public EditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public EditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSans-Regular.ttf");
            setTypeface(tf);
        }
    }
}
