package androidx.window.layout;

import android.app.Activity;
import e6.i0;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private static final int BUFFER_CAPACITY = 10;
    public static final Companion Companion = new Companion(null);
    private final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {54, 55}, m = "invokeSuspend")
    static final class AnonymousClass1 extends l implements p<b7.c<? super WindowLayoutInfo>, h6.d<? super i0>, Object> {
        final /* synthetic */ Activity $activity;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Activity activity, h6.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$activity = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m7invokeSuspend$lambda0(a7.d dVar, WindowLayoutInfo info) {
            q.e(info, "info");
            dVar.a(info);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final h6.d<i0> create(Object obj, h6.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = WindowInfoTrackerImpl.this.new AnonymousClass1(this.$activity, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p6.p
        public final Object invoke(b7.c<? super WindowLayoutInfo> cVar, h6.d<? super i0> dVar) {
            return ((AnonymousClass1) create(cVar, dVar)).invokeSuspend(i0.f21430a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #0 {all -> 0x00a1, blocks: (B:17:0x0064, B:21:0x0076, B:23:0x007e), top: B:35:0x0064 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0093 -> B:35:0x0064). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = i6.b.e()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L39
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r9.L$2
                a7.e r1 = (a7.e) r1
                java.lang.Object r4 = r9.L$1
                androidx.core.util.a r4 = (androidx.core.util.a) r4
                java.lang.Object r5 = r9.L$0
                b7.c r5 = (b7.c) r5
                e6.t.b(r10)     // Catch: java.lang.Throwable -> La3
                r10 = r5
                goto L63
            L1f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L27:
                java.lang.Object r1 = r9.L$2
                a7.e r1 = (a7.e) r1
                java.lang.Object r4 = r9.L$1
                androidx.core.util.a r4 = (androidx.core.util.a) r4
                java.lang.Object r5 = r9.L$0
                b7.c r5 = (b7.c) r5
                e6.t.b(r10)     // Catch: java.lang.Throwable -> La3
                r6 = r5
                r5 = r9
                goto L76
            L39:
                e6.t.b(r10)
                java.lang.Object r10 = r9.L$0
                b7.c r10 = (b7.c) r10
                r1 = 10
                a7.a r4 = a7.a.DROP_OLDEST
                r5 = 4
                r6 = 0
                a7.d r1 = a7.f.b(r1, r4, r6, r5, r6)
                androidx.window.layout.f r4 = new androidx.window.layout.f
                r4.<init>()
                androidx.window.layout.WindowInfoTrackerImpl r5 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r5 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r5)
                android.app.Activity r6 = r9.$activity
                l0.b r7 = new l0.b
                r7.<init>()
                r5.registerLayoutChangeCallback(r6, r7, r4)
                a7.e r1 = r1.iterator()     // Catch: java.lang.Throwable -> La3
            L63:
                r5 = r9
            L64:
                r5.L$0 = r10     // Catch: java.lang.Throwable -> La1
                r5.L$1 = r4     // Catch: java.lang.Throwable -> La1
                r5.L$2 = r1     // Catch: java.lang.Throwable -> La1
                r5.label = r3     // Catch: java.lang.Throwable -> La1
                java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> La1
                if (r6 != r0) goto L73
                return r0
            L73:
                r8 = r6
                r6 = r10
                r10 = r8
            L76:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La1
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La1
                if (r10 == 0) goto L95
                java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> La1
                androidx.window.layout.WindowLayoutInfo r10 = (androidx.window.layout.WindowLayoutInfo) r10     // Catch: java.lang.Throwable -> La1
                r5.L$0 = r6     // Catch: java.lang.Throwable -> La1
                r5.L$1 = r4     // Catch: java.lang.Throwable -> La1
                r5.L$2 = r1     // Catch: java.lang.Throwable -> La1
                r5.label = r2     // Catch: java.lang.Throwable -> La1
                java.lang.Object r10 = r6.emit(r10, r5)     // Catch: java.lang.Throwable -> La1
                if (r10 != r0) goto L93
                return r0
            L93:
                r10 = r6
                goto L64
            L95:
                androidx.window.layout.WindowInfoTrackerImpl r10 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r10 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r10)
                r10.unregisterLayoutChangeCallback(r4)
                e6.i0 r10 = e6.i0.f21430a
                return r10
            La1:
                r10 = move-exception
                goto La5
            La3:
                r10 = move-exception
                r5 = r9
            La5:
                androidx.window.layout.WindowInfoTrackerImpl r0 = androidx.window.layout.WindowInfoTrackerImpl.this
                androidx.window.layout.WindowBackend r0 = androidx.window.layout.WindowInfoTrackerImpl.access$getWindowBackend$p(r0)
                r0.unregisterLayoutChangeCallback(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator, WindowBackend windowBackend) {
        q.f(windowMetricsCalculator, "windowMetricsCalculator");
        q.f(windowBackend, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public b7.b<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        q.f(activity, "activity");
        return b7.d.a(new AnonymousClass1(activity, null));
    }
}
