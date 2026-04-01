package j2;

import android.content.Context;
import h2.z2;

/* JADX INFO: loaded from: classes.dex */
final class w extends h2.x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f24067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f24068b;

    w(z zVar, Context context) {
        this.f24068b = zVar;
        this.f24067a = context;
    }

    @Override // h2.z1
    public final void Z0(z2 z2Var) {
        if (z2Var == null) {
            return;
        }
        this.f24068b.i(this.f24067a, z2Var.f22384b, true, true);
    }
}
