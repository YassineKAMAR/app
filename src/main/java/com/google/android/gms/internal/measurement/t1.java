package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class t1 extends z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<Bundle> f19219a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19220b;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r4 = r4.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T H0(android.os.Bundle r4, java.lang.Class<T> r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L43
            java.lang.String r1 = "r"
            java.lang.Object r4 = r4.get(r1)
            if (r4 == 0) goto L43
            java.lang.Object r4 = r5.cast(r4)     // Catch: java.lang.ClassCastException -> L10
            return r4
        L10:
            r0 = move-exception
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected object type. Expected, Received"
            r1.append(r2)
            java.lang.String r2 = ": %s, %s"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = java.lang.String.format(r1, r2)
            java.lang.String r5 = "AM"
            android.util.Log.w(r5, r4, r0)
            throw r0
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.t1.H0(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.w1
    public final void f(Bundle bundle) {
        synchronized (this.f19219a) {
            try {
                this.f19219a.set(bundle);
                this.f19220b = true;
            } finally {
                this.f19219a.notify();
            }
        }
    }

    public final Long k3(long j8) {
        return (Long) H0(v0(j8), Long.class);
    }

    public final String q3(long j8) {
        return (String) H0(v0(j8), String.class);
    }

    public final Bundle v0(long j8) {
        Bundle bundle;
        synchronized (this.f19219a) {
            if (!this.f19220b) {
                try {
                    this.f19219a.wait(j8);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f19219a.get();
        }
        return bundle;
    }
}
