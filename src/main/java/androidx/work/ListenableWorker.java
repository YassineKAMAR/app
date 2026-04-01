package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.work.impl.utils.futures.c;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import x0.e;
import x0.v;
import x3.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f3055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WorkerParameters f3056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f3057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3059e;

    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.ListenableWorker$a$a, reason: collision with other inner class name */
        public static final class C0045a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final androidx.work.b f3060a;

            public C0045a() {
                this(androidx.work.b.f3105c);
            }

            public C0045a(androidx.work.b bVar) {
                this.f3060a = bVar;
            }

            public androidx.work.b e() {
                return this.f3060a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0045a.class != obj.getClass()) {
                    return false;
                }
                return this.f3060a.equals(((C0045a) obj).f3060a);
            }

            public int hashCode() {
                return (C0045a.class.getName().hashCode() * 31) + this.f3060a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f3060a + '}';
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final androidx.work.b f3061a;

            public c() {
                this(androidx.work.b.f3105c);
            }

            public c(androidx.work.b bVar) {
                this.f3061a = bVar;
            }

            public androidx.work.b e() {
                return this.f3061a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f3061a.equals(((c) obj).f3061a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f3061a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f3061a + '}';
            }
        }

        a() {
        }

        public static a a() {
            return new C0045a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(androidx.work.b bVar) {
            return new c(bVar);
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f3055a = context;
        this.f3056b = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f3055a;
    }

    public Executor getBackgroundExecutor() {
        return this.f3056b.a();
    }

    public d<e> getForegroundInfoAsync() {
        c cVarT = c.t();
        cVarT.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return cVarT;
    }

    public final UUID getId() {
        return this.f3056b.c();
    }

    public final b getInputData() {
        return this.f3056b.d();
    }

    public final Network getNetwork() {
        return this.f3056b.e();
    }

    public final int getRunAttemptCount() {
        return this.f3056b.g();
    }

    public final Set<String> getTags() {
        return this.f3056b.h();
    }

    public h1.a getTaskExecutor() {
        return this.f3056b.i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.f3056b.j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.f3056b.k();
    }

    public v getWorkerFactory() {
        return this.f3056b.l();
    }

    public boolean isRunInForeground() {
        return this.f3059e;
    }

    public final boolean isStopped() {
        return this.f3057c;
    }

    public final boolean isUsed() {
        return this.f3058d;
    }

    public void onStopped() {
    }

    public final d<Void> setForegroundAsync(e eVar) {
        this.f3059e = true;
        return this.f3056b.b().a(getApplicationContext(), getId(), eVar);
    }

    public d<Void> setProgressAsync(b bVar) {
        return this.f3056b.f().a(getApplicationContext(), getId(), bVar);
    }

    public void setRunInForeground(boolean z7) {
        this.f3059e = z7;
    }

    public final void setUsed() {
        this.f3058d = true;
    }

    public abstract d<a> startWork();

    public final void stop() {
        this.f3057c = true;
        onStopped();
    }
}
