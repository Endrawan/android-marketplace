package CustomComponents;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;

import com.endrawan.marketplace.behaviors.ChangeColorBehavior;

/**
 * Endrawan made this on 2017-08-21.
 */


@CoordinatorLayout.DefaultBehavior(ChangeColorBehavior.class)
public class ProductToolbar extends Toolbar {
    public ProductToolbar(Context context) {
        super(context);
    }

    public ProductToolbar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ProductToolbar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
