package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
final class zg0 extends ScheduledThreadPoolExecutor {
    zg0(int i8, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
