package a3;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class w0 extends l3.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f171b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(c cVar, Looper looper) {
        super(looper);
        this.f171b = cVar;
    }

    private static final void a(Message message) {
        x0 x0Var = (x0) message.obj;
        x0Var.b();
        x0Var.e();
    }

    private static final boolean b(Message message) {
        int i8 = message.what;
        return i8 == 2 || i8 == 1 || i8 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f171b.C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i8 = message.what;
        if ((i8 == 1 || i8 == 7 || ((i8 == 4 && !this.f171b.t()) || message.what == 5)) && !this.f171b.d()) {
            a(message);
            return;
        }
        int i9 = message.what;
        if (i9 == 4) {
            this.f171b.f49z = new x2.b(message.arg2);
            if (c.h0(this.f171b)) {
                c cVar = this.f171b;
                if (!cVar.A) {
                    cVar.i0(3, null);
                    return;
                }
            }
            c cVar2 = this.f171b;
            x2.b bVar = cVar2.f49z != null ? cVar2.f49z : new x2.b(8);
            this.f171b.f39p.c(bVar);
            this.f171b.L(bVar);
            return;
        }
        if (i9 == 5) {
            c cVar3 = this.f171b;
            x2.b bVar2 = cVar3.f49z != null ? cVar3.f49z : new x2.b(8);
            this.f171b.f39p.c(bVar2);
            this.f171b.L(bVar2);
            return;
        }
        if (i9 == 3) {
            Object obj = message.obj;
            x2.b bVar3 = new x2.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f171b.f39p.c(bVar3);
            this.f171b.L(bVar3);
            return;
        }
        if (i9 == 6) {
            this.f171b.i0(5, null);
            c cVar4 = this.f171b;
            if (cVar4.f44u != null) {
                cVar4.f44u.v0(message.arg2);
            }
            this.f171b.M(message.arg2);
            c.g0(this.f171b, 5, 1, null);
            return;
        }
        if (i9 == 2 && !this.f171b.g()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((x0) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
