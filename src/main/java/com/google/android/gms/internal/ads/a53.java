package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public interface a53 {
    ExecutorService a(int i8, ThreadFactory threadFactory, int i9);

    ExecutorService b(int i8);

    ExecutorService c(ThreadFactory threadFactory, int i8);
}
