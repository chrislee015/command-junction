package com.commandjunction.services.explain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExplainCommandTest {

    @Test
    void testExplainSuccess() {
        ExplainCommand command = new ExplainCommand(c -> 0);
        ExplainCommandResult result = command.explain();

        assertTrue(result.isSuccess());
        assertEquals("Explained successfully", result.getMessage());
    }

    @Test
    void testExplainFailure() {
        ExplainCommand command = new ExplainCommand(c -> 1);
        ExplainCommandResult result = command.explain();

        assertFalse(result.isSuccess());
        assertEquals("Failed to explain", result.getMessage());
    }
}
