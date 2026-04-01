package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
final class ni4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Exception f11898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f11899b;

    public ni4(long j8) {
    }

    public final void a() {
        this.f11898a = null;
    }

    public final void b(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f11898a == null) {
            this.f11898a = exc;
            this.f11899b = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.f11899b) {
            Exception exc2 = this.f11898a;
            if (exc2 != exc) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(exc2, exc);
                } catch (Exception unused) {
                }
            }
            Exception exc3 = this.f11898a;
            this.f11898a = null;
            throw exc3;
        }
    }
}
