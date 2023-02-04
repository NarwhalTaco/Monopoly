import java.util.*;

public class Player {
    private String name;
    private int money;
    private boolean bankrupt;
    private List<Space> ownedProps = new LinkedList<Space>();

    public Player(String n) {
        name = n;
        money = 0;
        bankrupt = false;
    }

    public String getName() {return name;}
    public int getMoney()   {return money;}

    public void setName(String newName) {name = newName;}
    public void setMoney(int newAmount) {money = newAmount;}
    public void setBankrupt(boolean newBr) {bankrupt = newBr;}

    public void addProp(Space prop) {ownedProps.add(prop);}
}
