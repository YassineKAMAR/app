package t6;

import f6.f0;

/* JADX INFO: loaded from: classes2.dex */
public class g implements Iterable<Long> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f26530d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f26531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f26533c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public g(long j8, long j9, long j10) {
        if (j10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j10 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f26531a = j8;
        this.f26532b = k6.c.d(j8, j9, j10);
        this.f26533c = j10;
    }

    public final long a() {
        return this.f26531a;
    }

    public final long e() {
        return this.f26532b;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public f0 iterator() {
        return new h(this.f26531a, this.f26532b, this.f26533c);
    }
}
