package com.avm.account.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        // Replace with actual user fetching logic (e.g., from Spring Security)
        return Optional.of("Accounts-MS"); // Default user
    }

}
