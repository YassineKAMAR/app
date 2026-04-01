package z6;

import android.os.Handler;
import android.os.Looper;
import h6.g;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import y6.n1;
import y6.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends d {
    private volatile c _immediate;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f27768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f27769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f27770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f27771f;

    public c(Handler handler, String str) {
        this(handler, str, false);
    }

    public /* synthetic */ c(Handler handler, String str, int i8, j jVar) {
        this(handler, (i8 & 2) != 0 ? null : str);
    }

    private c(Handler handler, String str, boolean z7) {
        super(null);
        this.f27768c = handler;
        this.f27769d = str;
        this.f27770e = z7;
        this._immediate = z7 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f27771f = cVar;
    }

    private final void j0(g gVar, Runnable runnable) {
        n1.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        s0.b().e0(gVar, runnable);
    }

    @Override // y6.b0
    public void e0(g gVar, Runnable runnable) {
        if (this.f27768c.post(runnable)) {
            return;
        }
        j0(gVar, runnable);
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f27768c == this.f27768c;
    }

    @Override // y6.b0
    public boolean f0(g gVar) {
        return (this.f27770e && q.b(Looper.myLooper(), this.f27768c.getLooper())) ? false : true;
    }

    public int hashCode() {
        return System.identityHashCode(this.f27768c);
    }

    @Override // y6.u1
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public c h0() {
        return this.f27771f;
    }

    @Override // y6.u1, y6.b0
    public String toString() {
        String strI0 = i0();
        if (strI0 != null) {
            return strI0;
        }
        String string = this.f27769d;
        if (string == null) {
            string = this.f27768c.toString();
        }
        if (!this.f27770e) {
            return string;
        }
        return string + ".immediate";
    }
}
