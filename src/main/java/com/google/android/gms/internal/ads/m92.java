package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f11211a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xn1 f11212b;

    public m92(xn1 xn1Var) {
        this.f11212b = xn1Var;
    }

    public final y60 a(String str) {
        if (this.f11211a.containsKey(str)) {
            return (y60) this.f11211a.get(str);
        }
        return null;
    }

    public final void b(String str) {
        try {
            this.f11211a.put(str, this.f11212b.b(str));
        } catch (RemoteException e8) {
            qg0.e("Couldn't create RTB adapter : ", e8);
        }
    }
}
