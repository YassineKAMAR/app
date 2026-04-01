package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class a84 {
    public static a84 b(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new v74(cls.getSimpleName()) : new x74(cls.getSimpleName());
    }

    public abstract void a(String str);
}
