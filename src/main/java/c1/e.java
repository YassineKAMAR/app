package c1;

import android.content.Context;
import android.os.Build;
import d1.i;
import f1.p;
import x0.j;
import x0.k;

/* JADX INFO: loaded from: classes.dex */
public class e extends c<b1.b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f3407e = j.f("NetworkMeteredCtrlr");

    public e(Context context, h1.a aVar) {
        super(i.c(context, aVar).d());
    }

    @Override // c1.c
    boolean b(p pVar) {
        return pVar.f21660j.b() == k.METERED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // c1.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(b1.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (bVar.a() && bVar.b()) ? false : true;
        }
        j.c().a(f3407e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !bVar.a();
    }
}
