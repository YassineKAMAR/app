package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.c;
import x3.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    c<ListenableWorker.a> f3063f;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f3063f.p(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.f3063f.q(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    public final d<ListenableWorker.a> startWork() {
        this.f3063f = c.t();
        getBackgroundExecutor().execute(new a());
        return this.f3063f;
    }
}
