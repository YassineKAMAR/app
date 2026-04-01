package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class xr3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    static final gx3 f17449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    static final gx3 f17450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    static final gx3 f17451c;

    static {
        new pr3();
        gx3 gx3VarN = gx3.N();
        f17449a = gx3VarN;
        f17450b = gx3VarN;
        f17451c = gx3VarN;
        try {
            a();
        } catch (GeneralSecurityException e8) {
            throw new ExceptionInInitializerError(e8);
        }
    }

    public static void a() {
        ds3.b();
        gr3.b();
        pr3.l(true);
        if (vn3.b()) {
            return;
        }
        sq3.m(true);
    }
}
