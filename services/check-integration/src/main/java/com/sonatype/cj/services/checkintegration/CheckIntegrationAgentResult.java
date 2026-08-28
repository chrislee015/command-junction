package com.sonatype.cj.services.checkintegration;

import com.sonatype.cj.common.core.CommandResult;

public record CheckIntegrationAgentResult(boolean success) implements CommandResult {
}
