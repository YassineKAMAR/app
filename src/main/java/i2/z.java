package i2;

import android.app.Activity;
import android.os.Bundle;
import j2.v1;

/* JADX INFO: loaded from: classes.dex */
public final class z extends s {
    public z(Activity activity) {
        super(activity);
    }

    @Override // i2.s, com.google.android.gms.internal.ads.q80
    public final void C3(Bundle bundle) {
        v1.k("AdOverlayParcel is null or does not contain valid overlay type.");
        this.f22539u = 4;
        this.f22519a.finish();
    }
}
