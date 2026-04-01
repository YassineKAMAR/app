package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ot2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ot2 f12639d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h2.k1 f12641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f12642c = new AtomicReference();

    ot2(Context context, h2.k1 k1Var) {
        this.f12640a = context;
        this.f12641b = k1Var;
    }

    static h2.k1 a(Context context) {
        try {
            return h2.j1.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e8) {
            qg0.e("Failed to retrieve lite SDK info.", e8);
            return null;
        }
    }

    public static ot2 d(Context context) {
        synchronized (ot2.class) {
            ot2 ot2Var = f12639d;
            if (ot2Var != null) {
                return ot2Var;
            }
            Context applicationContext = context.getApplicationContext();
            long jLongValue = ((Long) lu.f11043b.e()).longValue();
            h2.k1 k1VarA = null;
            if (jLongValue > 0 && jLongValue <= 233702200) {
                k1VarA = a(applicationContext);
            }
            ot2 ot2Var2 = new ot2(applicationContext, k1VarA);
            f12639d = ot2Var2;
            return ot2Var2;
        }
    }

    private final h2.n3 g() {
        h2.k1 k1Var = this.f12641b;
        if (k1Var != null) {
            try {
                return k1Var.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final z40 b() {
        return (z40) this.f12642c.get();
    }

    public final wg0 c(int i8, boolean z7, int i9) {
        h2.n3 n3VarG;
        g2.t.r();
        boolean zD = j2.k2.d(this.f12640a);
        wg0 wg0Var = new wg0(233702000, i9, true, zD);
        return (((Boolean) lu.f11044c.e()).booleanValue() && (n3VarG = g()) != null) ? new wg0(233702000, n3VarG.g(), true, zD) : wg0Var;
    }

    public final String e() {
        h2.n3 n3VarG = g();
        if (n3VarG != null) {
            return n3VarG.i();
        }
        return null;
    }

    public final void f(z40 z40Var) {
        z40 adapterCreator;
        if (!((Boolean) lu.f11042a.e()).booleanValue()) {
            nt2.a(this.f12642c, null, z40Var);
            return;
        }
        h2.k1 k1Var = this.f12641b;
        if (k1Var == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = k1Var.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        AtomicReference atomicReference = this.f12642c;
        if (adapterCreator != null) {
            z40Var = adapterCreator;
        }
        nt2.a(atomicReference, null, z40Var);
    }
}
