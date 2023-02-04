import java.awt.*;
import java.util.*;

public class Board {
    private Space[] properties = new Space[28];
    private Card[] deck = new Card[32];
    private int bankMoney, houses, hotels;

    public Board() {
        for (int i = 0; i < properties.length; i++) {
        }
        bankMoney = 20580;
        houses = 32;
        hotels = 12;
    }
}
