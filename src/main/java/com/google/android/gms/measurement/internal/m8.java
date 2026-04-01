package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class m8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f20261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f20262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j8 f20263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f20264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, String> f20265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ k8 f20266f;

    public m8(k8 k8Var, String str, URL url, byte[] bArr, Map<String, String> map, j8 j8Var) {
        this.f20266f = k8Var;
        a3.o.f(str);
        a3.o.j(url);
        a3.o.j(j8Var);
        this.f20261a = url;
        this.f20262b = null;
        this.f20263c = j8Var;
        this.f20264d = str;
        this.f20265e = null;
    }

    private final void b(final int i8, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.f20266f.u().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.l8
            @Override // java.lang.Runnable
            public final void run() {
                this.f20198a.a(i8, exc, bArr, map);
            }
        });
    }

    final /* synthetic */ void a(int i8, Exception exc, byte[] bArr, Map map) {
        this.f20263c.a(this.f20264d, i8, exc, bArr, map);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> headerFields;
        this.f20266f.g();
        int responseCode = 0;
        try {
            URLConnection uRLConnectionB = com.google.android.gms.internal.measurement.f1.a().b(this.f20261a, "client-measurement");
            if (!(uRLConnectionB instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionB;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                responseCode = httpURLConnection.getResponseCode();
                headerFields = httpURLConnection.getHeaderFields();
            } catch (IOException e8) {
                e = e8;
                headerFields = null;
            } catch (Throwable th) {
                th = th;
                headerFields = null;
            }
            try {
                k8 k8Var = this.f20266f;
                byte[] bArrV = k8.v(httpURLConnection);
                httpURLConnection.disconnect();
                b(responseCode, null, bArrV, headerFields);
            } catch (IOException e9) {
                e = e9;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                b(responseCode, e, null, headerFields);
            } catch (Throwable th2) {
                th = th2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                b(responseCode, null, null, headerFields);
                throw th;
            }
        } catch (IOException e10) {
            e = e10;
            httpURLConnection = null;
            headerFields = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            headerFields = null;
        }
    }
}
