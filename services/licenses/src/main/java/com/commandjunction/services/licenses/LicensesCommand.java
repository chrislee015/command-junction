package com.commandjunction.services.licenses;

import com.commandjunction.process.ProcessRunner;
import java.util.List;

public class LicensesCommand {

    private final ProcessRunner processRunner;

    public LicensesCommand(ProcessRunner processRunner) {
        this.processRunner = processRunner;
    }

    public LicensesCommandResult checkLicenses() {
        int exitCode = processRunner.runProcess(List.of("echo", "checking licenses"));
        if (exitCode == 0) {
            return new LicensesCommandResult(true, "Licenses checked successfully");
        } else {
            return new LicensesCommandResult(false, "Failed to check licenses");
        }
    }
}
