package com.commandjunction.services.licenses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LicensesCommandTest {

    @Test
    void testCheckLicensesSuccess() {
        LicensesCommand command = new LicensesCommand(c -> 0);
        LicensesCommandResult result = command.checkLicenses();

        assertTrue(result.isSuccess());
        assertEquals("Licenses checked successfully", result.getMessage());
    }

    @Test
    void testCheckLicensesFailure() {
        LicensesCommand command = new LicensesCommand(c -> 1);
        LicensesCommandResult result = command.checkLicenses();

        assertFalse(result.isSuccess());
        assertEquals("Failed to check licenses", result.getMessage());
    }
}
