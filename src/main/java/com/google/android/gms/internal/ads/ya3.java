package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ya3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ya3 f17722a = new va3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ya3 f17723b = new wa3(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ya3 f17724c = new wa3(1);

    /* synthetic */ ya3(xa3 xa3Var) {
    }

    public static ya3 i() {
        return f17722a;
    }

    public abstract int a();

    public abstract ya3 b(int i8, int i9);

    public abstract ya3 c(Object obj, Object obj2, Comparator comparator);

    public abstract ya3 d(boolean z7, boolean z8);

    public abstract ya3 e(boolean z7, boolean z8);
}
