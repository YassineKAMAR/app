package d1;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static i f20967e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f20968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f20969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f20970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f20971d;

    private i(Context context, h1.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f20968a = new a(applicationContext, aVar);
        this.f20969b = new b(applicationContext, aVar);
        this.f20970c = new g(applicationContext, aVar);
        this.f20971d = new h(applicationContext, aVar);
    }

    public static synchronized i c(Context context, h1.a aVar) {
        if (f20967e == null) {
            f20967e = new i(context, aVar);
        }
        return f20967e;
    }

    public a a() {
        return this.f20968a;
    }

    public b b() {
        return this.f20969b;
    }

    public g d() {
        return this.f20970c;
    }

    public h e() {
        return this.f20971d;
    }
}
