package n4;

import android.content.Context;
import android.util.Base64OutputStream;
import f4.e0;
import f4.r;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f implements i, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o4.b<l> f25148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f25149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o4.b<v4.i> f25150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<g> f25151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f25152e;

    private f(final Context context, final String str, Set<g> set, o4.b<v4.i> bVar, Executor executor) {
        this((o4.b<l>) new o4.b() { // from class: n4.e
            @Override // o4.b
            public final Object get() {
                return f.i(context, str);
            }
        }, set, executor, bVar, context);
    }

    f(o4.b<l> bVar, Set<g> set, Executor executor, o4.b<v4.i> bVar2, Context context) {
        this.f25148a = bVar;
        this.f25151d = set;
        this.f25152e = executor;
        this.f25150c = bVar2;
        this.f25149b = context;
    }

    public static f4.c<f> f() {
        final e0 e0VarA = e0.a(e4.a.class, Executor.class);
        return f4.c.f(f.class, i.class, j.class).b(r.i(Context.class)).b(r.i(c4.e.class)).b(r.k(g.class)).b(r.j(v4.i.class)).b(r.h(e0VarA)).e(new f4.h() { // from class: n4.d
            @Override // f4.h
            public final Object a(f4.e eVar) {
                return f.g(e0VarA, eVar);
            }
        }).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f g(e0 e0Var, f4.e eVar) {
        return new f((Context) eVar.a(Context.class), ((c4.e) eVar.a(c4.e.class)).r(), (Set<g>) eVar.d(g.class), (o4.b<v4.i>) eVar.c(v4.i.class), (Executor) eVar.f(e0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String h() {
        String string;
        synchronized (this) {
            l lVar = this.f25148a.get();
            List<m> listC = lVar.c();
            lVar.b();
            JSONArray jSONArray = new JSONArray();
            for (int i8 = 0; i8 < listC.size(); i8++) {
                m mVar = listC.get(i8);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", mVar.c());
                jSONObject.put("dates", new JSONArray((Collection) mVar.b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                try {
                    gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                    gZIPOutputStream.close();
                    base64OutputStream.close();
                    string = byteArrayOutputStream.toString("UTF-8");
                } finally {
                }
            } finally {
            }
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l i(Context context, String str) {
        return new l(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void j() {
        synchronized (this) {
            this.f25148a.get().g(System.currentTimeMillis(), this.f25150c.get().a());
        }
        return null;
    }

    @Override // n4.i
    public s3.h<String> a() {
        return androidx.core.os.l.a(this.f25149b) ^ true ? s3.k.e("") : s3.k.c(this.f25152e, new Callable() { // from class: n4.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f25144a.h();
            }
        });
    }

    public s3.h<Void> k() {
        if (this.f25151d.size() > 0 && !(!androidx.core.os.l.a(this.f25149b))) {
            return s3.k.c(this.f25152e, new Callable() { // from class: n4.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f25143a.j();
                }
            });
        }
        return s3.k.e(null);
    }
}
