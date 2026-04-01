package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class e10 implements mb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile q00 f7089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f7090b;

    public e10(Context context) {
        this.f7090b = context;
    }

    static /* bridge */ /* synthetic */ void c(e10 e10Var) {
        if (e10Var.f7089a == null) {
            return;
        }
        e10Var.f7089a.f();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.mb
    public final qb a(ub ubVar) throws dc {
        Parcelable.Creator<r00> creator = r00.CREATOR;
        Map mapR = ubVar.r();
        int size = mapR.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i8 = 0;
        int i9 = 0;
        for (Map.Entry entry : mapR.entrySet()) {
            strArr[i9] = (String) entry.getKey();
            strArr2[i9] = (String) entry.getValue();
            i9++;
        }
        r00 r00Var = new r00(ubVar.q(), strArr, strArr2);
        long jB = g2.t.b().b();
        try {
            jh0 jh0Var = new jh0();
            this.f7089a = new q00(this.f7090b, g2.t.v().b(), new c10(this, jh0Var), new d10(this, jh0Var));
            this.f7089a.q();
            a10 a10Var = new a10(this, r00Var);
            lg3 lg3Var = eh0.f7322a;
            x3.d dVarO = zf3.o(zf3.n(jh0Var, a10Var, lg3Var), ((Integer) h2.y.c().b(ns.f12161p4)).intValue(), TimeUnit.MILLISECONDS, eh0.f7325d);
            dVarO.c(new b10(this), lg3Var);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) dVarO.get();
            j2.v1.k("Http assets remote cache took " + (g2.t.b().b() - jB) + "ms");
            t00 t00Var = (t00) new wa0(parcelFileDescriptor).g(t00.CREATOR);
            if (t00Var == null) {
                return null;
            }
            if (t00Var.f14893a) {
                throw new dc(t00Var.f14894b);
            }
            if (t00Var.f14897e.length != t00Var.f14898f.length) {
                return null;
            }
            HashMap map = new HashMap();
            while (true) {
                String[] strArr3 = t00Var.f14897e;
                if (i8 >= strArr3.length) {
                    return new qb(t00Var.f14895c, t00Var.f14896d, map, t00Var.f14899g, t00Var.f14900h);
                }
                map.put(strArr3[i8], t00Var.f14898f[i8]);
                i8++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            j2.v1.k("Http assets remote cache took " + (g2.t.b().b() - jB) + "ms");
            return null;
        } catch (Throwable th) {
            j2.v1.k("Http assets remote cache took " + (g2.t.b().b() - jB) + "ms");
            throw th;
        }
    }
}
