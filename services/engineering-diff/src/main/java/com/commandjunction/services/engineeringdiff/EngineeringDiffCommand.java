package com.commandjunction.services.engineeringdiff;

import com.commandjunction.process.ProcessRunner;
import java.util.List;

public class EngineeringDiffCommand {

    private final ProcessRunner processRunner;

    public EngineeringDiffCommand(ProcessRunner processRunner) {
        this.processRunner = processRunner;
    }

    public EngineeringDiffCommandResult generateDiff() {
        int exitCode = processRunner.runProcess(List.of("echo", "generating engineering diff"));
        if (exitCode == 0) {
            return new EngineeringDiffCommandResult(true, "Engineering diff generated successfully");
        } else {
            return new EngineeringDiffCommandResult(false, "Failed to generate engineering diff");
        }
    }
}
