package e5;

import android.content.Context;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import l5.a;
import s5.k;

/* JADX INFO: loaded from: classes.dex */
public final class d implements l5.a, m5.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f21398d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f21399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private dev.fluttercommunity.plus.share.a f21400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k f21401c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    @Override // m5.a
    public void onAttachedToActivity(m5.c binding) {
        q.f(binding, "binding");
        dev.fluttercommunity.plus.share.a aVar = this.f21400b;
        c cVar = null;
        if (aVar == null) {
            q.t("manager");
            aVar = null;
        }
        binding.a(aVar);
        c cVar2 = this.f21399a;
        if (cVar2 == null) {
            q.t("share");
        } else {
            cVar = cVar2;
        }
        cVar.l(binding.g());
    }

    @Override // l5.a
    public void onAttachedToEngine(a.b binding) {
        q.f(binding, "binding");
        this.f21401c = new k(binding.b(), "dev.fluttercommunity.plus/share");
        Context contextA = binding.a();
        q.e(contextA, "getApplicationContext(...)");
        this.f21400b = new dev.fluttercommunity.plus.share.a(contextA);
        Context contextA2 = binding.a();
        q.e(contextA2, "getApplicationContext(...)");
        dev.fluttercommunity.plus.share.a aVar = this.f21400b;
        k kVar = null;
        if (aVar == null) {
            q.t("manager");
            aVar = null;
        }
        c cVar = new c(contextA2, null, aVar);
        this.f21399a = cVar;
        dev.fluttercommunity.plus.share.a aVar2 = this.f21400b;
        if (aVar2 == null) {
            q.t("manager");
            aVar2 = null;
        }
        e5.a aVar3 = new e5.a(cVar, aVar2);
        k kVar2 = this.f21401c;
        if (kVar2 == null) {
            q.t("methodChannel");
        } else {
            kVar = kVar2;
        }
        kVar.e(aVar3);
    }

    @Override // m5.a
    public void onDetachedFromActivity() {
        c cVar = this.f21399a;
        if (cVar == null) {
            q.t("share");
            cVar = null;
        }
        cVar.l(null);
    }

    @Override // m5.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // l5.a
    public void onDetachedFromEngine(a.b binding) {
        q.f(binding, "binding");
        k kVar = this.f21401c;
        if (kVar == null) {
            q.t("methodChannel");
            kVar = null;
        }
        kVar.e(null);
    }

    @Override // m5.a
    public void onReattachedToActivityForConfigChanges(m5.c binding) {
        q.f(binding, "binding");
        onAttachedToActivity(binding);
    }
}
