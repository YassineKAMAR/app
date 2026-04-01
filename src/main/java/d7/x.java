package d7;

import java.util.List;
import y6.u1;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f21075a = true;

    private static final y a(Throwable th, String str) throws Throwable {
        if (f21075a) {
            return new y(th, str);
        }
        if (th != null) {
            throw th;
        }
        d();
        throw new e6.h();
    }

    static /* synthetic */ y b(Throwable th, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            th = null;
        }
        if ((i8 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(u1 u1Var) {
        return u1Var.h0() instanceof y;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final u1 e(v vVar, List<? extends v> list) {
        try {
            return vVar.b(list);
        } catch (Throwable th) {
            return a(th, vVar.a());
        }
    }
}
