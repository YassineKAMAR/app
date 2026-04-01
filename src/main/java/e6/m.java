package e6;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class m {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21434a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.f21435a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.f21436b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.f21437c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21434a = iArr;
        }
    }

    public static <T> k<T> a(o mode, p6.a<? extends T> initializer) {
        kotlin.jvm.internal.q.f(mode, "mode");
        kotlin.jvm.internal.q.f(initializer, "initializer");
        int i8 = a.f21434a[mode.ordinal()];
        if (i8 == 1) {
            return new v(initializer, null, 2, null);
        }
        if (i8 == 2) {
            return new u(initializer);
        }
        if (i8 == 3) {
            return new j0(initializer);
        }
        throw new p();
    }

    public static <T> k<T> b(p6.a<? extends T> initializer) {
        kotlin.jvm.internal.q.f(initializer, "initializer");
        return new v(initializer, null, 2, null);
    }
}
