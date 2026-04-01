package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class k43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final n43 f9945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f9946b;

    private k43(n43 n43Var) {
        this.f9945a = n43Var;
        this.f9946b = n43Var != null;
    }

    public static k43 b(Context context, String str, String str2) {
        n43 l43Var;
        try {
            try {
                try {
                    IBinder iBinderD = DynamiteModule.e(context, DynamiteModule.f4911b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderD == null) {
                        l43Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderD.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        l43Var = iInterfaceQueryLocalInterface instanceof n43 ? (n43) iInterfaceQueryLocalInterface : new l43(iBinderD);
                    }
                    l43Var.n4(g3.b.k3(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new k43(l43Var);
                } catch (Exception e8) {
                    throw new l33(e8);
                }
            } catch (RemoteException | l33 | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new k43(new o43());
            }
        } catch (Exception e9) {
            throw new l33(e9);
        }
    }

    public static k43 c() {
        o43 o43Var = new o43();
        Log.d("GASS", "Clearcut logging disabled");
        return new k43(o43Var);
    }

    public final j43 a(byte[] bArr) {
        return new j43(this, bArr, null);
    }
}
