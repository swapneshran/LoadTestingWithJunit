package com.swappy.loadtest.tests.junit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

//@RunWith(ZeroCodeUnitRunner.class) //<--- Enable this for reports only. Otherwise not needed.
public class JunitExistingTest {
    static int a = 2;
    static int b = 3;

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // 1st run passes, but subsequent run fails,  this is deliberately
    // done to see the failures reflects in the CSV reports and conslosole
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    @Test
    public void testAddTwoNumbers_firstPassThenFail() {
        int sum = a + b;
        assertThat(sum, is(5));

        a++;
        b++;
    }
}
