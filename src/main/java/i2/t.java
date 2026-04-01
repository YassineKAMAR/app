package i2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.hc1;
import j2.k2;

/* JADX INFO: loaded from: classes.dex */
public final class t {
    public static final void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z7) {
        if (adOverlayInfoParcel.f4734k != 4 || adOverlayInfoParcel.f4726c != null) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
            intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f4736m.f16726d);
            intent.putExtra("shouldCallOnOverlayOpened", z7);
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
            intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
            if (!e3.m.f()) {
                intent.addFlags(524288);
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            g2.t.r();
            k2.s(context, intent);
            return;
        }
        h2.a aVar = adOverlayInfoParcel.f4725b;
        if (aVar != null) {
            aVar.Z();
        }
        hc1 hc1Var = adOverlayInfoParcel.f4744u;
        if (hc1Var != null) {
            hc1Var.f0();
        }
        Activity activityR = adOverlayInfoParcel.f4727d.r();
        i iVar = adOverlayInfoParcel.f4724a;
        if (iVar != null && iVar.f22506j && activityR != null) {
            context = activityR;
        }
        g2.t.j();
        i iVar2 = adOverlayInfoParcel.f4724a;
        a.b(context, iVar2, adOverlayInfoParcel.f4732i, iVar2 != null ? iVar2.f22505i : null);
    }
}
