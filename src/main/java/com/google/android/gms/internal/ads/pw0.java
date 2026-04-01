package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class pw0 implements tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private fm0 f13162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f13163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aw0 f13164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e3.e f13165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f13166e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f13167f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final dw0 f13168g = new dw0();

    public pw0(Executor executor, aw0 aw0Var, e3.e eVar) {
        this.f13163b = executor;
        this.f13164c = aw0Var;
        this.f13165d = eVar;
    }

    private final void k() {
        try {
            final JSONObject jSONObjectB = this.f13164c.b(this.f13168g);
            if (this.f13162a != null) {
                this.f13163b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ow0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f12651a.e(jSONObjectB);
                    }
                });
            }
        } catch (JSONException e8) {
            j2.v1.l("Failed to call video active view js", e8);
        }
    }

    public final void a() {
        this.f13166e = false;
    }

    public final void b() {
        this.f13166e = true;
        k();
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void b0(sk skVar) {
        boolean z7 = this.f13167f ? false : skVar.f14729j;
        dw0 dw0Var = this.f13168g;
        dw0Var.f7027a = z7;
        dw0Var.f7030d = this.f13165d.b();
        this.f13168g.f7032f = skVar;
        if (this.f13166e) {
            k();
        }
    }

    final /* synthetic */ void e(JSONObject jSONObject) {
        this.f13162a.x0("AFMA_updateActiveView", jSONObject);
    }

    public final void h(boolean z7) {
        this.f13167f = z7;
    }

    public final void j(fm0 fm0Var) {
        this.f13162a = fm0Var;
    }
}
