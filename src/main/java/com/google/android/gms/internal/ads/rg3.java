package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class rg3 {
    public static lg3 a(ExecutorService executorService) {
        if (executorService instanceof lg3) {
            return (lg3) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new qg3((ScheduledExecutorService) executorService) : new ng3(executorService);
    }

    public static Executor b() {
        return nf3.INSTANCE;
    }

    static Executor c(Executor executor, le3 le3Var) {
        executor.getClass();
        return executor == nf3.INSTANCE ? executor : new mg3(executor, le3Var);
    }
}
