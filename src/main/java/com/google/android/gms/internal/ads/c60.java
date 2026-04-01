package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class c60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashSet f6184a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f6185b = "media3.common";

    public static synchronized String a() {
        return f6185b;
    }

    public static synchronized void b(String str) {
        if (f6184a.add(str)) {
            f6185b = f6185b + ", " + str;
        }
    }
}
