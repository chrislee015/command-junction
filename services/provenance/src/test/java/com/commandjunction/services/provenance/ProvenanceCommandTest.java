package com.commandjunction.services.provenance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProvenanceCommandTest {

    @Test
    void testCheckProvenanceSuccess() {
        ProvenanceCommand command = new ProvenanceCommand(c -> 0);
        ProvenanceCommandResult result = command.checkProvenance();

        assertTrue(result.isSuccess());
        assertEquals("Provenance checked successfully", result.getMessage());
    }

    @Test
    void testCheckProvenanceFailure() {
        ProvenanceCommand command = new ProvenanceCommand(c -> 1);
        ProvenanceCommandResult result = command.checkProvenance();

        assertFalse(result.isSuccess());
        assertEquals("Failed to check provenance", result.getMessage());
    }
}
