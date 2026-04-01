package x2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"HandlerLeak"})
final class m extends k3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f27285b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f27285b = eVar;
        this.f27284a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i8 = message.what;
        if (i8 != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i8);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int iG = this.f27285b.g(this.f27284a);
        if (this.f27285b.j(iG)) {
            this.f27285b.o(this.f27284a, iG);
        }
    }
}
