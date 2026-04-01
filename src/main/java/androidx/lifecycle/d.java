package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicReference<Object> f2648a = new AtomicReference<>();

    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C0033a Companion = new C0033a(null);

        /* JADX INFO: renamed from: androidx.lifecycle.d$a$a, reason: collision with other inner class name */
        public static final class C0033a {

            /* JADX INFO: renamed from: androidx.lifecycle.d$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0034a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f2649a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f2649a = iArr;
                }
            }

            private C0033a() {
            }

            public /* synthetic */ C0033a(kotlin.jvm.internal.j jVar) {
                this();
            }

            public final a a(b state) {
                kotlin.jvm.internal.q.f(state, "state");
                int i8 = C0034a.f2649a[state.ordinal()];
                if (i8 == 1) {
                    return a.ON_DESTROY;
                }
                if (i8 == 2) {
                    return a.ON_STOP;
                }
                if (i8 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public final a b(b state) {
                kotlin.jvm.internal.q.f(state, "state");
                int i8 = C0034a.f2649a[state.ordinal()];
                if (i8 == 1) {
                    return a.ON_START;
                }
                if (i8 == 2) {
                    return a.ON_RESUME;
                }
                if (i8 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }
        }

        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2650a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f2650a = iArr;
            }
        }

        public final b c() {
            switch (b.f2650a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean c(b state) {
            kotlin.jvm.internal.q.f(state, "state");
            return compareTo(state) >= 0;
        }
    }

    public abstract void a(h hVar);

    public abstract b b();

    public abstract void c(h hVar);
}
