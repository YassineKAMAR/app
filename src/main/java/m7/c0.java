package m7;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f24884e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    private static final long[] f24885f = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k7.f f24886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p6.p<k7.f, Integer, Boolean> f24887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f24888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f24889d;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0(k7.f descriptor, p6.p<? super k7.f, ? super Integer, Boolean> readIfAbsent) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        kotlin.jvm.internal.q.f(readIfAbsent, "readIfAbsent");
        this.f24886a = descriptor;
        this.f24887b = readIfAbsent;
        int iF = descriptor.f();
        if (iF <= 64) {
            this.f24888c = iF != 64 ? (-1) << iF : 0L;
            this.f24889d = f24885f;
        } else {
            this.f24888c = 0L;
            this.f24889d = e(iF);
        }
    }

    private final void b(int i8) {
        int i9 = (i8 >>> 6) - 1;
        long[] jArr = this.f24889d;
        jArr[i9] = jArr[i9] | (1 << (i8 & 63));
    }

    private final int c() {
        int length = this.f24889d.length;
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 1;
            int i10 = i9 * 64;
            long j8 = this.f24889d[i8];
            while (j8 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j8);
                j8 |= 1 << iNumberOfTrailingZeros;
                int i11 = iNumberOfTrailingZeros + i10;
                if (this.f24887b.invoke(this.f24886a, Integer.valueOf(i11)).booleanValue()) {
                    this.f24889d[i8] = j8;
                    return i11;
                }
            }
            this.f24889d[i8] = j8;
            i8 = i9;
        }
        return -1;
    }

    private final long[] e(int i8) {
        long[] jArr = new long[(i8 - 1) >>> 6];
        if ((i8 & 63) != 0) {
            jArr[f6.j.r(jArr)] = (-1) << i8;
        }
        return jArr;
    }

    public final void a(int i8) {
        if (i8 < 64) {
            this.f24888c |= 1 << i8;
        } else {
            b(i8);
        }
    }

    public final int d() {
        int iNumberOfTrailingZeros;
        int iF = this.f24886a.f();
        do {
            long j8 = this.f24888c;
            if (j8 == -1) {
                if (iF > 64) {
                    return c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j8);
            this.f24888c |= 1 << iNumberOfTrailingZeros;
        } while (!this.f24887b.invoke(this.f24886a, Integer.valueOf(iNumberOfTrailingZeros)).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
