package a3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f179b;

    public z0(c cVar, int i8) {
        this.f179b = cVar;
        this.f178a = i8;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c cVar = this.f179b;
        if (iBinder == null) {
            c.d0(cVar, 16);
            return;
        }
        synchronized (cVar.f37n) {
            c cVar2 = this.f179b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            cVar2.f38o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof l)) ? new p0(iBinder) : (l) iInterfaceQueryLocalInterface;
        }
        this.f179b.e0(0, null, this.f178a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f179b.f37n) {
            this.f179b.f38o = null;
        }
        Handler handler = this.f179b.f35l;
        handler.sendMessage(handler.obtainMessage(6, this.f178a, 1));
    }
}
