package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards = new ArrayList<>(Arrays.asList(Card.values()));

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card getCard() {
        if (cards.isEmpty()) {
            throw new RuntimeException("The cards is empty!");
        }
        return cards.remove(0);
    }
}

