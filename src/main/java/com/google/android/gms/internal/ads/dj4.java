package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dj4 extends xk4 implements tc4 {
    private final Context O0;
    private final hh4 P0;
    private final oh4 Q0;
    private int R0;
    private boolean S0;
    private nb T0;
    private nb U0;
    private long V0;
    private boolean W0;
    private boolean X0;
    private rd4 Y0;

    public dj4(Context context, mk4 mk4Var, zk4 zk4Var, boolean z7, Handler handler, ih4 ih4Var, oh4 oh4Var) {
        super(1, mk4Var, zk4Var, false, 44100.0f);
        this.O0 = context.getApplicationContext();
        this.Q0 = oh4Var;
        this.P0 = new hh4(handler, ih4Var);
        oh4Var.v(new cj4(this, null));
    }

    private final int X0(rk4 rk4Var, nb nbVar) {
        int i8;
        if (!"OMX.google.raw.decoder".equals(rk4Var.f14176a) || (i8 = nz2.f12300a) >= 24 || (i8 == 23 && nz2.h(this.O0))) {
            return nbVar.f11794m;
        }
        return -1;
    }

    private static List Y0(zk4 zk4Var, nb nbVar, boolean z7, oh4 oh4Var) {
        rk4 rk4VarD;
        return nbVar.f11793l == null ? jb3.z() : (!oh4Var.h(nbVar) || (rk4VarD = ql4.d()) == null) ? ql4.h(zk4Var, nbVar, false, false) : jb3.A(rk4VarD);
    }

    private final void m0() {
        long jC = this.Q0.c(i());
        if (jC != Long.MIN_VALUE) {
            if (!this.W0) {
                jC = Math.max(this.V0, jC);
            }
            this.V0 = jC;
            this.W0 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final List A0(zk4 zk4Var, nb nbVar, boolean z7) {
        return ql4.i(Y0(zk4Var, nbVar, false, this.Q0), nbVar);
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final void B0(q94 q94Var) {
        nb nbVar;
        if (nz2.f12300a < 29 || (nbVar = q94Var.f13360b) == null) {
            return;
        }
        String str = nbVar.f11793l;
        if ((str == "audio/opus" || (str != null && str.equals("audio/opus"))) && g0()) {
            ByteBuffer byteBuffer = q94Var.f13365g;
            byteBuffer.getClass();
            nb nbVar2 = q94Var.f13360b;
            nbVar2.getClass();
            if (byteBuffer.remaining() == 8) {
                this.Q0.i(nbVar2.B, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final void C0(Exception exc) {
        pf2.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.P0.a(exc);
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final void D0(String str, lk4 lk4Var, long j8, long j9) {
        this.P0.c(str, j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final void E0(String str) {
        this.P0.d(str);
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final void F0(nb nbVar, MediaFormat mediaFormat) throws ja4 {
        int i8;
        nb nbVar2 = this.U0;
        int[] iArr = null;
        if (nbVar2 != null) {
            nbVar = nbVar2;
        } else if (O0() != null) {
            mediaFormat.getClass();
            int iW = "audio/raw".equals(nbVar.f11793l) ? nbVar.A : (nz2.f12300a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? nz2.w(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            l9 l9Var = new l9();
            l9Var.u("audio/raw");
            l9Var.p(iW);
            l9Var.e(nbVar.B);
            l9Var.f(nbVar.C);
            l9Var.o(nbVar.f11791j);
            l9Var.j(nbVar.f11782a);
            l9Var.l(nbVar.f11783b);
            l9Var.m(nbVar.f11784c);
            l9Var.w(nbVar.f11785d);
            l9Var.k0(mediaFormat.getInteger("channel-count"));
            l9Var.v(mediaFormat.getInteger("sample-rate"));
            nb nbVarD = l9Var.D();
            if (this.S0 && nbVarD.f11806y == 6 && (i8 = nbVar.f11806y) < 6) {
                iArr = new int[i8];
                for (int i9 = 0; i9 < nbVar.f11806y; i9++) {
                    iArr[i9] = i9;
                }
            }
            nbVar = nbVarD;
        }
        try {
            int i10 = nz2.f12300a;
            if (i10 >= 29) {
                if (g0()) {
                    S();
                }
                uu1.f(i10 >= 29);
            }
            this.Q0.u(nbVar, 0, iArr);
        } catch (jh4 e8) {
            throw P(e8, e8.f9629a, false, 5001);
        }
    }

    protected final void G0() {
        this.W0 = true;
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final void H0() {
        this.Q0.q();
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final void I0() throws ja4 {
        try {
            this.Q0.t();
        } catch (nh4 e8) {
            throw P(e8, e8.f11888c, e8.f11887b, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final boolean J0(long j8, long j9, nk4 nk4Var, ByteBuffer byteBuffer, int i8, int i9, int i10, long j10, boolean z7, boolean z8, nb nbVar) throws ja4 {
        byteBuffer.getClass();
        if (this.U0 != null && (i9 & 2) != 0) {
            nk4Var.getClass();
            nk4Var.i(i8, false);
            return true;
        }
        if (z7) {
            if (nk4Var != null) {
                nk4Var.i(i8, false);
            }
            this.H0.f5686f += i10;
            this.Q0.q();
            return true;
        }
        try {
            if (!this.Q0.p(byteBuffer, j10, i10)) {
                return false;
            }
            if (nk4Var != null) {
                nk4Var.i(i8, false);
            }
            this.H0.f5685e += i10;
            return true;
        } catch (kh4 e8) {
            throw P(e8, this.T0, e8.f10084b, 5001);
        } catch (nh4 e9) {
            throw P(e9, nbVar, e9.f11887b, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final boolean K0(nb nbVar) {
        S();
        return this.Q0.h(nbVar);
    }

    @Override // com.google.android.gms.internal.ads.xk4, com.google.android.gms.internal.ads.aa4
    protected final void U() {
        this.X0 = true;
        this.T0 = null;
        try {
            this.Q0.n();
            try {
                super.U();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.U();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xk4, com.google.android.gms.internal.ads.aa4
    protected final void V(boolean z7, boolean z8) {
        super.V(z7, z8);
        this.P0.f(this.H0);
        S();
        this.Q0.d(T());
        this.Q0.f(O());
    }

    @Override // com.google.android.gms.internal.ads.xk4, com.google.android.gms.internal.ads.aa4
    protected final void W(long j8, boolean z7) {
        super.W(j8, z7);
        this.Q0.n();
        this.V0 = j8;
        this.W0 = true;
    }

    @Override // com.google.android.gms.internal.ads.aa4
    protected final void Y() {
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final float Z(float f8, nb nbVar, nb[] nbVarArr) {
        int iMax = -1;
        for (nb nbVar2 : nbVarArr) {
            int i8 = nbVar2.f11807z;
            if (i8 != -1) {
                iMax = Math.max(iMax, i8);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f8;
    }

    @Override // com.google.android.gms.internal.ads.aa4, com.google.android.gms.internal.ads.nd4
    public final void a(int i8, Object obj) {
        if (i8 == 2) {
            oh4 oh4Var = this.Q0;
            obj.getClass();
            oh4Var.g(((Float) obj).floatValue());
            return;
        }
        if (i8 == 3) {
            zb4 zb4Var = (zb4) obj;
            oh4 oh4Var2 = this.Q0;
            zb4Var.getClass();
            oh4Var2.k(zb4Var);
            return;
        }
        if (i8 == 6) {
            ad4 ad4Var = (ad4) obj;
            oh4 oh4Var3 = this.Q0;
            ad4Var.getClass();
            oh4Var3.w(ad4Var);
            return;
        }
        switch (i8) {
            case 9:
                oh4 oh4Var4 = this.Q0;
                obj.getClass();
                oh4Var4.e(((Boolean) obj).booleanValue());
                break;
            case R.styleable.GradientColor_android_endX /* 10 */:
                oh4 oh4Var5 = this.Q0;
                obj.getClass();
                oh4Var5.a(((Integer) obj).intValue());
                break;
            case R.styleable.GradientColor_android_endY /* 11 */:
                this.Y0 = (rd4) obj;
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                if (nz2.f12300a >= 23) {
                    aj4.a(this.Q0, obj);
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    @Override // com.google.android.gms.internal.ads.xk4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final int a0(com.google.android.gms.internal.ads.zk4 r12, com.google.android.gms.internal.ads.nb r13) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dj4.a0(com.google.android.gms.internal.ads.zk4, com.google.android.gms.internal.ads.nb):int");
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final ca4 b0(rk4 rk4Var, nb nbVar, nb nbVar2) {
        int i8;
        int i9;
        ca4 ca4VarB = rk4Var.b(nbVar, nbVar2);
        int i10 = ca4VarB.f6262e;
        if (h0(nbVar2)) {
            i10 |= 32768;
        }
        if (X0(rk4Var, nbVar2) > this.R0) {
            i10 |= 64;
        }
        String str = rk4Var.f14176a;
        if (i10 != 0) {
            i9 = i10;
            i8 = 0;
        } else {
            i8 = ca4VarB.f6261d;
            i9 = 0;
        }
        return new ca4(str, nbVar, nbVar2, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.sd4, com.google.android.gms.internal.ads.ud4
    public final String c() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final ca4 c0(nc4 nc4Var) {
        nb nbVar = nc4Var.f11825a;
        nbVar.getClass();
        this.T0 = nbVar;
        ca4 ca4VarC0 = super.c0(nc4Var);
        this.P0.g(nbVar, ca4VarC0);
        return ca4VarC0;
    }

    @Override // com.google.android.gms.internal.ads.tc4
    public final void d(dm0 dm0Var) {
        this.Q0.x(dm0Var);
    }

    @Override // com.google.android.gms.internal.ads.xk4, com.google.android.gms.internal.ads.sd4
    public final boolean i() {
        return super.i() && this.Q0.K();
    }

    @Override // com.google.android.gms.internal.ads.tc4
    public final long j() {
        if (e() == 2) {
            m0();
        }
        return this.V0;
    }

    @Override // com.google.android.gms.internal.ads.tc4
    public final dm0 l() {
        return this.Q0.l();
    }

    @Override // com.google.android.gms.internal.ads.xk4, com.google.android.gms.internal.ads.sd4
    public final boolean n0() {
        return this.Q0.D() || super.n0();
    }

    @Override // com.google.android.gms.internal.ads.aa4, com.google.android.gms.internal.ads.sd4
    public final tc4 s() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.xk4, com.google.android.gms.internal.ads.aa4
    protected final void t() {
        try {
            super.t();
            if (this.X0) {
                this.X0 = false;
                this.Q0.s();
            }
        } catch (Throwable th) {
            if (this.X0) {
                this.X0 = false;
                this.Q0.s();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.aa4
    protected final void v() {
        this.Q0.r();
    }

    @Override // com.google.android.gms.internal.ads.aa4
    protected final void x() {
        m0();
        this.Q0.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    @Override // com.google.android.gms.internal.ads.xk4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.google.android.gms.internal.ads.lk4 z0(com.google.android.gms.internal.ads.rk4 r8, com.google.android.gms.internal.ads.nb r9, android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dj4.z0(com.google.android.gms.internal.ads.rk4, com.google.android.gms.internal.ads.nb, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.lk4");
    }
}
