package CustomComponents;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;

import java.text.NumberFormat;

/**
 * Endrawan made this on 2017-07-27.
 */
public class EditTextCurrency extends EditText implements TextWatcher {
    private String current = "";
    public EditTextCurrency(Context context) {
        super(context);
    }

    public EditTextCurrency(Context context, AttributeSet attrs) {
        super(context, attrs);;
    }

    public EditTextCurrency(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {

    }

    @Override
    public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        if(!text.toString().equals(current)){
            this.removeTextChangedListener(this);

            String cleanString = text.toString().replaceAll("[$,.]", "");

            double parsed = Double.parseDouble(cleanString);
            String formatted = NumberFormat.getCurrencyInstance().format((parsed/100));

            current = formatted;
            this.setText(formatted);
            this.setSelection(formatted.length());

            this.addTextChangedListener(this);
        }
    }
}
