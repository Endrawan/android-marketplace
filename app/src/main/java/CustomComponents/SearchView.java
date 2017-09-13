package CustomComponents;

import android.content.Context;
import android.util.AttributeSet;


/**
 * Endrawan made this on 2017-08-10.
 */

//@CoordinatorLayout.DefaultBehavior(SearchViewBehavior.class)
public class SearchView extends android.support.v7.widget.SearchView {
    public SearchView(Context context) {
        super(context);
        init();
    }

    public SearchView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SearchView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            /*int id = getContext().getResources().getIdentifier("android:id/search_src_text", null, null);
            TextView searchText = (TextView) findViewById(id);
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSans-Regular.ttf");
            searchText.setTypeface(tf);*/
        }
    }
}
