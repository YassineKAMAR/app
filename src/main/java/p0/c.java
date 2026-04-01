package p0;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f25466d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f25467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.savedstate.a f25468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25469c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public final c a(d owner) {
            q.f(owner, "owner");
            return new c(owner, null);
        }
    }

    private c(d dVar) {
        this.f25467a = dVar;
        this.f25468b = new androidx.savedstate.a();
    }

    public /* synthetic */ c(d dVar, j jVar) {
        this(dVar);
    }

    public static final c a(d dVar) {
        return f25466d.a(dVar);
    }

    public final androidx.savedstate.a b() {
        return this.f25468b;
    }

    public final void c() {
        androidx.lifecycle.d dVarA = this.f25467a.a();
        if (!(dVarA.b() == d.b.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        dVarA.a(new Recreator(this.f25467a));
        this.f25468b.d(dVarA);
        this.f25469c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f25469c) {
            c();
        }
        androidx.lifecycle.d dVarA = this.f25467a.a();
        if (!dVarA.b().c(d.b.STARTED)) {
            this.f25468b.e(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + dVarA.b()).toString());
    }

    public final void e(Bundle outBundle) {
        q.f(outBundle, "outBundle");
        this.f25468b.f(outBundle);
    }
}
