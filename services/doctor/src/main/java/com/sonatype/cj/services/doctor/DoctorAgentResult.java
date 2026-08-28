package com.sonatype.cj.services.doctor;

import com.sonatype.cj.common.core.CommandResult;

public record DoctorAgentResult(boolean success) implements CommandResult {
}
