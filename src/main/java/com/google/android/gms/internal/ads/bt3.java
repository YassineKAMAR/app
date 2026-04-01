package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bt3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sh3 f6033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f6036d;

    /* synthetic */ bt3(sh3 sh3Var, int i8, String str, String str2, at3 at3Var) {
        this.f6033a = sh3Var;
        this.f6034b = i8;
        this.f6035c = str;
        this.f6036d = str2;
    }

    public final int a() {
        return this.f6034b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bt3)) {
            return false;
        }
        bt3 bt3Var = (bt3) obj;
        return this.f6033a == bt3Var.f6033a && this.f6034b == bt3Var.f6034b && this.f6035c.equals(bt3Var.f6035c) && this.f6036d.equals(bt3Var.f6036d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6033a, Integer.valueOf(this.f6034b), this.f6035c, this.f6036d});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f6033a, Integer.valueOf(this.f6034b), this.f6035c, this.f6036d);
    }
}
