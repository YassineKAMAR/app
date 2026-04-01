package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dt3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ws3 f7012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f7013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f7014c;

    /* synthetic */ dt3(ws3 ws3Var, List list, Integer num, ct3 ct3Var) {
        this.f7012a = ws3Var;
        this.f7013b = list;
        this.f7014c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dt3)) {
            return false;
        }
        dt3 dt3Var = (dt3) obj;
        if (this.f7012a.equals(dt3Var.f7012a) && this.f7013b.equals(dt3Var.f7013b)) {
            Integer num = this.f7014c;
            Integer num2 = dt3Var.f7014c;
            if (num == num2) {
                return true;
            }
            if (num != null && num.equals(num2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7012a, this.f7013b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f7012a, this.f7013b, this.f7014c);
    }
}
