package com.revenuecat.purchases;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class UpgradeInfo {
    private final String oldSku;
    private final Integer prorationMode;

    public UpgradeInfo(String oldSku, Integer num) {
        q.f(oldSku, "oldSku");
        this.oldSku = oldSku;
        this.prorationMode = num;
    }

    public /* synthetic */ UpgradeInfo(String str, Integer num, int i8, j jVar) {
        this(str, (i8 & 2) != 0 ? null : num);
    }

    public static /* synthetic */ UpgradeInfo copy$default(UpgradeInfo upgradeInfo, String str, Integer num, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = upgradeInfo.oldSku;
        }
        if ((i8 & 2) != 0) {
            num = upgradeInfo.prorationMode;
        }
        return upgradeInfo.copy(str, num);
    }

    public final String component1() {
        return this.oldSku;
    }

    public final Integer component2() {
        return this.prorationMode;
    }

    public final UpgradeInfo copy(String oldSku, Integer num) {
        q.f(oldSku, "oldSku");
        return new UpgradeInfo(oldSku, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpgradeInfo)) {
            return false;
        }
        UpgradeInfo upgradeInfo = (UpgradeInfo) obj;
        return q.b(this.oldSku, upgradeInfo.oldSku) && q.b(this.prorationMode, upgradeInfo.prorationMode);
    }

    public final String getOldSku() {
        return this.oldSku;
    }

    public final Integer getProrationMode() {
        return this.prorationMode;
    }

    public int hashCode() {
        int iHashCode = this.oldSku.hashCode() * 31;
        Integer num = this.prorationMode;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "UpgradeInfo(oldSku=" + this.oldSku + ", prorationMode=" + this.prorationMode + ')';
    }
}
