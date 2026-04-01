package i1;

import android.os.Build;
import kotlin.jvm.internal.q;
import l5.a;
import s5.j;
import s5.k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements l5.a, k.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f22481a;

    @Override // l5.a
    public void onAttachedToEngine(a.b flutterPluginBinding) {
        q.f(flutterPluginBinding, "flutterPluginBinding");
        k kVar = new k(flutterPluginBinding.b(), "rive");
        this.f22481a = kVar;
        kVar.e(this);
    }

    @Override // l5.a
    public void onDetachedFromEngine(a.b binding) {
        q.f(binding, "binding");
        k kVar = this.f22481a;
        if (kVar == null) {
            q.t("channel");
            kVar = null;
        }
        kVar.e(null);
    }

    @Override // s5.k.c
    public void onMethodCall(j call, k.d result) {
        q.f(call, "call");
        q.f(result, "result");
        if (!q.b(call.f26252a, "getPlatformVersion")) {
            result.c();
            return;
        }
        result.a("Android " + Build.VERSION.RELEASE);
    }
}
