package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class h83 implements Serializable {
    h83() {
    }

    public static h83 c() {
        return p73.f12780a;
    }

    public static h83 d(Object obj) {
        return obj == null ? p73.f12780a : new r83(obj);
    }

    public abstract h83 a(z73 z73Var);

    public abstract Object b(Object obj);
}
