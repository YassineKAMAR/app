package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c83 f7190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c83 f7191c;

    /* synthetic */ e83(String str, d83 d83Var) {
        c83 c83Var = new c83(null);
        this.f7190b = c83Var;
        this.f7191c = c83Var;
        str.getClass();
        this.f7189a = str;
    }

    public final e83 a(Object obj) {
        c83 c83Var = new c83(null);
        this.f7191c.f6212b = c83Var;
        this.f7191c = c83Var;
        c83Var.f6211a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f7189a);
        sb.append('{');
        c83 c83Var = this.f7190b.f6212b;
        String str = "";
        while (c83Var != null) {
            Object obj = c83Var.f6211a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            c83Var = c83Var.f6212b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
