package CustomComponents;

import android.content.Context;
import android.os.Bundle;

import com.endrawan.marketplace.R;

/**
 * Endrawan made this on 2017-09-21.
 */
public class DialogFragment extends android.support.v4.app.DialogFragment {
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getDialog().getWindow()
                .getAttributes().windowAnimations = R.style.DialogAnimation;
    }
}
