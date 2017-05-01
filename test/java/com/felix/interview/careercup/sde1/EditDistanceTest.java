package com.felix.interview.careercup.sde1;

import org.junit.Test;

/**
 * Created by felix on 4/15/17.
 */
public class EditDistanceTest {
    EditDistance e = new EditDistance();

    @Test
    public void oneEdit(){
        assert e.oneDistanceAway("geeks", "geek");
        assert !e.oneDistanceAway("globe", "eloga");
        assert !e.oneDistanceAway("globe", "globing");
    }
}
