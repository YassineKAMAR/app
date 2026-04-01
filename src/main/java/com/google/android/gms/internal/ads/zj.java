package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ii f18254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18256c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class[] f18258e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Method f18257d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CountDownLatch f18259f = new CountDownLatch(1);

    public zj(ii iiVar, String str, String str2, Class... clsArr) {
        this.f18254a = iiVar;
        this.f18255b = str;
        this.f18256c = str2;
        this.f18258e = clsArr;
        iiVar.k().submit(new yj(this));
    }

    static /* bridge */ /* synthetic */ void b(zj zjVar) {
        try {
            try {
                ii iiVar = zjVar.f18254a;
                Class<?> clsLoadClass = iiVar.i().loadClass(zjVar.c(iiVar.u(), zjVar.f18255b));
                if (clsLoadClass != null) {
                    zjVar.f18257d = clsLoadClass.getMethod(zjVar.c(zjVar.f18254a.u(), zjVar.f18256c), zjVar.f18258e);
                    Method method = zjVar.f18257d;
                }
            } catch (lh | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
            }
        } finally {
            zjVar.f18259f.countDown();
        }
    }

    private final String c(byte[] bArr, String str) {
        return new String(this.f18254a.e().b(bArr, str), "UTF-8");
    }

    public final Method a() {
        if (this.f18257d != null) {
            return this.f18257d;
        }
        try {
            if (this.f18259f.await(2L, TimeUnit.SECONDS)) {
                return this.f18257d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
