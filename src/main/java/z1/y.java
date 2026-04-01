package z1;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.qg0;
import h2.j4;
import h2.p2;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f27678a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p2 f27679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f27680c;

    public static abstract class a {
        public void a() {
        }

        public void b(boolean z7) {
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public void a(a aVar) {
        j4 j4Var;
        synchronized (this.f27678a) {
            this.f27680c = aVar;
            p2 p2Var = this.f27679b;
            if (p2Var != null) {
                if (aVar == null) {
                    j4Var = null;
                } else {
                    try {
                        j4Var = new j4(aVar);
                    } catch (RemoteException e8) {
                        qg0.e("Unable to call setVideoLifecycleCallbacks on video controller.", e8);
                    }
                }
                p2Var.x4(j4Var);
            }
        }
    }

    public final p2 b() {
        p2 p2Var;
        synchronized (this.f27678a) {
            p2Var = this.f27679b;
        }
        return p2Var;
    }

    public final void c(p2 p2Var) {
        synchronized (this.f27678a) {
            this.f27679b = p2Var;
            a aVar = this.f27680c;
            if (aVar != null) {
                a(aVar);
            }
        }
    }
}
