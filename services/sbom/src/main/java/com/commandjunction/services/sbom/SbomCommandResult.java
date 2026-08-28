package com.commandjunction.services.sbom;

import com.commandjunction.core.command.CommandResult;

public record SbomCommandResult(boolean isSuccess, String getMessage) implements CommandResult {
}
