package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
    App app = new App();

    @Test
    public void testLogic() {
        assertTrue("AND failed", app.andOp(true, true));
        assertTrue("OR failed", app.orOp(true, false));
        assertFalse("NOT failed", app.notOp(true));
    }
}
