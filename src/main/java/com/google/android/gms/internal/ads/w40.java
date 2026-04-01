package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class w40 extends y40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c70 f16626a = new c70();

    @Override // com.google.android.gms.internal.ads.z40
    public final boolean b(String str) {
        try {
            return m2.a.class.isAssignableFrom(Class.forName(str, false, w40.class.getClassLoader()));
        } catch (Throwable unused) {
            qg0.g("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.z40
    public final d50 c(String str) throws RemoteException {
        a60 a60Var;
        try {
            try {
                Class<?> cls = Class.forName(str, false, w40.class.getClassLoader());
                if (l2.f.class.isAssignableFrom(cls)) {
                    return new a60((l2.f) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (l2.a.class.isAssignableFrom(cls)) {
                    return new a60((l2.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                qg0.g("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable th) {
                qg0.h("Could not instantiate mediation adapter: " + str + ". ", th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            qg0.b("Reflection failed, retrying using direct instantiation");
            if (!"com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    a60Var = new a60(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
            a60Var = new a60(new AdMobAdapter());
            return a60Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.z40
    public final y60 e(String str) {
        return new l70((RtbAdapter) Class.forName(str, false, c70.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // com.google.android.gms.internal.ads.z40
    public final boolean h(String str) {
        try {
            return l2.a.class.isAssignableFrom(Class.forName(str, false, w40.class.getClassLoader()));
        } catch (Throwable unused) {
            qg0.g("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }
}
