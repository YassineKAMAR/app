package h2;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.il;
import com.google.android.gms.internal.ads.jg0;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.w40;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w40 f22140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v4 f22141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f22142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z1.y f22143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final w f22144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f22145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private z1.d f22146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private z1.h[] f22147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a2.e f22148i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private s0 f22149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private z1.z f22150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f22151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ViewGroup f22152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f22153n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f22154o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private z1.q f22155p;

    public a3(ViewGroup viewGroup, int i8) {
        this(viewGroup, null, false, v4.f22331a, null, i8);
    }

    a3(ViewGroup viewGroup, AttributeSet attributeSet, boolean z7, v4 v4Var, s0 s0Var, int i8) {
        w4 w4VarU;
        this.f22140a = new w40();
        this.f22143d = new z1.y();
        this.f22144e = new y2(this);
        this.f22152m = viewGroup;
        this.f22141b = v4Var;
        this.f22149j = null;
        this.f22142c = new AtomicBoolean(false);
        this.f22153n = i8;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                e5 e5Var = new e5(context, attributeSet);
                this.f22147h = e5Var.b(z7);
                this.f22151l = e5Var.a();
                if (viewGroup.isInEditMode()) {
                    jg0 jg0VarB = v.b();
                    z1.h hVar = this.f22147h[0];
                    int i9 = this.f22153n;
                    if (hVar.equals(z1.h.f27632q)) {
                        w4VarU = w4.u();
                    } else {
                        w4 w4Var = new w4(context, hVar);
                        w4Var.f22360j = c(i9);
                        w4VarU = w4Var;
                    }
                    jg0VarB.q(viewGroup, w4VarU, "Ads by Google");
                }
            } catch (IllegalArgumentException e8) {
                v.b().p(viewGroup, new w4(context, z1.h.f27624i), e8.getMessage(), e8.getMessage());
            }
        }
    }

    private static w4 b(Context context, z1.h[] hVarArr, int i8) {
        for (z1.h hVar : hVarArr) {
            if (hVar.equals(z1.h.f27632q)) {
                return w4.u();
            }
        }
        w4 w4Var = new w4(context, hVarArr);
        w4Var.f22360j = c(i8);
        return w4Var;
    }

    private static boolean c(int i8) {
        return i8 == 1;
    }

    public final void A(z1.z zVar) {
        this.f22150k = zVar;
        try {
            s0 s0Var = this.f22149j;
            if (s0Var != null) {
                s0Var.P1(zVar == null ? null : new k4(zVar));
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    public final z1.h[] a() {
        return this.f22147h;
    }

    public final z1.d d() {
        return this.f22146g;
    }

    public final z1.h e() {
        w4 w4VarQ;
        try {
            s0 s0Var = this.f22149j;
            if (s0Var != null && (w4VarQ = s0Var.q()) != null) {
                return z1.b0.c(w4VarQ.f22355e, w4VarQ.f22352b, w4VarQ.f22351a);
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
        z1.h[] hVarArr = this.f22147h;
        if (hVarArr != null) {
            return hVarArr[0];
        }
        return null;
    }

    public final z1.q f() {
        return this.f22155p;
    }

    public final z1.w g() {
        m2 m2VarS = null;
        try {
            s0 s0Var = this.f22149j;
            if (s0Var != null) {
                m2VarS = s0Var.s();
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
        return z1.w.f(m2VarS);
    }

    public final z1.y i() {
        return this.f22143d;
    }

    public final z1.z j() {
        return this.f22150k;
    }

    public final a2.e k() {
        return this.f22148i;
    }

    public final p2 l() {
        s0 s0Var = this.f22149j;
        if (s0Var != null) {
            try {
                return s0Var.u();
            } catch (RemoteException e8) {
                qg0.i("#007 Could not call remote method.", e8);
            }
        }
        return null;
    }

    public final String m() {
        s0 s0Var;
        if (this.f22151l == null && (s0Var = this.f22149j) != null) {
            try {
                this.f22151l = s0Var.B();
            } catch (RemoteException e8) {
                qg0.i("#007 Could not call remote method.", e8);
            }
        }
        return this.f22151l;
    }

    public final void n() {
        try {
            s0 s0Var = this.f22149j;
            if (s0Var != null) {
                s0Var.D();
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    final /* synthetic */ void o(g3.a aVar) {
        this.f22152m.addView((View) g3.b.H0(aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce A[Catch: RemoteException -> 0x00da, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00da, blocks: (B:26:0x009d, B:28:0x00a3, B:30:0x00b1, B:32:0x00c3, B:33:0x00ce), top: B:48:0x009d, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(h2.w2 r11) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.a3.p(h2.w2):void");
    }

    public final void q() {
        try {
            s0 s0Var = this.f22149j;
            if (s0Var != null) {
                s0Var.W();
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    public final void r() {
        try {
            s0 s0Var = this.f22149j;
            if (s0Var != null) {
                s0Var.f0();
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    public final void s(a aVar) {
        try {
            this.f22145f = aVar;
            s0 s0Var = this.f22149j;
            if (s0Var != null) {
                s0Var.g4(aVar != null ? new x(aVar) : null);
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    public final void t(z1.d dVar) {
        this.f22146g = dVar;
        this.f22144e.o(dVar);
    }

    public final void u(z1.h... hVarArr) {
        if (this.f22147h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        v(hVarArr);
    }

    public final void v(z1.h... hVarArr) {
        this.f22147h = hVarArr;
        try {
            s0 s0Var = this.f22149j;
            if (s0Var != null) {
                s0Var.a5(b(this.f22152m.getContext(), this.f22147h, this.f22153n));
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
        this.f22152m.requestLayout();
    }

    public final void w(String str) {
        if (this.f22151l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f22151l = str;
    }

    public final void x(a2.e eVar) {
        try {
            this.f22148i = eVar;
            s0 s0Var = this.f22149j;
            if (s0Var != null) {
                s0Var.I2(eVar != null ? new il(eVar) : null);
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    public final void y(boolean z7) {
        this.f22154o = z7;
        try {
            s0 s0Var = this.f22149j;
            if (s0Var != null) {
                s0Var.H5(z7);
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    public final void z(z1.q qVar) {
        try {
            this.f22155p = qVar;
            s0 s0Var = this.f22149j;
            if (s0Var != null) {
                s0Var.m4(new e4(qVar));
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }
}
