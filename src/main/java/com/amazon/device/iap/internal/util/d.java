package com.amazon.device.iap.internal.util;

/* JADX INFO: loaded from: classes.dex */
public enum d {
    LEGACY(0),
    V1(1),
    V2(2),
    V3(3);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4343e;

    d(int i8) {
        this.f4343e = i8;
    }

    int a() {
        return this.f4343e;
    }

    public boolean a(d dVar) {
        return dVar != null && this.f4343e < dVar.f4343e;
    }
}
