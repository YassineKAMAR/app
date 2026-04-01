package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class o83 implements Serializable, m83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f12401a;

    @Override // com.google.android.gms.internal.ads.m83
    public final boolean a(Object obj) {
        for (int i8 = 0; i8 < this.f12401a.size(); i8++) {
            if (!((m83) this.f12401a.get(i8)).a(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o83) {
            return this.f12401a.equals(((o83) obj).f12401a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12401a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        boolean z7 = true;
        for (Object obj : this.f12401a) {
            if (!z7) {
                sb.append(',');
            }
            sb.append(obj);
            z7 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
