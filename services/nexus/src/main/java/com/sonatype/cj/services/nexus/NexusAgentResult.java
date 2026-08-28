package com.sonatype.cj.services.nexus;

import com.sonatype.cj.common.core.CommandResult;

public record NexusAgentResult(boolean success) implements CommandResult {
}
