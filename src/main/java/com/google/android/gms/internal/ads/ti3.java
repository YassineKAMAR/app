package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class ti3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    static final gx3 f15123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    static final gx3 f15124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    static final gx3 f15125c;

    static {
        new fj3();
        new tk3();
        new kl3();
        new bk3();
        new jm3();
        new om3();
        new zl3();
        new zm3();
        gx3 gx3VarN = gx3.N();
        f15123a = gx3VarN;
        f15124b = gx3VarN;
        f15125c = gx3VarN;
        try {
            a();
        } catch (GeneralSecurityException e8) {
            throw new ExceptionInInitializerError(e8);
        }
    }

    public static void a() {
        yi3.b();
        xr3.a();
        qi3.f(new fj3(), true);
        int i8 = rj3.f14162f;
        rj3.a(yo3.b());
        qi3.f(new tk3(), true);
        int i9 = dl3.f6802f;
        dl3.a(yo3.b());
        if (vn3.b()) {
            return;
        }
        qi3.f(new bk3(), true);
        int i10 = mk3.f11361f;
        mk3.a(yo3.b());
        kl3.k(true);
        qi3.f(new zl3(), true);
        int i11 = gm3.f8411f;
        gm3.a(yo3.b());
        qi3.f(new jm3(), true);
        qi3.f(new om3(), true);
        qi3.f(new zm3(), true);
        int i12 = gn3.f8431f;
        gn3.a(yo3.b());
    }
}
