package j2;

import android.content.Context;
import com.google.android.gms.internal.ads.vg0;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vg0 f23949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f23950d;

    public d1(Context context, String str, String str2) {
        this.f23949c = new vg0(g2.t.r().D(context, str));
        this.f23950d = str2;
    }

    @Override // j2.b0
    public final void a() {
        this.f23949c.a(this.f23950d);
    }
}
