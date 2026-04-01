package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class wo2 {
    public static void a(AtomicReference atomicReference, vo2 vo2Var) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            vo2Var.a(obj);
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            qg0.h("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }
}
