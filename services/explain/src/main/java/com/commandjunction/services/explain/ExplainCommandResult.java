package com.commandjunction.services.explain;

import com.commandjunction.core.command.CommandResult;

public record ExplainCommandResult(boolean isSuccess, String getMessage) implements CommandResult {
}
