package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class ul0 extends ji3 implements b94 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pattern f15727v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f15728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f15729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f15730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a94 f15731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ut3 f15732i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private HttpURLConnection f15733j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Queue f15734k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InputStream f15735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f15736m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f15737n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f15738o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f15739p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f15740q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f15741r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f15742s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f15743t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final long f15744u;

    ul0(String str, g94 g94Var, int i8, int i9, long j8, long j9) {
        super(true);
        uu1.c(str);
        this.f15730g = str;
        this.f15731h = new a94();
        this.f15728e = i8;
        this.f15729f = i9;
        this.f15734k = new ArrayDeque();
        this.f15743t = j8;
        this.f15744u = j9;
        if (g94Var != null) {
            a(g94Var);
        }
    }

    private final void g() {
        while (!this.f15734k.isEmpty()) {
            try {
                ((HttpURLConnection) this.f15734k.remove()).disconnect();
            } catch (Exception e8) {
                qg0.e("Unexpected error while disconnecting", e8);
            }
        }
        this.f15733j = null;
    }

    @Override // com.google.android.gms.internal.ads.wl4
    public final int H(byte[] bArr, int i8, int i9) throws g84 {
        if (i9 == 0) {
            return 0;
        }
        try {
            long j8 = this.f15738o;
            long j9 = this.f15739p;
            if (j8 - j9 == 0) {
                return -1;
            }
            long j10 = this.f15740q + j9;
            long j11 = i9;
            long j12 = j10 + j11 + this.f15744u;
            long j13 = this.f15742s;
            long j14 = j13 + 1;
            if (j12 > j14) {
                long j15 = this.f15741r;
                if (j13 < j15) {
                    long jMin = Math.min(j15, Math.max(((this.f15743t + j14) - r3) - 1, (-1) + j14 + j11));
                    f(j14, jMin, 2);
                    this.f15742s = jMin;
                    j13 = jMin;
                }
            }
            int i10 = this.f15735l.read(bArr, i8, (int) Math.min(j11, ((j13 + 1) - this.f15740q) - this.f15739p));
            if (i10 == -1) {
                throw new EOFException();
            }
            this.f15739p += (long) i10;
            F(i10);
            return i10;
        } catch (IOException e8) {
            throw new g84(e8, this.f15732i, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final long b(ut3 ut3Var) throws g84 {
        long jMax;
        this.f15732i = ut3Var;
        this.f15739p = 0L;
        long j8 = ut3Var.f15872f;
        long j9 = ut3Var.f15873g;
        long jMin = j9 == -1 ? this.f15743t : Math.min(this.f15743t, j9);
        this.f15740q = j8;
        HttpURLConnection httpURLConnectionF = f(j8, (jMin + j8) - 1, 1);
        this.f15733j = httpURLConnectionF;
        String headerField = httpURLConnectionF.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f15727v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j10 = Long.parseLong(matcher.group(2));
                    long j11 = Long.parseLong(matcher.group(3));
                    long j12 = ut3Var.f15873g;
                    if (j12 != -1) {
                        this.f15738o = j12;
                        jMax = Math.max(j10, (this.f15740q + j12) - 1);
                    } else {
                        this.f15738o = j11 - this.f15740q;
                        jMax = j11 - 1;
                    }
                    this.f15741r = jMax;
                    this.f15742s = j10;
                    this.f15736m = true;
                    e(ut3Var);
                    return this.f15738o;
                } catch (NumberFormatException unused) {
                    qg0.d("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new sl0(headerField, ut3Var);
    }

    final HttpURLConnection f(long j8, long j9, int i8) throws g84 {
        String string = this.f15732i.f15867a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.f15728e);
            httpURLConnection.setReadTimeout(this.f15729f);
            for (Map.Entry entry : this.f15731h.a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j8 + "-" + j9);
            httpURLConnection.setRequestProperty("User-Agent", this.f15730g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f15734k.add(httpURLConnection);
            String string2 = this.f15732i.f15867a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f15737n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    g();
                    throw new tl0(this.f15737n, headerFields, this.f15732i, i8);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f15735l != null) {
                        inputStream = new SequenceInputStream(this.f15735l, inputStream);
                    }
                    this.f15735l = inputStream;
                    return httpURLConnection;
                } catch (IOException e8) {
                    g();
                    throw new g84(e8, this.f15732i, 2000, i8);
                }
            } catch (IOException e9) {
                g();
                throw new g84("Unable to connect to ".concat(String.valueOf(string2)), e9, this.f15732i, 2000, i8);
            }
        } catch (IOException e10) {
            throw new g84("Unable to connect to ".concat(String.valueOf(string)), e10, this.f15732i, 2000, i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final Uri l() {
        HttpURLConnection httpURLConnection = this.f15733j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.ji3, com.google.android.gms.internal.ads.po3, com.google.android.gms.internal.ads.b94
    public final Map m() {
        HttpURLConnection httpURLConnection = this.f15733j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final void p() {
        try {
            InputStream inputStream = this.f15735l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    throw new g84(e8, this.f15732i, 2000, 3);
                }
            }
        } finally {
            this.f15735l = null;
            g();
            if (this.f15736m) {
                this.f15736m = false;
                c();
            }
        }
    }
}
