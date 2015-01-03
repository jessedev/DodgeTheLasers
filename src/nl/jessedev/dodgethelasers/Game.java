package nl.jessedev.dodgethelasers;

import nl.jessedev.dodgethelasers.enums.GameState;
import nl.jessedev.dodgethelasers.tasks.CountdownTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * COPYRIGHT 2014 (C) JESSE DE VRIES
 * -------------------------
 * This file was created by Jesse de Vries, also known as:
 * - "FlamingxGamer"
 * - "jessedv"
 * - "jessedev"
 * -------------------------
 * All rights reserved. Unauthorized copying of this file, via any medium is strictly prohibited.
 * Confidential. Usage requests can be done by mailing to <rights@jessedev.nl>
 */

public class Game {

    private static Game _instance;

    // Countdown
    public boolean isCountingDown;
    public int seconds;
    public int currentSeconds;
    public List<Integer> broadcastOn = new ArrayList<Integer>(Arrays.asList(new Integer[]{60, 50, 40, 30, 20, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}));

    // Game
    public GameState gameState;

    public Game() {
        _instance = this;

        this.isCountingDown = false;
        this.seconds = 60;
        this.currentSeconds = 60;
        new CountdownTask();
    }

    public static Game getInstance() {
        if(_instance != null) {
            return _instance;
        } else {
            new Game();
            return getInstance();
        }
    }

}
