package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import x0.j;
import x0.l;
import x0.t;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f3178a = j.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        j.c().a(f3178a, "Requesting diagnostics", new Throwable[0]);
        try {
            t.d(context).c(l.d(DiagnosticsWorker.class));
        } catch (IllegalStateException e8) {
            j.c().b(f3178a, "WorkManager is not initialized", e8);
        }
    }
}
