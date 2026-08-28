package com.commandjunction.process;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProcessRunnerTest {

    @Test
    void testProcessRunner() {
        ProcessRunner runner = new ProcessRunner() {};
        assertNotNull(runner);
    }
}
