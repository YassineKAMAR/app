package d2;

import a3.o;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import i3.e;
import i3.f;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import x2.g;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    x2.a f20972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    f f20973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f20974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f20975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    c f20976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f20977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f20978g;

    /* JADX INFO: renamed from: d2.a$a, reason: collision with other inner class name */
    public static final class C0100a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f20979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f20980b;

        @Deprecated
        public C0100a(String str, boolean z7) {
            this.f20979a = str;
            this.f20980b = z7;
        }

        public String a() {
            return this.f20979a;
        }

        public boolean b() {
            return this.f20980b;
        }

        public String toString() {
            String str = this.f20979a;
            boolean z7 = this.f20980b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z7);
            return sb.toString();
        }
    }

    public a(Context context) {
        this(context, 30000L, false, false);
    }

    public a(Context context, long j8, boolean z7, boolean z8) {
        Context applicationContext;
        this.f20975d = new Object();
        o.j(context);
        if (z7 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f20977f = context;
        this.f20974c = false;
        this.f20978g = j8;
    }

    public static C0100a a(Context context) {
        a aVar = new a(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.g(false);
            C0100a c0100aI = aVar.i(-1);
            aVar.h(c0100aI, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            return c0100aI;
        } finally {
        }
    }

    public static boolean c(Context context) {
        boolean zP;
        a aVar = new a(context, -1L, false, false);
        try {
            aVar.g(false);
            o.i("Calling this from your main thread can lead to deadlock");
            synchronized (aVar) {
                if (aVar.f20974c) {
                    o.j(aVar.f20972a);
                    o.j(aVar.f20973b);
                    zP = aVar.f20973b.p();
                } else {
                    synchronized (aVar.f20975d) {
                        c cVar = aVar.f20976e;
                        if (cVar == null || !cVar.f20985d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        aVar.g(false);
                        if (!aVar.f20974c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                        o.j(aVar.f20972a);
                        o.j(aVar.f20973b);
                        try {
                            zP = aVar.f20973b.p();
                        } catch (RemoteException e8) {
                            Log.i("AdvertisingIdClient", "GMS remote exception ", e8);
                            throw new IOException("Remote exception");
                        }
                    } catch (Exception e9) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e9);
                    }
                }
            }
            aVar.j();
            return zP;
        } finally {
            aVar.f();
        }
    }

    public static void d(boolean z7) {
    }

    private final C0100a i(int i8) {
        C0100a c0100a;
        o.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f20974c) {
                o.j(this.f20972a);
                o.j(this.f20973b);
                c0100a = new C0100a(this.f20973b.l(), this.f20973b.s1(true));
            } else {
                synchronized (this.f20975d) {
                    c cVar = this.f20976e;
                    if (cVar == null || !cVar.f20985d) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    g(false);
                    if (!this.f20974c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    o.j(this.f20972a);
                    o.j(this.f20973b);
                    try {
                        c0100a = new C0100a(this.f20973b.l(), this.f20973b.s1(true));
                    } catch (RemoteException e8) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e8);
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e9) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e9);
                }
            }
        }
        j();
        return c0100a;
    }

    private final void j() {
        synchronized (this.f20975d) {
            c cVar = this.f20976e;
            if (cVar != null) {
                cVar.f20984c.countDown();
                try {
                    this.f20976e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j8 = this.f20978g;
            if (j8 > 0) {
                this.f20976e = new c(this, j8);
            }
        }
    }

    public C0100a b() {
        return i(-1);
    }

    public void e() {
        g(true);
    }

    public final void f() {
        o.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f20977f == null || this.f20972a == null) {
                return;
            }
            try {
                if (this.f20974c) {
                    d3.b.b().c(this.f20977f, this.f20972a);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.f20974c = false;
            this.f20973b = null;
            this.f20972a = null;
        }
    }

    protected final void finalize() throws Throwable {
        f();
        super.finalize();
    }

    protected final void g(boolean z7) {
        o.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f20974c) {
                f();
            }
            Context context = this.f20977f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int iH = x2.f.f().h(context, 12451000);
                if (iH != 0 && iH != 2) {
                    throw new IOException("Google Play services not available");
                }
                x2.a aVar = new x2.a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!d3.b.b().a(context, intent, aVar, 1)) {
                        throw new IOException("Connection failure");
                    }
                    this.f20972a = aVar;
                    try {
                        this.f20973b = e.k0(aVar.a(10000L, TimeUnit.MILLISECONDS));
                        this.f20974c = true;
                        if (z7) {
                            j();
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th) {
                        throw new IOException(th);
                    }
                } finally {
                    IOException iOException = new IOException(th);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new g(9);
            }
        }
    }

    final boolean h(C0100a c0100a, boolean z7, float f8, long j8, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (c0100a != null) {
            map.put("limit_ad_tracking", true != c0100a.b() ? "0" : "1");
            String strA = c0100a.a();
            if (strA != null) {
                map.put("ad_id_size", Integer.toString(strA.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j8));
        new b(this, map).start();
        return true;
    }
}
