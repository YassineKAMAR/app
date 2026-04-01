package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes.dex */
public final class DateActive {
    private final boolean inGracePeriod;
    private final boolean isActive;

    public DateActive(boolean z7, boolean z8) {
        this.isActive = z7;
        this.inGracePeriod = z8;
    }

    public static /* synthetic */ DateActive copy$default(DateActive dateActive, boolean z7, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = dateActive.isActive;
        }
        if ((i8 & 2) != 0) {
            z8 = dateActive.inGracePeriod;
        }
        return dateActive.copy(z7, z8);
    }

    public final boolean component1() {
        return this.isActive;
    }

    public final boolean component2() {
        return this.inGracePeriod;
    }

    public final DateActive copy(boolean z7, boolean z8) {
        return new DateActive(z7, z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateActive)) {
            return false;
        }
        DateActive dateActive = (DateActive) obj;
        return this.isActive == dateActive.isActive && this.inGracePeriod == dateActive.inGracePeriod;
    }

    public final boolean getInGracePeriod() {
        return this.inGracePeriod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z7 = this.isActive;
        ?? r02 = z7;
        if (z7) {
            r02 = 1;
        }
        int i8 = r02 * 31;
        boolean z8 = this.inGracePeriod;
        return i8 + (z8 ? 1 : z8);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        return "DateActive(isActive=" + this.isActive + ", inGracePeriod=" + this.inGracePeriod + ')';
    }
}
