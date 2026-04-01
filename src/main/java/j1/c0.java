package j1;

import com.google.android.gms.internal.play_billing.n4;
import com.google.android.gms.internal.play_billing.o4;
import com.google.android.gms.internal.play_billing.r4;
import com.google.android.gms.internal.play_billing.s4;
import com.google.android.gms.internal.play_billing.u4;
import com.google.android.gms.internal.play_billing.y4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 {
    public static o4 a(int i8, int i9, com.android.billingclient.api.f fVar) {
        try {
            n4 n4VarY = o4.y();
            u4 u4VarY = y4.y();
            u4VarY.q(fVar.b());
            u4VarY.p(fVar.a());
            u4VarY.r(i8);
            n4VarY.p(u4VarY);
            n4VarY.r(i9);
            return (o4) n4VarY.h();
        } catch (Exception e8) {
            com.google.android.gms.internal.play_billing.v.l("BillingLogger", "Unable to create logging payload", e8);
            return null;
        }
    }

    public static s4 b(int i8) {
        try {
            r4 r4VarX = s4.x();
            r4VarX.q(i8);
            return (s4) r4VarX.h();
        } catch (Exception e8) {
            com.google.android.gms.internal.play_billing.v.l("BillingLogger", "Unable to create logging payload", e8);
            return null;
        }
    }
}
