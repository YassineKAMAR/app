package g2;

import com.google.android.gms.internal.ads.fh;
import com.google.android.gms.internal.ads.gh;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class o implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f21978a;

    o(s sVar) {
        this.f21978a = sVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        s sVar = this.f21978a;
        return new gh(fh.x(sVar.f21986a.f16723a, sVar.f21989d, false));
    }
}
