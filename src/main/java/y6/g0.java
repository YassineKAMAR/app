package y6;

/* JADX INFO: loaded from: classes2.dex */
public enum g0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27494a;

        static {
            int[] iArr = new int[g0.values().length];
            try {
                iArr[g0.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g0.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g0.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f27494a = iArr;
        }
    }

    public final <R, T> void c(p6.p<? super R, ? super h6.d<? super T>, ? extends Object> pVar, R r8, h6.d<? super T> dVar) throws Throwable {
        int i8 = a.f27494a[ordinal()];
        if (i8 == 1) {
            e7.a.d(pVar, r8, dVar, null, 4, null);
            return;
        }
        if (i8 == 2) {
            h6.f.a(pVar, r8, dVar);
        } else if (i8 == 3) {
            e7.b.a(pVar, r8, dVar);
        } else if (i8 != 4) {
            throw new e6.p();
        }
    }

    public final boolean d() {
        return this == LAZY;
    }
}
