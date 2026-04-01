package com.google.android.gms.internal.ads;

import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class z43 extends s43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c93<Integer> f18006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c93<Integer> f18007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private y43 f18008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HttpURLConnection f18009d;

    z43() {
        this(new c93() { // from class: com.google.android.gms.internal.ads.u43
            @Override // com.google.android.gms.internal.ads.c93
            public final Object j() {
                return z43.c();
            }
        }, new c93() { // from class: com.google.android.gms.internal.ads.v43
            @Override // com.google.android.gms.internal.ads.c93
            public final Object j() {
                return z43.d();
            }
        }, null);
    }

    z43(c93<Integer> c93Var, c93<Integer> c93Var2, y43 y43Var) {
        this.f18006a = c93Var;
        this.f18007b = c93Var2;
        this.f18008c = y43Var;
    }

    static /* synthetic */ Integer c() {
        return -1;
    }

    static /* synthetic */ Integer d() {
        return -1;
    }

    public static void t(HttpURLConnection httpURLConnection) {
        t43.a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        t(this.f18009d);
    }

    public HttpURLConnection o() {
        t43.b(((Integer) this.f18006a.j()).intValue(), ((Integer) this.f18007b.j()).intValue());
        y43 y43Var = this.f18008c;
        y43Var.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) y43Var.j();
        this.f18009d = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection q(y43 y43Var, final int i8, final int i9) {
        this.f18006a = new c93() { // from class: com.google.android.gms.internal.ads.w43
            @Override // com.google.android.gms.internal.ads.c93
            public final Object j() {
                return Integer.valueOf(i8);
            }
        };
        this.f18007b = new c93() { // from class: com.google.android.gms.internal.ads.x43
            @Override // com.google.android.gms.internal.ads.c93
            public final Object j() {
                return Integer.valueOf(i9);
            }
        };
        this.f18008c = y43Var;
        return o();
    }
}
