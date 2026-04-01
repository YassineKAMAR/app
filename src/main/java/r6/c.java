package r6;

import java.io.Serializable;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f26119a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f26120b = k6.b.f24237a.b();

    public static final class a extends c implements Serializable {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        @Override // r6.c
        public int b(int i8) {
            return c.f26120b.b(i8);
        }

        @Override // r6.c
        public int c() {
            return c.f26120b.c();
        }

        @Override // r6.c
        public long d() {
            return c.f26120b.d();
        }

        @Override // r6.c
        public long e(long j8, long j9) {
            return c.f26120b.e(j8, j9);
        }
    }

    public abstract int b(int i8);

    public abstract int c();

    public abstract long d();

    public long e(long j8, long j9) {
        long jD;
        boolean z7;
        long jD2;
        long j10;
        long jB;
        int iC;
        d.b(j8, j9);
        long j11 = j9 - j8;
        if (j11 <= 0) {
            do {
                jD = d();
                z7 = false;
                if (j8 <= jD && jD < j9) {
                    z7 = true;
                }
            } while (!z7);
            return jD;
        }
        if (((-j11) & j11) == j11) {
            int i8 = (int) j11;
            int i9 = (int) (j11 >>> 32);
            if (i8 != 0) {
                iC = b(d.c(i8));
            } else if (i9 == 1) {
                iC = c();
            } else {
                jB = (((long) b(d.c(i9))) << 32) + (((long) c()) & 4294967295L);
            }
            jB = ((long) iC) & 4294967295L;
        } else {
            do {
                jD2 = d() >>> 1;
                j10 = jD2 % j11;
            } while ((jD2 - j10) + (j11 - 1) < 0);
            jB = j10;
        }
        return j8 + jB;
    }
}
