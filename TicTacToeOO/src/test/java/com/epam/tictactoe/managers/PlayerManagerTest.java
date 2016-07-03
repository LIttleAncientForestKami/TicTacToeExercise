package com.epam.tictactoe.managers;

import com.epam.tictactoe.board.*;
import com.epam.tictactoe.enums.Sign;
import com.epam.tictactoe.managers.IPlayerManager;
import com.epam.tictactoe.managers.PlayerManager;
import com.epam.tictactoe.player.IPlayer;
import com.epam.tictactoe.player.PlayerO;
import com.epam.tictactoe.player.PlayerX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Grzegorz Sledz
 */
public class PlayerManagerTest {

    @DataProvider(name = "playerManager")
    public Object[][] playerManager() {
        IPlayer playerO=new PlayerO();
        IPlayer playerX=new PlayerX();
        IPlayerManager playerManager1=new PlayerManager(playerO,playerX);
        IPlayerManager playerManager2=new PlayerManager();
        return new Object[][] {{playerManager1},{playerManager2}};
    }

    @Test(dataProvider = "playerManager")
    public void playerOShouldBePlayerO(IPlayerManager playerManager) {
        Assert.assertTrue(playerManager.playerO().equals(new PlayerO()));
    }
    @Test(dataProvider = "playerManager")
    public void playerXShouldBePlayerX(IPlayerManager playerManager) {
        Assert.assertTrue(playerManager.playerX().equals(new PlayerX()));
    }

}
