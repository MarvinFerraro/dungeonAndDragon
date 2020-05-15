package com.dungeon_and_dragon.engine;

import java.util.SortedMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class TreeMapBoardCase {

    static void TreeMapBoardCase() {
        SortedMap<Integer, String> boardCase = new ConcurrentSkipListMap<>();

        boardCase.put(45, "Dragon");
        boardCase.put(52, "Dragon");
        boardCase.put(56, "Dragon");
        boardCase.put(62, "Dragon");

        boardCase.put(10, "Sorcier");
        boardCase.put(20, "Sorcier");
        boardCase.put(25, "Sorcier");
        boardCase.put(32, "Sorcier");
        boardCase.put(35, "Sorcier");
        boardCase.put(36, "Sorcier");
        boardCase.put(37, "Sorcier");
        boardCase.put(40, "Sorcier");
        boardCase.put(44, "Sorcier");
        boardCase.put(47, "Sorcier");



    }

}
