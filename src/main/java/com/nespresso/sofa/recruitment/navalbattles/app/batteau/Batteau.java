package com.nespresso.sofa.recruitment.navalbattles.app.batteau;

public abstract class Batteau {

    protected long displacement;
    protected long numberOfMast;
    protected long numberOfCannon;

    public abstract long speedOfBatteau();

    public Batteau(long displacement, long numberOfMast, long numberOfCannon) {
        this.displacement = displacement;
        this.numberOfMast = numberOfMast;
        this.numberOfCannon = numberOfCannon;
    }

    public Batteau(long displacement, long numberOfMast) {
        this(displacement , numberOfMast , 0);
    }

}
