package y0;

import a1.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import x0.j;
import x0.m;
import x0.p;
import x0.t;
import x0.u;

/* JADX INFO: loaded from: classes.dex */
public class i extends t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f27372j = x0.j.f("WorkManagerImpl");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static i f27373k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static i f27374l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f27375m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f27376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.work.a f27377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WorkDatabase f27378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h1.a f27379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<e> f27380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f27381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g1.f f27382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f27383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f27384i;

    public i(Context context, androidx.work.a aVar, h1.a aVar2) {
        this(context, aVar, aVar2, context.getResources().getBoolean(p.f27212a));
    }

    public i(Context context, androidx.work.a aVar, h1.a aVar2, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        x0.j.e(new j.a(aVar.j()));
        List<e> listG = g(applicationContext, aVar, aVar2);
        q(context, aVar, aVar2, workDatabase, listG, new d(context, aVar, aVar2, workDatabase, listG));
    }

    public i(Context context, androidx.work.a aVar, h1.a aVar2, boolean z7) {
        this(context, aVar, aVar2, WorkDatabase.s(context.getApplicationContext(), aVar2.c(), z7));
    }

    public static void e(Context context, androidx.work.a aVar) {
        synchronized (f27375m) {
            i iVar = f27373k;
            if (iVar != null && f27374l != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (iVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (f27374l == null) {
                    f27374l = new i(applicationContext, aVar, new h1.b(aVar.l()));
                }
                f27373k = f27374l;
            }
        }
    }

    @Deprecated
    public static i j() {
        synchronized (f27375m) {
            i iVar = f27373k;
            if (iVar != null) {
                return iVar;
            }
            return f27374l;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static i k(Context context) {
        i iVarJ;
        synchronized (f27375m) {
            iVarJ = j();
            if (iVarJ == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof a.c)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                e(applicationContext, ((a.c) applicationContext).a());
                iVarJ = k(applicationContext);
            }
        }
        return iVarJ;
    }

    private void q(Context context, androidx.work.a aVar, h1.a aVar2, WorkDatabase workDatabase, List<e> list, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f27376a = applicationContext;
        this.f27377b = aVar;
        this.f27379d = aVar2;
        this.f27378c = workDatabase;
        this.f27380e = list;
        this.f27381f = dVar;
        this.f27382g = new g1.f(workDatabase);
        this.f27383h = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f27379d.b(new ForceStopRunnable(applicationContext, this));
    }

    @Override // x0.t
    public m a(String str) {
        g1.a aVarD = g1.a.d(str, this);
        this.f27379d.b(aVarD);
        return aVarD.e();
    }

    @Override // x0.t
    public m b(List<? extends u> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new g(this, list).a();
    }

    public m f(UUID uuid) {
        g1.a aVarB = g1.a.b(uuid, this);
        this.f27379d.b(aVarB);
        return aVarB.e();
    }

    public List<e> g(Context context, androidx.work.a aVar, h1.a aVar2) {
        return Arrays.asList(f.a(context, this), new z0.b(context, aVar, aVar2, this));
    }

    public Context h() {
        return this.f27376a;
    }

    public androidx.work.a i() {
        return this.f27377b;
    }

    public g1.f l() {
        return this.f27382g;
    }

    public d m() {
        return this.f27381f;
    }

    public List<e> n() {
        return this.f27380e;
    }

    public WorkDatabase o() {
        return this.f27378c;
    }

    public h1.a p() {
        return this.f27379d;
    }

    public void r() {
        synchronized (f27375m) {
            this.f27383h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f27384i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f27384i = null;
            }
        }
    }

    public void s() {
        if (Build.VERSION.SDK_INT >= 23) {
            k.b(h());
        }
        o().B().u();
        f.b(i(), o(), n());
    }

    public void t(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f27375m) {
            this.f27384i = pendingResult;
            if (this.f27383h) {
                pendingResult.finish();
                this.f27384i = null;
            }
        }
    }

    public void u(String str) {
        v(str, null);
    }

    public void v(String str, WorkerParameters.a aVar) {
        this.f27379d.b(new g1.j(this, str, aVar));
    }

    public void w(String str) {
        this.f27379d.b(new g1.k(this, str, true));
    }

    public void x(String str) {
        this.f27379d.b(new g1.k(this, str, false));
    }
}
