package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class gv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j2.x1 f8516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t22 f8517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ln1 f8518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lg3 f8519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Executor f8520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f8521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r90 f8522h;

    gv0(Context context, j2.x1 x1Var, t22 t22Var, ln1 ln1Var, lg3 lg3Var, lg3 lg3Var2, ScheduledExecutorService scheduledExecutorService) {
        this.f8515a = context;
        this.f8516b = x1Var;
        this.f8517c = t22Var;
        this.f8518d = ln1Var;
        this.f8519e = lg3Var;
        this.f8520f = lg3Var2;
        this.f8521g = scheduledExecutorService;
    }

    private final x3.d j(final String str, final InputEvent inputEvent, Random random) {
        final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        if (!str.contains((CharSequence) h2.y.c().b(ns.v9)) || this.f8516b.F0()) {
            return zf3.h(str);
        }
        builderBuildUpon.appendQueryParameter((String) h2.y.c().b(ns.w9), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
        if (inputEvent != null) {
            return zf3.f(zf3.n(qf3.C(this.f8517c.a()), new gf3() { // from class: com.google.android.gms.internal.ads.av0
                @Override // com.google.android.gms.internal.ads.gf3
                public final x3.d a(Object obj) {
                    return this.f5504a.d(builderBuildUpon, str, inputEvent, (Integer) obj);
                }
            }, this.f8520f), Throwable.class, new gf3() { // from class: com.google.android.gms.internal.ads.bv0
                @Override // com.google.android.gms.internal.ads.gf3
                public final x3.d a(Object obj) {
                    return this.f6051a.e(builderBuildUpon, (Throwable) obj);
                }
            }, this.f8519e);
        }
        builderBuildUpon.appendQueryParameter((String) h2.y.c().b(ns.x9), "11");
        return zf3.h(builderBuildUpon.toString());
    }

    public final x3.d c(final String str, Random random) {
        return zf3.f(j(str, this.f8518d.a(), random), Throwable.class, new gf3() { // from class: com.google.android.gms.internal.ads.zu0
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return zf3.h(str);
            }
        }, this.f8519e);
    }

    final /* synthetic */ x3.d d(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) h2.y.c().b(ns.x9), "10");
            return zf3.h(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        builderBuildUpon.appendQueryParameter((String) h2.y.c().b(ns.y9), "1");
        builderBuildUpon.appendQueryParameter((String) h2.y.c().b(ns.x9), "12");
        if (str.contains((CharSequence) h2.y.c().b(ns.z9))) {
            builderBuildUpon.authority((String) h2.y.c().b(ns.A9));
        }
        return zf3.n(qf3.C(this.f8517c.b(builderBuildUpon.build(), inputEvent)), new gf3() { // from class: com.google.android.gms.internal.ads.cv0
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                String str2 = (String) h2.y.c().b(ns.x9);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return zf3.h(builder2.toString());
            }
        }, this.f8520f);
    }

    final /* synthetic */ x3.d e(Uri.Builder builder, final Throwable th) {
        this.f8519e.d(new Runnable() { // from class: com.google.android.gms.internal.ads.yu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17927a.h(th);
            }
        });
        builder.appendQueryParameter((String) h2.y.c().b(ns.x9), "9");
        return zf3.h(builder.toString());
    }

    final /* synthetic */ void h(Throwable th) {
        r90 r90VarC = o90.c(this.f8515a);
        this.f8522h = r90VarC;
        r90VarC.a(th, "AttributionReporting");
    }

    public final void i(String str, jz2 jz2Var, Random random) {
        zf3.r(zf3.o(j(str, this.f8518d.a(), random), ((Integer) h2.y.c().b(ns.B9)).intValue(), TimeUnit.MILLISECONDS, this.f8521g), new fv0(this, jz2Var, str), this.f8519e);
    }
}
