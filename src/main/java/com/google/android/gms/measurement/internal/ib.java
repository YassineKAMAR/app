package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.ye;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes.dex */
public final class ib extends u6 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f20128i = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f20129j = {"_err"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SecureRandom f20130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicLong f20131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j0.a f20133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f20134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Integer f20135h;

    ib(w5 w5Var) {
        super(w5Var);
        this.f20135h = null;
        this.f20131d = new AtomicLong(0L);
    }

    public static long A(z zVar) {
        long length = 0;
        if (zVar == null) {
            return 0L;
        }
        Iterator<String> it = zVar.iterator();
        while (it.hasNext()) {
            Object objV = zVar.v(it.next());
            if (objV instanceof Parcelable[]) {
                length += (long) ((Parcelable[]) objV).length;
            }
        }
        return length;
    }

    static long B(byte[] bArr) {
        a3.o.j(bArr);
        int i8 = 0;
        a3.o.m(bArr.length > 0);
        long j8 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j8 += (((long) bArr[length]) & 255) << i8;
            i8 += 8;
        }
        return j8;
    }

    private static boolean B0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static Bundle D(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i8 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i8 < parcelableArr.length) {
                        if (parcelableArr[i8] instanceof Bundle) {
                            parcelableArr[i8] = new Bundle((Bundle) parcelableArr[i8]);
                        }
                        i8++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i8 < list.size()) {
                        Object obj2 = list.get(i8);
                        if (obj2 instanceof Bundle) {
                            list.set(i8, new Bundle((Bundle) obj2));
                        }
                        i8++;
                    }
                }
            }
        }
        return bundle2;
    }

    static boolean D0(String str) {
        String strA = e0.f19925b0.a(null);
        return strA.equals("*") || Arrays.asList(strA.split(com.amazon.a.a.o.b.f.f3942a)).contains(str);
    }

    public static Bundle F(List<hb> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (hb hbVar : list) {
            String str = hbVar.f20075f;
            if (str != null) {
                bundle.putString(hbVar.f20071b, str);
            } else {
                Long l8 = hbVar.f20073d;
                if (l8 != null) {
                    bundle.putLong(hbVar.f20071b, l8.longValue());
                } else {
                    Double d8 = hbVar.f20077h;
                    if (d8 != null) {
                        bundle.putDouble(hbVar.f20071b, d8.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    private final Object H(int i8, Object obj, boolean z7, boolean z8) {
        Bundle bundleR0;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return I(String.valueOf(obj), i8, z7);
        }
        if (!z8 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if ((parcelable instanceof Bundle) && (bundleR0 = r0((Bundle) parcelable)) != null && !bundleR0.isEmpty()) {
                arrayList.add(bundleR0);
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static boolean H0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static String I(String str, int i8, boolean z7) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i8) {
            return str;
        }
        if (!z7) {
            return null;
        }
        return str.substring(0, str.offsetByCodePoints(0, i8)) + "...";
    }

    static boolean J0(String str) {
        a3.o.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    private static void K(Bundle bundle, int i8, String str, String str2, Object obj) {
        if (v0(bundle, i8)) {
            bundle.putString("_ev", I(str, 40, true));
            if (obj != null) {
                a3.o.j(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static boolean L0(String str) {
        for (String str2 : f20129j) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final int M0(String str) {
        if (!w0("event param", str)) {
            return 3;
        }
        if (n0("event param", null, str)) {
            return !i0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private final int N0(String str) {
        if (!C0("event param", str)) {
            return 3;
        }
        if (n0("event param", null, str)) {
            return !i0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private static int O0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return ("_lgclid".equals(str) || "_gbraid".equals(str)) ? 100 : 36;
    }

    private static boolean R0(String str) {
        a3.o.j(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    static MessageDigest T0() {
        MessageDigest messageDigest;
        for (int i8 = 0; i8 < 2; i8++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static void W(p8 p8Var, Bundle bundle, boolean z7) {
        if (bundle == null || p8Var == null || (bundle.containsKey("_sc") && !z7)) {
            if (bundle != null && p8Var == null && z7) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = p8Var.f20364a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = p8Var.f20365b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", p8Var.f20366c);
    }

    public static void X(kb kbVar, int i8, String str, String str2, int i9) {
        Y(kbVar, null, i8, str, str2, i9);
    }

    @TargetApi(30)
    private final boolean X0() {
        Integer num;
        if (this.f20134g == null) {
            j0.a aVarQ0 = Q0();
            boolean z7 = false;
            if (aVarQ0 == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = aVarQ0.b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z7 = true;
                        }
                    } catch (InterruptedException e8) {
                        e = e8;
                        num2 = num;
                        t().L().b("Measurement manager api exception", e);
                        this.f20134g = Boolean.FALSE;
                        num = num2;
                    } catch (CancellationException e9) {
                        e = e9;
                        num2 = num;
                        t().L().b("Measurement manager api exception", e);
                        this.f20134g = Boolean.FALSE;
                        num = num2;
                    } catch (ExecutionException e10) {
                        e = e10;
                        num2 = num;
                        t().L().b("Measurement manager api exception", e);
                        this.f20134g = Boolean.FALSE;
                        num = num2;
                    } catch (TimeoutException e11) {
                        e = e11;
                        num2 = num;
                        t().L().b("Measurement manager api exception", e);
                        this.f20134g = Boolean.FALSE;
                        num = num2;
                    }
                }
                this.f20134g = Boolean.valueOf(z7);
            } catch (InterruptedException e12) {
                e = e12;
            } catch (CancellationException e13) {
                e = e13;
            } catch (ExecutionException e14) {
                e = e14;
            } catch (TimeoutException e15) {
                e = e15;
            }
            t().K().b("Measurement manager api status result", num);
        }
        return this.f20134g.booleanValue();
    }

    static void Y(kb kbVar, String str, int i8, String str2, String str3, int i9) {
        Bundle bundle = new Bundle();
        v0(bundle, i8);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i8 == 6 || i8 == 7 || i8 == 2) {
            bundle.putLong("_el", i9);
        }
        kbVar.b(str, "_err", bundle);
    }

    private final void Z(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z7) {
        int iN0;
        String str4;
        int iX;
        p4 p4VarH;
        String strC;
        String strA;
        String str5;
        if (bundle == null) {
            return;
        }
        int iV = a().v();
        int i8 = 0;
        for (String str6 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str6)) {
                iN0 = !z7 ? N0(str6) : 0;
                if (iN0 == 0) {
                    iN0 = M0(str6);
                }
            } else {
                iN0 = 0;
            }
            if (iN0 != 0) {
                K(bundle, iN0, str6, str6, iN0 == 3 ? str6 : null);
                bundle.remove(str6);
            } else {
                if (g0(bundle.get(str6))) {
                    t().M().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str6);
                    iX = 22;
                    str4 = str6;
                } else {
                    str4 = str6;
                    iX = x(str, str2, str6, bundle.get(str6), bundle, list, z7, false);
                }
                if (iX != 0 && !"_ev".equals(str4)) {
                    K(bundle, iX, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (J0(str4) && !m0(str4, p3.t.f25620d)) {
                    int i9 = i8 + 1;
                    if (b0(231100000, true)) {
                        if (i9 > iV) {
                            if (ye.a() && a().q(e0.I0)) {
                                t().H().c("Item can't contain more than " + iV + " item-scoped custom params", c().c(str2), c().a(bundle));
                                v0(bundle, 28);
                                bundle.remove(str4);
                            } else {
                                p4VarH = t().H();
                                strC = c().c(str2);
                                strA = c().a(bundle);
                                str5 = "Item cannot contain custom parameters";
                            }
                        }
                        i8 = i9;
                    } else {
                        p4VarH = t().H();
                        strC = c().c(str2);
                        strA = c().a(bundle);
                        str5 = "Item array not supported on client's version of Google Play Services (Android Only)";
                    }
                    p4VarH.c(str5, strC, strA);
                    v0(bundle, 23);
                    bundle.remove(str4);
                    i8 = i9;
                }
            }
        }
    }

    static boolean c0(Context context) {
        ActivityInfo receiverInfo;
        a3.o.j(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static boolean d0(Context context, boolean z7) {
        a3.o.j(context);
        return B0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    static boolean e0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    static boolean f0(Bundle bundle, int i8) {
        int i9 = 0;
        if (bundle.size() <= i8) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i9++;
            if (i9 > i8) {
                bundle.remove(str);
            }
        }
        return true;
    }

    static boolean g0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    static boolean l0(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            a3.o.j(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    private static boolean m0(String str, String[] strArr) {
        a3.o.j(strArr);
        for (String str2 : strArr) {
            if (p3.i0.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    static byte[] p0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList<Bundle> t0(List<d> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (d dVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", dVar.f19877a);
            bundle.putString("origin", dVar.f19878b);
            bundle.putLong("creation_timestamp", dVar.f19880d);
            bundle.putString("name", dVar.f19879c.f20071b);
            p3.q.b(bundle, a3.o.j(dVar.f19879c.g()));
            bundle.putBoolean("active", dVar.f19881e);
            String str = dVar.f19882f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            d0 d0Var = dVar.f19883g;
            if (d0Var != null) {
                bundle.putString("timed_out_event_name", d0Var.f19888a);
                z zVar = d0Var.f19889b;
                if (zVar != null) {
                    bundle.putBundle("timed_out_event_params", zVar.p());
                }
            }
            bundle.putLong("trigger_timeout", dVar.f19884h);
            d0 d0Var2 = dVar.f19885i;
            if (d0Var2 != null) {
                bundle.putString("triggered_event_name", d0Var2.f19888a);
                z zVar2 = d0Var2.f19889b;
                if (zVar2 != null) {
                    bundle.putBundle("triggered_event_params", zVar2.p());
                }
            }
            bundle.putLong("triggered_timestamp", dVar.f19879c.f20072c);
            bundle.putLong("time_to_live", dVar.f19886j);
            d0 d0Var3 = dVar.f19887k;
            if (d0Var3 != null) {
                bundle.putString("expired_event_name", d0Var3.f19888a);
                z zVar3 = d0Var3.f19889b;
                if (zVar3 != null) {
                    bundle.putBundle("expired_event_params", zVar3.p());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private final boolean u0(Context context, String str) {
        p4 p4VarG;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoF = f3.e.a(context).f(str, 64);
            if (packageInfoF == null || (signatureArr = packageInfoF.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e8) {
            e = e8;
            p4VarG = t().G();
            str2 = "Package name not found";
            p4VarG.b(str2, e);
            return true;
        } catch (CertificateException e9) {
            e = e9;
            p4VarG = t().G();
            str2 = "Error obtaining certificate";
            p4VarG.b(str2, e);
            return true;
        }
    }

    private static boolean v0(Bundle bundle, int i8) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i8);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int x(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Object r19, android.os.Bundle r20, java.util.List<java.lang.String> r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ib.x(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    static Bundle[] x0(Object obj) {
        Object[] array;
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else {
            if (!(obj instanceof ArrayList)) {
                return null;
            }
            ArrayList arrayList = (ArrayList) obj;
            array = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) array;
    }

    public static long y(long j8, long j9) {
        return (j8 + (j9 * 60000)) / 86400000;
    }

    static int y0() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(UtilsKt.MICROS_MULTIPLIER);
    }

    final Object A0(String str, Object obj) {
        boolean zEquals = "_ldl".equals(str);
        int iO0 = O0(str);
        return zEquals ? H(iO0, obj, true, false) : H(iO0, obj, false, false);
    }

    final Bundle C(Uri uri, boolean z7, boolean z8) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = z8 ? uri.getQueryParameter("gbraid") : null;
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = z7 ? uri.getQueryParameter("sfmc_id") : null;
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && ((!z8 || TextUtils.isEmpty(queryParameter5)) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && (!z7 || TextUtils.isEmpty(queryParameter9)))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(queryParameter)) {
                str = "sfmc_id";
            } else {
                str = "sfmc_id";
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (z8 && !TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("term", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("content", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("aclid", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("cp1", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("anid", queryParameter14);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter15 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("source_platform", queryParameter15);
            }
            String queryParameter16 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("creative_format", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("marketing_tactic", queryParameter17);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (z7 && !TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e8) {
            t().L().b("Install referrer url isn't a hierarchical URI", e8);
            return null;
        }
    }

    final boolean C0(String str, String str2) {
        if (str2 == null) {
            t().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            t().H().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            t().H().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                t().H().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final Bundle E(String str, String str2, Bundle bundle, List<String> list, boolean z7) {
        int iN0;
        int i8;
        ib ibVar = this;
        boolean zM0 = m0(str2, p3.r.f25614d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int iE = a().E();
        int i9 = 0;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iN0 = !z7 ? ibVar.N0(str3) : 0;
                if (iN0 == 0) {
                    iN0 = ibVar.M0(str3);
                }
            } else {
                iN0 = 0;
            }
            if (iN0 != 0) {
                K(bundle2, iN0, str3, str3, iN0 == 3 ? str3 : null);
                bundle2.remove(str3);
                i8 = iE;
            } else {
                i8 = iE;
                int iX = x(str, str2, str3, bundle.get(str3), bundle2, list, z7, zM0);
                if (iX == 17) {
                    K(bundle2, iX, str3, str3, Boolean.FALSE);
                } else if (iX != 0 && !"_ev".equals(str3)) {
                    K(bundle2, iX, iX == 21 ? str2 : str3, str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (J0(str3)) {
                    int i10 = i9 + 1;
                    if (i10 > i8) {
                        t().H().c("Event can't contain more than " + i8 + " params", c().c(str2), c().a(bundle));
                        v0(bundle2, 5);
                        bundle2.remove(str3);
                    }
                    i9 = i10;
                }
            }
            iE = i8;
            ibVar = this;
        }
        return bundle2;
    }

    final boolean E0(String str) {
        i();
        if (f3.e.a(j()).a(str) == 0) {
            return true;
        }
        t().F().b("Permission not granted", str);
        return false;
    }

    final boolean F0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return a().N().equals(str);
    }

    final d0 G(String str, String str2, Bundle bundle, String str3, long j8, boolean z7, boolean z8) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (v(str2) != 0) {
            t().G().b("Invalid conditional property event name", c().g(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleE = E(str, str2, bundle2, e3.f.a("_o"), true);
        if (z7) {
            bundleE = r0(bundleE);
        }
        a3.o.j(bundleE);
        return new d0(str2, new z(bundleE), str3, j8);
    }

    public final int G0() {
        if (this.f20135h == null) {
            this.f20135h = Integer.valueOf(x2.f.f().a(j()) / 1000);
        }
        return this.f20135h.intValue();
    }

    final long I0() {
        i();
        if (!D0(this.f20556a.B().F())) {
            return 0L;
        }
        long j8 = Build.VERSION.SDK_INT < 30 ? 4L : SdkExtensions.getExtensionVersion(30) < 4 ? 8L : y0() < e0.X.a(null).intValue() ? 16L : 0L;
        if (!E0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j8 |= 2;
        }
        if (j8 == 0 && !X0()) {
            j8 |= 64;
        }
        if (j8 == 0) {
            return 1L;
        }
        return j8;
    }

    public final URL J(long j8, String str, String str2, long j9, String str3) {
        try {
            a3.o.f(str2);
            a3.o.f(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j8), Integer.valueOf(G0())), str2, str, Long.valueOf(j9));
            if (str.equals(a().O())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                }
                strConcat = strConcat.concat(str3);
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException | MalformedURLException e8) {
            t().G().b("Failed to create BOW URL for Deferred Deep Link. exception", e8.getMessage());
            return null;
        }
    }

    public final boolean K0(String str) {
        List<ResolveInfo> listQueryIntentActivities;
        return (TextUtils.isEmpty(str) || (listQueryIntentActivities = j().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || listQueryIntentActivities.isEmpty()) ? false : true;
    }

    final void L(Bundle bundle, long j8) {
        long j9 = bundle.getLong("_et");
        if (j9 != 0) {
            t().L().b("Params already contained engagement", Long.valueOf(j9));
        }
        bundle.putLong("_et", j8 + j9);
    }

    final void M(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                f().N(bundle, str, bundle2.get(str));
            }
        }
    }

    final void N(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            t().M().c("Not putting event parameter. Invalid value type. name, type", c().f(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void O(com.google.android.gms.internal.measurement.w1 w1Var, int i8) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i8);
        try {
            w1Var.f(bundle);
        } catch (RemoteException e8) {
            this.f20556a.t().L().b("Error returning int value to wrapper", e8);
        }
    }

    public final void P(com.google.android.gms.internal.measurement.w1 w1Var, long j8) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j8);
        try {
            w1Var.f(bundle);
        } catch (RemoteException e8) {
            this.f20556a.t().L().b("Error returning long value to wrapper", e8);
        }
    }

    public final long P0() {
        long j8 = this.f20131d.get();
        synchronized (this.f20131d) {
            if (j8 != 0) {
                this.f20131d.compareAndSet(-1L, 1L);
                return this.f20131d.getAndIncrement();
            }
            long jNextLong = new Random(System.nanoTime() ^ k().a()).nextLong();
            int i8 = this.f20132e + 1;
            this.f20132e = i8;
            return jNextLong + ((long) i8);
        }
    }

    public final void Q(com.google.android.gms.internal.measurement.w1 w1Var, Bundle bundle) {
        try {
            w1Var.f(bundle);
        } catch (RemoteException e8) {
            this.f20556a.t().L().b("Error returning bundle value to wrapper", e8);
        }
    }

    final j0.a Q0() {
        if (this.f20133f == null) {
            this.f20133f = j0.a.a(j());
        }
        return this.f20133f;
    }

    public final void R(com.google.android.gms.internal.measurement.w1 w1Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            w1Var.f(bundle);
        } catch (RemoteException e8) {
            this.f20556a.t().L().b("Error returning string value to wrapper", e8);
        }
    }

    public final void S(com.google.android.gms.internal.measurement.w1 w1Var, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            w1Var.f(bundle);
        } catch (RemoteException e8) {
            this.f20556a.t().L().b("Error returning bundle list to wrapper", e8);
        }
    }

    final String S0() {
        byte[] bArr = new byte[16];
        U0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void T(com.google.android.gms.internal.measurement.w1 w1Var, boolean z7) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z7);
        try {
            w1Var.f(bundle);
        } catch (RemoteException e8) {
            this.f20556a.t().L().b("Error returning boolean value to wrapper", e8);
        }
    }

    public final void U(com.google.android.gms.internal.measurement.w1 w1Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            w1Var.f(bundle);
        } catch (RemoteException e8) {
            this.f20556a.t().L().b("Error returning byte array to wrapper", e8);
        }
    }

    final SecureRandom U0() {
        i();
        if (this.f20130c == null) {
            this.f20130c = new SecureRandom();
        }
        return this.f20130c;
    }

    final void V(r4 r4Var, int i8) {
        int i9 = 0;
        for (String str : new TreeSet(r4Var.f20427d.keySet())) {
            if (J0(str) && (i9 = i9 + 1) > i8) {
                t().H().c("Event can't contain more than " + i8 + " params", c().c(r4Var.f20424a), c().a(r4Var.f20427d));
                v0(r4Var.f20427d, 5);
                r4Var.f20427d.remove(str);
            }
        }
    }

    final boolean V0() {
        i();
        return I0() == 1;
    }

    public final boolean W0() {
        try {
            j().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    final void a0(Parcelable[] parcelableArr, int i8, boolean z7) {
        int i9;
        a3.o.j(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i10 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (J0(str) && !m0(str, p3.t.f25620d) && (i10 = i10 + 1) > i8) {
                    p4 p4VarH = t().H();
                    if (z7) {
                        p4VarH.c("Param can't contain more than " + i8 + " item-scoped custom parameters", c().f(str), c().a(bundle));
                        i9 = 28;
                    } else {
                        p4VarH.c("Param cannot contain item-scoped custom parameters", c().f(str), c().a(bundle));
                        i9 = 23;
                    }
                    v0(bundle, i9);
                    bundle.remove(str);
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y b() {
        return super.b();
    }

    public final boolean b0(int i8, boolean z7) {
        Boolean boolW = this.f20556a.J().W();
        if (G0() < i8 / 1000) {
            return (boolW == null || boolW.booleanValue()) ? false : true;
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @SuppressLint({"ApplySharedPref"})
    final boolean h0(String str, double d8) {
        try {
            SharedPreferences.Editor editorEdit = j().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong(DiagnosticsEntry.Event.TIMESTAMP_KEY, Double.doubleToRawLongBits(d8));
            return editorEdit.commit();
        } catch (RuntimeException e8) {
            t().G().b("Failed to persist Deferred Deep Link. exception", e8);
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    final boolean i0(String str, int i8, String str2) {
        if (str2 == null) {
            t().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i8) {
            return true;
        }
        t().H().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i8), str2);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context j() {
        return super.j();
    }

    final boolean j0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (R0(str)) {
                return true;
            }
            if (this.f20556a.o()) {
                t().H().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", n4.v(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.f20556a.o()) {
                t().H().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (R0(str2)) {
            return true;
        }
        t().H().b("Invalid admob_app_id. Analytics disabled.", n4.v(str2));
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e3.e k() {
        return super.k();
    }

    final boolean k0(String str, String str2, int i8, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i8) {
                t().M().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    final boolean n0(String str, String[] strArr, String str2) {
        return o0(str, strArr, null, str2);
    }

    final boolean o0(String str, String[] strArr, String[] strArr2, String str2) {
        boolean z7;
        if (str2 == null) {
            t().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        a3.o.j(str2);
        String[] strArr3 = f20128i;
        int length = strArr3.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                z7 = false;
                break;
            }
            if (str2.startsWith(strArr3[i8])) {
                z7 = true;
                break;
            }
            i8++;
        }
        if (z7) {
            t().H().c("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr == null || !m0(str2, strArr) || (strArr2 != null && m0(str2, strArr2))) {
            return true;
        }
        t().H().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.u6
    protected final boolean q() {
        return true;
    }

    final int q0(String str) {
        if (!w0("user property", str)) {
            return 6;
        }
        if (n0("user property", p3.s.f25615a, str)) {
            return !i0("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    @Override // com.google.android.gms.measurement.internal.u6
    protected final void r() {
        i();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                t().L().a("Utils falling back to Random for random id");
            }
        }
        this.f20131d.set(jNextLong);
    }

    final Bundle r0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objS0 = s0(str, bundle.get(str));
                if (objS0 == null) {
                    t().M().b("Param value can't be null", c().f(str));
                } else {
                    N(bundle2, str, objS0);
                }
            }
        }
        return bundle2;
    }

    public final int s(int i8) {
        return x2.f.f().h(j(), 12451000);
    }

    final Object s0(String str, Object obj) {
        if ("_ev".equals(str)) {
            return H(a().w(this.f20556a.B().F()), obj, true, true);
        }
        return H(H0(str) ? a().w(this.f20556a.B().F()) : a().r(this.f20556a.B().F()), obj, false, true);
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 u() {
        return super.u();
    }

    final int v(String str) {
        if (!w0("event", str)) {
            return 2;
        }
        if (o0("event", p3.r.f25611a, p3.r.f25612b, str)) {
            return !i0("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    final int w(String str, Object obj) {
        int iO0;
        String str2;
        if ("_ldl".equals(str)) {
            iO0 = O0(str);
            str2 = "user property referrer";
        } else {
            iO0 = O0(str);
            str2 = "user property";
        }
        return k0(str2, str, iO0, obj) ? 0 : 7;
    }

    final boolean w0(String str, String str2) {
        if (str2 == null) {
            t().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            t().H().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            t().H().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                t().H().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0065 -> B:17:0x0072). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final long z(android.content.Context r7, java.lang.String r8) {
        /*
            r6 = this;
            r6.i()
            a3.o.j(r7)
            a3.o.f(r8)
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            java.security.MessageDigest r1 = T0()
            r2 = -1
            r4 = 0
            if (r1 != 0) goto L25
            com.google.android.gms.measurement.internal.n4 r7 = r6.t()
            com.google.android.gms.measurement.internal.p4 r7 = r7.G()
            java.lang.String r8 = "Could not get MD5 instance"
            r7.a(r8)
            goto L73
        L25:
            if (r0 == 0) goto L72
            boolean r8 = r6.u0(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            if (r8 != 0) goto L72
            f3.d r7 = f3.e.a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            android.content.Context r8 = r6.j()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            java.lang.String r8 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            r0 = 64
            android.content.pm.PackageInfo r7 = r7.f(r8, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            android.content.pm.Signature[] r7 = r7.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            if (r7 == 0) goto L56
            int r8 = r7.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            if (r8 <= 0) goto L56
            r8 = 0
            r7 = r7[r8]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            byte[] r7 = r1.digest(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            long r2 = B(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            goto L73
        L56:
            com.google.android.gms.measurement.internal.n4 r7 = r6.t()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            com.google.android.gms.measurement.internal.p4 r7 = r7.L()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            java.lang.String r8 = "Could not get signatures"
            r7.a(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            goto L73
        L64:
            r7 = move-exception
            com.google.android.gms.measurement.internal.n4 r8 = r6.t()
            com.google.android.gms.measurement.internal.p4 r8 = r8.G()
            java.lang.String r0 = "Package name not found"
            r8.b(r0, r7)
        L72:
            r2 = r4
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ib.z(android.content.Context, java.lang.String):long");
    }

    final long z0(String str) {
        if (j().getPackageManager() == null) {
            return 0L;
        }
        int i8 = 0;
        try {
            ApplicationInfo applicationInfoC = f3.e.a(j()).c(str, 0);
            if (applicationInfoC != null) {
                i8 = applicationInfoC.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            t().J().b("PackageManager failed to find running app: app_id", str);
        }
        return i8;
    }
}
