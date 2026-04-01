package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class j53 extends g53 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static j53 f9490h;

    private j53(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final j53 j(Context context) {
        j53 j53Var;
        synchronized (j53.class) {
            if (f9490h == null) {
                f9490h = new j53(context);
            }
            j53Var = f9490h;
        }
        return j53Var;
    }

    public final f53 i(long j8, boolean z7) {
        synchronized (j53.class) {
            if (p()) {
                return b(null, null, j8, z7);
            }
            return new f53();
        }
    }

    public final void k() {
        synchronized (j53.class) {
            if (g(false)) {
                f(false);
            }
        }
    }

    public final void l() throws IOException {
        this.f8222f.e("paidv2_publisher_option");
    }

    public final void m() throws IOException {
        this.f8222f.e("paidv2_user_option");
    }

    public final void n(boolean z7) throws IOException {
        this.f8222f.d("paidv2_user_option", Boolean.valueOf(z7));
    }

    public final void o(boolean z7) throws IOException {
        this.f8222f.d("paidv2_publisher_option", Boolean.valueOf(z7));
        if (z7) {
            return;
        }
        k();
    }

    public final boolean p() {
        return this.f8222f.f("paidv2_publisher_option", true);
    }

    public final boolean q() {
        return this.f8222f.f("paidv2_user_option", true);
    }
}
