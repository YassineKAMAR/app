package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wg0 f7355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ct f7356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final gt f7357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j2.j0 f7358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long[] f7359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String[] f7360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f7361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f7362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f7363k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f7364l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f7365m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ii0 f7366n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f7367o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f7368p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f7369q;

    public ej0(Context context, wg0 wg0Var, String str, gt gtVar, ct ctVar) {
        j2.h0 h0Var = new j2.h0();
        h0Var.a("min_1", Double.MIN_VALUE, 1.0d);
        h0Var.a("1_5", 1.0d, 5.0d);
        h0Var.a("5_10", 5.0d, 10.0d);
        h0Var.a("10_20", 10.0d, 20.0d);
        h0Var.a("20_30", 20.0d, 30.0d);
        h0Var.a("30_max", 30.0d, Double.MAX_VALUE);
        this.f7358f = h0Var.b();
        this.f7361i = false;
        this.f7362j = false;
        this.f7363k = false;
        this.f7364l = false;
        this.f7369q = -1L;
        this.f7353a = context;
        this.f7355c = wg0Var;
        this.f7354b = str;
        this.f7357e = gtVar;
        this.f7356d = ctVar;
        String str2 = (String) h2.y.c().b(ns.A);
        if (str2 == null) {
            this.f7360h = new String[0];
            this.f7359g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, com.amazon.a.a.o.b.f.f3942a);
        int length = strArrSplit.length;
        this.f7360h = new String[length];
        this.f7359g = new long[length];
        for (int i8 = 0; i8 < strArrSplit.length; i8++) {
            try {
                this.f7359g[i8] = Long.parseLong(strArrSplit[i8]);
            } catch (NumberFormatException e8) {
                qg0.h("Unable to parse frame hash target time number.", e8);
                this.f7359g[i8] = -1;
            }
        }
    }

    public final void a(ii0 ii0Var) {
        xs.a(this.f7357e, this.f7356d, "vpc2");
        this.f7361i = true;
        this.f7357e.d("vpn", ii0Var.q());
        this.f7366n = ii0Var;
    }

    public final void b() {
        if (!this.f7361i || this.f7362j) {
            return;
        }
        xs.a(this.f7357e, this.f7356d, "vfr2");
        this.f7362j = true;
    }

    public final void c() {
        this.f7365m = true;
        if (!this.f7362j || this.f7363k) {
            return;
        }
        xs.a(this.f7357e, this.f7356d, "vfp2");
        this.f7363k = true;
    }

    public final void d() {
        if (!((Boolean) yu.f17926a.e()).booleanValue() || this.f7367o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f7354b);
        bundle.putString("player", this.f7366n.q());
        for (j2.g0 g0Var : this.f7358f.a()) {
            String strValueOf = String.valueOf(g0Var.f23965a);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(g0Var.f23969e));
            String strValueOf2 = String.valueOf(g0Var.f23965a);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(g0Var.f23968d));
        }
        int i8 = 0;
        while (true) {
            long[] jArr = this.f7359g;
            if (i8 >= jArr.length) {
                g2.t.r().I(this.f7353a, this.f7355c.f16723a, "gmob-apps", bundle, true);
                this.f7367o = true;
                return;
            }
            String str = this.f7360h[i8];
            if (str != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i8]).toString()), str);
            }
            i8++;
        }
    }

    public final void e() {
        this.f7365m = false;
    }

    public final void f(ii0 ii0Var) {
        if (this.f7363k && !this.f7364l) {
            if (j2.v1.m() && !this.f7364l) {
                j2.v1.k("VideoMetricsMixin first frame");
            }
            xs.a(this.f7357e, this.f7356d, "vff2");
            this.f7364l = true;
        }
        long jC = g2.t.b().c();
        if (this.f7365m && this.f7368p && this.f7369q != -1) {
            this.f7358f.b(TimeUnit.SECONDS.toNanos(1L) / (jC - this.f7369q));
        }
        this.f7368p = this.f7365m;
        this.f7369q = jC;
        long jLongValue = ((Long) h2.y.c().b(ns.B)).longValue();
        long jI = ii0Var.i();
        int i8 = 0;
        while (true) {
            String[] strArr = this.f7360h;
            if (i8 >= strArr.length) {
                return;
            }
            if (strArr[i8] == null && jLongValue > Math.abs(jI - this.f7359g[i8])) {
                String[] strArr2 = this.f7360h;
                int i9 = 8;
                Bitmap bitmap = ii0Var.getBitmap(8, 8);
                long j8 = 63;
                long j9 = 0;
                int i10 = 0;
                while (i10 < i9) {
                    int i11 = 0;
                    while (i11 < i9) {
                        int pixel = bitmap.getPixel(i11, i10);
                        j9 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j8);
                        j8--;
                        i11++;
                        i9 = 8;
                    }
                    i10++;
                    i9 = 8;
                }
                strArr2[i8] = String.format("%016X", Long.valueOf(j9));
                return;
            }
            i8++;
        }
    }
}
