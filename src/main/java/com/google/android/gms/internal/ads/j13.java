package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l03 f9443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f9444b;

    public j13(l03 l03Var, String str) {
        ArrayList arrayList = new ArrayList();
        this.f9444b = arrayList;
        this.f9443a = l03Var;
        arrayList.add(str);
    }

    public final l03 a() {
        return this.f9443a;
    }

    public final ArrayList b() {
        return this.f9444b;
    }

    public final void c(String str) {
        this.f9444b.add(str);
    }
}
