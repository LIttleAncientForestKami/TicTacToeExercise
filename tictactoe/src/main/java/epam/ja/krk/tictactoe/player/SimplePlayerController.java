package epam.ja.krk.tictactoe.player;

import epam.ja.krk.tictactoe.map.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ehsan on 28.06.16.
 */
public class SimplePlayerController implements PlayerController {

    private final Map<Shape, PlayerType> playerMap = new HashMap<Shape, PlayerType>();

    public SimplePlayerController(PlayerType typeO, PlayerType typeX) {

        playerMap.put(Shape.O, typeO);
        playerMap.put(Shape.X, typeX);

    }

    public PlayerType getTypeOfPlayer(Shape shape) {
        PlayerType retType = PlayerType.NOT_A_PLAYER;
        if(playerMap.containsKey(shape)){
            retType = playerMap.get(shape);
        }
        return retType;
    }
}
