package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.a5;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.f5;
import com.google.android.gms.internal.measurement.td;
import com.google.android.gms.internal.measurement.w4;
import com.google.android.gms.internal.measurement.y4;
import com.google.android.gms.internal.measurement.yf;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class n8 extends ua {
    public n8(va vaVar) {
        super(vaVar);
    }

    private static String d(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.ua
    protected final boolean x() {
        return false;
    }

    public final byte[] y(d0 d0Var, String str) {
        jb next;
        b5.a aVar;
        Bundle bundle;
        r5 r5Var;
        a5.a aVar2;
        byte[] bArr;
        long j8;
        a0 a0VarA;
        i();
        this.f20556a.Q();
        a3.o.j(d0Var);
        a3.o.f(str);
        if (!a().B(str, e0.f19934f0)) {
            t().F().b("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(d0Var.f19888a) && !"_iapx".equals(d0Var.f19888a)) {
            t().F().c("Generating a payload for this event is not available. package_name, event_name", str, d0Var.f19888a);
            return null;
        }
        a5.a aVarI = com.google.android.gms.internal.measurement.a5.I();
        n().Q0();
        try {
            r5 r5VarD0 = n().D0(str);
            if (r5VarD0 == null) {
                t().F().b("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!r5VarD0.r()) {
                t().F().b("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            b5.a aVarP0 = com.google.android.gms.internal.measurement.b5.E3().i0(1).P0("android");
            if (!TextUtils.isEmpty(r5VarD0.t0())) {
                aVarP0.K(r5VarD0.t0());
            }
            if (!TextUtils.isEmpty(r5VarD0.v0())) {
                aVarP0.W((String) a3.o.j(r5VarD0.v0()));
            }
            if (!TextUtils.isEmpty(r5VarD0.h())) {
                aVarP0.c0((String) a3.o.j(r5VarD0.h()));
            }
            if (r5VarD0.z() != -2147483648L) {
                aVarP0.Z((int) r5VarD0.z());
            }
            aVarP0.f0(r5VarD0.g0()).U(r5VarD0.c0());
            String strJ = r5VarD0.j();
            String strR0 = r5VarD0.r0();
            if (!TextUtils.isEmpty(strJ)) {
                aVarP0.J0(strJ);
            } else if (!TextUtils.isEmpty(strR0)) {
                aVarP0.E(strR0);
            }
            aVarP0.z0(r5VarD0.p0());
            y6 y6VarQ = this.f20461b.Q(str);
            aVarP0.O(r5VarD0.a0());
            if (this.f20556a.m() && a().K(aVarP0.T0()) && y6VarQ.x() && !TextUtils.isEmpty(null)) {
                aVarP0.A0(null);
            }
            aVarP0.p0(y6VarQ.v());
            if (y6VarQ.x() && r5VarD0.q()) {
                Pair<String, Boolean> pairZ = q().z(r5VarD0.t0(), y6VarQ);
                if (r5VarD0.q() && pairZ != null && !TextUtils.isEmpty((CharSequence) pairZ.first)) {
                    aVarP0.R0(d((String) pairZ.first, Long.toString(d0Var.f19891d)));
                    Object obj = pairZ.second;
                    if (obj != null) {
                        aVarP0.R(((Boolean) obj).booleanValue());
                    }
                }
            }
            b().l();
            b5.a aVarX0 = aVarP0.x0(Build.MODEL);
            b().l();
            aVarX0.N0(Build.VERSION.RELEASE).v0((int) b().v()).U0(b().w());
            if (y6VarQ.y() && r5VarD0.u0() != null) {
                aVarP0.Q(d((String) a3.o.j(r5VarD0.u0()), Long.toString(d0Var.f19891d)));
            }
            if (!TextUtils.isEmpty(r5VarD0.i())) {
                aVarP0.H0((String) a3.o.j(r5VarD0.i()));
            }
            String strT0 = r5VarD0.t0();
            List<jb> listM0 = n().M0(strT0);
            Iterator<jb> it = listM0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if ("_lte".equals(next.f20164c)) {
                    break;
                }
            }
            if (next == null || next.f20166e == null) {
                jb jbVar = new jb(strT0, "auto", "_lte", k().a(), 0L);
                listM0.add(jbVar);
                n().e0(jbVar);
            }
            com.google.android.gms.internal.measurement.f5[] f5VarArr = new com.google.android.gms.internal.measurement.f5[listM0.size()];
            for (int i8 = 0; i8 < listM0.size(); i8++) {
                f5.a aVarX = com.google.android.gms.internal.measurement.f5.W().v(listM0.get(i8).f20164c).x(listM0.get(i8).f20165d);
                l().U(aVarX, listM0.get(i8).f20166e);
                f5VarArr[i8] = (com.google.android.gms.internal.measurement.f5) ((com.google.android.gms.internal.measurement.y8) aVarX.d());
            }
            aVarP0.b0(Arrays.asList(f5VarArr));
            l().T(aVarP0);
            if (td.a() && a().q(e0.T0)) {
                this.f20461b.v(r5VarD0, aVarP0);
            }
            r4 r4VarB = r4.b(d0Var);
            f().M(r4VarB.f20427d, n().A0(str));
            f().V(r4VarB, a().y(str));
            Bundle bundle2 = r4VarB.f20427d;
            bundle2.putLong("_c", 1L);
            t().F().a("Marking in-app purchase as real-time");
            bundle2.putLong("_r", 1L);
            bundle2.putString("_o", d0Var.f19890c);
            if (f().F0(aVarP0.T0())) {
                f().N(bundle2, "_dbg", 1L);
                f().N(bundle2, "_r", 1L);
            }
            a0 a0VarC0 = n().C0(str, d0Var.f19888a);
            if (a0VarC0 == null) {
                aVar = aVarP0;
                bundle = bundle2;
                r5Var = r5VarD0;
                aVar2 = aVarI;
                bArr = null;
                a0VarA = new a0(str, d0Var.f19888a, 0L, 0L, d0Var.f19891d, 0L, null, null, null, null);
                j8 = 0;
            } else {
                aVar = aVarP0;
                bundle = bundle2;
                r5Var = r5VarD0;
                aVar2 = aVarI;
                bArr = null;
                j8 = a0VarC0.f19773f;
                a0VarA = a0VarC0.a(d0Var.f19891d);
            }
            n().U(a0VarA);
            w wVar = new w(this.f20556a, d0Var.f19890c, str, d0Var.f19888a, d0Var.f19891d, j8, bundle);
            w4.a aVarW = com.google.android.gms.internal.measurement.w4.Y().C(wVar.f20607d).A(wVar.f20605b).w(wVar.f20608e);
            for (String str2 : wVar.f20609f) {
                y4.a aVarX2 = com.google.android.gms.internal.measurement.y4.Y().x(str2);
                Object objV = wVar.f20609f.v(str2);
                if (objV != null) {
                    l().S(aVarX2, objV);
                    aVarW.x(aVarX2);
                }
            }
            b5.a aVar3 = aVar;
            aVar3.z(aVarW).A(com.google.android.gms.internal.measurement.c5.F().s(com.google.android.gms.internal.measurement.x4.F().s(a0VarA.f19770c).t(d0Var.f19888a)));
            aVar3.D(m().z(r5Var.t0(), Collections.emptyList(), aVar3.a1(), Long.valueOf(aVarW.E()), Long.valueOf(aVarW.E())));
            if (aVarW.I()) {
                aVar3.w0(aVarW.E()).a0(aVarW.E());
            }
            long jI0 = r5Var.i0();
            if (jI0 != 0) {
                aVar3.j0(jI0);
            }
            long jM0 = r5Var.m0();
            if (jM0 != 0) {
                aVar3.s0(jM0);
            } else if (jI0 != 0) {
                aVar3.s0(jI0);
            }
            String strM = r5Var.m();
            if (yf.a() && a().B(str, e0.f19972y0) && strM != null) {
                aVar3.S0(strM);
            }
            r5Var.p();
            aVar3.e0((int) r5Var.k0()).G0(82001L).D0(k().a()).X(true);
            if (a().q(e0.C0)) {
                this.f20461b.A(aVar3.T0(), aVar3);
            }
            a5.a aVar4 = aVar2;
            aVar4.t(aVar3);
            r5 r5Var2 = r5Var;
            r5Var2.j0(aVar3.S());
            r5Var2.f0(aVar3.M());
            n().V(r5Var2);
            n().T0();
            try {
                return l().g0(((com.google.android.gms.internal.measurement.a5) ((com.google.android.gms.internal.measurement.y8) aVar4.d())).k());
            } catch (IOException e8) {
                t().G().c("Data loss. Failed to bundle and serialize. appId", n4.v(str), e8);
                return bArr;
            }
        } catch (SecurityException e9) {
            t().F().b("Resettable device id encryption failed", e9.getMessage());
            return new byte[0];
        } catch (SecurityException e10) {
            t().F().b("app instance id encryption failed", e10.getMessage());
            return new byte[0];
        } finally {
            n().R0();
        }
    }
}
