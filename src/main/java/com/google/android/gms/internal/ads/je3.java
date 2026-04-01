package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class je3 extends ae3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Unsafe f9582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long f9583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final long f9584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final long f9585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final long f9586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long f9587f;

    class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws IllegalAccessException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f9584c = unsafe.objectFieldOffset(le3.class.getDeclaredField("c"));
                f9583b = unsafe.objectFieldOffset(le3.class.getDeclaredField("b"));
                f9585d = unsafe.objectFieldOffset(le3.class.getDeclaredField("a"));
                f9586e = unsafe.objectFieldOffset(ke3.class.getDeclaredField("a"));
                f9587f = unsafe.objectFieldOffset(ke3.class.getDeclaredField("b"));
                f9582a = unsafe;
            } catch (NoSuchFieldException e8) {
                throw new RuntimeException(e8);
            } catch (RuntimeException e9) {
                throw e9;
            }
        } catch (PrivilegedActionException e10) {
            throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
        }
    }

    /* synthetic */ je3(qe3 qe3Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final de3 a(le3 le3Var, de3 de3Var) {
        de3 de3Var2;
        do {
            de3Var2 = le3Var.f10656b;
            if (de3Var == de3Var2) {
                return de3Var2;
            }
        } while (!e(le3Var, de3Var2, de3Var));
        return de3Var2;
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final ke3 b(le3 le3Var, ke3 ke3Var) {
        ke3 ke3Var2;
        do {
            ke3Var2 = le3Var.f10657c;
            if (ke3Var == ke3Var2) {
                return ke3Var2;
            }
        } while (!g(le3Var, ke3Var2, ke3Var));
        return ke3Var2;
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final void c(ke3 ke3Var, ke3 ke3Var2) {
        f9582a.putObject(ke3Var, f9587f, ke3Var2);
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final void d(ke3 ke3Var, Thread thread) {
        f9582a.putObject(ke3Var, f9586e, thread);
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final boolean e(le3 le3Var, de3 de3Var, de3 de3Var2) {
        return pe3.a(f9582a, le3Var, f9583b, de3Var, de3Var2);
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final boolean f(le3 le3Var, Object obj, Object obj2) {
        return pe3.a(f9582a, le3Var, f9585d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.ae3
    final boolean g(le3 le3Var, ke3 ke3Var, ke3 ke3Var2) {
        return pe3.a(f9582a, le3Var, f9584c, ke3Var, ke3Var2);
    }
}
