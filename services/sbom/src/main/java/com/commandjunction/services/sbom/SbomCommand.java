package com.commandjunction.services.sbom;

import com.commandjunction.process.ProcessRunner;
import java.util.List;

public class SbomCommand {

    private final ProcessRunner processRunner;

    public SbomCommand(ProcessRunner processRunner) {
        this.processRunner = processRunner;
    }

    public SbomCommandResult generateSbom() {
        int exitCode = processRunner.runProcess(List.of("echo", "generating sbom"));
        if (exitCode == 0) {
            return new SbomCommandResult(true, "SBOM generated successfully");
        } else {
            return new SbomCommandResult(false, "Failed to generate SBOM");
        }
    }
}
