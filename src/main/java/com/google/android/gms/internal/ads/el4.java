package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class el4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7425c;

    public el4(String str, boolean z7, boolean z8) {
        this.f7423a = str;
        this.f7424b = z7;
        this.f7425c = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == el4.class) {
            el4 el4Var = (el4) obj;
            if (TextUtils.equals(this.f7423a, el4Var.f7423a) && this.f7424b == el4Var.f7424b && this.f7425c == el4Var.f7425c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7423a.hashCode() + 31) * 31) + (true != this.f7424b ? 1237 : 1231)) * 31) + (true == this.f7425c ? 1231 : 1237);
    }
}
