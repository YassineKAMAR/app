package com.google.android.gms.dynamite;

import a3.o;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Boolean f4917h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f4918i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f4919j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f4920k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Boolean f4921l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static m f4926q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static n f4927r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4928a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final ThreadLocal f4922m = new ThreadLocal();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f4923n = new com.google.android.gms.dynamite.b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final b.a f4924o = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f4911b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f4912c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f4913d = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f4914e = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f4915f = new h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f4916g = new i();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f4925p = new j();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        /* synthetic */ a(String str, h3.d dVar) {
            super(str);
        }

        /* synthetic */ a(String str, Throwable th, h3.d dVar) {
            super(str, th);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str, boolean z7);

            int b(Context context, String str);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0075b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f4929a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f4930b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f4931c = 0;
        }

        C0075b a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        o.j(context);
        this.f4928a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (a3.n.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e8) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e8.getMessage())));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0083 A[Catch: all -> 0x0300, TRY_LEAVE, TryCatch #0 {all -> 0x0300, blocks: (B:5:0x002b, B:9:0x0075, B:14:0x007d, B:17:0x0083, B:28:0x00a5, B:124:0x0238, B:125:0x0243, B:137:0x0259, B:139:0x0277, B:141:0x0288, B:151:0x02ae, B:152:0x02b6, B:128:0x0247, B:131:0x024b, B:132:0x0253, B:153:0x02b7, B:154:0x02ce, B:155:0x02cf, B:156:0x02ff), top: B:169:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.dynamite.DynamiteModule e(android.content.Context r18, com.google.android.gms.dynamite.DynamiteModule.b r19, java.lang.String r20) throws com.google.android.gms.dynamite.DynamiteModule.a {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5 A[Catch: all -> 0x00af, TryCatch #4 {, blocks: (B:9:0x0026, B:11:0x0032, B:48:0x00ad, B:14:0x0038, B:16:0x003f, B:18:0x0045, B:21:0x0048, B:23:0x004c, B:27:0x0056, B:29:0x005e, B:32:0x0065, B:39:0x008f, B:40:0x0097, B:35:0x006c, B:37:0x0072, B:38:0x0081, B:43:0x009a, B:46:0x009d, B:47:0x00a5, B:15:0x003b), top: B:128:0x0026, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0163 A[Catch: all -> 0x01bf, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x01bf, blocks: (B:3:0x0002, B:61:0x00d6, B:63:0x00dc, B:68:0x00fd, B:90:0x0155, B:94:0x0163, B:115:0x01b8, B:116:0x01bb, B:110:0x01b0, B:66:0x00e2, B:119:0x01be, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:59:0x00d3, B:19:0x0046, B:41:0x0098, B:44:0x009b, B:52:0x00b1, B:60:0x00d5, B:58:0x00b7), top: B:136:0x0002, inners: #1, #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int g(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void i(ClassLoader classLoader) throws a {
        n nVar;
        h3.d dVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new n(iBinder);
            }
            f4927r = nVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e8) {
            throw new a("Failed to instantiate dynamite loader", e8, dVar);
        }
    }

    private static boolean j(Cursor cursor) {
        k kVar = (k) f4922m.get();
        if (kVar == null || kVar.f4932a != null) {
            return false;
        }
        kVar.f4932a = cursor;
        return true;
    }

    private static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f4921l)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (f4921l == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (x2.f.f().h(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            f4921l = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f4919j = true;
            }
        }
        if (!zBooleanValue) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return zBooleanValue;
    }

    private static m l(Context context) {
        m mVar;
        synchronized (DynamiteModule.class) {
            m mVar2 = f4926q;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder);
                }
                if (mVar != null) {
                    f4926q = mVar;
                    return mVar;
                }
            } catch (Exception e8) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e8.getMessage());
            }
            return null;
        }
    }

    @ResultIgnorabilityUnspecified
    public Context b() {
        return this.f4928a;
    }

    public IBinder d(String str) throws a {
        try {
            return (IBinder) this.f4928a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e8) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e8, null);
        }
    }
}
