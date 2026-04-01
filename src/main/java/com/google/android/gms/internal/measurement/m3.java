package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class m3 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Bundle f18942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Activity f18943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final /* synthetic */ g2.b f18944g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m3(g2.b bVar, Bundle bundle, Activity activity) {
        super(g2.this);
        this.f18944g = bVar;
        this.f18942e = bundle;
        this.f18943f = activity;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    final void a() {
        Bundle bundle;
        if (this.f18942e != null) {
            bundle = new Bundle();
            if (this.f18942e.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f18942e.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((v1) a3.o.j(g2.this.f18723i)).onActivityCreated(g3.b.k3(this.f18943f), bundle, this.f18725b);
    }
}
