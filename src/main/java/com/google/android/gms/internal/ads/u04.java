package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
abstract class u04 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f15434a = Logger.getLogger(h04.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f15435b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    u04() {
    }

    static m04 b(Class cls) {
        String str;
        ClassLoader classLoader = u04.class.getClassLoader();
        if (cls.equals(m04.class)) {
            str = f15435b;
        } else {
            if (!cls.getPackage().equals(u04.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return (m04) cls.cast(((u04) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
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
            Iterator it = ServiceLoader.load(u04.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((m04) cls.cast(((u04) it.next()).a()));
                } catch (ServiceConfigurationError e12) {
                    f15434a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e12);
                }
            }
            if (arrayList.size() == 1) {
                return (m04) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (m04) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e13) {
                throw new IllegalStateException(e13);
            } catch (NoSuchMethodException e14) {
                throw new IllegalStateException(e14);
            } catch (InvocationTargetException e15) {
                throw new IllegalStateException(e15);
            }
        }
    }

    protected abstract m04 a();
}
