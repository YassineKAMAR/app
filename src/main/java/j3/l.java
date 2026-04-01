package j3;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class l implements u2.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static u2.b f24096e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f24099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f24100d;

    l(Context context) {
        this.f24098b = false;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f24099c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f24100d = Executors.newSingleThreadExecutor();
        this.f24097a = context;
        if (this.f24098b) {
            return;
        }
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new j(this, null), 0L, 86400L, TimeUnit.SECONDS);
        this.f24098b = true;
    }

    static synchronized u2.b d(Context context) {
        a3.o.k(context, "Context must not be null");
        if (f24096e == null) {
            f24096e = new l(context.getApplicationContext());
        }
        return f24096e;
    }

    protected static final void f(Context context) {
        if (!g(context).edit().remove("app_set_id").commit()) {
            String strValueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new String("Failed to clear app set ID generated for App "));
        }
        if (g(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String strValueOf2 = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new String("Failed to clear app set ID last used time for App "));
    }

    private static final SharedPreferences g(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    private static final void h(Context context) throws k {
        if (g(context).edit().putLong("app_set_id_last_used_time", e3.h.d().a()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new k("Failed to store the app set ID last used time.");
    }

    @Override // u2.b
    public final s3.h<u2.c> a() {
        final s3.i iVar = new s3.i();
        this.f24100d.execute(new Runnable() { // from class: j3.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f24093a.e(iVar);
            }
        });
        return iVar.a();
    }

    protected final long b() {
        long j8 = g(this.f24097a).getLong("app_set_id_last_used_time", -1L);
        if (j8 != -1) {
            return j8 + 33696000000L;
        }
        return -1L;
    }

    final /* synthetic */ void e(s3.i iVar) {
        String string = g(this.f24097a).getString("app_set_id", null);
        long jB = b();
        if (string == null || e3.h.d().a() > jB) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f24097a;
                if (!g(context).edit().putString("app_set_id", string).commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                    throw new k("Failed to store the app set ID.");
                }
                h(context);
                Context context2 = this.f24097a;
                if (!g(context2).edit().putLong("app_set_id_creation_time", e3.h.d().a()).commit()) {
                    String strValueOf2 = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new k("Failed to store the app set ID creation time.");
                }
            } catch (k e8) {
                iVar.b(e8);
                return;
            }
        } else {
            try {
                h(this.f24097a);
            } catch (k e9) {
                iVar.b(e9);
                return;
            }
        }
        iVar.c(new u2.c(string, 1));
    }
}
