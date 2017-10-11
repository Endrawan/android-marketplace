package CustomComponents;

/**
 * Endrawan made this on 2017-09-28.
 */
public class Fragment extends android.support.v4.app.Fragment {

    public static final String TAG_AllProducts = "a";
    public static final String TAG_Home = "b";
    public static final String TAG_Categories = "c";
    public static final String TAG_Cart = "d";
    public static final String TAG_Account = "e";
    public static final String TAG_Search = "f";
    public static final String TAG_SearchResult = "g";

    protected int position, bottomBarPosition, indexArray;
    protected String title;

    public int getBottomBarPosition() {
        return bottomBarPosition;
    }

    public void setBottomBarPosition(int bottomBarPosition) {
        this.bottomBarPosition = bottomBarPosition;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIndexArray() {
        return indexArray;
    }

    public void setIndexArray(int indexArray) {
        this.indexArray = indexArray;
    }
}
