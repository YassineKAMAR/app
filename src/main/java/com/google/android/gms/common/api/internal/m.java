package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import y2.a;
import y2.a.d;
import y2.f;

/* JADX INFO: loaded from: classes.dex */
public final class m<O extends a.d> implements f.a, f.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a.f f4869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z2.b<O> f4870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f4871d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f4874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z2.z f4875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4876i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ b f4880m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue<x> f4868a = new LinkedList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<z2.b0> f4872e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<z2.f<?>, z2.v> f4873f = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<n> f4877j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private x2.b f4878k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f4879l = 0;

    public m(b bVar, y2.e<O> eVar) {
        this.f4880m = bVar;
        a.f fVarI = eVar.i(bVar.f4840p.getLooper(), this);
        this.f4869b = fVarI;
        this.f4870c = eVar.f();
        this.f4871d = new e();
        this.f4874g = eVar.h();
        if (fVarI.o()) {
            this.f4875h = eVar.j(bVar.f4831g, bVar.f4840p);
        } else {
            this.f4875h = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final x2.d b(x2.d[] dVarArr) {
        if (dVarArr != null && dVarArr.length != 0) {
            x2.d[] dVarArrL = this.f4869b.l();
            if (dVarArrL == null) {
                dVarArrL = new x2.d[0];
            }
            p.a aVar = new p.a(dVarArrL.length);
            for (x2.d dVar : dVarArrL) {
                aVar.put(dVar.getName(), Long.valueOf(dVar.g()));
            }
            for (x2.d dVar2 : dVarArr) {
                Long l8 = (Long) aVar.get(dVar2.getName());
                if (l8 == null || l8.longValue() < dVar2.g()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    private final void c(x2.b bVar) {
        Iterator<z2.b0> it = this.f4872e.iterator();
        while (it.hasNext()) {
            it.next().b(this.f4870c, bVar, a3.n.a(bVar, x2.b.f27239e) ? this.f4869b.e() : null);
        }
        this.f4872e.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Status status) {
        a3.o.d(this.f4880m.f4840p);
        e(status, null, false);
    }

    private final void e(Status status, Exception exc, boolean z7) {
        a3.o.d(this.f4880m.f4840p);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator<x> it = this.f4868a.iterator();
        while (it.hasNext()) {
            x next = it.next();
            if (!z7 || next.f4906a == 2) {
                if (status != null) {
                    next.a(status);
                } else {
                    next.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void f() {
        ArrayList arrayList = new ArrayList(this.f4868a);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            x xVar = (x) arrayList.get(i8);
            if (!this.f4869b.g()) {
                return;
            }
            if (l(xVar)) {
                this.f4868a.remove(xVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        A();
        c(x2.b.f27239e);
        k();
        Iterator<z2.v> it = this.f4873f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw null;
        }
        f();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(int i8) {
        A();
        this.f4876i = true;
        this.f4871d.c(i8, this.f4869b.m());
        b bVar = this.f4880m;
        bVar.f4840p.sendMessageDelayed(Message.obtain(bVar.f4840p, 9, this.f4870c), this.f4880m.f4825a);
        b bVar2 = this.f4880m;
        bVar2.f4840p.sendMessageDelayed(Message.obtain(bVar2.f4840p, 11, this.f4870c), this.f4880m.f4826b);
        this.f4880m.f4833i.c();
        Iterator<z2.v> it = this.f4873f.values().iterator();
        while (it.hasNext()) {
            it.next().f27736a.run();
        }
    }

    private final void i() {
        this.f4880m.f4840p.removeMessages(12, this.f4870c);
        b bVar = this.f4880m;
        bVar.f4840p.sendMessageDelayed(bVar.f4840p.obtainMessage(12, this.f4870c), this.f4880m.f4827c);
    }

    private final void j(x xVar) {
        xVar.d(this.f4871d, M());
        try {
            xVar.c(this);
        } catch (DeadObjectException unused) {
            v0(1);
            this.f4869b.c("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void k() {
        if (this.f4876i) {
            this.f4880m.f4840p.removeMessages(11, this.f4870c);
            this.f4880m.f4840p.removeMessages(9, this.f4870c);
            this.f4876i = false;
        }
    }

    private final boolean l(x xVar) {
        if (!(xVar instanceof z2.r)) {
            j(xVar);
            return true;
        }
        z2.r rVar = (z2.r) xVar;
        x2.d dVarB = b(rVar.g(this));
        if (dVarB == null) {
            j(xVar);
            return true;
        }
        String name = this.f4869b.getClass().getName();
        String name2 = dVarB.getName();
        long jG = dVarB.g();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(name2).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(name2);
        sb.append(", ");
        sb.append(jG);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f4880m.f4841q || !rVar.f(this)) {
            rVar.b(new y2.l(dVarB));
            return true;
        }
        n nVar = new n(this.f4870c, dVarB, null);
        int iIndexOf = this.f4877j.indexOf(nVar);
        if (iIndexOf >= 0) {
            n nVar2 = this.f4877j.get(iIndexOf);
            this.f4880m.f4840p.removeMessages(15, nVar2);
            b bVar = this.f4880m;
            bVar.f4840p.sendMessageDelayed(Message.obtain(bVar.f4840p, 15, nVar2), this.f4880m.f4825a);
            return false;
        }
        this.f4877j.add(nVar);
        b bVar2 = this.f4880m;
        bVar2.f4840p.sendMessageDelayed(Message.obtain(bVar2.f4840p, 15, nVar), this.f4880m.f4825a);
        b bVar3 = this.f4880m;
        bVar3.f4840p.sendMessageDelayed(Message.obtain(bVar3.f4840p, 16, nVar), this.f4880m.f4826b);
        x2.b bVar4 = new x2.b(2, null);
        if (m(bVar4)) {
            return false;
        }
        this.f4880m.g(bVar4, this.f4874g);
        return false;
    }

    private final boolean m(x2.b bVar) {
        synchronized (b.f4823t) {
            b bVar2 = this.f4880m;
            if (bVar2.f4837m == null || !bVar2.f4838n.contains(this.f4870c)) {
                return false;
            }
            this.f4880m.f4837m.s(bVar, this.f4874g);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(boolean z7) {
        a3.o.d(this.f4880m.f4840p);
        if (!this.f4869b.g() || this.f4873f.size() != 0) {
            return false;
        }
        if (!this.f4871d.e()) {
            this.f4869b.c("Timing out service connection.");
            return true;
        }
        if (z7) {
            i();
        }
        return false;
    }

    static /* bridge */ /* synthetic */ void y(m mVar, n nVar) {
        if (mVar.f4877j.contains(nVar) && !mVar.f4876i) {
            if (mVar.f4869b.g()) {
                mVar.f();
            } else {
                mVar.B();
            }
        }
    }

    static /* bridge */ /* synthetic */ void z(m mVar, n nVar) {
        x2.d[] dVarArrG;
        if (mVar.f4877j.remove(nVar)) {
            mVar.f4880m.f4840p.removeMessages(15, nVar);
            mVar.f4880m.f4840p.removeMessages(16, nVar);
            x2.d dVar = nVar.f4882b;
            ArrayList arrayList = new ArrayList(mVar.f4868a.size());
            for (x xVar : mVar.f4868a) {
                if ((xVar instanceof z2.r) && (dVarArrG = ((z2.r) xVar).g(mVar)) != null && e3.b.b(dVarArrG, dVar)) {
                    arrayList.add(xVar);
                }
            }
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                x xVar2 = (x) arrayList.get(i8);
                mVar.f4868a.remove(xVar2);
                xVar2.b(new y2.l(dVar));
            }
        }
    }

    public final void A() {
        a3.o.d(this.f4880m.f4840p);
        this.f4878k = null;
    }

    public final void B() {
        x2.b bVar;
        a3.o.d(this.f4880m.f4840p);
        if (this.f4869b.g() || this.f4869b.d()) {
            return;
        }
        try {
            b bVar2 = this.f4880m;
            int iB = bVar2.f4833i.b(bVar2.f4831g, this.f4869b);
            if (iB != 0) {
                x2.b bVar3 = new x2.b(iB, null);
                String name = this.f4869b.getClass().getName();
                String string = bVar3.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(string);
                Log.w("GoogleApiManager", sb.toString());
                E(bVar3, null);
                return;
            }
            b bVar4 = this.f4880m;
            a.f fVar = this.f4869b;
            p pVar = new p(bVar4, fVar, this.f4870c);
            if (fVar.o()) {
                ((z2.z) a3.o.j(this.f4875h)).h5(pVar);
            }
            try {
                this.f4869b.h(pVar);
                return;
            } catch (SecurityException e8) {
                e = e8;
                bVar = new x2.b(10);
            }
        } catch (IllegalStateException e9) {
            e = e9;
            bVar = new x2.b(10);
        }
        E(bVar, e);
    }

    public final void C(x xVar) {
        a3.o.d(this.f4880m.f4840p);
        if (this.f4869b.g()) {
            if (l(xVar)) {
                i();
                return;
            } else {
                this.f4868a.add(xVar);
                return;
            }
        }
        this.f4868a.add(xVar);
        x2.b bVar = this.f4878k;
        if (bVar == null || !bVar.p()) {
            B();
        } else {
            E(this.f4878k, null);
        }
    }

    final void D() {
        this.f4879l++;
    }

    public final void E(x2.b bVar, Exception exc) {
        a3.o.d(this.f4880m.f4840p);
        z2.z zVar = this.f4875h;
        if (zVar != null) {
            zVar.G5();
        }
        A();
        this.f4880m.f4833i.c();
        c(bVar);
        if ((this.f4869b instanceof c3.e) && bVar.g() != 24) {
            this.f4880m.f4828d = true;
            b bVar2 = this.f4880m;
            bVar2.f4840p.sendMessageDelayed(bVar2.f4840p.obtainMessage(19), 300000L);
        }
        if (bVar.g() == 4) {
            d(b.f4822s);
            return;
        }
        if (this.f4868a.isEmpty()) {
            this.f4878k = bVar;
            return;
        }
        if (exc != null) {
            a3.o.d(this.f4880m.f4840p);
            e(null, exc, false);
            return;
        }
        if (!this.f4880m.f4841q) {
            d(b.h(this.f4870c, bVar));
            return;
        }
        e(b.h(this.f4870c, bVar), null, true);
        if (this.f4868a.isEmpty() || m(bVar) || this.f4880m.g(bVar, this.f4874g)) {
            return;
        }
        if (bVar.g() == 18) {
            this.f4876i = true;
        }
        if (!this.f4876i) {
            d(b.h(this.f4870c, bVar));
        } else {
            b bVar3 = this.f4880m;
            bVar3.f4840p.sendMessageDelayed(Message.obtain(bVar3.f4840p, 9, this.f4870c), this.f4880m.f4825a);
        }
    }

    public final void F(x2.b bVar) {
        a3.o.d(this.f4880m.f4840p);
        a.f fVar = this.f4869b;
        String name = fVar.getClass().getName();
        String strValueOf = String.valueOf(bVar);
        StringBuilder sb = new StringBuilder(name.length() + 25 + strValueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(strValueOf);
        fVar.c(sb.toString());
        E(bVar, null);
    }

    public final void G(z2.b0 b0Var) {
        a3.o.d(this.f4880m.f4840p);
        this.f4872e.add(b0Var);
    }

    public final void H() {
        a3.o.d(this.f4880m.f4840p);
        if (this.f4876i) {
            B();
        }
    }

    @Override // z2.c
    public final void H0(Bundle bundle) {
        if (Looper.myLooper() == this.f4880m.f4840p.getLooper()) {
            g();
        } else {
            this.f4880m.f4840p.post(new i(this));
        }
    }

    public final void I() {
        a3.o.d(this.f4880m.f4840p);
        d(b.f4821r);
        this.f4871d.d();
        for (z2.f fVar : (z2.f[]) this.f4873f.keySet().toArray(new z2.f[0])) {
            C(new w(fVar, new s3.i()));
        }
        c(new x2.b(4));
        if (this.f4869b.g()) {
            this.f4869b.i(new l(this));
        }
    }

    public final void J() {
        a3.o.d(this.f4880m.f4840p);
        if (this.f4876i) {
            k();
            b bVar = this.f4880m;
            d(bVar.f4832h.g(bVar.f4831g) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f4869b.c("Timing out connection while resuming.");
        }
    }

    final boolean L() {
        return this.f4869b.g();
    }

    public final boolean M() {
        return this.f4869b.o();
    }

    public final boolean a() {
        return n(true);
    }

    @Override // z2.h
    public final void k0(x2.b bVar) {
        E(bVar, null);
    }

    public final int o() {
        return this.f4874g;
    }

    final int p() {
        return this.f4879l;
    }

    public final x2.b q() {
        a3.o.d(this.f4880m.f4840p);
        return this.f4878k;
    }

    public final a.f s() {
        return this.f4869b;
    }

    public final Map<z2.f<?>, z2.v> u() {
        return this.f4873f;
    }

    @Override // z2.c
    public final void v0(int i8) {
        if (Looper.myLooper() == this.f4880m.f4840p.getLooper()) {
            h(i8);
        } else {
            this.f4880m.f4840p.post(new j(this, i8));
        }
    }
}
