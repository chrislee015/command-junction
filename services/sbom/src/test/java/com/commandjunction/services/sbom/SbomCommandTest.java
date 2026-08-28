package com.commandjunction.services.sbom;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SbomCommandTest {

    @Test
    void testGenerateSbomSuccess() {
        SbomCommand command = new SbomCommand(c -> 0);
        SbomCommandResult result = command.generateSbom();

        assertTrue(result.isSuccess());
        assertEquals("SBOM generated successfully", result.getMessage());
    }

    @Test
    void testGenerateSbomFailure() {
        SbomCommand command = new SbomCommand(c -> 1);
        SbomCommandResult result = command.generateSbom();

        assertFalse(result.isSuccess());
        assertEquals("Failed to generate SBOM", result.getMessage());
    }
}
