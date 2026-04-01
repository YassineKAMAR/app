package c1;

import android.content.Context;
import android.os.Build;
import d1.i;
import f1.p;
import x0.k;

/* JADX INFO: loaded from: classes.dex */
public class g extends c<b1.b> {
    public g(Context context, h1.a aVar) {
        super(i.c(context, aVar).d());
    }

    @Override // c1.c
    boolean b(p pVar) {
        return pVar.f21660j.b() == k.UNMETERED || (Build.VERSION.SDK_INT >= 30 && pVar.f21660j.b() == k.TEMPORARILY_UNMETERED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c1.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(b1.b bVar) {
        return !bVar.a() || bVar.b();
    }
}
