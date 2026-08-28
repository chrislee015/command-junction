package com.sonatype.cj.services.quality;

import com.sonatype.cj.common.core.CommandResult;

public record QualityAgentResult(boolean success) implements CommandResult {
}
