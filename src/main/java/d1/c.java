package d1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import x0.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<T> extends d<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f20949h = j.f("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final BroadcastReceiver f20950g;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(Context context, h1.a aVar) {
        super(context, aVar);
        this.f20950g = new a();
    }

    @Override // d1.d
    public void e() {
        j.c().a(f20949h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f20954b.registerReceiver(this.f20950g, g());
    }

    @Override // d1.d
    public void f() {
        j.c().a(f20949h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f20954b.unregisterReceiver(this.f20950g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
