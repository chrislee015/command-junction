package com.sonatype.cj.services.dependency;

import com.sonatype.cj.common.core.CommandResult;

public record DependencyAgentResult(boolean success) implements CommandResult {
}
