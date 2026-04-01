package com.revenuecat.purchases.common;

import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.verification.SignatureVerificationException;
import e6.i0;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import org.json.JSONException;
import t6.i;
import t6.l;

/* JADX INFO: loaded from: classes.dex */
public class Dispatcher {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final double INTEGRATION_TEST_DELAY_PERCENTAGE = 0.01d;
    private final ExecutorService executorService;
    private final Handler mainHandler;
    private final boolean runningIntegrationTests;

    public static abstract class AsyncCall implements Runnable {
        public abstract HTTPResult call();

        public void onCompletion(HTTPResult result) {
            q.f(result, "result");
        }

        public void onError(PurchasesError error) {
            q.f(error, "error");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                onCompletion(call());
            } catch (SignatureVerificationException | IOException | SecurityException | JSONException e8) {
                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e8);
                LogUtilsKt.errorLog(purchasesError);
                onError(purchasesError);
            }
        }
    }

    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public Dispatcher(ExecutorService executorService, Handler handler, boolean z7) {
        q.f(executorService, "executorService");
        this.executorService = executorService;
        this.mainHandler = handler;
        this.runningIntegrationTests = z7;
    }

    public /* synthetic */ Dispatcher(ExecutorService executorService, Handler handler, boolean z7, int i8, j jVar) {
        this(executorService, (i8 & 2) != 0 ? new Handler(Looper.getMainLooper()) : handler, (i8 & 4) != 0 ? false : z7);
    }

    public static /* synthetic */ void enqueue$default(Dispatcher dispatcher, Runnable runnable, Delay delay, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
        }
        if ((i8 & 2) != 0) {
            delay = Delay.NONE;
        }
        dispatcher.enqueue(runnable, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$2$lambda$1(Runnable command, Dispatcher this$0) {
        q.f(command, "$command");
        q.f(this$0, "this$0");
        try {
            command.run();
        } catch (Exception e8) {
            LogUtilsKt.errorLog$default("Exception running command: " + e8, null, 2, null);
            Handler handler = this$0.mainHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.revenuecat.purchases.common.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        Dispatcher.enqueue$lambda$2$lambda$1$lambda$0(e8);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$2$lambda$1$lambda$0(Exception e8) throws Exception {
        q.f(e8, "$e");
        throw e8;
    }

    public void close() {
        synchronized (this.executorService) {
            this.executorService.shutdownNow();
        }
    }

    public void enqueue(final Runnable command, Delay delay) {
        q.f(command, "command");
        q.f(delay, "delay");
        synchronized (this.executorService) {
            if (!this.executorService.isShutdown()) {
                Runnable runnable = new Runnable() { // from class: com.revenuecat.purchases.common.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        Dispatcher.enqueue$lambda$2$lambda$1(command, this);
                    }
                };
                if (delay == Delay.NONE || !(this.executorService instanceof ScheduledExecutorService)) {
                    this.executorService.submit(runnable);
                } else {
                    long jI = l.i(new i(x6.a.u(delay.m10getMinDelayUwyO8pc()), x6.a.u(delay.m9getMaxDelayUwyO8pc())), r6.c.f26119a);
                    if (this.runningIntegrationTests) {
                        jI = (long) (jI * 0.01d);
                    }
                    ((ScheduledExecutorService) this.executorService).schedule(runnable, jI, TimeUnit.MILLISECONDS);
                }
            }
            i0 i0Var = i0.f21430a;
        }
    }

    public boolean isClosed() {
        boolean zIsShutdown;
        synchronized (this.executorService) {
            zIsShutdown = this.executorService.isShutdown();
        }
        return zIsShutdown;
    }
}
