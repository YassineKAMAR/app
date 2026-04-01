package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.a;
import androidx.work.b;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.qg0;
import g3.b;
import j2.u0;
import x0.b;
import x0.k;
import x0.l;
import x0.t;

/* JADX INFO: loaded from: classes.dex */
public class WorkManagerUtil extends u0 {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void O5(Context context) {
        try {
            t.e(context.getApplicationContext(), new a.b().a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // j2.v0
    public final void zze(g3.a aVar) {
        Context context = (Context) b.H0(aVar);
        O5(context);
        try {
            t tVarD = t.d(context);
            tVarD.a("offline_ping_sender_work");
            tVarD.c(new l.a(OfflinePingSender.class).e(new b.a().b(k.CONNECTED).a()).a("offline_ping_sender_work").b());
        } catch (IllegalStateException e8) {
            qg0.h("Failed to instantiate WorkManager.", e8);
        }
    }

    @Override // j2.v0
    public final boolean zzf(g3.a aVar, String str, String str2) throws Throwable {
        Context context = (Context) g3.b.H0(aVar);
        O5(context);
        x0.b bVarA = new b.a().b(k.CONNECTED).a();
        try {
            t.d(context).c(new l.a(OfflineNotificationPoster.class).e(bVarA).f(new b.a().e("uri", str).e("gws_query_id", str2).a()).a("offline_notification_work").b());
            return true;
        } catch (IllegalStateException e8) {
            qg0.h("Failed to instantiate WorkManager.", e8);
            return false;
        }
    }
}
