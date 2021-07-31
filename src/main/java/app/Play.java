package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toList;

/**
 * Created by Ebrahim Kh.
 */


public class Play {
    private final List<Player> players = new ArrayList<>();
    private final Deck deck = new Deck();
    private final Map<Player, Integer> rank = new HashMap<>();

    public Play(List<String> guys) {
        guys.forEach(player -> players.add(new Player(player)));
    }

    public Player start(int round) {
        deck.shuffle();
        for (int i = 0; i <= round; i++) {
            playRound();
        }
        return getWinner();
    }


    private void playRound() {
        Map<Player, Card> cardsOfRound = dealCards();
        Card highestCard = cardsOfRound.entrySet().stream()
            .max(comparingByValue())
            .map(Map.Entry::getValue)
            .orElseThrow(IllegalStateException::new);

        List<Player> highValue = cardsOfRound.entrySet().stream()
            .filter(o -> o.getValue().getPoint() == highestCard.getPoint())
            .map(Map.Entry::getKey)
            .collect(toList());

        if (highValue.size() > 1) {
            return;
        }
        countWin(highValue.get(0));
    }

    private Map<Player, Card> dealCards() {
        final Map<Player, Card> cardsOfRound = new HashMap<>();
        for (Player player : players)
            cardsOfRound.put(player, deck.getCard());
        return cardsOfRound;
    }

    private void countWin(Player player) {
        rank.putIfAbsent(player, 0);
        rank.put(player, rank.get(player) + 1);
    }

    private Player getWinner() {
        Integer qtyWins = rank.entrySet().stream()
            .max(comparingByValue())
            .map(Map.Entry::getValue)
            .orElse(0);

        List<Player> winners = rank.entrySet().stream()
            .filter(o -> o.getValue().equals(qtyWins))
            .map(Map.Entry::getKey)
            .collect(toList());

        return winners.get(0);
    }
}
