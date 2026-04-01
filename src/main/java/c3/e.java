package c3;

import a3.g;
import a3.v;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import z2.h;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g<a> {
    private final v I;

    public e(Context context, Looper looper, a3.d dVar, v vVar, z2.c cVar, h hVar) {
        super(context, looper, 270, dVar, cVar, hVar);
        this.I = vVar;
    }

    @Override // a3.c
    protected final Bundle A() {
        return this.I.d();
    }

    @Override // a3.c
    protected final String E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // a3.c
    protected final String F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // a3.c
    protected final boolean I() {
        return true;
    }

    @Override // a3.c, y2.a.f
    public final int k() {
        return 203400000;
    }

    @Override // a3.c
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder);
    }

    @Override // a3.c
    public final x2.d[] v() {
        return k3.d.f24204b;
    }
}
