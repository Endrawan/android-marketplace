package CustomComponents;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Endrawan made this on 2017-07-26.
 */
public class TextViewH1 extends TextView {
    public TextViewH1(Context context) {
        super(context);
        init();
    }

    public TextViewH1(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextViewH1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setTextSize(26);
    }
}
