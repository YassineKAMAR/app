package a3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends m0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f18g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ c f19h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c cVar, int i8, IBinder iBinder, Bundle bundle) {
        super(cVar, i8, bundle);
        this.f19h = cVar;
        this.f18g = iBinder;
    }

    @Override // a3.m0
    protected final void f(x2.b bVar) {
        if (this.f19h.f45v != null) {
            this.f19h.f45v.k0(bVar);
        }
        this.f19h.L(bVar);
    }

    @Override // a3.m0
    protected final boolean g() {
        String str;
        String interfaceDescriptor;
        try {
            IBinder iBinder = this.f18g;
            o.j(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
            str = "service probably died";
        }
        if (!this.f19h.E().equals(interfaceDescriptor)) {
            str = "service descriptor mismatch: " + this.f19h.E() + " vs. " + interfaceDescriptor;
            Log.w("GmsClient", str);
            return false;
        }
        IInterface iInterfaceS = this.f19h.s(this.f18g);
        if (iInterfaceS == null || !(c.g0(this.f19h, 2, 4, iInterfaceS) || c.g0(this.f19h, 3, 4, iInterfaceS))) {
            return false;
        }
        this.f19h.f49z = null;
        Bundle bundleX = this.f19h.x();
        c cVar = this.f19h;
        if (cVar.f44u == null) {
            return true;
        }
        cVar.f44u.H0(bundleX);
        return true;
    }
}
