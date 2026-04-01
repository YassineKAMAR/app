package m3;

import android.app.Application;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class r implements q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f24802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f24803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f24804c;

    public r(Application application, t tVar, Executor executor) {
        this.f24802a = application;
        this.f24803b = tVar;
        this.f24804c = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // m3.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r9, org.json.JSONObject r10) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.r.a(java.lang.String, org.json.JSONObject):boolean");
    }

    @Override // m3.q2
    public final Executor j() {
        return this.f24804c;
    }
}
