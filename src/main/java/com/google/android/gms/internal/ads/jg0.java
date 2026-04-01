package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class jg0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Handler f9600b = new e53(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f9601c = z1.j.class.getName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f9602d = k2.a.class.getName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f9603e = a2.b.class.getName();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f9604f = a2.c.class.getName();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f9605g = t2.b.class.getName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f9606h = z1.f.class.getName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f9607a = -1.0f;

    public static final void A(Context context, String str, String str2, Bundle bundle, boolean z7, ig0 ig0Var) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = x2.f.f().a(context) + ".233702000";
        }
        bundle.putString("js", str);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        ig0Var.a(builderAppendQueryParameter.toString());
    }

    public static final int B(Context context, int i8) {
        return t(context.getResources().getDisplayMetrics(), i8);
    }

    public static final String C(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || v()) {
            string = "emulator";
        }
        return D(string, "MD5");
    }

    private static String D(String str, String str2) {
        for (int i8 = 0; i8 < 2; i8++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    private final JSONArray a(Collection collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void b(JSONArray jSONArray, Object obj) throws JSONException {
        Object objK;
        if (obj instanceof Bundle) {
            objK = l((Bundle) obj);
        } else if (obj instanceof Map) {
            objK = m((Map) obj);
        } else if (obj instanceof Collection) {
            objK = a((Collection) obj);
        } else {
            if (!(obj instanceof Object[])) {
                jSONArray.put(obj);
                return;
            }
            objK = k((Object[]) obj);
        }
        jSONArray.put(objK);
    }

    private final void c(JSONObject jSONObject, String str, Object obj) throws JSONException {
        Boolean[] boolArr;
        Object objK;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        Collection collectionAsList;
        if (((Boolean) h2.y.c().b(ns.f12192t)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            objK = l((Bundle) obj);
        } else if (obj instanceof Map) {
            objK = m((Map) obj);
        } else {
            if (obj instanceof Collection) {
                str = String.valueOf(str);
                collectionAsList = (Collection) obj;
            } else if (obj instanceof Object[]) {
                collectionAsList = Arrays.asList((Object[]) obj);
            } else {
                int i8 = 0;
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    if (iArr == null) {
                        numArr = new Integer[0];
                    } else {
                        int length = iArr.length;
                        Integer[] numArr2 = new Integer[length];
                        while (i8 < length) {
                            numArr2[i8] = Integer.valueOf(iArr[i8]);
                            i8++;
                        }
                        numArr = numArr2;
                    }
                    objK = k(numArr);
                } else if (obj instanceof double[]) {
                    double[] dArr2 = (double[]) obj;
                    if (dArr2 == null) {
                        dArr = new Double[0];
                    } else {
                        int length2 = dArr2.length;
                        Double[] dArr3 = new Double[length2];
                        while (i8 < length2) {
                            dArr3[i8] = Double.valueOf(dArr2[i8]);
                            i8++;
                        }
                        dArr = dArr3;
                    }
                    objK = k(dArr);
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    if (jArr == null) {
                        lArr = new Long[0];
                    } else {
                        int length3 = jArr.length;
                        Long[] lArr2 = new Long[length3];
                        while (i8 < length3) {
                            lArr2[i8] = Long.valueOf(jArr[i8]);
                            i8++;
                        }
                        lArr = lArr2;
                    }
                    objK = k(lArr);
                } else {
                    if (!(obj instanceof boolean[])) {
                        jSONObject.put(str, obj);
                        return;
                    }
                    boolean[] zArr = (boolean[]) obj;
                    if (zArr == null) {
                        boolArr = new Boolean[0];
                    } else {
                        int length4 = zArr.length;
                        Boolean[] boolArr2 = new Boolean[length4];
                        while (i8 < length4) {
                            boolArr2[i8] = Boolean.valueOf(zArr[i8]);
                            i8++;
                        }
                        boolArr = boolArr2;
                    }
                    objK = k(boolArr);
                }
            }
            objK = a(collectionAsList);
        }
        jSONObject.put(str, objK);
    }

    private static final void d(ViewGroup viewGroup, h2.w4 w4Var, String str, int i8, int i9) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i8);
        textView.setBackgroundColor(i9);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i8);
        int iB = B(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(w4Var.f22356f - iB, w4Var.f22353c - iB, 17));
        viewGroup.addView(frameLayout, w4Var.f22356f, w4Var.f22353c);
    }

    public static int e(Context context, int i8) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i9 = configuration.orientation;
        if (i8 == 0) {
            i8 = i9;
        }
        return Math.round((i8 == i9 ? displayMetrics.heightPixels : displayMetrics.widthPixels) / displayMetrics.density);
    }

    public static z1.h g(Context context, int i8, int i9, int i10) {
        float f8;
        float f9;
        int iRound;
        int iE = e(context, i10);
        if (iE == -1) {
            return z1.h.f27632q;
        }
        int iMin = Math.min(90, Math.round(iE * 0.15f));
        if (i8 <= 655) {
            if (i8 > 632) {
                iRound = 81;
            } else if (i8 > 526) {
                f8 = i8 / 468.0f;
                f9 = 60.0f;
            } else if (i8 > 432) {
                iRound = 68;
            } else {
                f8 = i8 / 320.0f;
                f9 = 50.0f;
            }
            return new z1.h(i8, Math.max(Math.min(iRound, iMin), 50));
        }
        f8 = i8 / 728.0f;
        f9 = 90.0f;
        iRound = Math.round(f8 * f9);
        return new z1.h(i8, Math.max(Math.min(iRound, iMin), 50));
    }

    public static String h() {
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i8 = 0; i8 < 2; i8++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return string;
    }

    public static String i(String str) {
        return D(str, "MD5");
    }

    public static String j(String str) {
        return D(str, "SHA-256");
    }

    public static boolean s(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) su.f14829d.e());
    }

    public static final int t(DisplayMetrics displayMetrics, int i8) {
        return (int) TypedValue.applyDimension(1, i8, displayMetrics);
    }

    public static final String u(StackTraceElement[] stackTraceElementArr, String str) {
        int i8;
        String className;
        int i9 = 0;
        while (true) {
            i8 = i9 + 1;
            if (i8 >= stackTraceElementArr.length) {
                className = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i9];
            String className2 = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f9601c.equalsIgnoreCase(className2) || f9602d.equalsIgnoreCase(className2) || f9603e.equalsIgnoreCase(className2) || f9604f.equalsIgnoreCase(className2) || f9605g.equalsIgnoreCase(className2) || f9606h.equalsIgnoreCase(className2))) {
                break;
            }
            i9 = i8;
        }
        className = stackTraceElementArr[i8].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i10 = 2; i10 > 0 && stringTokenizer.hasMoreElements(); i10--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (className != null && !className.contains(str)) {
                return className;
            }
        }
        return null;
    }

    public static final boolean v() {
        boolean zBooleanValue = ((Boolean) h2.y.c().b(ns.sa)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator") || (zBooleanValue && Build.HARDWARE.contains("ranchu"));
    }

    public static final boolean w(Context context, int i8) {
        return x2.f.f().h(context, i8) == 0;
    }

    public static final boolean x(Context context) {
        int iH = x2.f.f().h(context, 12451000);
        return iH == 0 || iH == 2;
    }

    public static final boolean y() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int z(DisplayMetrics displayMetrics, int i8) {
        return Math.round(i8 / displayMetrics.density);
    }

    public final int f(Context context, int i8) {
        if (this.f9607a < 0.0f) {
            synchronized (this) {
                if (this.f9607a < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f9607a = displayMetrics.density;
                }
            }
        }
        return Math.round(i8 / this.f9607a);
    }

    final JSONArray k(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            b(jSONArray, obj);
        }
        return jSONArray;
    }

    public final JSONObject l(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            c(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject m(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                c(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e8) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e8.getMessage())));
        }
    }

    public final JSONObject n(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return l(bundle);
        } catch (JSONException e8) {
            qg0.e("Error converting Bundle to JSON", e8);
            return null;
        }
    }

    public final void o(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject2.get(next);
            try {
                Object obj2 = jSONObject.get(next);
                if (JSONObject.class.isInstance(obj2) && JSONObject.class.isInstance(obj)) {
                    o((JSONObject) obj2, (JSONObject) obj);
                }
            } catch (JSONException unused) {
                jSONObject.put(next, obj);
            }
        }
    }

    public final void p(ViewGroup viewGroup, h2.w4 w4Var, String str, String str2) {
        if (str2 != null) {
            qg0.g(str2);
        }
        d(viewGroup, w4Var, str, -65536, -16777216);
    }

    public final void q(ViewGroup viewGroup, h2.w4 w4Var, String str) {
        d(viewGroup, w4Var, "Ads by Google", -16777216, -1);
    }

    public final void r(Context context, String str, String str2, Bundle bundle, boolean z7) {
        A(context, str, "gmob-apps", bundle, true, new ig0() { // from class: com.google.android.gms.internal.ads.gg0
            @Override // com.google.android.gms.internal.ads.ig0
            public final boolean a(String str3) {
                new hg0(this.f8311a, str3).start();
                return true;
            }
        });
    }
}
