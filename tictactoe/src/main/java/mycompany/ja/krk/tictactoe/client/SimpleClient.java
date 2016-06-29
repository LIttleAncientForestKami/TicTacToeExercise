package epam.ja.krk.tictactoe.client;

import epam.ja.krk.tictactoe.arbiter.Arbiter;
import epam.ja.krk.tictactoe.arbiter.SimpleArbiter;
import epam.ja.krk.tictactoe.environment.Environment;
import epam.ja.krk.tictactoe.environment.TicTacToeSimpleEnvironment;
import epam.ja.krk.tictactoe.graphic.GraphicalViewer;
import epam.ja.krk.tictactoe.graphic.SimpleGraphicalConsole;
import epam.ja.krk.tictactoe.map.TicTacToeMap;
import epam.ja.krk.tictactoe.map.TicTacToeMapBuilder;
import epam.ja.krk.tictactoe.map.TicTacToeSimpleMap;
import epam.ja.krk.tictactoe.player.*;

import java.util.Scanner;

/**
 * Created by ehsan on 24.06.16.
 */
public class SimpleClient {


    public static void main(String [] args){

        // creating the map
        TicTacToeMap map = new TicTacToeSimpleMap((new TicTacToeMapBuilder()).simpleTicTacToeMap());

        // creating the arbiter
        Arbiter arbiter = new SimpleArbiter(map);

        // players
        PlayerO playerO = new PlayerO("Name", "Surname", PlayerType.HUMAN);
        PlayerX playerX = new PlayerX("MachineName", "MachineSurname", PlayerType.MACHINE);

        // creating the player controller
        PlayerController controller = new SimplePlayerController(playerO,playerX);

        // opening the graphical view
        GraphicalViewer graphicalViewer = new SimpleGraphicalConsole(System.out, new Scanner(System.in), controller);

        // running the environment by the parameters that we create earlier
        Environment env = new TicTacToeSimpleEnvironment(arbiter,graphicalViewer,map);
        Thread thread = new Thread(env);
        thread.start();

        // joining the thread
        try {
            thread.join();
        } catch (InterruptedException e) {
            // TODO have a logger
            //logger.log(this-e)
        }


        //graphicalViewer.displayMap(map);
        //graphicalViewer.showWinner(env);

    }

}
