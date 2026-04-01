package c6;

import android.content.Context;
import kotlin.jvm.internal.q;
import l5.a;
import s5.k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements l5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f3475a;

    private final void a(s5.c cVar, Context context) {
        this.f3475a = new k(cVar, "PonnamKarthik/fluttertoast");
        d dVar = new d(context);
        k kVar = this.f3475a;
        if (kVar != null) {
            kVar.e(dVar);
        }
    }

    private final void b() {
        k kVar = this.f3475a;
        if (kVar != null) {
            kVar.e(null);
        }
        this.f3475a = null;
    }

    @Override // l5.a
    public void onAttachedToEngine(a.b binding) {
        q.f(binding, "binding");
        s5.c cVarB = binding.b();
        q.e(cVarB, "getBinaryMessenger(...)");
        Context contextA = binding.a();
        q.e(contextA, "getApplicationContext(...)");
        a(cVarB, contextA);
    }

    @Override // l5.a
    public void onDetachedFromEngine(a.b p02) {
        q.f(p02, "p0");
        b();
    }
}
