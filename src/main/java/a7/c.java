package a7;

import d7.h0;
import d7.k0;
import e6.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i<Object> f263a = new i<>(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f264b = k0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f265c = k0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h0 f266d = new h0("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h0 f267e = new h0("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h0 f268f = new h0("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final h0 f269g = new h0("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final h0 f270h = new h0("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final h0 f271i = new h0("DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final h0 f272j = new h0("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final h0 f273k = new h0("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final h0 f274l = new h0("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final h0 f275m = new h0("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final h0 f276n = new h0("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final h0 f277o = new h0("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final h0 f278p = new h0("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final h0 f279q = new h0("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final h0 f280r = new h0("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final h0 f281s = new h0("NO_CLOSE_CAUSE");

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* synthetic */ class a<E> extends kotlin.jvm.internal.o implements p6.p<Long, i<E>, i<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f282a = new a();

        a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final i<E> e(long j8, i<E> iVar) {
            return c.v(j8, iVar);
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ Object invoke(Long l8, Object obj) {
            return e(l8.longValue(), (i) obj);
        }
    }

    static /* synthetic */ boolean A(y6.j jVar, Object obj, p6.l lVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            lVar = null;
        }
        return z(jVar, obj, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long t(long j8, boolean z7) {
        return (z7 ? 4611686018427387904L : 0L) + j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long u(long j8, int i8) {
        return (((long) i8) << 60) + j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> i<E> v(long j8, i<E> iVar) {
        return new i<>(j8, iVar, iVar.u(), 0);
    }

    public static final <E> u6.f<i<E>> w() {
        return a.f282a;
    }

    public static final h0 x() {
        return f274l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long y(int i8) {
        if (i8 == 0) {
            return 0L;
        }
        if (i8 != Integer.MAX_VALUE) {
            return i8;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean z(y6.j<? super T> jVar, T t7, p6.l<? super Throwable, i0> lVar) {
        Object objB = jVar.b(t7, null, lVar);
        if (objB == null) {
            return false;
        }
        jVar.e(objB);
        return true;
    }
}
