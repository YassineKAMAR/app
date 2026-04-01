package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes.dex */
public abstract class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f1 f18693a = new i1();

    public static synchronized f1 a() {
        return f18693a;
    }

    public abstract URLConnection b(URL url, String str);
}
