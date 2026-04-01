package j2;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.ns;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f24029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f24030e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24028c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f24027b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f24026a = new o1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void e(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f24027b.entrySet()) {
            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                arrayList.add((BroadcastReceiver) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((BroadcastReceiver) arrayList.get(i8)).onReceive(context, intent);
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void b(Context context) {
        if (this.f24028c) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.f24030e = applicationContext;
        if (applicationContext == null) {
            this.f24030e = context;
        }
        ns.a(this.f24030e);
        this.f24029d = ((Boolean) h2.y.c().b(ns.F3)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        if (!((Boolean) h2.y.c().b(ns.ca)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            this.f24030e.registerReceiver(this.f24026a, intentFilter);
        } else {
            this.f24030e.registerReceiver(this.f24026a, intentFilter, 4);
        }
        this.f24028c = true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f24029d) {
            this.f24027b.put(broadcastReceiver, intentFilter);
            return;
        }
        ns.a(context);
        if (!((Boolean) h2.y.c().b(ns.ca)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void d(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f24029d) {
            this.f24027b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
