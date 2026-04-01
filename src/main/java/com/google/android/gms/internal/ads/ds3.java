package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ds3 implements oi3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ds3 f6999a = new ds3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final kp3 f7000b = kp3.b(new ip3() { // from class: com.google.android.gms.internal.ads.as3
        @Override // com.google.android.gms.internal.ads.ip3
        public final Object a(nh3 nh3Var) {
            return ss3.b((mo3) nh3Var);
        }
    }, mo3.class, ei3.class);

    ds3() {
    }

    public static void b() {
        qi3.g(f6999a);
        vo3.a().e(f7000b);
    }

    @Override // com.google.android.gms.internal.ads.oi3
    public final /* bridge */ /* synthetic */ Object a(ni3 ni3Var) throws GeneralSecurityException {
        Iterator it = ni3Var.d().iterator();
        while (it.hasNext()) {
            for (ii3 ii3Var : (List) it.next()) {
                if (ii3Var.b() instanceof yr3) {
                    yr3 yr3Var = (yr3) ii3Var.b();
                    wy3 wy3VarB = wy3.b(ii3Var.g());
                    if (!wy3VarB.equals(yr3Var.b())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + String.valueOf(yr3Var.a()) + " has wrong output prefix (" + yr3Var.b().toString() + ") instead of (" + wy3VarB.toString() + ")");
                    }
                }
            }
        }
        return new cs3(ni3Var, null);
    }

    @Override // com.google.android.gms.internal.ads.oi3
    public final Class j() {
        return ei3.class;
    }

    @Override // com.google.android.gms.internal.ads.oi3
    public final Class k() {
        return ei3.class;
    }
}
