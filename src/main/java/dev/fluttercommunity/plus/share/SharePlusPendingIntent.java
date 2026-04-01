package dev.fluttercommunity.plus.share;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class SharePlusPendingIntent extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21081a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f21082b = "";

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public final String a() {
            return SharePlusPendingIntent.f21082b;
        }

        public final void b(String str) {
            q.f(str, "<set-?>");
            SharePlusPendingIntent.f21082b = str;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        q.f(context, "context");
        q.f(intent, "intent");
        ComponentName componentName = (ComponentName) (Build.VERSION.SDK_INT >= 33 ? intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT", ComponentName.class) : intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT"));
        if (componentName != null) {
            String strFlattenToString = componentName.flattenToString();
            q.e(strFlattenToString, "flattenToString(...)");
            f21082b = strFlattenToString;
        }
    }
}
