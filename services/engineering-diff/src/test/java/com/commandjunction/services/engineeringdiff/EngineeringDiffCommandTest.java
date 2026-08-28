package com.commandjunction.services.engineeringdiff;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EngineeringDiffCommandTest {

    @Test
    void testGenerateDiffSuccess() {
        EngineeringDiffCommand command = new EngineeringDiffCommand(c -> 0);
        EngineeringDiffCommandResult result = command.generateDiff();

        assertTrue(result.isSuccess());
        assertEquals("Engineering diff generated successfully", result.getMessage());
    }

    @Test
    void testGenerateDiffFailure() {
        EngineeringDiffCommand command = new EngineeringDiffCommand(c -> 1);
        EngineeringDiffCommandResult result = command.generateDiff();

        assertFalse(result.isSuccess());
        assertEquals("Failed to generate engineering diff", result.getMessage());
    }
}
