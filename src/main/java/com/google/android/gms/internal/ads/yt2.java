package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class yt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static s3.h f17923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static u2.b f17924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f17925c = new Object();

    public static s3.h a(Context context) {
        s3.h hVar;
        b(context, false);
        synchronized (f17925c) {
            hVar = f17923a;
        }
        return hVar;
    }

    public static void b(Context context, boolean z7) {
        synchronized (f17925c) {
            if (f17924b == null) {
                f17924b = u2.a.a(context);
            }
            s3.h hVar = f17923a;
            if (hVar == null || ((hVar.l() && !f17923a.m()) || (z7 && f17923a.l()))) {
                f17923a = ((u2.b) a3.o.k(f17924b, "the appSetIdClient shouldn't be null")).a();
            }
        }
    }
}
