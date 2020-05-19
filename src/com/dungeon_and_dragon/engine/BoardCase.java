package com.dungeon_and_dragon.engine;

import com.dungeon_and_dragon.characters.Hero;
import com.dungeon_and_dragon.enemies.Dragon;
import com.dungeon_and_dragon.enemies.Goblin;
import com.dungeon_and_dragon.enemies.Necromancer;
import com.dungeon_and_dragon.equipements.spell.FireBall;
import com.dungeon_and_dragon.equipements.spell.Lightning;
import com.dungeon_and_dragon.equipements.utilities.BighealthPotion;
import com.dungeon_and_dragon.equipements.utilities.MinorHealthPotion;
import com.dungeon_and_dragon.equipements.weapons.Club;
import com.dungeon_and_dragon.equipements.weapons.Sword;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

public class BoardCase {

    // Tableau position Enemies
    private final int[] dragonPos = {45, 52, 56, 62};
    private final int[] necromancerPos = {10, 20, 25, 32, 35, 36, 37, 40, 44, 47};
    private final int[] goblin = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};

    // Tableau position Weapons
    private final int[] clubPos = {2, 11, 5, 22, 38};
    private final int[] swordPos = {19, 26, 42, 53};

    // Tableau position Spells
    private final int[] lightningPos = {1, 4, 8, 17, 23};
    private final int[] fireBallPos = {48, 49};

    // Tableau position Decoction
    private final int[] minorHealthPos = {7, 13, 31, 33, 39, 43};
    private final int[] bigHealthPos = {28, 41};

    final int boardLimit = 64;

    ArrayList<Event> board = new ArrayList<>();

    public void fill() {

        /** TODO Faire un system de shuffle ou de put random in ArrayList
         *
         */

        for (int i = 0; i < boardLimit; i++) {
            int c = i;

            if (IntStream.of(dragonPos).anyMatch(x -> x == c)) {
//                System.out.println("Il y des dragons mamène en :" + c);
                board.add(new Dragon());

            } else if (IntStream.of(necromancerPos).anyMatch(x -> x == c)) {
//                System.out.println("Il y des nécromanciens mamène en :" + c);
                board.add(new Necromancer());

            } else if (IntStream.of(goblin).anyMatch(x -> x == c)) {
                board.add(new Goblin());

            } else if (IntStream.of(clubPos).anyMatch(x -> x == c)) {
//                System.out.println("Une massue en :" + c);
                board.add(new Club());

            } else if (IntStream.of(swordPos).anyMatch(x -> x == c)) {
//                System.out.println("Une épée en :" + c);
                board.add(new Sword());

            } else if (IntStream.of(lightningPos).anyMatch(x -> x == c)) {
//                System.out.println("Un sort d'éclaire en :" + c);
                board.add(new Lightning());

            } else if (IntStream.of(fireBallPos).anyMatch(x -> x == c)) {
//                System.out.println("Un sort de Boule de feu en :" + c);
                board.add(new FireBall());

            } else if (IntStream.of(minorHealthPos).anyMatch(x -> x == c)) {
//                System.out.println("Une petite popo en :" + c);
                board.add(new MinorHealthPotion());

            } else if (IntStream.of(bigHealthPos).anyMatch(x -> x == c)) {
//                System.out.println("Une grosse popo en :" + c);
                board.add(new BighealthPotion());

            } else {
//                System.out.println("Nope");
                board.add(new EmptyCase());
            }
        }
        // Function de shuffle
        shuffle(board);
    }

    /**
     * @param pos
     * @param h
     * @return
     */
    public Event getCase(int pos, Hero h) {
        return board.get(pos);
    }

    /**
     * @param array
     */
    public void shuffle(ArrayList array) {
        Collections.shuffle(array);
    }
}
