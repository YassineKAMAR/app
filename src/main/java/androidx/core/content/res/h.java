package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f1980a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<d, SparseArray<c>> f1981b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f1982c = new Object();

    static class a {
        static Drawable a(Resources resources, int i8, Resources.Theme theme) {
            return resources.getDrawable(i8, theme);
        }

        static Drawable b(Resources resources, int i8, int i9, Resources.Theme theme) {
            return resources.getDrawableForDensity(i8, i9, theme);
        }
    }

    static class b {
        static int a(Resources resources, int i8, Resources.Theme theme) {
            return resources.getColor(i8, theme);
        }

        static ColorStateList b(Resources resources, int i8, Resources.Theme theme) {
            return resources.getColorStateList(i8, theme);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ColorStateList f1983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Configuration f1984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f1985c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f1983a = colorStateList;
            this.f1984b = configuration;
            this.f1985c = theme == null ? 0 : theme.hashCode();
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Resources f1986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Resources.Theme f1987b;

        d(Resources resources, Resources.Theme theme) {
            this.f1986a = resources;
            this.f1987b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f1986a.equals(dVar.f1986a) && androidx.core.util.d.a(this.f1987b, dVar.f1987b);
        }

        public int hashCode() {
            return androidx.core.util.d.b(this.f1986a, this.f1987b);
        }
    }

    public static abstract class e {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i8, Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1993a.f(i8);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: androidx.core.content.res.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1991a.g(typeface);
                }
            });
        }

        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract void f(int i8);

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract void g(Typeface typeface);
    }

    public static final class f {

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final Object f1988a = new Object();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static Method f1989b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static boolean f1990c;

            /* JADX WARN: Removed duplicated region for block: B:30:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @android.annotation.SuppressLint({"BanUncheckedReflection"})
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            static void a(android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = androidx.core.content.res.h.f.a.f1988a
                    monitor-enter(r0)
                    boolean r1 = androidx.core.content.res.h.f.a.f1990c     // Catch: java.lang.Throwable -> L3c
                    r2 = 0
                    if (r1 != 0) goto L23
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    androidx.core.content.res.h.f.a.f1989b = r3     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    r3.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L19 java.lang.Throwable -> L3c
                    goto L21
                L19:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L3c
                L21:
                    androidx.core.content.res.h.f.a.f1990c = r1     // Catch: java.lang.Throwable -> L3c
                L23:
                    java.lang.reflect.Method r1 = androidx.core.content.res.h.f.a.f1989b     // Catch: java.lang.Throwable -> L3c
                    if (r1 == 0) goto L3a
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    r1.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L2d java.lang.IllegalAccessException -> L2f java.lang.Throwable -> L3c
                    goto L3a
                L2d:
                    r6 = move-exception
                    goto L30
                L2f:
                    r6 = move-exception
                L30:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r2 = "Failed to invoke rebase() method via reflection"
                    android.util.Log.i(r1, r2, r6)     // Catch: java.lang.Throwable -> L3c
                    r6 = 0
                    androidx.core.content.res.h.f.a.f1989b = r6     // Catch: java.lang.Throwable -> L3c
                L3a:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    return
                L3c:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.h.f.a.a(android.content.res.Resources$Theme):void");
            }
        }

        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 29) {
                b.a(theme);
            } else if (i8 >= 23) {
                a.a(theme);
            }
        }
    }

    private static void a(d dVar, int i8, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f1982c) {
            WeakHashMap<d, SparseArray<c>> weakHashMap = f1981b;
            SparseArray<c> sparseArray = weakHashMap.get(dVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(dVar, sparseArray);
            }
            sparseArray.append(i8, new c(colorStateList, dVar.f1986a.getConfiguration(), theme));
        }
    }

    private static ColorStateList b(d dVar, int i8) {
        c cVar;
        Resources.Theme theme;
        synchronized (f1982c) {
            SparseArray<c> sparseArray = f1981b.get(dVar);
            if (sparseArray != null && sparseArray.size() > 0 && (cVar = sparseArray.get(i8)) != null) {
                if (cVar.f1984b.equals(dVar.f1986a.getConfiguration()) && (((theme = dVar.f1987b) == null && cVar.f1985c == 0) || (theme != null && cVar.f1985c == theme.hashCode()))) {
                    return cVar.f1983a;
                }
                sparseArray.remove(i8);
            }
            return null;
        }
    }

    public static ColorStateList c(Resources resources, int i8, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList colorStateListB = b(dVar, i8);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListG = g(resources, i8, theme);
        if (colorStateListG == null) {
            return Build.VERSION.SDK_INT >= 23 ? b.b(resources, i8, theme) : resources.getColorStateList(i8);
        }
        a(dVar, i8, colorStateListG, theme);
        return colorStateListG;
    }

    public static Drawable d(Resources resources, int i8, Resources.Theme theme) {
        return a.a(resources, i8, theme);
    }

    public static Typeface e(Context context, int i8, TypedValue typedValue, int i9, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return i(context, i8, typedValue, i9, eVar, null, true, false);
    }

    private static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = f1980a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList g(Resources resources, int i8, Resources.Theme theme) {
        if (h(resources, i8)) {
            return null;
        }
        try {
            return androidx.core.content.res.c.a(resources, resources.getXml(i8), theme);
        } catch (Exception e8) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e8);
            return null;
        }
    }

    private static boolean h(Resources resources, int i8) {
        TypedValue typedValueF = f();
        resources.getValue(i8, typedValueF, true);
        int i9 = typedValueF.type;
        return i9 >= 28 && i9 <= 31;
    }

    private static Typeface i(Context context, int i8, TypedValue typedValue, int i9, e eVar, Handler handler, boolean z7, boolean z8) {
        Resources resources = context.getResources();
        resources.getValue(i8, typedValue, true);
        Typeface typefaceJ = j(context, resources, typedValue, i8, i9, eVar, handler, z7, z8);
        if (typefaceJ != null || eVar != null || z8) {
            return typefaceJ;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i8) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface j(android.content.Context r17, android.content.res.Resources r18, android.util.TypedValue r19, int r20, int r21, androidx.core.content.res.h.e r22, android.os.Handler r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.h.j(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.h$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
