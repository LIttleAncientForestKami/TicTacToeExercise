package player;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PlayerTest {

    @Test
    public void getMarkTest(){
        Player player = new Player(Mark.X);
        Mark mark = player.getMark();
        assertEquals(mark,Mark.X);
    }

}