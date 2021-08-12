package com.BirdGame.birdgame;

import com.kee.androidgames.framework.Screen;
import com.kee.androidgames.framework.impl.AndroidGame;

public class BirdGame extends AndroidGame {
    @Override
    public Screen getStartScreen() {
        return new StartScreen(this);
    }
}
