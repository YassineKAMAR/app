package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qv extends c2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pv f13771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f13772b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f13773c;

    public qv(pv pvVar) {
        IBinder iBinder;
        this.f13771a = pvVar;
        try {
            this.f13773c = pvVar.q();
        } catch (RemoteException e8) {
            qg0.e("", e8);
            this.f13773c = "";
        }
        try {
            for (Object obj : pvVar.o()) {
                wv uvVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    uvVar = iInterfaceQueryLocalInterface instanceof wv ? (wv) iInterfaceQueryLocalInterface : new uv(iBinder);
                }
                if (uvVar != null) {
                    this.f13772b.add(new xv(uvVar));
                }
            }
        } catch (RemoteException e9) {
            qg0.e("", e9);
        }
    }
}
