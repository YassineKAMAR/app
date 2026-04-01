package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class kv1 implements jw1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f10364h = Pattern.compile("Received error HTTP response code: (.*)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ku1 f10365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lg3 f10366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ts2 f10367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f10368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m02 f10369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final qy2 f10370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f10371g;

    kv1(Context context, ts2 ts2Var, ku1 ku1Var, lg3 lg3Var, ScheduledExecutorService scheduledExecutorService, m02 m02Var, qy2 qy2Var) {
        this.f10371g = context;
        this.f10367c = ts2Var;
        this.f10365a = ku1Var;
        this.f10366b = lg3Var;
        this.f10368d = scheduledExecutorService;
        this.f10369e = m02Var;
        this.f10370f = qy2Var;
    }

    @Override // com.google.android.gms.internal.ads.jw1
    public final x3.d a(ya0 ya0Var) {
        Context context = this.f10371g;
        x3.d dVarB = this.f10365a.b(ya0Var);
        ey2 ey2VarA = dy2.a(context, 11);
        py2.d(dVarB, ey2VarA);
        x3.d dVarN = zf3.n(dVarB, new gf3() { // from class: com.google.android.gms.internal.ads.hv1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f8989a.c((InputStream) obj);
            }
        }, this.f10366b);
        if (((Boolean) h2.y.c().b(ns.f12189s5)).booleanValue()) {
            dVarN = zf3.f(zf3.o(dVarN, ((Integer) h2.y.c().b(ns.f12206u5)).intValue(), TimeUnit.SECONDS, this.f10368d), TimeoutException.class, new gf3() { // from class: com.google.android.gms.internal.ads.iv1
                @Override // com.google.android.gms.internal.ads.gf3
                public final x3.d a(Object obj) {
                    return zf3.g(new gu1(5));
                }
            }, eh0.f7327f);
        }
        py2.a(dVarN, this.f10370f, ey2VarA);
        zf3.r(dVarN, new jv1(this), eh0.f7327f);
        return dVarN;
    }

    final /* synthetic */ x3.d c(InputStream inputStream) {
        return zf3.h(new ks2(new hs2(this.f10367c), js2.a(new InputStreamReader(inputStream))));
    }
}
