package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class rx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lz0 f14359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f14360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xr2 f14361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fm0 f14362d;

    public rx0(View view, fm0 fm0Var, lz0 lz0Var, xr2 xr2Var) {
        this.f14360b = view;
        this.f14362d = fm0Var;
        this.f14359a = lz0Var;
        this.f14361c = xr2Var;
    }

    public static final yb1 f(final Context context, final wg0 wg0Var, final wr2 wr2Var, final ts2 ts2Var) {
        return new yb1(new v51() { // from class: com.google.android.gms.internal.ads.px0
            @Override // com.google.android.gms.internal.ads.v51
            public final void B() {
                g2.t.u().n(context, wg0Var.f16723a, wr2Var.E.toString(), ts2Var.f15304f);
            }
        }, eh0.f7327f);
    }

    public static final Set g(cz0 cz0Var) {
        return Collections.singleton(new yb1(cz0Var, eh0.f7327f));
    }

    public static final yb1 h(az0 az0Var) {
        return new yb1(az0Var, eh0.f7326e);
    }

    public final View a() {
        return this.f14360b;
    }

    public final fm0 b() {
        return this.f14362d;
    }

    public final lz0 c() {
        return this.f14359a;
    }

    public t51 d(Set set) {
        return new t51(set);
    }

    public final xr2 e() {
        return this.f14361c;
    }
}
