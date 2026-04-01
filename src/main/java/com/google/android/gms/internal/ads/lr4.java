package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class lr4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fr4 f11020d = new fr4(0, -9223372036854775807L, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fr4 f11021e = new fr4(1, -9223372036854775807L, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final fr4 f11022f = new fr4(2, -9223372036854775807L, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final fr4 f11023g = new fr4(3, -9223372036854775807L, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f11024a = nz2.c("ExoPlayer:Loader:ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gr4 f11025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IOException f11026c;

    public lr4(String str) {
    }

    public static fr4 b(boolean z7, long j8) {
        return new fr4(z7 ? 1 : 0, j8, null);
    }

    public final long a(hr4 hr4Var, dr4 dr4Var, int i8) {
        Looper looperMyLooper = Looper.myLooper();
        uu1.b(looperMyLooper);
        this.f11026c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new gr4(this, looperMyLooper, hr4Var, dr4Var, i8, jElapsedRealtime).c(0L);
        return jElapsedRealtime;
    }

    public final void g() {
        gr4 gr4Var = this.f11025b;
        uu1.b(gr4Var);
        gr4Var.a(false);
    }

    public final void h() {
        this.f11026c = null;
    }

    public final void i(int i8) throws IOException {
        IOException iOException = this.f11026c;
        if (iOException != null) {
            throw iOException;
        }
        gr4 gr4Var = this.f11025b;
        if (gr4Var != null) {
            gr4Var.b(i8);
        }
    }

    public final void j(ir4 ir4Var) {
        gr4 gr4Var = this.f11025b;
        if (gr4Var != null) {
            gr4Var.a(true);
        }
        this.f11024a.execute(new jr4(ir4Var));
        this.f11024a.shutdown();
    }

    public final boolean k() {
        return this.f11026c != null;
    }

    public final boolean l() {
        return this.f11025b != null;
    }
}
