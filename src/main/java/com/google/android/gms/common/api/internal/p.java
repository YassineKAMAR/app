package com.google.android.gms.common.api.internal;

import a3.c;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import y2.a;

/* JADX INFO: loaded from: classes.dex */
final class p implements c.InterfaceC0001c, z2.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.f f4885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z2.b<?> f4886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a3.i f4887c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set<Scope> f4888d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4889e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ b f4890f;

    public p(b bVar, a.f fVar, z2.b<?> bVar2) {
        this.f4890f = bVar;
        this.f4885a = fVar;
        this.f4886b = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        a3.i iVar;
        if (!this.f4889e || (iVar = this.f4887c) == null) {
            return;
        }
        this.f4885a.a(iVar, this.f4888d);
    }

    @Override // z2.y
    public final void a(x2.b bVar) {
        m mVar = (m) this.f4890f.f4836l.get(this.f4886b);
        if (mVar != null) {
            mVar.F(bVar);
        }
    }

    @Override // z2.y
    public final void b(a3.i iVar, Set<Scope> set) {
        if (iVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            a(new x2.b(4));
        } else {
            this.f4887c = iVar;
            this.f4888d = set;
            h();
        }
    }

    @Override // a3.c.InterfaceC0001c
    public final void c(x2.b bVar) {
        this.f4890f.f4840p.post(new o(this, bVar));
    }
}
