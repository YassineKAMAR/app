package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h03 extends k03 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static final h03 f8586d = new h03();

    private h03() {
    }

    public static h03 i() {
        return f8586d;
    }

    @Override // com.google.android.gms.internal.ads.k03
    public final void b(boolean z7) {
        Iterator it = i03.a().c().iterator();
        while (it.hasNext()) {
            w03 w03VarG = ((uz2) it.next()).g();
            if (w03VarG.l()) {
                p03.a().b(w03VarG.a(), "setState", true != z7 ? "backgrounded" : "foregrounded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k03
    public final boolean c() {
        Iterator it = i03.a().b().iterator();
        while (it.hasNext()) {
            View viewF = ((uz2) it.next()).f();
            if (viewF != null && viewF.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
