package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class xi4 implements oh4 {
    private static final Object X = new Object();
    private static ExecutorService Y;
    private static int Z;
    private long A;
    private int B;
    private boolean C;
    private boolean D;
    private long E;
    private float F;
    private ByteBuffer G;
    private int H;
    private ByteBuffer I;
    private byte[] J;
    private int K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private int P;
    private ad4 Q;
    private ei4 R;
    private long S;
    private boolean T;
    private boolean U;
    private final ji4 V;
    private final yh4 W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final th4 f17245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hj4 f17246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jb3 f17247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jb3 f17248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final yx1 f17249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final sh4 f17250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f17251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ui4 f17252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ni4 f17253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ni4 f17254j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final fi4 f17255k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private pg4 f17256l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private lh4 f17257m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ii4 f17258n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ii4 f17259o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private kk1 f17260p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AudioTrack f17261q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private sg4 f17262r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private zb4 f17263s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private mi4 f17264t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private mi4 f17265u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private dm0 f17266v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f17267w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f17268x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f17269y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f17270z;

    /* synthetic */ xi4(gi4 gi4Var, vi4 vi4Var) {
        this.f17262r = gi4Var.f8357a;
        this.V = gi4Var.f8360d;
        int i8 = nz2.f12300a;
        this.f17255k = gi4Var.f8359c;
        yh4 yh4Var = gi4Var.f8361e;
        yh4Var.getClass();
        this.W = yh4Var;
        yx1 yx1Var = new yx1(vv1.f16482a);
        this.f17249e = yx1Var;
        yx1Var.e();
        this.f17250f = new sh4(new pi4(this, null));
        th4 th4Var = new th4();
        this.f17245a = th4Var;
        hj4 hj4Var = new hj4();
        this.f17246b = hj4Var;
        this.f17247c = jb3.C(new rr1(), th4Var, hj4Var);
        this.f17248d = jb3.A(new gj4());
        this.F = 1.0f;
        this.f17263s = zb4.f18139c;
        this.P = 0;
        this.Q = new ad4(0, 0.0f);
        dm0 dm0Var = dm0.f6807d;
        this.f17265u = new mi4(dm0Var, 0L, 0L, null);
        this.f17266v = dm0Var;
        this.f17267w = false;
        this.f17251g = new ArrayDeque();
        this.f17253i = new ni4(100L);
        this.f17254j = new ni4(100L);
    }

    static /* synthetic */ void E(AudioTrack audioTrack, yx1 yx1Var) {
        try {
            audioTrack.flush();
            audioTrack.release();
            yx1Var.e();
            synchronized (X) {
                int i8 = Z - 1;
                Z = i8;
                if (i8 == 0) {
                    Y.shutdown();
                    Y = null;
                }
            }
        } catch (Throwable th) {
            yx1Var.e();
            synchronized (X) {
                int i9 = Z - 1;
                Z = i9;
                if (i9 == 0) {
                    Y.shutdown();
                    Y = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long G() {
        ii4 ii4Var = this.f17259o;
        return ii4Var.f9233c == 0 ? this.f17268x / ((long) ii4Var.f9232b) : this.f17269y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long H() {
        ii4 ii4Var = this.f17259o;
        if (ii4Var.f9233c != 0) {
            return this.A;
        }
        long j8 = this.f17270z;
        long j9 = ii4Var.f9234d;
        int i8 = nz2.f12300a;
        return ((j8 + j9) - 1) / j9;
    }

    private final AudioTrack I(ii4 ii4Var) throws kh4 {
        try {
            return ii4Var.a(false, this.f17263s, this.P);
        } catch (kh4 e8) {
            lh4 lh4Var = this.f17257m;
            if (lh4Var != null) {
                lh4Var.a(e8);
            }
            throw e8;
        }
    }

    private final void J(long j8) {
        dm0 dm0Var;
        boolean z7;
        if (U()) {
            ji4 ji4Var = this.V;
            dm0Var = this.f17266v;
            ji4Var.c(dm0Var);
        } else {
            dm0Var = dm0.f6807d;
        }
        dm0 dm0Var2 = dm0Var;
        this.f17266v = dm0Var2;
        if (U()) {
            ji4 ji4Var2 = this.V;
            z7 = this.f17267w;
            ji4Var2.d(z7);
        } else {
            z7 = false;
        }
        this.f17267w = z7;
        ArrayDeque arrayDeque = this.f17251g;
        long jMax = Math.max(0L, j8);
        ii4 ii4Var = this.f17259o;
        long jH = H();
        int i8 = ii4Var.f9235e;
        int i9 = nz2.f12300a;
        arrayDeque.add(new mi4(dm0Var2, jMax, (jH * 1000000) / ((long) i8), null));
        P();
        lh4 lh4Var = this.f17257m;
        if (lh4Var != null) {
            ((cj4) lh4Var).f6382a.P0.s(this.f17267w);
        }
    }

    private final void L() {
        if (this.M) {
            return;
        }
        this.M = true;
        this.f17250f.c(H());
        this.f17261q.stop();
    }

    private final void M(long j8) throws Exception {
        ByteBuffer byteBufferB;
        if (!this.f17260p.h()) {
            ByteBuffer byteBuffer = this.G;
            if (byteBuffer == null) {
                byteBuffer = nn1.f11925a;
            }
            Q(byteBuffer, j8);
            return;
        }
        while (!this.f17260p.g()) {
            do {
                byteBufferB = this.f17260p.b();
                if (byteBufferB.hasRemaining()) {
                    Q(byteBufferB, j8);
                } else {
                    ByteBuffer byteBuffer2 = this.G;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f17260p.e(this.G);
                    }
                }
            } while (!byteBufferB.hasRemaining());
            return;
        }
    }

    private final void N(dm0 dm0Var) {
        long j8 = -9223372036854775807L;
        mi4 mi4Var = new mi4(dm0Var, j8, j8, null);
        if (S()) {
            this.f17264t = mi4Var;
        } else {
            this.f17265u = mi4Var;
        }
    }

    private final void O() {
        if (S()) {
            if (nz2.f12300a >= 21) {
                this.f17261q.setVolume(this.F);
                return;
            }
            AudioTrack audioTrack = this.f17261q;
            float f8 = this.F;
            audioTrack.setStereoVolume(f8, f8);
        }
    }

    private final void P() {
        kk1 kk1Var = this.f17259o.f9239i;
        this.f17260p = kk1Var;
        kk1Var.c();
    }

    private final void Q(ByteBuffer byteBuffer, long j8) throws Exception {
        int iWrite;
        lh4 lh4Var;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.I;
            if (byteBuffer2 != null) {
                uu1.d(byteBuffer2 == byteBuffer);
            } else {
                this.I = byteBuffer;
                if (nz2.f12300a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.J;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.J = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.J, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.K = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i8 = nz2.f12300a;
            if (i8 < 21) {
                int iA = this.f17250f.a(this.f17270z);
                if (iA > 0) {
                    iWrite = this.f17261q.write(this.J, this.K, Math.min(iRemaining2, iA));
                    if (iWrite > 0) {
                        this.K += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
            } else {
                iWrite = this.f17261q.write(byteBuffer, iRemaining2, 1);
            }
            this.S = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                nh4 nh4Var = new nh4(iWrite, this.f17259o.f9231a, ((i8 >= 24 && iWrite == -6) || iWrite == -32) && H() > 0);
                lh4 lh4Var2 = this.f17257m;
                if (lh4Var2 != null) {
                    lh4Var2.a(nh4Var);
                }
                if (nh4Var.f11887b) {
                    this.f17262r = sg4.f14656c;
                    throw nh4Var;
                }
                this.f17254j.b(nh4Var);
                return;
            }
            this.f17254j.a();
            if (T(this.f17261q)) {
                if (this.A > 0) {
                    this.U = false;
                }
                if (this.N && (lh4Var = this.f17257m) != null && iWrite < iRemaining2) {
                    dj4 dj4Var = ((cj4) lh4Var).f6382a;
                    if (dj4Var.Y0 != null) {
                        dj4Var.Y0.j();
                    }
                }
            }
            int i9 = this.f17259o.f9233c;
            if (i9 == 0) {
                this.f17270z += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i9 != 0) {
                    uu1.f(byteBuffer == this.G);
                    this.A += ((long) this.B) * ((long) this.H);
                }
                this.I = null;
            }
        }
    }

    private final boolean R() throws Exception {
        if (!this.f17260p.h()) {
            ByteBuffer byteBuffer = this.I;
            if (byteBuffer == null) {
                return true;
            }
            Q(byteBuffer, Long.MIN_VALUE);
            return this.I == null;
        }
        this.f17260p.d();
        M(Long.MIN_VALUE);
        if (!this.f17260p.g()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.I;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    private final boolean S() {
        return this.f17261q != null;
    }

    private static boolean T(AudioTrack audioTrack) {
        return nz2.f12300a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean U() {
        ii4 ii4Var = this.f17259o;
        if (ii4Var.f9233c != 0) {
            return false;
        }
        int i8 = ii4Var.f9231a.A;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final boolean D() {
        return S() && this.f17250f.h(H());
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final boolean K() {
        return !S() || (this.L && !D());
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final void a(int i8) {
        if (this.P != i8) {
            this.P = i8;
            this.O = i8 != 0;
            n();
        }
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final int b(nb nbVar) {
        if (!"audio/raw".equals(nbVar.f11793l)) {
            return this.f17262r.a(nbVar) != null ? 2 : 0;
        }
        boolean zF = nz2.f(nbVar.A);
        int i8 = nbVar.A;
        if (zF) {
            return i8 != 2 ? 1 : 2;
        }
        pf2.f("DefaultAudioSink", "Invalid PCM encoding: " + i8);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final long c(boolean z7) {
        long jA;
        if (!S() || this.D) {
            return Long.MIN_VALUE;
        }
        long jB = this.f17250f.b(z7);
        ii4 ii4Var = this.f17259o;
        long jH = H();
        int i8 = ii4Var.f9235e;
        int i9 = nz2.f12300a;
        long jMin = Math.min(jB, (jH * 1000000) / ((long) i8));
        while (!this.f17251g.isEmpty() && jMin >= ((mi4) this.f17251g.getFirst()).f11323c) {
            this.f17265u = (mi4) this.f17251g.remove();
        }
        mi4 mi4Var = this.f17265u;
        long j8 = jMin - mi4Var.f11323c;
        if (mi4Var.f11321a.equals(dm0.f6807d)) {
            jA = this.f17265u.f11322b + j8;
        } else if (this.f17251g.isEmpty()) {
            jA = this.V.a(j8) + this.f17265u.f11322b;
        } else {
            mi4 mi4Var2 = (mi4) this.f17251g.getFirst();
            jA = mi4Var2.f11322b - nz2.A(mi4Var2.f11323c - jMin, this.f17265u.f11321a.f6811a);
        }
        ii4 ii4Var2 = this.f17259o;
        return jA + ((this.V.b() * 1000000) / ((long) ii4Var2.f9235e));
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final void d(pg4 pg4Var) {
        this.f17256l = pg4Var;
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final void e(boolean z7) {
        this.f17267w = z7;
        N(this.f17266v);
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final void f(vv1 vv1Var) {
        this.f17250f.f(vv1Var);
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final void g(float f8) {
        if (this.F != f8) {
            this.F = f8;
            O();
        }
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final boolean h(nb nbVar) {
        return b(nbVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final void i(int i8, int i9) {
        AudioTrack audioTrack = this.f17261q;
        if (audioTrack != null) {
            T(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final void j(AudioDeviceInfo audioDeviceInfo) {
        ei4 ei4Var = audioDeviceInfo == null ? null : new ei4(audioDeviceInfo);
        this.R = ei4Var;
        AudioTrack audioTrack = this.f17261q;
        if (audioTrack != null) {
            bi4.a(audioTrack, ei4Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final void k(zb4 zb4Var) {
        if (this.f17263s.equals(zb4Var)) {
            return;
        }
        this.f17263s = zb4Var;
        n();
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final dm0 l() {
        return this.f17266v;
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final vg4 m(nb nbVar) {
        return this.T ? vg4.f16263d : this.W.a(nbVar, this.f17263s);
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final void n() {
        if (S()) {
            this.f17268x = 0L;
            this.f17269y = 0L;
            this.f17270z = 0L;
            this.A = 0L;
            this.U = false;
            this.B = 0;
            this.f17265u = new mi4(this.f17266v, 0L, 0L, null);
            this.E = 0L;
            this.f17264t = null;
            this.f17251g.clear();
            this.G = null;
            this.H = 0;
            this.I = null;
            this.M = false;
            this.L = false;
            this.f17246b.j();
            P();
            if (this.f17250f.i()) {
                this.f17261q.pause();
            }
            if (T(this.f17261q)) {
                ui4 ui4Var = this.f17252h;
                ui4Var.getClass();
                ui4Var.b(this.f17261q);
            }
            if (nz2.f12300a < 21 && !this.O) {
                this.P = 0;
            }
            ii4 ii4Var = this.f17258n;
            if (ii4Var != null) {
                this.f17259o = ii4Var;
                this.f17258n = null;
            }
            this.f17250f.d();
            final AudioTrack audioTrack = this.f17261q;
            final yx1 yx1Var = this.f17249e;
            yx1Var.c();
            synchronized (X) {
                if (Y == null) {
                    Y = nz2.c("ExoPlayer:AudioTrackReleaseThread");
                }
                Z++;
                Y.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zh4
                    @Override // java.lang.Runnable
                    public final void run() {
                        xi4.E(audioTrack, yx1Var);
                    }
                });
            }
            this.f17261q = null;
        }
        this.f17254j.a();
        this.f17253i.a();
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final void o() {
        this.N = false;
        if (S() && this.f17250f.l()) {
            this.f17261q.pause();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x039a A[Catch: kh4 -> 0x039e, TryCatch #3 {kh4 -> 0x039e, blocks: (B:36:0x0071, B:49:0x00c0, B:51:0x00c8, B:53:0x00ce, B:54:0x00d5, B:55:0x00de, B:57:0x00e2, B:59:0x00e6, B:60:0x00eb, B:64:0x0101, B:68:0x0119, B:69:0x011e, B:45:0x0086, B:47:0x008f, B:187:0x0392, B:189:0x039a, B:190:0x039d, B:39:0x007a, B:41:0x007f), top: B:204:0x0071, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[Catch: kh4 -> 0x039e, SYNTHETIC, TRY_LEAVE, TryCatch #3 {kh4 -> 0x039e, blocks: (B:36:0x0071, B:49:0x00c0, B:51:0x00c8, B:53:0x00ce, B:54:0x00d5, B:55:0x00de, B:57:0x00e2, B:59:0x00e6, B:60:0x00eb, B:64:0x0101, B:68:0x0119, B:69:0x011e, B:45:0x0086, B:47:0x008f, B:187:0x0392, B:189:0x039a, B:190:0x039d, B:39:0x007a, B:41:0x007f), top: B:204:0x0071, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.oh4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(java.nio.ByteBuffer r27, long r28, int r30) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xi4.p(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final void q() {
        this.C = true;
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final void r() {
        this.N = true;
        if (S()) {
            this.f17250f.g();
            this.f17261q.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final void s() {
        n();
        jb3 jb3Var = this.f17247c;
        int size = jb3Var.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((nn1) jb3Var.get(i8)).n();
        }
        jb3 jb3Var2 = this.f17248d;
        int size2 = jb3Var2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            ((nn1) jb3Var2.get(i9)).n();
        }
        kk1 kk1Var = this.f17260p;
        if (kk1Var != null) {
            kk1Var.f();
        }
        this.N = false;
        this.T = false;
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final void t() {
        if (!this.L && S() && R()) {
            L();
            this.L = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    @Override // com.google.android.gms.internal.ads.oh4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(com.google.android.gms.internal.ads.nb r19, int r20, int[] r21) throws com.google.android.gms.internal.ads.jh4 {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xi4.u(com.google.android.gms.internal.ads.nb, int, int[]):void");
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final void v(lh4 lh4Var) {
        this.f17257m = lh4Var;
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final void w(ad4 ad4Var) {
        if (this.Q.equals(ad4Var)) {
            return;
        }
        if (this.f17261q != null) {
            int i8 = this.Q.f5223a;
        }
        this.Q = ad4Var;
    }

    @Override // com.google.android.gms.internal.ads.oh4
    public final void x(dm0 dm0Var) {
        this.f17266v = new dm0(Math.max(0.1f, Math.min(dm0Var.f6811a, 8.0f)), Math.max(0.1f, Math.min(dm0Var.f6812b, 8.0f)));
        N(dm0Var);
    }
}
