package a3;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class k1 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l1 f125a;

    /* synthetic */ k1(l1 l1Var, j1 j1Var) {
        this.f125a = l1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i8 = message.what;
        if (i8 == 0) {
            synchronized (this.f125a.f126f) {
                g1 g1Var = (g1) message.obj;
                i1 i1Var = (i1) this.f125a.f126f.get(g1Var);
                if (i1Var != null && i1Var.i()) {
                    if (i1Var.j()) {
                        i1Var.g("GmsClientSupervisor");
                    }
                    this.f125a.f126f.remove(g1Var);
                }
            }
            return true;
        }
        if (i8 != 1) {
            return false;
        }
        synchronized (this.f125a.f126f) {
            g1 g1Var2 = (g1) message.obj;
            i1 i1Var2 = (i1) this.f125a.f126f.get(g1Var2);
            if (i1Var2 != null && i1Var2.a() == 3) {
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(g1Var2), new Exception());
                ComponentName componentNameB = i1Var2.b();
                if (componentNameB == null) {
                    componentNameB = g1Var2.a();
                }
                if (componentNameB == null) {
                    String strC = g1Var2.c();
                    o.j(strC);
                    componentNameB = new ComponentName(strC, "unknown");
                }
                i1Var2.onServiceDisconnected(componentNameB);
            }
        }
        return true;
    }
}
