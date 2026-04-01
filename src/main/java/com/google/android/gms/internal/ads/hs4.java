package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hs4 extends xk4 implements h {

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private static final int[] f8949t1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private static boolean f8950u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private static boolean f8951v1;
    private final Context O0;
    private final us4 P0;
    private final ur4 Q0;
    private final e R0;
    private final boolean S0;
    private ds4 T0;
    private boolean U0;
    private boolean V0;
    private Surface W0;
    private ks4 X0;
    private boolean Y0;
    private int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f8952a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private long f8953b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private long f8954c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private long f8955d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private int f8956e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private int f8957f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private int f8958g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private long f8959h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private long f8960i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private long f8961j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private int f8962k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private long f8963l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private jj1 f8964m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private jj1 f8965n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private boolean f8966o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f8967p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private int f8968q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private ls4 f8969r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private j f8970s1;

    public hs4(Context context, mk4 mk4Var, zk4 zk4Var, long j8, boolean z7, Handler handler, f fVar, int i8, float f8) {
        gs4 gs4Var = new gs4(null);
        super(2, mk4Var, zk4Var, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.O0 = applicationContext;
        this.P0 = new us4(applicationContext);
        this.R0 = new e(handler, fVar);
        this.Q0 = new ur4(context, gs4Var, this);
        this.S0 = "NVIDIA".equals(nz2.f12302c);
        this.f8954c1 = -9223372036854775807L;
        this.Z0 = 1;
        this.f8964m1 = jj1.f9649e;
        this.f8968q1 = 0;
        this.f8952a1 = 0;
        this.f8965n1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected static final boolean b1(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 2926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hs4.b1(java.lang.String):boolean");
    }

    private static List c1(Context context, zk4 zk4Var, nb nbVar, boolean z7, boolean z8) {
        String str = nbVar.f11793l;
        if (str == null) {
            return jb3.z();
        }
        if (nz2.f12300a >= 26 && "video/dolby-vision".equals(str) && !cs4.a(context)) {
            List listF = ql4.f(zk4Var, nbVar, z7, z8);
            if (!listF.isEmpty()) {
                return listF;
            }
        }
        return ql4.h(zk4Var, nbVar, z7, z8);
    }

    private final void d1(int i8) {
        this.f8952a1 = Math.min(this.f8952a1, i8);
        int i9 = nz2.f12300a;
    }

    private final void e1() {
        Surface surface = this.W0;
        if (surface == null || this.f8952a1 == 3) {
            return;
        }
        this.f8952a1 = 3;
        this.R0.q(surface);
        this.Y0 = true;
    }

    private final void f1(jj1 jj1Var) {
        if (jj1Var.equals(jj1.f9649e) || jj1Var.equals(this.f8965n1)) {
            return;
        }
        this.f8965n1 = jj1Var;
        this.R0.t(jj1Var);
    }

    private final void g1() {
        jj1 jj1Var = this.f8965n1;
        if (jj1Var != null) {
            this.R0.t(jj1Var);
        }
    }

    private final void h1() {
        Surface surface = this.W0;
        ks4 ks4Var = this.X0;
        if (surface == ks4Var) {
            this.W0 = null;
        }
        if (ks4Var != null) {
            ks4Var.release();
            this.X0 = null;
        }
    }

    private static boolean i1(long j8) {
        return j8 < -30000;
    }

    private final boolean j1(rk4 rk4Var) {
        return nz2.f12300a >= 23 && !b1(rk4Var.f14176a) && (!rk4Var.f14181f || ks4.c(this.O0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int k1(com.google.android.gms.internal.ads.rk4 r10, com.google.android.gms.internal.ads.nb r11) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hs4.k1(com.google.android.gms.internal.ads.rk4, com.google.android.gms.internal.ads.nb):int");
    }

    protected static int l1(rk4 rk4Var, nb nbVar) {
        if (nbVar.f11794m == -1) {
            return k1(rk4Var, nbVar);
        }
        int size = nbVar.f11795n.size();
        int length = 0;
        for (int i8 = 0; i8 < size; i8++) {
            length += ((byte[]) nbVar.f11795n.get(i8)).length;
        }
        return nbVar.f11794m + length;
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final List A0(zk4 zk4Var, nb nbVar, boolean z7) {
        return ql4.i(c1(this.O0, zk4Var, nbVar, false, false), nbVar);
    }

    @Override // com.google.android.gms.internal.ads.xk4
    @TargetApi(29)
    protected final void B0(q94 q94Var) {
        if (this.V0) {
            ByteBuffer byteBuffer = q94Var.f13365g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b8 = byteBuffer.get();
                short s8 = byteBuffer.getShort();
                short s9 = byteBuffer.getShort();
                byte b9 = byteBuffer.get();
                byte b10 = byteBuffer.get();
                byteBuffer.position(0);
                if (b8 == -75 && s8 == 60 && s9 == 1 && b9 == 4) {
                    if (b10 == 0 || b10 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        nk4 nk4VarO0 = O0();
                        nk4VarO0.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        nk4VarO0.V(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.aa4, com.google.android.gms.internal.ads.sd4
    public final void C() {
        if (this.f8952a1 == 0) {
            this.f8952a1 = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final void C0(Exception exc) {
        pf2.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.R0.s(exc);
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final void D0(String str, lk4 lk4Var, long j8, long j9) {
        this.R0.a(str, j8, j9);
        this.U0 = b1(str);
        rk4 rk4VarQ0 = Q0();
        rk4VarQ0.getClass();
        boolean z7 = false;
        if (nz2.f12300a >= 29 && "video/x-vnd.on2.vp9".equals(rk4VarQ0.f14177b)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrH = rk4VarQ0.h();
            int length = codecProfileLevelArrH.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                if (codecProfileLevelArrH[i8].profile == 16384) {
                    z7 = true;
                    break;
                }
                i8++;
            }
        }
        this.V0 = z7;
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final void E0(String str) {
        this.R0.b(str);
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final void F0(nb nbVar, MediaFormat mediaFormat) {
        nk4 nk4VarO0 = O0();
        if (nk4VarO0 != null) {
            nk4VarO0.h(this.Z0);
        }
        mediaFormat.getClass();
        int i8 = 0;
        boolean z7 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z7 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z7 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f8 = nbVar.f11802u;
        if (nz2.f12300a >= 21) {
            int i9 = nbVar.f11801t;
            if (i9 == 90 || i9 == 270) {
                f8 = 1.0f / f8;
                int i10 = integer2;
                integer2 = integer;
                integer = i10;
            }
        } else if (this.f8970s1 == null) {
            i8 = nbVar.f11801t;
        }
        this.f8964m1 = new jj1(integer, integer2, i8, f8);
        this.P0.c(nbVar.f11800s);
        j jVar = this.f8970s1;
        if (jVar != null) {
            l9 l9VarB = nbVar.b();
            l9VarB.C(integer);
            l9VarB.h(integer2);
            l9VarB.t(i8);
            l9VarB.r(f8);
            jVar.s(1, l9VarB.D());
        }
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final void H0() {
        d1(2);
        if (this.Q0.i()) {
            this.Q0.f(M0());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
    
        if (r16 > 100000) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bd, code lost:
    
        if (r19 >= N0()) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c3, code lost:
    
        if (r13 == 2) goto L54;
     */
    @Override // com.google.android.gms.internal.ads.xk4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean J0(long r19, long r21, com.google.android.gms.internal.ads.nk4 r23, java.nio.ByteBuffer r24, int r25, int r26, int r27, long r28, boolean r30, boolean r31, com.google.android.gms.internal.ads.nb r32) throws com.google.android.gms.internal.ads.ja4 {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hs4.J0(long, long, com.google.android.gms.internal.ads.nk4, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.google.android.gms.internal.ads.nb):boolean");
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final ok4 P0(Throwable th, rk4 rk4Var) {
        return new xr4(th, rk4Var, this.W0);
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final void S0(long j8) {
        super.S0(j8);
        this.f8958g1--;
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final void T0(q94 q94Var) {
        this.f8958g1++;
        int i8 = nz2.f12300a;
    }

    @Override // com.google.android.gms.internal.ads.xk4, com.google.android.gms.internal.ads.aa4
    protected final void U() {
        this.f8965n1 = null;
        d1(0);
        this.Y0 = false;
        try {
            super.U();
        } finally {
            this.R0.c(this.H0);
            this.R0.t(jj1.f9649e);
        }
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final void U0(nb nbVar) throws ja4 {
        if (this.f8966o1 && !this.f8967p1 && !this.Q0.i()) {
            try {
                this.Q0.c(nbVar);
                this.Q0.f(M0());
                ls4 ls4Var = this.f8969r1;
                if (ls4Var != null) {
                    this.Q0.h(ls4Var);
                }
            } catch (i e8) {
                throw P(e8, nbVar, false, 7000);
            }
        }
        if (this.f8970s1 == null && this.Q0.i()) {
            j jVarA = this.Q0.a();
            this.f8970s1 = jVarA;
            jVarA.r(new yr4(this), rg3.b());
        }
        this.f8967p1 = true;
    }

    @Override // com.google.android.gms.internal.ads.xk4, com.google.android.gms.internal.ads.aa4
    protected final void V(boolean z7, boolean z8) {
        super.V(z7, z8);
        S();
        this.R0.e(this.H0);
        this.f8952a1 = z8 ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.xk4, com.google.android.gms.internal.ads.aa4
    protected final void W(long j8, boolean z7) {
        super.W(j8, z7);
        if (this.f8970s1 != null) {
            throw null;
        }
        if (this.Q0.i()) {
            this.Q0.f(M0());
        }
        d1(1);
        this.P0.f();
        this.f8959h1 = -9223372036854775807L;
        this.f8953b1 = -9223372036854775807L;
        this.f8957f1 = 0;
        this.f8954c1 = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final void W0() {
        super.W0();
        this.f8958g1 = 0;
    }

    protected final void X0(nk4 nk4Var, int i8, long j8, long j9) {
        int i9 = nz2.f12300a;
        Trace.beginSection("releaseOutputBuffer");
        nk4Var.d(i8, j9);
        Trace.endSection();
        this.H0.f5685e++;
        this.f8957f1 = 0;
        if (this.f8970s1 == null) {
            O();
            this.f8960i1 = nz2.C(SystemClock.elapsedRealtime());
            f1(this.f8964m1);
            e1();
        }
    }

    @Override // com.google.android.gms.internal.ads.aa4
    protected final void Y() {
        if (this.Q0.i()) {
            this.Q0.d();
        }
    }

    protected final void Y0(nk4 nk4Var, int i8, long j8) {
        int i9 = nz2.f12300a;
        Trace.beginSection("skipVideoBuffer");
        nk4Var.i(i8, false);
        Trace.endSection();
        this.H0.f5686f++;
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final float Z(float f8, nb nbVar, nb[] nbVarArr) {
        float fMax = -1.0f;
        for (nb nbVar2 : nbVarArr) {
            float f9 = nbVar2.f11800s;
            if (f9 != -1.0f) {
                fMax = Math.max(fMax, f9);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f8;
    }

    protected final void Z0(int i8, int i9) {
        ba4 ba4Var = this.H0;
        ba4Var.f5688h += i8;
        int i10 = i8 + i9;
        ba4Var.f5687g += i10;
        this.f8956e1 += i10;
        int i11 = this.f8957f1 + i10;
        this.f8957f1 = i11;
        ba4Var.f5689i = Math.max(i11, ba4Var.f5689i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.nk4] */
    /* JADX WARN: Type inference failed for: r6v13, types: [com.google.android.gms.internal.ads.ur4] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.google.android.gms.internal.ads.us4] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [com.google.android.gms.internal.ads.ks4] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.aa4, com.google.android.gms.internal.ads.nd4
    public final void a(int i8, Object obj) throws ja4 {
        Surface surface;
        if (i8 != 1) {
            if (i8 == 7) {
                obj.getClass();
                ls4 ls4Var = (ls4) obj;
                this.f8969r1 = ls4Var;
                this.Q0.h(ls4Var);
                return;
            }
            if (i8 == 10) {
                obj.getClass();
                int iIntValue = ((Integer) obj).intValue();
                if (this.f8968q1 != iIntValue) {
                    this.f8968q1 = iIntValue;
                    return;
                }
                return;
            }
            if (i8 == 4) {
                obj.getClass();
                int iIntValue2 = ((Integer) obj).intValue();
                this.Z0 = iIntValue2;
                nk4 nk4VarO0 = O0();
                if (nk4VarO0 != null) {
                    nk4VarO0.h(iIntValue2);
                    return;
                }
                return;
            }
            if (i8 == 5) {
                us4 us4Var = this.P0;
                obj.getClass();
                us4Var.j(((Integer) obj).intValue());
                return;
            }
            if (i8 == 13) {
                obj.getClass();
                this.Q0.g((List) obj);
                this.f8966o1 = true;
                return;
            } else {
                if (i8 != 14) {
                    return;
                }
                obj.getClass();
                er2 er2Var = (er2) obj;
                if (!this.Q0.i() || er2Var.b() == 0 || er2Var.a() == 0 || (surface = this.W0) == null) {
                    return;
                }
                this.Q0.e(surface, er2Var);
                return;
            }
        }
        ?? B = obj instanceof Surface ? (Surface) obj : 0;
        if (B == 0) {
            ks4 ks4Var = this.X0;
            if (ks4Var != null) {
                B = ks4Var;
            } else {
                rk4 rk4VarQ0 = Q0();
                if (rk4VarQ0 != null && j1(rk4VarQ0)) {
                    B = ks4.b(this.O0, rk4VarQ0.f14181f);
                    this.X0 = B;
                }
            }
        }
        if (this.W0 == B) {
            if (B == 0 || B == this.X0) {
                return;
            }
            g1();
            Surface surface2 = this.W0;
            if (surface2 == null || !this.Y0) {
                return;
            }
            this.R0.q(surface2);
            return;
        }
        this.W0 = B;
        this.P0.i(B);
        this.Y0 = false;
        int iE = e();
        ?? O0 = O0();
        ?? r72 = B;
        if (O0 != 0) {
            r72 = B;
            if (!this.Q0.i()) {
                ?? r73 = B;
                if (nz2.f12300a < 23) {
                    V0();
                    R0();
                    r72 = r73;
                } else {
                    if (B != 0) {
                        r73 = B;
                        if (!this.U0) {
                            O0.f(B);
                            r72 = B;
                        }
                    } else {
                        r73 = 0;
                    }
                    V0();
                    R0();
                    r72 = r73;
                }
            }
        }
        if (r72 == 0 || r72 == this.X0) {
            this.f8965n1 = null;
            d1(1);
            if (this.Q0.i()) {
                this.Q0.b();
                return;
            }
            return;
        }
        g1();
        d1(1);
        if (iE == 2) {
            this.f8954c1 = -9223372036854775807L;
        }
        if (this.Q0.i()) {
            this.Q0.e(r72, er2.f7474c);
        }
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final int a0(zk4 zk4Var, nb nbVar) {
        boolean z7;
        if (!xg0.g(nbVar.f11793l)) {
            return 128;
        }
        int i8 = 0;
        boolean z8 = nbVar.f11796o != null;
        List listC1 = c1(this.O0, zk4Var, nbVar, z8, false);
        if (z8 && listC1.isEmpty()) {
            listC1 = c1(this.O0, zk4Var, nbVar, false, false);
        }
        if (listC1.isEmpty()) {
            return 129;
        }
        if (!xk4.j0(nbVar)) {
            return 130;
        }
        rk4 rk4Var = (rk4) listC1.get(0);
        boolean zE = rk4Var.e(nbVar);
        if (zE) {
            z7 = true;
        } else {
            for (int i9 = 1; i9 < listC1.size(); i9++) {
                rk4 rk4Var2 = (rk4) listC1.get(i9);
                if (rk4Var2.e(nbVar)) {
                    rk4Var = rk4Var2;
                    z7 = false;
                    zE = true;
                    break;
                }
            }
            z7 = true;
        }
        int i10 = true != zE ? 3 : 4;
        int i11 = true != rk4Var.f(nbVar) ? 8 : 16;
        int i12 = true != rk4Var.f14182g ? 0 : 64;
        int i13 = true != z7 ? 0 : 128;
        if (nz2.f12300a >= 26 && "video/dolby-vision".equals(nbVar.f11793l) && !cs4.a(this.O0)) {
            i13 = 256;
        }
        if (zE) {
            List listC12 = c1(this.O0, zk4Var, nbVar, z8, true);
            if (!listC12.isEmpty()) {
                rk4 rk4Var3 = (rk4) ql4.i(listC12, nbVar).get(0);
                if (rk4Var3.e(nbVar) && rk4Var3.f(nbVar)) {
                    i8 = 32;
                }
            }
        }
        return i10 | i11 | i8 | i12 | i13;
    }

    protected final void a1(long j8) {
        ba4 ba4Var = this.H0;
        ba4Var.f5691k += j8;
        ba4Var.f5692l++;
        this.f8961j1 += j8;
        this.f8962k1++;
    }

    @Override // com.google.android.gms.internal.ads.xk4, com.google.android.gms.internal.ads.aa4, com.google.android.gms.internal.ads.sd4
    public final void b(float f8, float f9) throws ja4 {
        super.b(f8, f9);
        this.P0.e(f8);
        if (this.f8970s1 != null) {
            uu1.d(((double) f8) >= 0.0d);
        }
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final ca4 b0(rk4 rk4Var, nb nbVar, nb nbVar2) {
        int i8;
        int i9;
        ca4 ca4VarB = rk4Var.b(nbVar, nbVar2);
        int i10 = ca4VarB.f6262e;
        ds4 ds4Var = this.T0;
        ds4Var.getClass();
        if (nbVar2.f11798q > ds4Var.f7001a || nbVar2.f11799r > ds4Var.f7002b) {
            i10 |= 256;
        }
        if (l1(rk4Var, nbVar2) > ds4Var.f7003c) {
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
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final ca4 c0(nc4 nc4Var) {
        ca4 ca4VarC0 = super.c0(nc4Var);
        nb nbVar = nc4Var.f11825a;
        nbVar.getClass();
        this.R0.f(nbVar, ca4VarC0);
        return ca4VarC0;
    }

    @Override // com.google.android.gms.internal.ads.xk4, com.google.android.gms.internal.ads.sd4
    public final boolean i() {
        return super.i() && this.f8970s1 == null;
    }

    @Override // com.google.android.gms.internal.ads.xk4
    protected final boolean i0(rk4 rk4Var) {
        return this.W0 != null || j1(rk4Var);
    }

    protected final void m1(nk4 nk4Var, int i8, long j8) {
        int i9 = nz2.f12300a;
        Trace.beginSection("releaseOutputBuffer");
        nk4Var.i(i8, true);
        Trace.endSection();
        this.H0.f5685e++;
        this.f8957f1 = 0;
        if (this.f8970s1 == null) {
            O();
            this.f8960i1 = nz2.C(SystemClock.elapsedRealtime());
            f1(this.f8964m1);
            e1();
        }
    }

    @Override // com.google.android.gms.internal.ads.xk4, com.google.android.gms.internal.ads.sd4
    public final boolean n0() {
        j jVar;
        ks4 ks4Var;
        if (super.n0() && (((jVar = this.f8970s1) == null || jVar.q()) && (this.f8952a1 == 3 || (((ks4Var = this.X0) != null && this.W0 == ks4Var) || O0() == null)))) {
            this.f8954c1 = -9223372036854775807L;
            return true;
        }
        if (this.f8954c1 == -9223372036854775807L) {
            return false;
        }
        O();
        if (SystemClock.elapsedRealtime() < this.f8954c1) {
            return true;
        }
        this.f8954c1 = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.gms.internal.ads.xk4, com.google.android.gms.internal.ads.aa4
    @TargetApi(17)
    protected final void t() {
        try {
            super.t();
            this.f8967p1 = false;
            if (this.X0 != null) {
                h1();
            }
        } catch (Throwable th) {
            this.f8967p1 = false;
            if (this.X0 != null) {
                h1();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.aa4
    protected final void v() {
        this.f8956e1 = 0;
        O();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f8955d1 = jElapsedRealtime;
        this.f8960i1 = nz2.C(jElapsedRealtime);
        this.f8961j1 = 0L;
        this.f8962k1 = 0;
        this.P0.g();
    }

    @Override // com.google.android.gms.internal.ads.aa4
    protected final void x() {
        this.f8954c1 = -9223372036854775807L;
        if (this.f8956e1 > 0) {
            O();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.R0.d(this.f8956e1, jElapsedRealtime - this.f8955d1);
            this.f8956e1 = 0;
            this.f8955d1 = jElapsedRealtime;
        }
        int i8 = this.f8962k1;
        if (i8 != 0) {
            this.R0.r(this.f8961j1, i8);
            this.f8961j1 = 0L;
            this.f8962k1 = 0;
        }
        this.P0.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0118, code lost:
    
        if (true == r12) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011a, code lost:
    
        r13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011c, code lost:
    
        r13 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011d, code lost:
    
        if (true == r12) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011f, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0123, code lost:
    
        r3 = new android.graphics.Point(r13, r4);
     */
    @Override // com.google.android.gms.internal.ads.xk4
    @android.annotation.TargetApi(17)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.google.android.gms.internal.ads.lk4 z0(com.google.android.gms.internal.ads.rk4 r20, com.google.android.gms.internal.ads.nb r21, android.media.MediaCrypto r22, float r23) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hs4.z0(com.google.android.gms.internal.ads.rk4, com.google.android.gms.internal.ads.nb, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.lk4");
    }
}
