package CustomComponents;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

import com.endrawan.marketplace.R;

/**
 * Endrawan made this on 2017-07-19.
 */
public class RoundedEditText extends CustomComponents.EditText {
    public RoundedEditText(Context context) {
        super(context);
        init();
    }

    public RoundedEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RoundedEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setBackgroundResource(R.drawable.rounded_edittext);
            setTextSize(14);
        }
    }
}
