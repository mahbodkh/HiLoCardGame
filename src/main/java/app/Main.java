package app;

import java.util.Arrays;

/**
 * Created by Ebrahim Kh.
 */


public class Main {
    public static void main(String[] args) {
        int round = 5;
        Player win = new Play(Arrays.asList("Alex", "Ebrahim")).start(round);
        System.out.printf("%s wins the match with %s games to 1!", win.getName(), round);
    }
}
