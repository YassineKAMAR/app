package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a24 extends ji3 implements b94 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f4961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f4962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f4963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f4964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a94 f4965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a94 f4966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ut3 f4967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private HttpURLConnection f4968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private InputStream f4969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f4970n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f4971o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f4972p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f4973q;

    @Deprecated
    public a24() {
        this(null, 8000, 8000, false, null, null, false);
    }

    private a24(String str, int i8, int i9, boolean z7, a94 a94Var, m83 m83Var, boolean z8) {
        super(true);
        this.f4964h = str;
        this.f4962f = i8;
        this.f4963g = i9;
        this.f4961e = z7;
        this.f4965i = a94Var;
        this.f4966j = new a94();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.net.HttpURLConnection f(java.net.URL r3, int r4, byte[] r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) throws java.io.IOException {
        /*
            r2 = this;
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            int r4 = r2.f4962f
            r3.setConnectTimeout(r4)
            int r4 = r2.f4963g
            r3.setReadTimeout(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.google.android.gms.internal.ads.a94 r5 = r2.f4965i
            java.util.Map r5 = r5.a()
            r4.putAll(r5)
            com.google.android.gms.internal.ads.a94 r5 = r2.f4966j
            java.util.Map r5 = r5.a()
            r4.putAll(r5)
            r4.putAll(r12)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r12 = r5.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r3.setRequestProperty(r12, r5)
            goto L32
        L4e:
            r4 = 0
            r0 = -1
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 != 0) goto L5d
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L5c
            r4 = 0
            goto L7c
        L5c:
            r6 = r4
        L5d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "bytes="
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = "-"
            r4.append(r5)
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L78
            long r6 = r6 + r8
            long r6 = r6 + r0
            r4.append(r6)
        L78:
            java.lang.String r4 = r4.toString()
        L7c:
            if (r4 == 0) goto L83
            java.lang.String r5 = "Range"
            r3.setRequestProperty(r5, r4)
        L83:
            java.lang.String r4 = r2.f4964h
            if (r4 == 0) goto L8c
            java.lang.String r5 = "User-Agent"
            r3.setRequestProperty(r5, r4)
        L8c:
            r4 = 1
            if (r4 == r10) goto L92
            java.lang.String r4 = "identity"
            goto L94
        L92:
            java.lang.String r4 = "gzip"
        L94:
            java.lang.String r5 = "Accept-Encoding"
            r3.setRequestProperty(r5, r4)
            r3.setInstanceFollowRedirects(r11)
            r4 = 0
            r3.setDoOutput(r4)
            int r4 = com.google.android.gms.internal.ads.ut3.f15866j
            java.lang.String r4 = "GET"
            r3.setRequestMethod(r4)
            r3.connect()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a24.f(java.net.URL, int, byte[], long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    private final URL g(URL url, String str, ut3 ut3Var) throws g84 {
        if (str == null) {
            throw new g84("Null location redirect", ut3Var, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new g84("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), ut3Var, 2001, 1);
            }
            if (this.f4961e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new g84("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", ut3Var, 2001, 1);
        } catch (MalformedURLException e8) {
            throw new g84(e8, ut3Var, 2001, 1);
        }
    }

    private final void h() {
        HttpURLConnection httpURLConnection = this.f4968l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e8) {
                pf2.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e8);
            }
            this.f4968l = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.wl4
    public final int H(byte[] bArr, int i8, int i9) throws g84 {
        if (i9 == 0) {
            return 0;
        }
        try {
            long j8 = this.f4972p;
            if (j8 != -1) {
                long j9 = j8 - this.f4973q;
                if (j9 == 0) {
                    return -1;
                }
                i9 = (int) Math.min(i9, j9);
            }
            InputStream inputStream = this.f4969m;
            int i10 = nz2.f12300a;
            int i11 = inputStream.read(bArr, i8, i9);
            if (i11 == -1) {
                return -1;
            }
            this.f4973q += (long) i11;
            F(i11);
            return i11;
        } catch (IOException e8) {
            ut3 ut3Var = this.f4967k;
            int i12 = nz2.f12300a;
            throw g84.a(e8, ut3Var, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    @Override // com.google.android.gms.internal.ads.po3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(com.google.android.gms.internal.ads.ut3 r27) throws com.google.android.gms.internal.ads.g84 {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a24.b(com.google.android.gms.internal.ads.ut3):long");
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final Uri l() {
        HttpURLConnection httpURLConnection = this.f4968l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.ji3, com.google.android.gms.internal.ads.po3, com.google.android.gms.internal.ads.b94
    public final Map m() {
        HttpURLConnection httpURLConnection = this.f4968l;
        return httpURLConnection == null ? mb3.d() : new a04(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d A[Catch: Exception -> 0x0069, all -> 0x008a, TRY_LEAVE, TryCatch #0 {Exception -> 0x0069, blocks: (B:15:0x001e, B:17:0x0026, B:23:0x0035, B:25:0x0045, B:27:0x004d, B:29:0x0058), top: B:45:0x001e }] */
    @Override // com.google.android.gms.internal.ads.po3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r10.f4969m     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L7b
            long r3 = r10.f4972p     // Catch: java.lang.Throwable -> L8a
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L10
            r3 = r5
            goto L13
        L10:
            long r7 = r10.f4973q     // Catch: java.lang.Throwable -> L8a
            long r3 = r3 - r7
        L13:
            java.net.HttpURLConnection r7 = r10.f4968l     // Catch: java.lang.Throwable -> L8a
            if (r7 == 0) goto L69
            int r8 = com.google.android.gms.internal.ads.nz2.f12300a     // Catch: java.lang.Throwable -> L8a
            r9 = 20
            if (r8 <= r9) goto L1e
            goto L69
        L1e:
            java.io.InputStream r7 = r7.getInputStream()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L8a
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L2e
            int r3 = r7.read()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L8a
            r4 = -1
            if (r3 == r4) goto L69
            goto L35
        L2e:
            r5 = 2048(0x800, double:1.0118E-320)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L35
            goto L69
        L35:
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L8a
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L8a
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L8a
            if (r4 != 0) goto L4d
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L8a
            if (r3 == 0) goto L69
        L4d:
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L8a
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L8a
            r3.getClass()
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L8a
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L8a
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L8a
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L8a
            r3.invoke(r7, r4)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L8a
        L69:
            r2.close()     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L8a
            goto L7b
        L6d:
            r2 = move-exception
            com.google.android.gms.internal.ads.g84 r3 = new com.google.android.gms.internal.ads.g84     // Catch: java.lang.Throwable -> L8a
            com.google.android.gms.internal.ads.ut3 r4 = r10.f4967k     // Catch: java.lang.Throwable -> L8a
            int r5 = com.google.android.gms.internal.ads.nz2.f12300a     // Catch: java.lang.Throwable -> L8a
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L8a
            throw r3     // Catch: java.lang.Throwable -> L8a
        L7b:
            r10.f4969m = r0
            r10.h()
            boolean r0 = r10.f4970n
            if (r0 == 0) goto L89
            r10.f4970n = r1
            r10.c()
        L89:
            return
        L8a:
            r2 = move-exception
            r10.f4969m = r0
            r10.h()
            boolean r0 = r10.f4970n
            if (r0 == 0) goto L99
            r10.f4970n = r1
            r10.c()
        L99:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a24.p():void");
    }
}
