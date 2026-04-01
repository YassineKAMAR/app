package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fy {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f8098i = Integer.toString(0, 36);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f8099j = Integer.toString(1, 36);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f8100k = Integer.toString(2, 36);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f8101l = Integer.toString(3, 36);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f8102m = Integer.toString(4, 36);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f8103n = Integer.toString(5, 36);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f8104o = Integer.toString(6, 36);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f8105p = Integer.toString(7, 36);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final cf4 f8106q = new cf4() { // from class: com.google.android.gms.internal.ads.hw
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f8107a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f8109c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jb3 f8111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public final List f8112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f8113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f8114h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8108b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8110d = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ fy(Uri uri, String str, dr drVar, qf qfVar, List list, String str2, jb3 jb3Var, Object obj, long j8, hx hxVar) {
        this.f8107a = uri;
        this.f8109c = list;
        this.f8111e = jb3Var;
        gb3 gb3Var = new gb3();
        if (jb3Var.size() > 0) {
            throw null;
        }
        this.f8112f = gb3Var.j();
        this.f8113g = null;
        this.f8114h = -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy)) {
            return false;
        }
        fy fyVar = (fy) obj;
        return this.f8107a.equals(fyVar.f8107a) && nz2.e(null, null) && nz2.e(null, null) && nz2.e(null, null) && this.f8109c.equals(fyVar.f8109c) && nz2.e(null, null) && this.f8111e.equals(fyVar.f8111e) && nz2.e(null, null) && nz2.e(-9223372036854775807L, -9223372036854775807L);
    }

    public final int hashCode() {
        return (int) ((((long) (((((this.f8107a.hashCode() * 923521) + this.f8109c.hashCode()) * 961) + this.f8111e.hashCode()) * 31)) * 31) - Long.MAX_VALUE);
    }
}
