package com.commandjunction.services.provenance;

import com.commandjunction.core.command.CommandResult;

public record ProvenanceCommandResult(boolean isSuccess, String getMessage) implements CommandResult {
}
