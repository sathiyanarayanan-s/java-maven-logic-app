package com.yourcompany.app;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
    App app = new App();

    @Test
    public void testLogic() {
        // Testing AND: true && true = true
        assertTrue("AND logic failed", app.andOp(true, true));
        
        // Testing OR: true || false = true
        assertTrue("OR logic failed", app.orOp(true, false));
        
        // Testing NOT: !true = false
        assertFalse("NOT logic failed", app.notOp(true));
    }
}
