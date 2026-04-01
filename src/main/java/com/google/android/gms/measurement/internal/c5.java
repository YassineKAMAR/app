package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f19861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ y4 f19862e;

    private c5(y4 y4Var, String str, long j8) {
        this.f19862e = y4Var;
        a3.o.f(str);
        a3.o.a(j8 > 0);
        this.f19858a = str + ":start";
        this.f19859b = str + ":count";
        this.f19860c = str + ":value";
        this.f19861d = j8;
    }

    private final long c() {
        return this.f19862e.F().getLong(this.f19858a, 0L);
    }

    private final void d() {
        this.f19862e.i();
        long jA = this.f19862e.k().a();
        SharedPreferences.Editor editorEdit = this.f19862e.F().edit();
        editorEdit.remove(this.f19859b);
        editorEdit.remove(this.f19860c);
        editorEdit.putLong(this.f19858a, jA);
        editorEdit.apply();
    }

    public final Pair<String, Long> a() {
        long jAbs;
        this.f19862e.i();
        this.f19862e.i();
        long jC = c();
        if (jC == 0) {
            d();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jC - this.f19862e.k().a());
        }
        long j8 = this.f19861d;
        if (jAbs < j8) {
            return null;
        }
        if (jAbs > (j8 << 1)) {
            d();
            return null;
        }
        String string = this.f19862e.F().getString(this.f19860c, null);
        long j9 = this.f19862e.F().getLong(this.f19859b, 0L);
        d();
        return (string == null || j9 <= 0) ? y4.f20696z : new Pair<>(string, Long.valueOf(j9));
    }

    public final void b(String str, long j8) {
        this.f19862e.i();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j9 = this.f19862e.F().getLong(this.f19859b, 0L);
        if (j9 <= 0) {
            SharedPreferences.Editor editorEdit = this.f19862e.F().edit();
            editorEdit.putString(this.f19860c, str);
            editorEdit.putLong(this.f19859b, 1L);
            editorEdit.apply();
            return;
        }
        long j10 = j9 + 1;
        boolean z7 = (this.f19862e.f().U0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j10;
        SharedPreferences.Editor editorEdit2 = this.f19862e.F().edit();
        if (z7) {
            editorEdit2.putString(this.f19860c, str);
        }
        editorEdit2.putLong(this.f19859b, j10);
        editorEdit2.apply();
    }
}
