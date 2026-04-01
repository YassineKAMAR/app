package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class i90 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ff0 f9102e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z1.b f9104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h2.w2 f9105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9106d;

    public i90(Context context, z1.b bVar, h2.w2 w2Var, String str) {
        this.f9103a = context;
        this.f9104b = bVar;
        this.f9105c = w2Var;
        this.f9106d = str;
    }

    public static ff0 a(Context context) {
        ff0 ff0Var;
        synchronized (i90.class) {
            if (f9102e == null) {
                f9102e = h2.v.a().o(context, new w40());
            }
            ff0Var = f9102e;
        }
        return ff0Var;
    }

    public final void b(q2.b bVar) {
        h2.r4 r4VarA;
        String str;
        ff0 ff0VarA = a(this.f9103a);
        if (ff0VarA == null) {
            str = "Internal Error, query info generator is null.";
        } else {
            Context context = this.f9103a;
            h2.w2 w2Var = this.f9105c;
            g3.a aVarK3 = g3.b.k3(context);
            if (w2Var == null) {
                r4VarA = new h2.s4().a();
            } else {
                r4VarA = h2.v4.f22331a.a(this.f9103a, w2Var);
            }
            try {
                ff0VarA.g5(aVarK3, new jf0(this.f9106d, this.f9104b.name(), null, r4VarA), new h90(this, bVar));
                return;
            } catch (RemoteException unused) {
                str = "Internal Error.";
            }
        }
        bVar.a(str);
    }
}
