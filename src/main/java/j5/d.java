package j5;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.s;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f24124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f24125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j5.b f24126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FlutterJNI f24127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ExecutorService f24128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Future<b> f24129g;

    class a implements Callable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f24130a;

        a(Context context) {
            this.f24130a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            d.this.f24127e.prefetchDefaultFontManager();
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b call() {
            b6.e.a("FlutterLoader initTask");
            try {
                d.a(d.this, this.f24130a);
                d.this.f24127e.loadLibrary();
                d.this.f24127e.updateRefreshRate();
                d.this.f24128f.execute(new Runnable() { // from class: j5.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24122a.c();
                    }
                });
                return new b(b6.b.d(this.f24130a), b6.b.a(this.f24130a), b6.b.c(this.f24130a), null);
            } finally {
                b6.e.d();
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f24132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f24133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f24134c;

        private b(String str, String str2, String str3) {
            this.f24132a = str;
            this.f24133b = str2;
            this.f24134c = str3;
        }

        /* synthetic */ b(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f24135a;

        public String a() {
            return this.f24135a;
        }
    }

    public d() {
        this(g5.a.e().d().a());
    }

    public d(FlutterJNI flutterJNI) {
        this(flutterJNI, g5.a.e().b());
    }

    public d(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f24123a = false;
        this.f24127e = flutterJNI;
        this.f24128f = executorService;
    }

    static /* synthetic */ e a(d dVar, Context context) {
        dVar.j(context);
        return null;
    }

    private static boolean d() {
        return false;
    }

    private String h(String str) {
        return this.f24126d.f24118d + File.separator + str;
    }

    private e j(Context context) {
        return null;
    }

    private static boolean l(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    public boolean e() {
        return this.f24126d.f24121g;
    }

    public void f(Context context, String[] strArr) {
        if (this.f24123a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f24124b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        b6.e.a("FlutterLoader#ensureInitializationComplete");
        try {
            try {
                b bVar = this.f24129g.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                StringBuilder sb = new StringBuilder();
                sb.append("--icu-native-lib-path=");
                sb.append(this.f24126d.f24120f);
                String str = File.separator;
                sb.append(str);
                sb.append("libflutter.so");
                arrayList.add(sb.toString());
                if (strArr != null) {
                    Collections.addAll(arrayList, strArr);
                }
                arrayList.add("--aot-shared-library-name=" + this.f24126d.f24115a);
                arrayList.add("--aot-shared-library-name=" + this.f24126d.f24120f + str + this.f24126d.f24115a);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("--cache-dir-path=");
                sb2.append(bVar.f24133b);
                arrayList.add(sb2.toString());
                if (this.f24126d.f24119e != null) {
                    arrayList.add("--domain-network-policy=" + this.f24126d.f24119e);
                }
                if (this.f24124b.a() != null) {
                    arrayList.add("--log-tag=" + this.f24124b.a());
                }
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i8 = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                if (i8 == 0) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    i8 = (int) ((r5.totalMem / 1000000.0d) / 2.0d);
                }
                arrayList.add("--old-gen-heap-size=" + i8);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 12 * 4));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null) {
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller", false)) {
                        arrayList.add("--enable-impeller");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", d())) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                    if (string != null) {
                        arrayList.add("--impeller-backend=" + string);
                    }
                }
                arrayList.add("--leak-vm=" + (l(bundle) ? com.amazon.a.a.o.b.ac : com.amazon.a.a.o.b.ad));
                this.f24127e.init(context, (String[]) arrayList.toArray(new String[0]), null, bVar.f24132a, bVar.f24133b, SystemClock.uptimeMillis() - this.f24125c);
                this.f24123a = true;
            } catch (Exception e8) {
                g5.b.c("FlutterLoader", "Flutter initialization failed.", e8);
                throw new RuntimeException(e8);
            }
        } finally {
            b6.e.d();
        }
    }

    public String g() {
        return this.f24126d.f24118d;
    }

    public String i(String str) {
        return h(str);
    }

    public boolean k() {
        return this.f24123a;
    }

    public void m(Context context) {
        n(context, new c());
    }

    public void n(Context context, c cVar) {
        if (this.f24124b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        b6.e.a("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f24124b = cVar;
            this.f24125c = SystemClock.uptimeMillis();
            this.f24126d = j5.a.e(applicationContext);
            s.f((DisplayManager) applicationContext.getSystemService("display"), this.f24127e).g();
            this.f24129g = this.f24128f.submit(new a(applicationContext));
        } finally {
            b6.e.d();
        }
    }
}
