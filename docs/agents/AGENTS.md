# Command Junction Agent Dependency DAG

## Overview

Command Junction uses specialized child agents to iteratively build the platform. Agents must strictly adhere to their designated filesystem ownership and only implement dependencies explicitly authorized in their wave.

## Waves and Spawn Sets

### WAVE 0 — Architecture and Build Foundation
*   **Architecture Reconciliation Agent**
    *   *Owns*: `docs/**`
    *   *Dependencies*: None
*   **Build Platform Agent**
    *   *Owns*: `settings.gradle`, `build.gradle`, `gradle.properties`, `gradle/**`, `buildSrc/**`, `application/cj` initial skeleton
    *   *Dependencies*: None
*   **Spring Support Core Agent**
    *   *Owns*: `common/spring-support/core/**`
    *   *Dependencies*: Build Platform

### WAVE 1 — Core Runtime
*   **Spring Support CQRS/Pipeline Agent** -> `common/spring-support/core/** cqrs/pipeline`
*   **Spring Support Concurrency/Resilience Agent** -> `common/spring-support/core/** concurrency/resilience`
*   **Spring Support Data/Audit Agent** -> `common/spring-support/core/** data/audit`
*   **Process Runtime Agent** -> `common/process/**`
*   **CLI Output Agent** -> `common/cli/output/**`
*   **Project Model Agent** -> `common/project/**`
*   **Config/Security Agent** -> `common/config/**`, `common/security/**`
*(All depend on Spring Support Core, Build Platform)*

### WAVE 2 — Interactive and Repository Services
*   **Spring Support Spring Adapter Agent**
*   **Spring Support Testing Agent**
*   **Git Agent**
*   **Gradle Agent**
*   **Project Context Agent**
*   **Terminal Agent**
*   **Flow Components Agent**
*   **Auth/Profile Agent**
*(Depend on Wave 1 components where relevant)*

### WAVE 3 — Core Developer Control Plane
*   **Quality Agent**
*   **Dependency Agent**
*   **Nexus Agent**
*   **Sonatype Agent**
*   **Doctor/Check Integration Agent**
*   **Cache Agent**

### WAVE 4 — Supply Chain
*   **SBOM Agent**
*   **Provenance Agent**
*   **License Agent**
*   **Engineering Diff Agent**
*   **Explain Agent**

### WAVE 5 — Remediation
*   **OpenRewrite Runtime Agent**
*   **OpenRewrite Quality Recipe Agent**
*   **OpenRewrite Migration Agent**
*   **Company Standards Recipe Agent**
*   **Upgrade Agent**
*   **Architecture Conformance Agent**

### WAVE 6 — Transactional Fix Platform
*   **Fix Transaction Agent**
*   **Baseline Agent**
*   **Policy Agent**
*   **History Agent**
*   **Audit Agent**
*   **Drift Agent**

### WAVE 7 — cj fix all
*   **Fix All Orchestrator Agent**
*   **Git Publication Agent**
*   **GitLab Publication Agent**

### WAVE 8 — Local Runtime and Environment
*   **Environment Agent**
*   **Run Agent**
*   **Logs Agent**
*   **Observability Agent**
*   **Database Agent**

### WAVE 9 — Container and Kubernetes
*   **Container Agent** -> `services/container/**`
*   **Kubernetes Agent** -> `services/k8s/**`
*   **Deployment Agent** -> `services/deploy/**`

### WAVE 10 — Workspace Scale
*   **Workspace Agent**
*   **Campaign Agent**
*   **API Compatibility Agent**
*   **Pipeline Reproduction Agent**

### WAVE 11 — TUI
*   **TUI Agent**

### WAVE 12 — Extension Platform
*   **Extension Protocol Agent**
*   **Extension Registry Agent**

### WAVE 13 — Agentic CJ
*   **Agent Planning Agent**
*   **Agent Policy Agent**
*   **Agent Retry Agent**
