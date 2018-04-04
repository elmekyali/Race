package com.nespresso.sofa.recruitment.navalbattles.app.batteau;

public class Clipper extends Batteau {

    public Clipper(long displacement, long numberOfMast, long numberOfCannon) {
        super(displacement, numberOfMast, numberOfCannon);
    }

    public Clipper(long displacement, long numberOfMast) {
        super(displacement , numberOfMast);
    }

    public long speedOfBatteau() {
        long speed = (long) ((displacement / numberOfMast) - (((displacement / numberOfMast) / 100.0) * 20) + (((displacement / numberOfMast) / 100.0) * 0.5) * numberOfCannon);
        return speed;
    }
}
