package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ed1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ed1 f7268b = new ed1(jb3.z());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7269c = Integer.toString(0, 36);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final cf4 f7270d = new cf4() { // from class: com.google.android.gms.internal.ads.ba1
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jb3 f7271a;

    public ed1(List list) {
        this.f7271a = jb3.x(list);
    }

    public final jb3 a() {
        return this.f7271a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(int i8) {
        for (int i9 = 0; i9 < this.f7271a.size(); i9++) {
            dc1 dc1Var = (dc1) this.f7271a.get(i9);
            if (dc1Var.c() && dc1Var.a() == i8) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ed1.class != obj.getClass()) {
            return false;
        }
        return this.f7271a.equals(((ed1) obj).f7271a);
    }

    public final int hashCode() {
        return this.f7271a.hashCode();
    }
}
