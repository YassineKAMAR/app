package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class qw implements c2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pw f13786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c2.b f13787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z1.y f13788c = new z1.y();

    public qw(pw pwVar) {
        Context context;
        this.f13786a = pwVar;
        c2.b bVar = null;
        try {
            context = (Context) g3.b.H0(pwVar.o());
        } catch (RemoteException | NullPointerException e8) {
            qg0.e("", e8);
            context = null;
        }
        if (context != null) {
            c2.b bVar2 = new c2.b(context);
            try {
                if (true == this.f13786a.t0(g3.b.k3(bVar2))) {
                    bVar = bVar2;
                }
            } catch (RemoteException e9) {
                qg0.e("", e9);
            }
        }
        this.f13787b = bVar;
    }

    @Override // c2.f
    public final String a() {
        try {
            return this.f13786a.r();
        } catch (RemoteException e8) {
            qg0.e("", e8);
            return null;
        }
    }

    public final pw b() {
        return this.f13786a;
    }
}
