package com.commandjunction.support.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CommandResultTest {

    @Test
    void testCommandResult() {
        CommandResult result = new CommandResult() {};
        assertNotNull(result);
    }
}
