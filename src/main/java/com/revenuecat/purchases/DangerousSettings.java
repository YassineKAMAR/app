package com.revenuecat.purchases;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class DangerousSettings {
    private final boolean autoSyncPurchases;
    private final boolean customEntitlementComputation;

    /* JADX WARN: Illegal instructions before constructor call */
    public DangerousSettings() {
        boolean z7 = false;
        this(z7, z7, 3, null);
    }

    public DangerousSettings(boolean z7) {
        this(z7, false);
    }

    public /* synthetic */ DangerousSettings(boolean z7, int i8, j jVar) {
        this((i8 & 1) != 0 ? true : z7);
    }

    public DangerousSettings(boolean z7, boolean z8) {
        this.autoSyncPurchases = z7;
        this.customEntitlementComputation = z8;
    }

    public /* synthetic */ DangerousSettings(boolean z7, boolean z8, int i8, j jVar) {
        this((i8 & 1) != 0 ? true : z7, (i8 & 2) != 0 ? false : z8);
    }

    public static /* synthetic */ DangerousSettings copy$default(DangerousSettings dangerousSettings, boolean z7, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = dangerousSettings.autoSyncPurchases;
        }
        if ((i8 & 2) != 0) {
            z8 = dangerousSettings.customEntitlementComputation;
        }
        return dangerousSettings.copy(z7, z8);
    }

    public final boolean component1() {
        return this.autoSyncPurchases;
    }

    public final boolean component2$purchases_defaultsRelease() {
        return this.customEntitlementComputation;
    }

    public final DangerousSettings copy(boolean z7, boolean z8) {
        return new DangerousSettings(z7, z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DangerousSettings)) {
            return false;
        }
        DangerousSettings dangerousSettings = (DangerousSettings) obj;
        return this.autoSyncPurchases == dangerousSettings.autoSyncPurchases && this.customEntitlementComputation == dangerousSettings.customEntitlementComputation;
    }

    public final boolean getAutoSyncPurchases() {
        return this.autoSyncPurchases;
    }

    public final boolean getCustomEntitlementComputation$purchases_defaultsRelease() {
        return this.customEntitlementComputation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z7 = this.autoSyncPurchases;
        ?? r02 = z7;
        if (z7) {
            r02 = 1;
        }
        int i8 = r02 * 31;
        boolean z8 = this.customEntitlementComputation;
        return i8 + (z8 ? 1 : z8);
    }

    public String toString() {
        return "DangerousSettings(autoSyncPurchases=" + this.autoSyncPurchases + ", customEntitlementComputation=" + this.customEntitlementComputation + ')';
    }
}
