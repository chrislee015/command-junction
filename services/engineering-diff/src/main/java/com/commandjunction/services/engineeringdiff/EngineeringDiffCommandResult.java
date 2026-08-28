package com.commandjunction.services.engineeringdiff;

import com.commandjunction.core.command.CommandResult;

public record EngineeringDiffCommandResult(boolean isSuccess, String getMessage) implements CommandResult {
}
