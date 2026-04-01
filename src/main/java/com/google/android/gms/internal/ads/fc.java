package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class fc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f7715c = gc.f8287b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f7716a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7717b = false;

    fc() {
    }

    public final synchronized void a(String str, long j8) {
        if (this.f7717b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f7716a.add(new ec(str, j8, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        long j8;
        this.f7717b = true;
        if (this.f7716a.size() == 0) {
            j8 = 0;
        } else {
            j8 = ((ec) this.f7716a.get(r1.size() - 1)).f7261c - ((ec) this.f7716a.get(0)).f7261c;
        }
        if (j8 <= 0) {
            return;
        }
        long j9 = ((ec) this.f7716a.get(0)).f7261c;
        gc.a("(%-4d ms) %s", Long.valueOf(j8), str);
        for (ec ecVar : this.f7716a) {
            long j10 = ecVar.f7261c;
            gc.a("(+%-4d) [%2d] %s", Long.valueOf(j10 - j9), Long.valueOf(ecVar.f7260b), ecVar.f7259a);
            j9 = j10;
        }
    }

    protected final void finalize() {
        if (this.f7717b) {
            return;
        }
        b("Request on the loose");
        gc.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
