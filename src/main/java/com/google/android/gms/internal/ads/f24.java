package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class f24 {
    f24() {
    }

    public static final boolean a(Object obj) {
        return !((e24) obj).l();
    }

    public static final Object b(Object obj, Object obj2) {
        e24 e24VarH = (e24) obj;
        e24 e24Var = (e24) obj2;
        if (!e24Var.isEmpty()) {
            if (!e24VarH.l()) {
                e24VarH = e24VarH.h();
            }
            e24VarH.k(e24Var);
        }
        return e24VarH;
    }
}
