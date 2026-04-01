package m3;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static v0 f24833a;

    public static v0 a(Context context) {
        v0 v0Var;
        synchronized (v0.class) {
            if (f24833a == null) {
                m mVar = new m(null);
                mVar.b((Application) context.getApplicationContext());
                f24833a = mVar.a();
            }
            v0Var = f24833a;
        }
        return v0Var;
    }

    public abstract u2 b();

    public abstract l0 c();
}
