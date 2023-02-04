import java.awt.*;

public class Space {
    private String name;
    private Color group;
    private int value;
    private boolean owned;

    public Space(String n, int v, Color g) {
        name = n;
        value = v;
        group = g;
        owned = false;
    }
}
