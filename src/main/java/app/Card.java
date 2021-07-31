package app;

import lombok.Getter;

@Getter
public enum Card {


    // CLUBS
    A_C(0),
    TWO_C(1),
    THREE_C(2),
    FOUR_C(3),
    FIVE_C(4),
    SIX_C(5),
    SEVEN_C(6),
    EIGHT_C(7),
    NINE_C(8),
    TEN_C(9),
    J_C(10),
    Q_C(11),
    K_C(12),

    // DIAMONDS
    A_D(0),
    TWO_D(1),
    THREE_D(2),
    FOUR_D(3),
    FIVE_D(4),
    SIX_D(5),
    SEVEN_D(6),
    EIGHT_D(7),
    NINE_D(8),
    TEN_D(9),
    J_D(10),
    Q_D(11),
    K_D(12),

    // HEARTS
    A_H(0),
    TWO_H(1),
    THREE_H(2),
    FOUR_H(3),
    FIVE_H(4),
    SIX_H(5),
    SEVEN_H(6),
    EIGHT_H(7),
    NINE_H(8),
    TEN_H(9),
    J_H(10),
    Q_H(11),
    K_H(12),

    // SPADES
    A_S(0),
    TWO_S(1),
    THREE_S(2),
    FOUR_S(3),
    FIVE_S(4),
    SIX_S(5),
    SEVEN_S(6),
    EIGHT_S(7),
    NINE_S(8),
    TEN_S(9),
    J_S(10),
    Q_S(11),
    K_S(12),

    ;


    private final int point;

    Card(int point) {
        this.point = point;
    }
}