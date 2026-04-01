package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bn0 extends h2.o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dj0 f5888a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f5890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f5891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h2.s2 f5893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f5894g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f5896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f5897j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f5898k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f5899l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f5900m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private dx f5901n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f5889b = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5895h = true;

    public bn0(dj0 dj0Var, float f8, boolean z7, boolean z8) {
        this.f5888a = dj0Var;
        this.f5896i = f8;
        this.f5890c = z7;
        this.f5891d = z8;
    }

    private final void V5(final int i8, final int i9, final boolean z7, final boolean z8) {
        eh0.f7326e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.an0
            @Override // java.lang.Runnable
            public final void run() {
                this.f5341a.Q5(i8, i9, z7, z8);
            }
        });
    }

    private final void W5(String str, Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        eh0.f7326e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zm0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18287a.R5(map2);
            }
        });
    }

    public final void E() {
        boolean z7;
        int i8;
        synchronized (this.f5889b) {
            z7 = this.f5895h;
            i8 = this.f5892e;
            this.f5892e = 3;
        }
        V5(i8, 3, z7, z7);
    }

    public final void P5(float f8, float f9, int i8, boolean z7, float f10) {
        boolean z8;
        boolean z9;
        int i9;
        synchronized (this.f5889b) {
            z8 = true;
            if (f9 == this.f5896i && f10 == this.f5898k) {
                z8 = false;
            }
            this.f5896i = f9;
            this.f5897j = f8;
            z9 = this.f5895h;
            this.f5895h = z7;
            i9 = this.f5892e;
            this.f5892e = i8;
            float f11 = this.f5898k;
            this.f5898k = f10;
            if (Math.abs(f10 - f11) > 1.0E-4f) {
                this.f5888a.T().invalidate();
            }
        }
        if (z8) {
            try {
                dx dxVar = this.f5901n;
                if (dxVar != null) {
                    dxVar.m();
                }
            } catch (RemoteException e8) {
                qg0.i("#007 Could not call remote method.", e8);
            }
        }
        V5(i9, i8, z9, z7);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0055 A[Catch: RemoteException -> 0x003f, all -> 0x0072, TryCatch #1 {RemoteException -> 0x003f, blocks: (B:31:0x0037, B:33:0x003b, B:37:0x0043, B:39:0x0047, B:41:0x004c, B:43:0x0050, B:45:0x0055, B:47:0x0059, B:48:0x005c, B:50:0x0063, B:52:0x0067), top: B:62:0x0037, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0070 A[Catch: all -> 0x0072, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x0003, B:29:0x0033, B:31:0x0037, B:33:0x003b, B:37:0x0043, B:39:0x0047, B:41:0x004c, B:43:0x0050, B:45:0x0055, B:47:0x0059, B:48:0x005c, B:50:0x0063, B:52:0x0067, B:55:0x0070, B:54:0x006b), top: B:60:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void Q5(int r8, int r9, boolean r10, boolean r11) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f5889b
            monitor-enter(r0)
            boolean r1 = r7.f5894g     // Catch: java.lang.Throwable -> L72
            r2 = 0
            r3 = 1
            if (r1 != 0) goto Lf
            if (r9 != r3) goto Lf
            r9 = 1
            r4 = 1
            r5 = 1
            goto L11
        Lf:
            r4 = r9
            r5 = 0
        L11:
            if (r8 == r9) goto L15
            r8 = 1
            goto L16
        L15:
            r8 = 0
        L16:
            if (r8 == 0) goto L1d
            if (r4 != r3) goto L1d
            r9 = 1
            r4 = 1
            goto L1e
        L1d:
            r9 = 0
        L1e:
            if (r8 == 0) goto L25
            r6 = 2
            if (r4 != r6) goto L25
            r6 = 1
            goto L26
        L25:
            r6 = 0
        L26:
            if (r8 == 0) goto L2d
            r8 = 3
            if (r4 != r8) goto L2d
            r8 = 1
            goto L2e
        L2d:
            r8 = 0
        L2e:
            if (r1 != 0) goto L32
            if (r5 == 0) goto L33
        L32:
            r2 = 1
        L33:
            r7.f5894g = r2     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L41
            h2.s2 r1 = r7.f5893f     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            if (r1 == 0) goto L41
            r1.r()     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            goto L41
        L3f:
            r8 = move-exception
            goto L6b
        L41:
            if (r9 == 0) goto L4a
            h2.s2 r9 = r7.f5893f     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            if (r9 == 0) goto L4a
            r9.o()     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
        L4a:
            if (r6 == 0) goto L53
            h2.s2 r9 = r7.f5893f     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            if (r9 == 0) goto L53
            r9.q()     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
        L53:
            if (r8 == 0) goto L61
            h2.s2 r8 = r7.f5893f     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            if (r8 == 0) goto L5c
            r8.m()     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
        L5c:
            com.google.android.gms.internal.ads.dj0 r8 = r7.f5888a     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            r8.J()     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
        L61:
            if (r10 == r11) goto L70
            h2.s2 r8 = r7.f5893f     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            if (r8 == 0) goto L70
            r8.C0(r11)     // Catch: android.os.RemoteException -> L3f java.lang.Throwable -> L72
            goto L70
        L6b:
            java.lang.String r9 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.qg0.i(r9, r8)     // Catch: java.lang.Throwable -> L72
        L70:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L72
            return
        L72:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L72
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bn0.Q5(int, int, boolean, boolean):void");
    }

    final /* synthetic */ void R5(Map map) {
        this.f5888a.U("pubVideoCmd", map);
    }

    public final void S5(h2.k4 k4Var) {
        Object obj = this.f5889b;
        boolean z7 = k4Var.f22215a;
        boolean z8 = k4Var.f22216b;
        boolean z9 = k4Var.f22217c;
        synchronized (obj) {
            this.f5899l = z8;
            this.f5900m = z9;
        }
        W5("initialState", e3.f.c("muteStart", true != z7 ? "0" : "1", "customControlsRequested", true != z8 ? "0" : "1", "clickToExpandRequested", true != z9 ? "0" : "1"));
    }

    public final void T5(float f8) {
        synchronized (this.f5889b) {
            this.f5897j = f8;
        }
    }

    public final void U5(dx dxVar) {
        synchronized (this.f5889b) {
            this.f5901n = dxVar;
        }
    }

    @Override // h2.p2
    public final float m() {
        float f8;
        synchronized (this.f5889b) {
            f8 = this.f5898k;
        }
        return f8;
    }

    @Override // h2.p2
    public final float n() {
        float f8;
        synchronized (this.f5889b) {
            f8 = this.f5897j;
        }
        return f8;
    }

    @Override // h2.p2
    public final void n0(boolean z7) {
        W5(true != z7 ? "unmute" : "mute", null);
    }

    @Override // h2.p2
    public final int o() {
        int i8;
        synchronized (this.f5889b) {
            i8 = this.f5892e;
        }
        return i8;
    }

    @Override // h2.p2
    public final float q() {
        float f8;
        synchronized (this.f5889b) {
            f8 = this.f5896i;
        }
        return f8;
    }

    @Override // h2.p2
    public final h2.s2 r() {
        h2.s2 s2Var;
        synchronized (this.f5889b) {
            s2Var = this.f5893f;
        }
        return s2Var;
    }

    @Override // h2.p2
    public final void s() {
        W5("pause", null);
    }

    @Override // h2.p2
    public final void u() {
        W5("play", null);
    }

    @Override // h2.p2
    public final void v() {
        W5("stop", null);
    }

    @Override // h2.p2
    public final boolean w() {
        boolean z7;
        Object obj = this.f5889b;
        boolean zY = y();
        synchronized (obj) {
            z7 = false;
            if (!zY) {
                try {
                    if (this.f5900m && this.f5891d) {
                        z7 = true;
                    }
                } finally {
                }
            }
        }
        return z7;
    }

    @Override // h2.p2
    public final void x4(h2.s2 s2Var) {
        synchronized (this.f5889b) {
            this.f5893f = s2Var;
        }
    }

    @Override // h2.p2
    public final boolean y() {
        boolean z7;
        synchronized (this.f5889b) {
            z7 = false;
            if (this.f5890c && this.f5899l) {
                z7 = true;
            }
        }
        return z7;
    }

    @Override // h2.p2
    public final boolean z() {
        boolean z7;
        synchronized (this.f5889b) {
            z7 = this.f5895h;
        }
        return z7;
    }
}
