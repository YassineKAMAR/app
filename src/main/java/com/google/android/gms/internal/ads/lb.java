package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10567b;

    public lb(String str, String str2) {
        this.f10566a = str;
        this.f10567b = str2;
    }

    public final String a() {
        return this.f10566a;
    }

    public final String b() {
        return this.f10567b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lb.class == obj.getClass()) {
            lb lbVar = (lb) obj;
            if (TextUtils.equals(this.f10566a, lbVar.f10566a) && TextUtils.equals(this.f10567b, lbVar.f10567b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f10566a.hashCode() * 31) + this.f10567b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f10566a + ",value=" + this.f10567b + "]";
    }
}
