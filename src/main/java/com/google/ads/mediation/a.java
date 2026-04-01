package com.google.ads.mediation;

import android.view.View;
import c2.h;
import c2.l;
import c2.n;
import java.util.Map;
import l2.x;

/* JADX INFO: loaded from: classes.dex */
final class a extends x {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final h f4677s;

    public a(h hVar) {
        this.f4677s = hVar;
        w(hVar.d());
        y(hVar.f());
        u(hVar.b());
        x(hVar.e());
        v(hVar.c());
        t(hVar.a());
        C(hVar.h());
        D(hVar.i());
        B(hVar.g());
        J(hVar.k());
        A(true);
        z(true);
        K(hVar.j());
    }

    @Override // l2.x
    public final void E(View view, Map<String, View> map, Map<String, View> map2) {
        if (view instanceof n) {
            throw null;
        }
        if (((l) l.f3430a.get(view)) != null) {
            throw null;
        }
    }
}
