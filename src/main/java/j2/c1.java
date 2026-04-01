package j2;

import android.content.Context;
import com.google.android.gms.internal.ads.pg0;
import com.google.android.gms.internal.ads.qg0;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class c1 extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f23942c;

    c1(Context context) {
        this.f23942c = context;
    }

    @Override // j2.b0
    public final void a() {
        boolean zC;
        try {
            zC = d2.a.c(this.f23942c);
        } catch (IOException | IllegalStateException | x2.g e8) {
            qg0.e("Fail to get isAdIdFakeForDebugLogging", e8);
            zC = false;
        }
        pg0.j(zC);
        qg0.g("Update ad debug logging enablement as " + zC);
    }
}
