package a3;

import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
abstract class m0 extends x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f145f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected m0(c cVar, int i8, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f145f = cVar;
        this.f143d = i8;
        this.f144e = bundle;
    }

    @Override // a3.x0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        x2.b bVar;
        if (this.f143d != 0) {
            this.f145f.i0(1, null);
            Bundle bundle = this.f144e;
            bVar = new x2.b(this.f143d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        } else {
            if (g()) {
                return;
            }
            this.f145f.i0(1, null);
            bVar = new x2.b(8, null);
        }
        f(bVar);
    }

    @Override // a3.x0
    protected final void b() {
    }

    protected abstract void f(x2.b bVar);

    protected abstract boolean g();
}
