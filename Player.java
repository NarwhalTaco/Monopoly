import java.util.*;

public class Player {
    private String name;
    private int money;
    private boolean bankrupt;
    private List<Space> ownedProps;

    public Player(String n) {
        name = n;
        money = 0;
        bankrupt = false;
    }
}
