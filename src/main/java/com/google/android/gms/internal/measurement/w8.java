package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.l8;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
abstract class w8<T extends l8> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f19299a = Logger.getLogger(h8.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f19300b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    w8() {
    }

    static <T extends l8> T b(Class<T> cls) {
        String str;
        ClassLoader classLoader = w8.class.getClassLoader();
        if (cls.equals(l8.class)) {
            str = f19300b;
        } else {
            if (!cls.getPackage().equals(w8.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return cls.cast(((w8) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
                    } catch (InstantiationException e8) {
                        throw new IllegalStateException(e8);
                    } catch (NoSuchMethodException e9) {
                        throw new IllegalStateException(e9);
                    }
                } catch (InvocationTargetException e10) {
                    throw new IllegalStateException(e10);
                }
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(w8.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((w8) it.next()).a()));
                } catch (ServiceConfigurationError e12) {
                    f19299a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load " + cls.getSimpleName(), (Throwable) e12);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e13) {
                throw new IllegalStateException(e13);
            } catch (NoSuchMethodException e14) {
                throw new IllegalStateException(e14);
            } catch (InvocationTargetException e15) {
                throw new IllegalStateException(e15);
            }
        }
    }

    protected abstract T a();
}
