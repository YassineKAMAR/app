package s7;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.net.Uri;
import e6.i0;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f26283h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final s7.h f26284i = new s7.h(0.0f, 0.0f, 3, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SoundPool f26288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<Integer, k.d> f26289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ExecutorService f26290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<Integer, s7.h> f26291g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f26292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k.d f26293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26294c;

        public b(int i8, k.d dVar, int i9) {
            this.f26292a = i8;
            this.f26293b = dVar;
            this.f26294c = i9;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f26292a == 0) {
                this.f26293b.a(Integer.valueOf(this.f26294c));
                return;
            }
            this.f26293b.b("Loading failed", "Error code: " + this.f26292a, null);
        }
    }

    public static final class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ s7.h f26297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f26298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ double f26299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k.d f26300f;

        public c(int i8, s7.h hVar, int i9, double d8, k.d dVar) {
            this.f26296b = i8;
            this.f26297c = hVar;
            this.f26298d = i9;
            this.f26299e = d8;
            this.f26300f = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            s7.c.b().post(new k(this.f26300f, g.this.f26288d.play(this.f26296b, this.f26297c.a(), this.f26297c.b(), 0, this.f26298d, (float) this.f26299e)));
        }
    }

    public static final class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26302b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k.d f26303c;

        public d(int i8, k.d dVar) {
            this.f26302b = i8;
            this.f26303c = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.f26288d.pause(this.f26302b);
            s7.c.b().post(new l(this.f26303c, this.f26302b));
        }
    }

    public static final class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k.d f26306c;

        public e(int i8, k.d dVar) {
            this.f26305b = i8;
            this.f26306c = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.f26288d.resume(this.f26305b);
            s7.c.b().post(new m(this.f26306c, this.f26305b));
        }
    }

    public static final class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k.d f26309c;

        public f(int i8, k.d dVar) {
            this.f26308b = i8;
            this.f26309c = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.f26288d.stop(this.f26308b);
            s7.c.b().post(new n(this.f26309c, this.f26308b));
        }
    }

    /* JADX INFO: renamed from: s7.g$g, reason: collision with other inner class name */
    public static final class RunnableC0174g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Integer f26310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f26311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f26312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f26313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ double f26314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k.d f26315f;

        public RunnableC0174g(Integer num, Integer num2, g gVar, double d8, double d9, k.d dVar) {
            this.f26310a = num;
            this.f26311b = num2;
            this.f26312c = gVar;
            this.f26313d = d8;
            this.f26314e = d9;
            this.f26315f = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Integer num = this.f26310a;
            if (num != null) {
                this.f26312c.f26288d.setVolume(num.intValue(), (float) this.f26313d, (float) this.f26314e);
            }
            Integer num2 = this.f26311b;
            if (num2 != null) {
                this.f26312c.f26291g.put(Integer.valueOf(num2.intValue()), new s7.h((float) this.f26313d, (float) this.f26314e));
            }
            s7.c.b().post(new o(this.f26315f));
        }
    }

    public static final class h implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ double f26318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k.d f26319d;

        public h(int i8, double d8, k.d dVar) {
            this.f26317b = i8;
            this.f26318c = d8;
            this.f26319d = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.f26288d.setRate(this.f26317b, (float) this.f26318c);
            s7.c.b().post(new p(this.f26319d));
        }
    }

    public static final class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f26320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26321b;

        public i(k.d dVar, int i8) {
            this.f26320a = dVar;
            this.f26321b = i8;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26320a.a(Integer.valueOf(this.f26321b));
        }
    }

    public static final class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f26322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f26323b;

        public j(k.d dVar, Throwable th) {
            this.f26322a = dVar;
            this.f26323b = th;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26322a.b("URI loading failure", this.f26323b.getMessage(), null);
        }
    }

    public static final class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f26324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26325b;

        public k(k.d dVar, int i8) {
            this.f26324a = dVar;
            this.f26325b = i8;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26324a.a(Integer.valueOf(this.f26325b));
        }
    }

    public static final class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f26326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26327b;

        public l(k.d dVar, int i8) {
            this.f26326a = dVar;
            this.f26327b = i8;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26326a.a(Integer.valueOf(this.f26327b));
        }
    }

    public static final class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f26328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26329b;

        public m(k.d dVar, int i8) {
            this.f26328a = dVar;
            this.f26329b = i8;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26328a.a(Integer.valueOf(this.f26329b));
        }
    }

    public static final class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f26330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26331b;

        public n(k.d dVar, int i8) {
            this.f26330a = dVar;
            this.f26331b = i8;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26330a.a(Integer.valueOf(this.f26331b));
        }
    }

    public static final class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f26332a;

        public o(k.d dVar) {
            this.f26332a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26332a.a(null);
        }
    }

    public static final class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f26333a;

        public p(k.d dVar) {
            this.f26333a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26333a.a(null);
        }
    }

    public static final class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f26334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f26335b;

        public q(k.d dVar, Throwable th) {
            this.f26334a = dVar;
            this.f26335b = th;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26334a.b("Loading failure", this.f26335b.getMessage(), null);
        }
    }

    public static final class r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.d f26336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f26337b;

        public r(k.d dVar, int i8) {
            this.f26336a = dVar;
            this.f26337b = i8;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f26336a.a(Integer.valueOf(this.f26337b));
        }
    }

    public g(Context context, int i8, int i9) {
        kotlin.jvm.internal.q.f(context, "context");
        this.f26285a = context;
        this.f26286b = i8;
        this.f26287c = i9;
        this.f26288d = f();
        this.f26289e = new HashMap<>();
        this.f26290f = new ThreadPoolExecutor(1, i8, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque());
        this.f26291g = new LinkedHashMap();
    }

    private final SoundPool f() {
        int i8 = this.f26287c;
        int i9 = 5;
        if (i8 == 2) {
            i9 = 6;
        } else if (i8 == 4) {
            i9 = 4;
        } else if (i8 != 5) {
            i9 = 14;
        }
        SoundPool soundPoolBuild = new SoundPool.Builder().setMaxStreams(this.f26286b).setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(this.f26287c).setUsage(i9).build()).build();
        soundPoolBuild.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: s7.d
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
                g.g(this.f26276a, soundPool, i10, i11);
            }
        });
        return soundPoolBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(g this$0, SoundPool soundPool, int i8, int i9) {
        kotlin.jvm.internal.q.f(this$0, "this$0");
        k.d dVar = this$0.f26289e.get(Integer.valueOf(i8));
        if (dVar != null) {
            s7.c.b().post(new b(i9, dVar, i8));
            this$0.f26289e.remove(Integer.valueOf(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(s5.j call, g this$0, k.d result) {
        int iLoad;
        kotlin.jvm.internal.q.f(call, "$call");
        kotlin.jvm.internal.q.f(this$0, "this$0");
        kotlin.jvm.internal.q.f(result, "$result");
        try {
            Object obj = call.f26253b;
            kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            Map map = (Map) obj;
            Object obj2 = map.get("uri");
            kotlin.jvm.internal.q.d(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = map.get("priority");
            kotlin.jvm.internal.q.d(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            URI uriCreate = URI.create(str);
            if (kotlin.jvm.internal.q.b(uriCreate.getScheme(), "content")) {
                iLoad = this$0.f26288d.load(this$0.f26285a.getContentResolver().openAssetFileDescriptor(Uri.parse(str), "r"), 1);
            } else {
                File fileE = n6.j.e("sound", "pool", this$0.f26285a.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(fileE);
                try {
                    URL url = uriCreate.toURL();
                    kotlin.jvm.internal.q.e(url, "toURL(...)");
                    fileOutputStream.write(n6.l.c(url));
                    i0 i0Var = i0.f21430a;
                    n6.b.a(fileOutputStream, null);
                    fileE.deleteOnExit();
                    iLoad = this$0.f26288d.load(fileE.getAbsolutePath(), iIntValue);
                } finally {
                }
            }
            if (iLoad <= -1) {
                s7.c.b().post(new i(result, iLoad));
            } else {
                this$0.f26289e.put(Integer.valueOf(iLoad), result);
            }
        } catch (Throwable th) {
            s7.c.b().post(new j(result, th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(s5.j call, g this$0, k.d result) {
        kotlin.jvm.internal.q.f(call, "$call");
        kotlin.jvm.internal.q.f(this$0, "this$0");
        kotlin.jvm.internal.q.f(result, "$result");
        try {
            Object obj = call.f26253b;
            kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            Map map = (Map) obj;
            Object obj2 = map.get("rawSound");
            kotlin.jvm.internal.q.d(obj2, "null cannot be cast to non-null type kotlin.ByteArray");
            byte[] bArr = (byte[]) obj2;
            Object obj3 = map.get("priority");
            kotlin.jvm.internal.q.d(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            File fileE = n6.j.e("sound", "pool", this$0.f26285a.getCacheDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileE);
            try {
                fileOutputStream.write(bArr);
                fileE.deleteOnExit();
                int iLoad = this$0.f26288d.load(fileE.getAbsolutePath(), iIntValue);
                if (iLoad > -1) {
                    this$0.f26289e.put(Integer.valueOf(iLoad), result);
                } else {
                    s7.c.b().post(new r(result, iLoad));
                }
                i0 i0Var = i0.f21430a;
                n6.b.a(fileOutputStream, null);
            } finally {
            }
        } catch (Throwable th) {
            s7.c.b().post(new q(result, th));
        }
    }

    private final s7.h m(int i8) {
        s7.h hVar = this.f26291g.get(Integer.valueOf(i8));
        return hVar == null ? f26284i : hVar;
    }

    public final void h() {
        l();
        this.f26290f.shutdownNow();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void k(final s5.j call, final k.d result) {
        Executor executorA;
        Runnable eVar;
        kotlin.jvm.internal.q.f(call, "call");
        kotlin.jvm.internal.q.f(result, "result");
        String str = call.f26252a;
        if (str != null) {
            switch (str.hashCode()) {
                case -934426579:
                    if (str.equals("resume")) {
                        Object obj = call.f26253b;
                        kotlin.jvm.internal.q.d(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
                        Object obj2 = ((Map) obj).get("streamId");
                        kotlin.jvm.internal.q.c(obj2);
                        int iIntValue = ((Number) obj2).intValue();
                        executorA = this.f26290f;
                        eVar = new e(iIntValue, result);
                    }
                    break;
                case 3327206:
                    if (str.equals("load")) {
                        executorA = s7.c.a();
                        eVar = new Runnable() { // from class: s7.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                g.j(call, this, result);
                            }
                        };
                    }
                    break;
                case 3443508:
                    if (str.equals("play")) {
                        Object obj3 = call.f26253b;
                        kotlin.jvm.internal.q.d(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                        Map map = (Map) obj3;
                        Integer num = (Integer) map.get("soundId");
                        kotlin.jvm.internal.q.c(num);
                        int iIntValue2 = num.intValue();
                        Integer num2 = (Integer) map.get("repeat");
                        int iIntValue3 = num2 != null ? num2.intValue() : 0;
                        Double d8 = (Double) map.get("rate");
                        this.f26290f.execute(new c(iIntValue2, m(iIntValue2), iIntValue3, d8 != null ? d8.doubleValue() : 1.0d, result));
                        return;
                    }
                    break;
                case 3540994:
                    if (str.equals("stop")) {
                        Object obj4 = call.f26253b;
                        kotlin.jvm.internal.q.d(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
                        Object obj5 = ((Map) obj4).get("streamId");
                        kotlin.jvm.internal.q.c(obj5);
                        int iIntValue4 = ((Number) obj5).intValue();
                        executorA = this.f26290f;
                        eVar = new f(iIntValue4, result);
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        Object obj6 = call.f26253b;
                        kotlin.jvm.internal.q.d(obj6, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
                        Object obj7 = ((Map) obj6).get("streamId");
                        kotlin.jvm.internal.q.c(obj7);
                        int iIntValue5 = ((Number) obj7).intValue();
                        executorA = this.f26290f;
                        eVar = new d(iIntValue5, result);
                    }
                    break;
                case 336631462:
                    if (str.equals("loadUri")) {
                        executorA = s7.c.a();
                        eVar = new Runnable() { // from class: s7.f
                            @Override // java.lang.Runnable
                            public final void run() {
                                g.i(call, this, result);
                            }
                        };
                    }
                    break;
                case 670514716:
                    if (str.equals("setVolume")) {
                        Object obj8 = call.f26253b;
                        kotlin.jvm.internal.q.d(obj8, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                        Map map2 = (Map) obj8;
                        Integer num3 = (Integer) map2.get("streamId");
                        Integer num4 = (Integer) map2.get("soundId");
                        if (num3 == null && num4 == null) {
                            result.b("InvalidParameters", "Either 'streamId' or 'soundId' has to be passed", null);
                        }
                        Object obj9 = map2.get("volumeLeft");
                        kotlin.jvm.internal.q.c(obj9);
                        double dDoubleValue = ((Double) obj9).doubleValue();
                        Object obj10 = map2.get("volumeRight");
                        kotlin.jvm.internal.q.c(obj10);
                        this.f26290f.execute(new RunnableC0174g(num3, num4, this, dDoubleValue, ((Double) obj10).doubleValue(), result));
                        return;
                    }
                    break;
                case 1090594823:
                    if (str.equals("release")) {
                        l();
                        this.f26288d = f();
                        result.a(null);
                        return;
                    }
                    break;
                case 1984920674:
                    if (str.equals("setRate")) {
                        Object obj11 = call.f26253b;
                        kotlin.jvm.internal.q.d(obj11, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                        Map map3 = (Map) obj11;
                        Object obj12 = map3.get("streamId");
                        kotlin.jvm.internal.q.c(obj12);
                        int iIntValue6 = ((Integer) obj12).intValue();
                        Double d9 = (Double) map3.get("rate");
                        this.f26290f.execute(new h(iIntValue6, d9 != null ? d9.doubleValue() : 1.0d, result));
                        return;
                    }
                    break;
            }
            executorA.execute(eVar);
            return;
        }
        result.c();
    }

    public final void l() {
        this.f26288d.release();
    }
}
