package s6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends r6.a {
    @Override // r6.c
    public long e(long j8, long j9) {
        return ThreadLocalRandom.current().nextLong(j8, j9);
    }

    @Override // r6.a
    public Random f() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        q.e(threadLocalRandomCurrent, "current()");
        return threadLocalRandomCurrent;
    }
}
