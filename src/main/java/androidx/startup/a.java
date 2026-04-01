package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s0.c;
import t0.b;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f2928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f2929e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f2932c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set<Class<? extends s0.a<?>>> f2931b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<Class<?>, Object> f2930a = new HashMap();

    a(Context context) {
        this.f2932c = context.getApplicationContext();
    }

    private <T> T c(Class<? extends s0.a<?>> cls, Set<Class<?>> set) {
        T t7;
        if (b.h()) {
            try {
                b.c(cls.getSimpleName());
            } finally {
                b.f();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f2930a.containsKey(cls)) {
            t7 = (T) this.f2930a.get(cls);
        } else {
            set.add(cls);
            try {
                s0.a<?> aVarNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends s0.a<?>>> listA = aVarNewInstance.a();
                if (!listA.isEmpty()) {
                    for (Class<? extends s0.a<?>> cls2 : listA) {
                        if (!this.f2930a.containsKey(cls2)) {
                            c(cls2, set);
                        }
                    }
                }
                t7 = (T) aVarNewInstance.b(this.f2932c);
                set.remove(cls);
                this.f2930a.put(cls, t7);
            } catch (Throwable th) {
                throw new c(th);
            }
        }
        return t7;
    }

    public static a d(Context context) {
        if (f2928d == null) {
            synchronized (f2929e) {
                if (f2928d == null) {
                    f2928d = new a(context);
                }
            }
        }
        return f2928d;
    }

    void a() {
        try {
            try {
                b.c("Startup");
                b(this.f2932c.getPackageManager().getProviderInfo(new ComponentName(this.f2932c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e8) {
                throw new c(e8);
            }
        } finally {
            b.f();
        }
    }

    void b(Bundle bundle) {
        String string = this.f2932c.getString(s0.b.f26141a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (s0.a.class.isAssignableFrom(cls)) {
                            this.f2931b.add((Class<? extends s0.a<?>>) cls);
                        }
                    }
                }
                Iterator<Class<? extends s0.a<?>>> it = this.f2931b.iterator();
                while (it.hasNext()) {
                    c(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e8) {
                throw new c(e8);
            }
        }
    }

    public boolean e(Class<? extends s0.a<?>> cls) {
        return this.f2931b.contains(cls);
    }
}
