package com.commandjunction.services.licenses;

import com.commandjunction.core.command.CommandResult;

public record LicensesCommandResult(boolean isSuccess, String getMessage) implements CommandResult {
}
