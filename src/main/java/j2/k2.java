package j2;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.as2;
import com.google.android.gms.internal.ads.cn0;
import com.google.android.gms.internal.ads.e53;
import com.google.android.gms.internal.ads.fs;
import com.google.android.gms.internal.ads.ig0;
import com.google.android.gms.internal.ads.jg0;
import com.google.android.gms.internal.ads.jn1;
import com.google.android.gms.internal.ads.mb0;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.pg0;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.qt;
import com.google.android.gms.internal.ads.su;
import com.google.android.gms.internal.ads.vl0;
import com.google.android.gms.internal.ads.w73;
import com.google.android.gms.internal.ads.wr2;
import com.google.android.gms.internal.ads.x84;
import com.google.android.gms.internal.ads.z83;
import com.google.android.gms.internal.ads.zf3;
import com.revenuecat.purchases.common.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class k2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e53 f23991k = new w1(Looper.getMainLooper());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f23998g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f23992a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f23993b = new AtomicReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f23994c = new AtomicReference(new Bundle());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f23995d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23996e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f23997f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23999h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24000i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Executor f24001j = Executors.newSingleThreadExecutor();

    public static int A(int i8) {
        if (i8 >= 5000) {
            return i8;
        }
        if (i8 <= 0) {
            return 60000;
        }
        qg0.g("HTTP timeout too low: " + i8 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    private static final void B(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static List E() {
        fs fsVar = ns.f12021a;
        List listB = h2.y.a().b();
        ArrayList arrayList = new ArrayList();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            Iterator it2 = z83.c(w73.c(',')).d((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    v1.k("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean O(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.k2.O(android.view.View):boolean");
    }

    public static final void P(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String Q(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return y(x(context));
    }

    static final String R() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String S() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    public static final DisplayMetrics T(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    protected static final int[] U() {
        return new int[]{0, 0};
    }

    public static final Map V(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i8);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e8) {
            g2.t.q().u(e8, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long W(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final WebResourceResponse X(Context context, String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", g2.t.r().D(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new s0(context).b(0, str2, map, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e8) {
            qg0.h("Could not fetch MRAID JS.", e8);
        }
        return null;
    }

    public static final String Y() {
        Resources resourcesD = g2.t.q().d();
        return resourcesD != null ? resourcesD.getString(e2.b.f21374t) : "Test Ad";
    }

    public static final v0 Z(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(objNewInstance instanceof IBinder)) {
                qg0.d("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof v0 ? (v0) iInterfaceQueryLocalInterface : new t0(iBinder);
        } catch (Exception e8) {
            g2.t.q().u(e8, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean a(Context context) {
        try {
            return e3.i.b(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean a0(Context context, String str) {
        Context contextA = mb0.a(context);
        return f3.e.a(contextA).b(str, contextA.getPackageName()) == 0;
    }

    public static final boolean b(String str) {
        if (!pg0.k()) {
            return false;
        }
        if (!((Boolean) h2.y.c().b(ns.O4)).booleanValue()) {
            return false;
        }
        String str2 = (String) h2.y.c().b(ns.Q4);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) h2.y.c().b(ns.P4);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(Context context) {
        KeyguardManager keyguardManagerW;
        return (context == null || (keyguardManagerW = w(context)) == null || !keyguardManagerW.isKeyguardLocked()) ? false : true;
    }

    public static final boolean d(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            qg0.e("Error loading class.", th);
            g2.t.q().u(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean e() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    public static final boolean f(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean g(Context context) {
        Bundle bundleX = x(context);
        return TextUtils.isEmpty(y(bundleX)) && !TextUtils.isEmpty(bundleX.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static final boolean h(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void i(View view, int i8, MotionEvent motionEvent) {
        String strA;
        int i9;
        int iHeight;
        int iWidth;
        String str;
        wr2 wr2VarD;
        as2 as2VarP;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (childAt instanceof jn1) {
                childAt = ((jn1) childAt).getChildAt(0);
            }
            if ((childAt instanceof c2.n) || (childAt instanceof NativeAdView)) {
                strA = "NATIVE";
                i9 = 1;
            } else {
                strA = "UNKNOWN";
                i9 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            g2.t.r();
            long jW = W(childAt);
            childAt.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            String str2 = "none";
            if (!(childAt instanceof cn0) || (as2VarP = ((cn0) childAt).P()) == null) {
                str = "none";
            } else {
                str = as2VarP.f5462b;
                childAt.setContentDescription(str + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + childAt.hashCode());
            }
            if ((childAt instanceof vl0) && (wr2VarD = ((vl0) childAt).d()) != null) {
                strA = wr2.a(wr2VarD.f16867b);
                i9 = wr2VarD.f16875f;
                str2 = wr2VarD.G;
            }
            qg0.f(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(childAt.hashCode()), packageName, str2, str, strA, Integer.valueOf(i9), childAt.getClass().getName(), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(childAt.getWidth()), Integer.valueOf(childAt.getHeight()), Integer.valueOf(iWidth), Integer.valueOf(iHeight), Long.valueOf(jW), Integer.toString(i8, 2)));
        } catch (Exception e8) {
            qg0.e("Failure getting view location.", e8);
        }
    }

    public static final AlertDialog.Builder j(Context context) {
        return new AlertDialog.Builder(context, g2.t.s().a());
    }

    public static final void k(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new d1(context, str, (String) it.next()).b();
        }
    }

    public static final void l(Context context, Throwable th) {
        if (context != null) {
            try {
                if (((Boolean) su.f14827b.e()).booleanValue()) {
                    e3.g.a(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final String m(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int i8 = inputStreamReader.read(cArr);
            if (i8 == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i8);
        }
    }

    public static final int n(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e8) {
            qg0.g("Could not parse value:".concat(e8.toString()));
            return 0;
        }
    }

    public static final Map o(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                map.put(str, uri.getQueryParameter(str));
            }
        }
        return map;
    }

    public static final int[] p(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? U() : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] q(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArrU = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? U() : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{h2.v.b().f(activity, iArrU[0]), h2.v.b().f(activity, iArrU[1])};
    }

    public static final boolean r(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z7 = g2.t.r().f23996e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || O(view);
        long jW = W(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z7)) {
            if (!((Boolean) h2.y.c().b(ns.f12104j1)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) h2.y.c().b(ns.L9)).booleanValue()) {
                    return true;
                }
                if (jW >= ((Integer) h2.y.c().b(ns.N9)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void s(Context context, Intent intent) {
        if (!((Boolean) h2.y.c().b(ns.da)).booleanValue()) {
            B(context, intent);
            return;
        }
        try {
            B(context, intent);
        } catch (SecurityException e8) {
            qg0.h("", e8);
            g2.t.q().u(e8, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void t(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            P(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            qg0.b("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e8) {
            qg0.e("No browser is found.", e8);
        }
    }

    public static final int[] u(Activity activity) {
        int[] iArrP = p(activity);
        return new int[]{h2.v.b().f(activity, iArrP[0]), h2.v.b().f(activity, iArrP[1])};
    }

    public static final boolean v(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return r(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, w(context));
    }

    private static KeyguardManager w(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static Bundle x(Context context) {
        try {
            return f3.e.a(context).c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e8) {
            v1.l("Error getting metadata", e8);
            return null;
        }
    }

    private static String y(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return TextUtils.isEmpty(string) ? "" : (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    private static boolean z(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public final x3.d C(final Uri uri) {
        return zf3.j(new Callable() { // from class: j2.e2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                e53 e53Var = k2.f23991k;
                g2.t.r();
                return k2.o(uri);
            }
        }, this.f24001j);
    }

    public final String D(final Context context, String str) {
        Object objA;
        synchronized (this.f23997f) {
            String str2 = this.f23998g;
            if (str2 != null) {
                return str2;
            }
            if (str == null) {
                return R();
            }
            try {
                n1 n1VarA = n1.a();
                if (TextUtils.isEmpty(n1VarA.f24015a)) {
                    if (e3.d.a()) {
                        objA = k1.a(context, new Callable() { // from class: j2.l1
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Context context2 = context;
                                SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                String string = sharedPreferences.getString("user_agent", "");
                                if (!TextUtils.isEmpty(string)) {
                                    v1.k("User agent is already initialized on Google Play Services.");
                                    return string;
                                }
                                v1.k("User agent is not initialized on Google Play Services. Initializing.");
                                String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                                e3.p.a(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                                return defaultUserAgent;
                            }
                        });
                    } else {
                        final Context contextC = x2.i.c(context);
                        objA = k1.a(context, new Callable() { // from class: j2.m1
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                SharedPreferences sharedPreferences;
                                Context context2 = contextC;
                                Context context3 = context;
                                boolean z7 = false;
                                if (context2 != null) {
                                    v1.k("Attempting to read user agent from Google Play Services.");
                                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                } else {
                                    v1.k("Attempting to read user agent from local cache.");
                                    sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                    z7 = true;
                                }
                                String string = sharedPreferences.getString("user_agent", "");
                                if (TextUtils.isEmpty(string)) {
                                    v1.k("Reading user agent from WebSettings");
                                    string = WebSettings.getDefaultUserAgent(context3);
                                    if (z7) {
                                        sharedPreferences.edit().putString("user_agent", string).apply();
                                        v1.k("Persisting user agent.");
                                    }
                                }
                                return string;
                            }
                        });
                    }
                    n1VarA.f24015a = (String) objA;
                }
                this.f23998g = n1VarA.f24015a;
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(this.f23998g)) {
                this.f23998g = WebSettings.getDefaultUserAgent(context);
            }
            if (TextUtils.isEmpty(this.f23998g)) {
                this.f23998g = R();
            }
            this.f23998g = this.f23998g + " (Mobile; " + str;
            try {
                if (f3.e.a(context).g()) {
                    this.f23998g = this.f23998g + ";aia";
                }
            } catch (Exception e8) {
                g2.t.q().u(e8, "AdUtil.getUserAgent");
            }
            String str3 = this.f23998g + ")";
            this.f23998g = str3;
            return str3;
        }
    }

    public final void G(Context context, String str, boolean z7, HttpURLConnection httpURLConnection, boolean z8, int i8) {
        int iA = A(i8);
        qg0.f("HTTP timeout: " + iA + " milliseconds.");
        httpURLConnection.setConnectTimeout(iA);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iA);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", D(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    final /* synthetic */ void H(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.f23994c.set(e.b(context, str));
    }

    public final void I(final Context context, final String str, String str2, Bundle bundle, boolean z7) {
        g2.t.r();
        bundle.putString("device", S());
        fs fsVar = ns.f12021a;
        bundle.putString("eids", TextUtils.join(com.amazon.a.a.o.b.f.f3942a, h2.y.a().a()));
        if (bundle.isEmpty()) {
            qg0.b("Empty or null bundle.");
        } else {
            final String str3 = (String) h2.y.c().b(ns.I9);
            if (!this.f23995d.getAndSet(true)) {
                this.f23994c.set(e.a(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: j2.d2
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        this.f23951a.H(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((Bundle) this.f23994c.get());
        }
        h2.v.b();
        jg0.A(context, str, "gmob-apps", bundle, true, new ig0() { // from class: j2.c2
            @Override // com.google.android.gms.internal.ads.ig0
            public final boolean a(String str4) {
                e53 e53Var = k2.f23991k;
                g2.t.r();
                k2.k(context, str, str4);
                return true;
            }
        });
    }

    public final boolean J(String str) {
        return z(str, this.f23992a, (String) h2.y.c().b(ns.f12031b0));
    }

    public final boolean K(String str) {
        return z(str, this.f23993b, (String) h2.y.c().b(ns.f12040c0));
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean L(Context context) {
        if (this.f24000i) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        ns.a(context);
        g2 g2Var = null;
        if (!((Boolean) h2.y.c().b(ns.ca)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new h2(this, g2Var), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new h2(this, g2Var), intentFilter, 4);
        }
        this.f24000i = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean M(Context context) {
        if (this.f23999h) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        ns.a(context);
        i2 i2Var = null;
        if (!((Boolean) h2.y.c().b(ns.ca)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new j2(this, i2Var), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new j2(this, i2Var), intentFilter, 4);
        }
        this.f23999h = true;
        return true;
    }

    public final int N(Context context, Uri uri) {
        int i8;
        if (context == null) {
            v1.k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (context instanceof Activity) {
            i8 = 0;
        } else {
            v1.k("Chrome Custom Tabs can only work with Activity context.");
            i8 = 2;
        }
        fs fsVar = ns.f12197t4;
        Boolean bool = (Boolean) h2.y.c().b(fsVar);
        fs fsVar2 = ns.f12205u4;
        if (true == bool.equals(h2.y.c().b(fsVar2))) {
            i8 = 9;
        }
        if (i8 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i8;
        }
        if (((Boolean) h2.y.c().b(fsVar)).booleanValue()) {
            qt qtVar = new qt();
            qtVar.e(new f2(this, qtVar, context, uri));
            qtVar.b((Activity) context);
        }
        if (!((Boolean) h2.y.c().b(fsVar2)).booleanValue()) {
            return 5;
        }
        androidx.browser.customtabs.d dVarA = new d.b().a();
        dVarA.f1207a.setPackage(x84.a(context));
        dVarA.a(context, uri);
        return 5;
    }
}
