package com.nespresso.sofa.recruitment.navalbattles.app.batteau;

public class Ship extends Batteau{

    public Ship(long displacement, long numberOfMast, long numberOfCannon) {
        super(displacement, numberOfMast, numberOfCannon);
    }

    public Ship(long displacement, long numberOfMast) {
        super(displacement , numberOfMast);
    }

    public long speedOfBatteau() {
        long speed = (long) ((displacement / numberOfMast) + (((displacement / numberOfMast) / 100.0) * 0.5) * numberOfCannon);
        return speed;
    }
}
