package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import x0.g;
import x0.i;
import x0.q;
import x0.v;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Executor f3078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Executor f3079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final v f3080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final i f3081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final q f3082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final g f3083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f3084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f3085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f3086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f3087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final int f3088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f3089l;

    /* JADX INFO: renamed from: androidx.work.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0046a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f3090a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3091b;

        ThreadFactoryC0046a(boolean z7) {
            this.f3091b = z7;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f3091b ? "WM.task-" : "androidx.work-") + this.f3090a.incrementAndGet());
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Executor f3093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        v f3094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        i f3095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Executor f3096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        q f3097e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        g f3098f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f3099g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f3100h = 4;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f3101i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f3102j = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f3103k = 20;

        public a a() {
            return new a(this);
        }
    }

    public interface c {
        a a();
    }

    a(b bVar) {
        Executor executor = bVar.f3093a;
        this.f3078a = executor == null ? a(false) : executor;
        Executor executorA = bVar.f3096d;
        if (executorA == null) {
            this.f3089l = true;
            executorA = a(true);
        } else {
            this.f3089l = false;
        }
        this.f3079b = executorA;
        v vVar = bVar.f3094b;
        this.f3080c = vVar == null ? v.c() : vVar;
        i iVar = bVar.f3095c;
        this.f3081d = iVar == null ? i.c() : iVar;
        q qVar = bVar.f3097e;
        this.f3082e = qVar == null ? new y0.a() : qVar;
        this.f3085h = bVar.f3100h;
        this.f3086i = bVar.f3101i;
        this.f3087j = bVar.f3102j;
        this.f3088k = bVar.f3103k;
        this.f3083f = bVar.f3098f;
        this.f3084g = bVar.f3099g;
    }

    private Executor a(boolean z7) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z7));
    }

    private ThreadFactory b(boolean z7) {
        return new ThreadFactoryC0046a(z7);
    }

    public String c() {
        return this.f3084g;
    }

    public g d() {
        return this.f3083f;
    }

    public Executor e() {
        return this.f3078a;
    }

    public i f() {
        return this.f3081d;
    }

    public int g() {
        return this.f3087j;
    }

    public int h() {
        return Build.VERSION.SDK_INT == 23 ? this.f3088k / 2 : this.f3088k;
    }

    public int i() {
        return this.f3086i;
    }

    public int j() {
        return this.f3085h;
    }

    public q k() {
        return this.f3082e;
    }

    public Executor l() {
        return this.f3079b;
    }

    public v m() {
        return this.f3080c;
    }
}
