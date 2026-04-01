package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.cct.d;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import m1.j;
import m1.k;
import m1.l;
import m1.m;
import m1.n;
import m1.o;
import m1.p;
import n1.h;
import n1.i;
import o1.f;
import o1.g;
import o1.m;

/* JADX INFO: loaded from: classes.dex */
final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i4.a f4707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f4708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f4709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final URL f4710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x1.a f4711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x1.a f4712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f4713g;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final URL f4714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final j f4715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f4716c;

        a(URL url, j jVar, String str) {
            this.f4714a = url;
            this.f4715b = jVar;
            this.f4716c = str;
        }

        a a(URL url) {
            return new a(url, this.f4715b, this.f4716c);
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f4717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final URL f4718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f4719c;

        b(int i8, URL url, long j8) {
            this.f4717a = i8;
            this.f4718b = url;
            this.f4719c = j8;
        }
    }

    d(Context context, x1.a aVar, x1.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }

    d(Context context, x1.a aVar, x1.a aVar2, int i8) {
        this.f4707a = j.b();
        this.f4709c = context;
        this.f4708b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f4710d = n(com.google.android.datatransport.cct.a.f4698c);
        this.f4711e = aVar2;
        this.f4712f = aVar;
        this.f4713g = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        r1.a.f("CctTransportBackend", "Making request to: %s", aVar.f4714a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f4714a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f4713g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.8"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f4716c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f4707a.a(aVar.f4715b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    r1.a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    r1.a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    r1.a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamM = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(inputStreamM))).c());
                            if (inputStreamM != null) {
                                inputStreamM.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (i4.b e8) {
            e = e8;
            r1.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(RCHTTPStatusCodes.BAD_REQUEST, null, 0L);
        } catch (ConnectException e9) {
            e = e9;
            r1.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            r1.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            r1.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(RCHTTPStatusCodes.BAD_REQUEST, null, 0L);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        o.b bVar;
        if (networkInfo == null) {
            bVar = o.b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype != -1) {
                if (o.b.a(subtype) != null) {
                    return subtype;
                }
                return 0;
            }
            bVar = o.b.COMBINED;
        }
        return bVar.c();
    }

    private static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? o.c.NONE.c() : networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e8) {
            r1.a.d("CctTransportBackend", "Unable to find version code for package", e8);
            return -1;
        }
    }

    private j i(f fVar) {
        l.a aVarJ;
        HashMap map = new HashMap();
        for (i iVar : fVar.b()) {
            String strJ = iVar.j();
            if (map.containsKey(strJ)) {
                ((List) map.get(strJ)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                map.put(strJ, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            m.a aVarB = m1.m.a().f(p.DEFAULT).g(this.f4712f.a()).h(this.f4711e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(m1.a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h hVarE = iVar3.e();
                l1.b bVarB = hVarE.b();
                if (bVarB.equals(l1.b.b("proto"))) {
                    aVarJ = l.j(hVarE.a());
                } else if (bVarB.equals(l1.b.b("json"))) {
                    aVarJ = l.i(new String(hVarE.a(), Charset.forName("UTF-8")));
                } else {
                    r1.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", bVarB);
                }
                aVarJ.c(iVar3.f()).d(iVar3.k()).h(iVar3.h("tz-offset")).e(o.a().c(o.c.a(iVar3.g("net-type"))).b(o.b.a(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    aVarJ.b(iVar3.d());
                }
                arrayList3.add(aVarJ.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.f4718b;
        if (url == null) {
            return null;
        }
        r1.a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f4718b);
    }

    private static InputStream m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e8) {
            throw new IllegalArgumentException("Invalid url: " + str, e8);
        }
    }

    @Override // o1.m
    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.f4708b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f4709c).getSimOperator()).c("application_build", Integer.toString(h(this.f4709c))).d();
    }

    @Override // o1.m
    public g b(f fVar) {
        j jVarI = i(fVar);
        URL urlN = this.f4710d;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a aVarC = com.google.android.datatransport.cct.a.c(fVar.c());
                strD = aVarC.d() != null ? aVarC.d() : null;
                if (aVarC.e() != null) {
                    urlN = n(aVarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) s1.b.a(5, new a(urlN, jVarI, strD), new s1.a() { // from class: com.google.android.datatransport.cct.b
                @Override // s1.a
                public final Object apply(Object obj) {
                    return this.f4706a.e((d.a) obj);
                }
            }, new s1.c() { // from class: com.google.android.datatransport.cct.c
                @Override // s1.c
                public final Object a(Object obj, Object obj2) {
                    return d.l((d.a) obj, (d.b) obj2);
                }
            });
            int i8 = bVar.f4717a;
            if (i8 == 200) {
                return g.e(bVar.f4719c);
            }
            if (i8 < 500 && i8 != 404) {
                return i8 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e8) {
            r1.a.d("CctTransportBackend", "Could not make request to the backend", e8);
            return g.f();
        }
    }
}
