package com.nespresso.sofa.recruitment.navalbattles.app;

import com.nespresso.sofa.recruitment.navalbattles.app.batteau.Clipper;
import com.nespresso.sofa.recruitment.navalbattles.app.batteau.Ship;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RaceTest {

    // Speed of a ship is its displacement divided by number of mast: the lower the value, the faster the ship
    @Test
    public void fastestShouldWin() {

        Ship a = new Ship(20000, 2); // 20000 tons of displacement, 2 createMasts
        Ship b = new Ship(7500, 1);

        Race race = new Race(a, b);
        assertEquals(race.winner() , b);
    }

   // a clipper goes 20% faster than a standard ship.
    @Test
    public void clipperGoesFaster() {

        Ship a = new Ship(20000, 2);
        Ship b = new Ship(7500, 1);
        Clipper c = new Clipper(18000, 2);

        Race race = new Race(a, b, c);
        assertEquals(race.winner() , c);
    }


    // any ship can carry cannons, each cannons grant 0.5% cumulative penalty to withSpeed
    @Test
    public void armedShipAreUsuallySlower() {

        Ship a = new Ship(7800, 1, 16);  // 7800 tons of displacement, 1 createMasts, 16 cannons
        Ship b = new Ship(8000, 1);

        Race race = new Race(a, b);
        assertEquals(race.winner() , b);
    }

    @Test
    public void clipperGoesFasterWithCannons() {

        Ship a = new Ship(20000, 2);
        Ship b = new Ship(7500, 1);
        Clipper c = new Clipper(15000, 2, 45);

        Race race = new Race(a, b, c);
        assertEquals(race.winner() , b);
    }

}
