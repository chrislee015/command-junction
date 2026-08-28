package com.sonatype.cj.services.sonatypelifecycle;

import com.sonatype.cj.common.core.CommandResult;

public record SonatypeLifecycleAgentResult(boolean success) implements CommandResult {
}
