package controler.arbiter;

import model.field.Sign;

/**
 * Created by lucz on 01.07.16.
 */
public interface GameArbiter {
    String announceWinner(String playerName, Sign sign);
}
