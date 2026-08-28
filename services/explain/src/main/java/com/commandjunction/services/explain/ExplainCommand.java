package com.commandjunction.services.explain;

import com.commandjunction.process.ProcessRunner;
import java.util.List;

public class ExplainCommand {

    private final ProcessRunner processRunner;

    public ExplainCommand(ProcessRunner processRunner) {
        this.processRunner = processRunner;
    }

    public ExplainCommandResult explain() {
        int exitCode = processRunner.runProcess(List.of("echo", "explaining"));
        if (exitCode == 0) {
            return new ExplainCommandResult(true, "Explained successfully");
        } else {
            return new ExplainCommandResult(false, "Failed to explain");
        }
    }
}
