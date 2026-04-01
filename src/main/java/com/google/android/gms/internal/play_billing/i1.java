package com.google.android.gms.internal.play_billing;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
abstract class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f19572a = Logger.getLogger(v0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f19573b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    i1() {
    }

    static a1 b(Class cls) {
        String str;
        ClassLoader classLoader = i1.class.getClassLoader();
        if (cls.equals(a1.class)) {
            str = f19573b;
        } else {
            if (!cls.getPackage().equals(i1.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return (a1) cls.cast(((i1) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
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
            Iterator it = ServiceLoader.load(i1.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((a1) cls.cast(((i1) it.next()).a()));
                } catch (ServiceConfigurationError e12) {
                    f19572a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e12);
                }
            }
            if (arrayList.size() == 1) {
                return (a1) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (a1) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e13) {
                throw new IllegalStateException(e13);
            } catch (NoSuchMethodException e14) {
                throw new IllegalStateException(e14);
            } catch (InvocationTargetException e15) {
                throw new IllegalStateException(e15);
            }
        }
    }

    protected abstract a1 a();
}
