package CustomComponents;

/**
 * Endrawan made this on 2017-09-28.
 */
public class Fragment extends android.support.v4.app.Fragment {
    protected int position, iconPosition;
    protected String title;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getIconPosition() {
        return iconPosition;
    }

    public void setIconPosition(int iconPosition) {
        this.iconPosition = iconPosition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
