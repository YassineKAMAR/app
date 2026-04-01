package h5;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import s5.c;

/* JADX INFO: loaded from: classes.dex */
class c implements s5.c, h5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FlutterJNI f22409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, f> f22410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, List<b>> f22411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f22412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f22413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<Integer, c.b> f22414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f22416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WeakHashMap<c.InterfaceC0171c, d> f22417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i f22418j;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f22419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f22420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f22421c;

        b(ByteBuffer byteBuffer, int i8, long j8) {
            this.f22419a = byteBuffer;
            this.f22420b = i8;
            this.f22421c = j8;
        }
    }

    /* JADX INFO: renamed from: h5.c$c, reason: collision with other inner class name */
    static class C0118c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ExecutorService f22422a;

        C0118c(ExecutorService executorService) {
            this.f22422a = executorService;
        }

        @Override // h5.c.d
        public void a(Runnable runnable) {
            this.f22422a.execute(runnable);
        }
    }

    interface d {
        void a(Runnable runnable);
    }

    private static class e implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ExecutorService f22423a = g5.a.e().b();

        e() {
        }

        @Override // h5.c.i
        public d a(c.d dVar) {
            return dVar.a() ? new h(this.f22423a) : new C0118c(this.f22423a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.a f22424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f22425b;

        f(c.a aVar, d dVar) {
            this.f22424a = aVar;
            this.f22425b = dVar;
        }
    }

    static class g implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FlutterJNI f22426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f22427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f22428c = new AtomicBoolean(false);

        g(FlutterJNI flutterJNI, int i8) {
            this.f22426a = flutterJNI;
            this.f22427b = i8;
        }

        @Override // s5.c.b
        public void a(ByteBuffer byteBuffer) {
            if (this.f22428c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.f22426a.invokePlatformMessageEmptyResponseCallback(this.f22427b);
            } else {
                this.f22426a.invokePlatformMessageResponseCallback(this.f22427b, byteBuffer, byteBuffer.position());
            }
        }
    }

    static class h implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ExecutorService f22429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ConcurrentLinkedQueue<Runnable> f22430b = new ConcurrentLinkedQueue<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f22431c = new AtomicBoolean(false);

        h(ExecutorService executorService) {
            this.f22429a = executorService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public void f() {
            if (this.f22431c.compareAndSet(false, true)) {
                try {
                    Runnable runnablePoll = this.f22430b.poll();
                    if (runnablePoll != null) {
                        runnablePoll.run();
                    }
                } finally {
                    this.f22431c.set(false);
                    if (!this.f22430b.isEmpty()) {
                        this.f22429a.execute(new Runnable() { // from class: h5.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f22433a.f();
                            }
                        });
                    }
                }
            }
        }

        @Override // h5.c.d
        public void a(Runnable runnable) {
            this.f22430b.add(runnable);
            this.f22429a.execute(new Runnable() { // from class: h5.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22432a.e();
                }
            });
        }
    }

    interface i {
        d a(c.d dVar);
    }

    private static class j implements c.InterfaceC0171c {
        private j() {
        }
    }

    c(FlutterJNI flutterJNI) {
        this(flutterJNI, new e());
    }

    c(FlutterJNI flutterJNI, i iVar) {
        this.f22410b = new HashMap();
        this.f22411c = new HashMap();
        this.f22412d = new Object();
        this.f22413e = new AtomicBoolean(false);
        this.f22414f = new HashMap();
        this.f22415g = 1;
        this.f22416h = new h5.g();
        this.f22417i = new WeakHashMap<>();
        this.f22409a = flutterJNI;
        this.f22418j = iVar;
    }

    private void j(final String str, final f fVar, final ByteBuffer byteBuffer, final int i8, final long j8) {
        d dVar = fVar != null ? fVar.f22425b : null;
        b6.e.b("PlatformChannel ScheduleHandler on " + str, i8);
        Runnable runnable = new Runnable() { // from class: h5.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f22403a.m(str, i8, fVar, byteBuffer, j8);
            }
        };
        if (dVar == null) {
            dVar = this.f22416h;
        }
        dVar.a(runnable);
    }

    private static void k(Error error) {
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
            throw error;
        }
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, error);
    }

    private void l(f fVar, ByteBuffer byteBuffer, int i8) {
        if (fVar != null) {
            try {
                g5.b.f("DartMessenger", "Deferring to registered handler to process message.");
                fVar.f22424a.a(byteBuffer, new g(this.f22409a, i8));
                return;
            } catch (Error e8) {
                k(e8);
                return;
            } catch (Exception e9) {
                g5.b.c("DartMessenger", "Uncaught exception in binary message listener", e9);
            }
        } else {
            g5.b.f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
        }
        this.f22409a.invokePlatformMessageEmptyResponseCallback(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(String str, int i8, f fVar, ByteBuffer byteBuffer, long j8) {
        b6.e.e("PlatformChannel ScheduleHandler on " + str, i8);
        b6.e.a("DartMessenger#handleMessageFromDart on " + str);
        try {
            l(fVar, byteBuffer, i8);
            if (byteBuffer != null && byteBuffer.isDirect()) {
                byteBuffer.limit(0);
            }
        } finally {
            this.f22409a.cleanupMessageData(j8);
            b6.e.d();
        }
    }

    @Override // s5.c
    public c.InterfaceC0171c a(c.d dVar) {
        d dVarA = this.f22418j.a(dVar);
        j jVar = new j();
        this.f22417i.put(jVar, dVarA);
        return jVar;
    }

    @Override // s5.c
    public /* synthetic */ c.InterfaceC0171c b() {
        return s5.b.a(this);
    }

    @Override // s5.c
    public void c(String str, ByteBuffer byteBuffer) {
        g5.b.f("DartMessenger", "Sending message over channel '" + str + "'");
        h(str, byteBuffer, null);
    }

    @Override // s5.c
    public void d(String str, c.a aVar, c.InterfaceC0171c interfaceC0171c) {
        if (aVar == null) {
            g5.b.f("DartMessenger", "Removing handler for channel '" + str + "'");
            synchronized (this.f22412d) {
                this.f22410b.remove(str);
            }
            return;
        }
        d dVar = null;
        if (interfaceC0171c != null && (dVar = this.f22417i.get(interfaceC0171c)) == null) {
            throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
        }
        g5.b.f("DartMessenger", "Setting handler for channel '" + str + "'");
        synchronized (this.f22412d) {
            this.f22410b.put(str, new f(aVar, dVar));
            List<b> listRemove = this.f22411c.remove(str);
            if (listRemove == null) {
                return;
            }
            for (b bVar : listRemove) {
                j(str, this.f22410b.get(str), bVar.f22419a, bVar.f22420b, bVar.f22421c);
            }
        }
    }

    @Override // s5.c
    public void e(String str, c.a aVar) {
        d(str, aVar, null);
    }

    @Override // h5.f
    public void f(int i8, ByteBuffer byteBuffer) {
        g5.b.f("DartMessenger", "Received message reply from Dart.");
        c.b bVarRemove = this.f22414f.remove(Integer.valueOf(i8));
        if (bVarRemove != null) {
            try {
                g5.b.f("DartMessenger", "Invoking registered callback for reply from Dart.");
                bVarRemove.a(byteBuffer);
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
            } catch (Error e8) {
                k(e8);
            } catch (Exception e9) {
                g5.b.c("DartMessenger", "Uncaught exception in binary message reply handler", e9);
            }
        }
    }

    @Override // h5.f
    public void g(String str, ByteBuffer byteBuffer, int i8, long j8) {
        f fVar;
        boolean z7;
        g5.b.f("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.f22412d) {
            fVar = this.f22410b.get(str);
            z7 = this.f22413e.get() && fVar == null;
            if (z7) {
                if (!this.f22411c.containsKey(str)) {
                    this.f22411c.put(str, new LinkedList());
                }
                this.f22411c.get(str).add(new b(byteBuffer, i8, j8));
            }
        }
        if (z7) {
            return;
        }
        j(str, fVar, byteBuffer, i8, j8);
    }

    @Override // s5.c
    public void h(String str, ByteBuffer byteBuffer, c.b bVar) {
        b6.e.a("DartMessenger#send on " + str);
        try {
            g5.b.f("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i8 = this.f22415g;
            this.f22415g = i8 + 1;
            if (bVar != null) {
                this.f22414f.put(Integer.valueOf(i8), bVar);
            }
            if (byteBuffer == null) {
                this.f22409a.dispatchEmptyPlatformMessage(str, i8);
            } else {
                this.f22409a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i8);
            }
        } finally {
            b6.e.d();
        }
    }
}
