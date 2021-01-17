package playertest.fightertest;

import player.fighter.FighterType;
import player.fighter.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    private Knight sirGalahad;

    @Before
    public void before() {sirGalahad = new Knight("Sir Galahad", FighterType.KNIGHT); }


}

