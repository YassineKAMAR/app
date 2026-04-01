package z2;

import a3.k0;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import y2.a;
import y2.f;

/* JADX INFO: loaded from: classes.dex */
public final class z extends r3.d implements f.a, f.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a.AbstractC0191a<? extends q3.f, q3.a> f27740h = q3.e.f25807c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f27742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.AbstractC0191a<? extends q3.f, q3.a> f27743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<Scope> f27744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a3.d f27745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private q3.f f27746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private y f27747g;

    public z(Context context, Handler handler, a3.d dVar) {
        a.AbstractC0191a<? extends q3.f, q3.a> abstractC0191a = f27740h;
        this.f27741a = context;
        this.f27742b = handler;
        this.f27745e = (a3.d) a3.o.k(dVar, "ClientSettings must not be null");
        this.f27744d = dVar.e();
        this.f27743c = abstractC0191a;
    }

    static /* bridge */ /* synthetic */ void y4(z zVar, r3.l lVar) {
        x2.b bVarG = lVar.g();
        if (bVarG.u()) {
            k0 k0Var = (k0) a3.o.j(lVar.i());
            bVarG = k0Var.g();
            if (bVarG.u()) {
                zVar.f27747g.b(k0Var.i(), zVar.f27744d);
            } else {
                String strValueOf = String.valueOf(bVarG);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                zVar.f27747g.a(bVarG);
            }
        } else {
            zVar.f27747g.a(bVarG);
        }
        zVar.f27746f.f();
    }

    public final void G5() {
        q3.f fVar = this.f27746f;
        if (fVar != null) {
            fVar.f();
        }
    }

    @Override // z2.c
    public final void H0(Bundle bundle) {
        this.f27746f.n(this);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [q3.f, y2.a$f] */
    public final void h5(y yVar) {
        q3.f fVar = this.f27746f;
        if (fVar != null) {
            fVar.f();
        }
        this.f27745e.i(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0191a<? extends q3.f, q3.a> abstractC0191a = this.f27743c;
        Context context = this.f27741a;
        Looper looper = this.f27742b.getLooper();
        a3.d dVar = this.f27745e;
        this.f27746f = abstractC0191a.a(context, looper, dVar, dVar.f(), this, this);
        this.f27747g = yVar;
        Set<Scope> set = this.f27744d;
        if (set == null || set.isEmpty()) {
            this.f27742b.post(new w(this));
        } else {
            this.f27746f.p();
        }
    }

    @Override // z2.h
    public final void k0(x2.b bVar) {
        this.f27747g.a(bVar);
    }

    @Override // r3.f
    public final void r2(r3.l lVar) {
        this.f27742b.post(new x(this, lVar));
    }

    @Override // z2.c
    public final void v0(int i8) {
        this.f27746f.f();
    }
}
