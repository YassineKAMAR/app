package com.revenuecat.purchases;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public enum EntitlementVerificationMode {
    DISABLED,
    INFORMATIONAL;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final EntitlementVerificationMode getDefault() {
            return EntitlementVerificationMode.DISABLED;
        }
    }

    public final boolean isEnabled() {
        return this != DISABLED;
    }
}
