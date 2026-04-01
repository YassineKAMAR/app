package q7;

import android.os.Build;
import l5.a;
import s5.j;
import s5.k;

/* JADX INFO: loaded from: classes2.dex */
public class a implements l5.a, k.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f25813a;

    @Override // l5.a
    public void onAttachedToEngine(a.b bVar) {
        k kVar = new k(bVar.b(), "flutter_native_splash");
        this.f25813a = kVar;
        kVar.e(this);
    }

    @Override // l5.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f25813a.e(null);
    }

    @Override // s5.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        if (!jVar.f26252a.equals("getPlatformVersion")) {
            dVar.c();
            return;
        }
        dVar.a("Android " + Build.VERSION.RELEASE);
    }
}
