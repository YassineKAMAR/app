package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class qo extends z04 implements l24 {
    private static final qo zzb;
    private j14 zzd = z04.y();

    static {
        qo qoVar = new qo();
        zzb = qoVar;
        z04.E(qo.class, qoVar);
    }

    private qo() {
    }

    public static ko M() {
        return (ko) zzb.l();
    }

    static /* synthetic */ void O(qo qoVar, jo joVar) {
        joVar.getClass();
        j14 j14Var = qoVar.zzd;
        if (!j14Var.l()) {
            qoVar.zzd = z04.z(j14Var);
        }
        qoVar.zzd.add(joVar);
    }

    @Override // com.google.android.gms.internal.ads.z04
    protected final Object J(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return z04.B(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", jo.class});
        }
        if (i9 == 3) {
            return new qo();
        }
        co coVar = null;
        if (i9 == 4) {
            return new ko(coVar);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
