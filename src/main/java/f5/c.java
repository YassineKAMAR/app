package f5;

import android.content.Context;
import android.os.Vibrator;
import l5.a;
import s5.k;

/* JADX INFO: loaded from: classes.dex */
public class c implements l5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f21785a;

    @Override // l5.a
    public void onAttachedToEngine(a.b bVar) {
        Context contextA = bVar.a();
        s5.c cVarB = bVar.b();
        b bVar2 = new b((Vibrator) contextA.getSystemService("vibrator"));
        k kVar = new k(cVarB, "vibrate");
        this.f21785a = kVar;
        kVar.e(bVar2);
    }

    @Override // l5.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f21785a.e(null);
        this.f21785a = null;
    }
}
