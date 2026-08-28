package com.commandjunction.services.provenance;

import com.commandjunction.process.ProcessRunner;
import java.util.List;

public class ProvenanceCommand {

    private final ProcessRunner processRunner;

    public ProvenanceCommand(ProcessRunner processRunner) {
        this.processRunner = processRunner;
    }

    public ProvenanceCommandResult checkProvenance() {
        int exitCode = processRunner.runProcess(List.of("echo", "checking provenance"));
        if (exitCode == 0) {
            return new ProvenanceCommandResult(true, "Provenance checked successfully");
        } else {
            return new ProvenanceCommandResult(false, "Failed to check provenance");
        }
    }
}
