package app;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Created by Ebrahim Kh.
 */


@Data
public class Player {
    private final String name;
    private final List<Card> cards = new ArrayList<>();
}
