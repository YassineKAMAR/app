package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.b;
import androidx.room.c;
import androidx.room.e;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f2842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f2843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f2844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final androidx.room.e f2845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final e.c f2846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    androidx.room.c f2847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Executor f2848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final androidx.room.b f2849h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final AtomicBoolean f2850i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final ServiceConnection f2851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Runnable f2852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Runnable f2853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f2854m;

    class a extends b.a {

        /* JADX INFO: renamed from: androidx.room.f$a$a, reason: collision with other inner class name */
        class RunnableC0040a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String[] f2856a;

            RunnableC0040a(String[] strArr) {
                this.f2856a = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.f2845d.e(this.f2856a);
            }
        }

        a() {
        }

        @Override // androidx.room.b
        public void q1(String[] strArr) {
            f.this.f2848g.execute(new RunnableC0040a(strArr));
        }
    }

    class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            f.this.f2847f = c.a.k0(iBinder);
            f fVar = f.this;
            fVar.f2848g.execute(fVar.f2852k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            f fVar = f.this;
            fVar.f2848g.execute(fVar.f2853l);
            f.this.f2847f = null;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f fVar = f.this;
                androidx.room.c cVar = fVar.f2847f;
                if (cVar != null) {
                    fVar.f2844c = cVar.V1(fVar.f2849h, fVar.f2843b);
                    f fVar2 = f.this;
                    fVar2.f2845d.a(fVar2.f2846e);
                }
            } catch (RemoteException e8) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e8);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f2845d.g(fVar.f2846e);
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f2845d.g(fVar.f2846e);
            try {
                f fVar2 = f.this;
                androidx.room.c cVar = fVar2.f2847f;
                if (cVar != null) {
                    cVar.C5(fVar2.f2849h, fVar2.f2844c);
                }
            } catch (RemoteException e8) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e8);
            }
            f fVar3 = f.this;
            fVar3.f2842a.unbindService(fVar3.f2851j);
        }
    }

    /* JADX INFO: renamed from: androidx.room.f$f, reason: collision with other inner class name */
    class C0041f extends e.c {
        C0041f(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.e.c
        boolean a() {
            return true;
        }

        @Override // androidx.room.e.c
        public void b(Set<String> set) {
            if (f.this.f2850i.get()) {
                return;
            }
            try {
                f fVar = f.this;
                androidx.room.c cVar = fVar.f2847f;
                if (cVar != null) {
                    cVar.i5(fVar.f2844c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e8) {
                Log.w("ROOM", "Cannot broadcast invalidation", e8);
            }
        }
    }

    f(Context context, String str, androidx.room.e eVar, Executor executor) {
        b bVar = new b();
        this.f2851j = bVar;
        this.f2852k = new c();
        this.f2853l = new d();
        this.f2854m = new e();
        Context applicationContext = context.getApplicationContext();
        this.f2842a = applicationContext;
        this.f2843b = str;
        this.f2845d = eVar;
        this.f2848g = executor;
        this.f2846e = new C0041f((String[]) eVar.f2819a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, (Class<?>) MultiInstanceInvalidationService.class), bVar, 1);
    }
}
