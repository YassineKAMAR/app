package m3;

import android.app.Activity;
import android.app.Application;
import t3.a;

/* JADX INFO: loaded from: classes.dex */
final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f24843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f24844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f24845c;

    w2(Application application, a aVar, t tVar) {
        this.f24843a = application;
        this.f24844b = aVar;
        this.f24845c = tVar;
    }

    final g1 d(Activity activity, t3.d dVar) {
        t3.a aVarA = dVar.a();
        if (aVarA == null) {
            aVarA = new a.C0175a(this.f24843a).b();
        }
        return z2.a(new z2(this, activity, aVarA, dVar, null));
    }
}
