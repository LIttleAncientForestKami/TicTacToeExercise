package mycompany.ja.krk.tictactoe.player;

import mycompany.ja.krk.tictactoe.map.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by e.golesor@gmail.com on 28.06.16.
 */
public class SimplePlayerController implements PlayerController{

    private final Map<Shape, Player> playerMap = new HashMap<Shape, Player>();

    public SimplePlayerController(Player playerO, Player playerX) {

        playerMap.put(Shape.O, playerO);
        playerMap.put(Shape.X, playerX);
        playerMap.put(Shape.N, fakePlayer());

    }

    private Player fakePlayer(){
        return new Player("fake", "fake", PlayerType.NOT_A_PLAYER) {
            @Override
            public Shape shape() {
                return Shape.N;

            }
        };
    }
    public PlayerType getTypeOfPlayer(Shape shape) {
        return playerMap.get(shape).type();
    }

    public Player whoPlaysAs(Shape shape) {
        return playerMap.get(shape);
    }
}
