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
 * Created by grzegorz_sledz on 27.06.16.
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
    public void currentPlayerShouldBePlayerOAfterPlayerManagerCreation(IPlayerManager playerManager) {
        Assert.assertTrue(playerManager.current().equals(new PlayerO()));
    }

    @Test(dataProvider = "playerManager")
    public void nextPlayerShouldBePlayerX(IPlayerManager playerManager) {
        Assert.assertTrue(playerManager.next().equals(new PlayerX()));
    }

    @Test(dataProvider = "playerManager")
    public void checkingSequencesPlayerOPlayerX(IPlayerManager playerManager) {
        Assert.assertTrue(playerManager.current().equals(new PlayerO()));
        Assert.assertTrue(playerManager.next().equals(new PlayerX()));
        Assert.assertTrue(playerManager.next().equals(new PlayerO()));
        Assert.assertTrue(playerManager.next().equals(new PlayerX()));
    }
}
