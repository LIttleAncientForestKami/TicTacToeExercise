package player;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by kuba on 24.06.16.
 */
public class PlayerTest {

    @Test
    public void getMarkTest(){
        Player player = new Player(Mark.X);
        Mark mark = player.getMark();
        assertEquals(mark,Mark.X);
    }

}