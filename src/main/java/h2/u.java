package h2;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.du;
import com.google.android.gms.internal.ads.jg0;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.su;

/* JADX INFO: loaded from: classes.dex */
abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d1 f22303a;

    static {
        d1 b1Var = null;
        try {
            Object objNewInstance = t.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    b1Var = iInterfaceQueryLocalInterface instanceof d1 ? (d1) iInterfaceQueryLocalInterface : new b1(iBinder);
                }
            } else {
                qg0.g("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            qg0.g("Failed to instantiate ClientApi class.");
        }
        f22303a = b1Var;
    }

    u() {
    }

    private final Object e() {
        d1 d1Var = f22303a;
        if (d1Var == null) {
            qg0.g("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return b(d1Var);
        } catch (RemoteException e8) {
            qg0.h("Cannot invoke local loader using ClientApi class.", e8);
            return null;
        }
    }

    private final Object f() {
        try {
            return c();
        } catch (RemoteException e8) {
            qg0.h("Cannot invoke remote loader.", e8);
            return null;
        }
    }

    protected abstract Object a();

    protected abstract Object b(d1 d1Var);

    protected abstract Object c();

    public final Object d(Context context, boolean z7) {
        boolean z8;
        Object objE;
        if (!z7) {
            v.b();
            if (!jg0.w(context, 12451000)) {
                qg0.b("Google Play Services is not available.");
                z7 = true;
            }
        }
        boolean z9 = false;
        boolean z10 = !(DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
        ns.a(context);
        if (((Boolean) du.f7015a.e()).booleanValue()) {
            z8 = false;
        } else if (((Boolean) du.f7016b.e()).booleanValue()) {
            z8 = true;
            z9 = true;
        } else {
            z9 = z7 | z10;
            z8 = false;
        }
        if (z9) {
            objE = e();
            if (objE == null && !z8) {
                objE = f();
            }
        } else {
            Object objF = f();
            if (objF == null) {
                if (v.e().nextInt(((Long) su.f14826a.e()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    v.b().r(context, v.c().f16723a, "gmob-apps", bundle, true);
                }
            }
            objE = objF == null ? e() : objF;
        }
        return objE == null ? a() : objE;
    }
}
