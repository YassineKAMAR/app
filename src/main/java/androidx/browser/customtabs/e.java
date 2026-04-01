package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import b.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1218a;

    class a extends c {
        a(b.b bVar, ComponentName componentName, Context context) {
            super(bVar, componentName, context);
        }
    }

    public abstract void a(ComponentName componentName, c cVar);

    void b(Context context) {
        this.f1218a = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f1218a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        a(componentName, new a(b.a.k0(iBinder), componentName, this.f1218a));
    }
}
