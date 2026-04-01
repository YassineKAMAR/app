package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import b2.a;

/* JADX INFO: loaded from: classes.dex */
public final class wm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h2.s0 f16807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f16808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h2.w2 f16810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f16811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a.AbstractC0055a f16812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w40 f16813g = new w40();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h2.v4 f16814h = h2.v4.f22331a;

    public wm(Context context, String str, h2.w2 w2Var, int i8, a.AbstractC0055a abstractC0055a) {
        this.f16808b = context;
        this.f16809c = str;
        this.f16810d = w2Var;
        this.f16811e = i8;
        this.f16812f = abstractC0055a;
    }

    public final void a() {
        try {
            h2.s0 s0VarD = h2.v.a().d(this.f16808b, h2.w4.i(), this.f16809c, this.f16813g);
            this.f16807a = s0VarD;
            if (s0VarD != null) {
                if (this.f16811e != 3) {
                    this.f16807a.c5(new h2.c5(this.f16811e));
                }
                this.f16807a.a2(new jm(this.f16812f, this.f16809c));
                this.f16807a.v2(this.f16814h.a(this.f16808b, this.f16810d));
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }
}
