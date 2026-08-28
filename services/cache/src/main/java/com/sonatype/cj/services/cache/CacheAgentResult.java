package com.sonatype.cj.services.cache;

import com.sonatype.cj.common.core.CommandResult;

public record CacheAgentResult(boolean success) implements CommandResult {
}
