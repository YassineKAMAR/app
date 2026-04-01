package io.flutter.embedding.engine;

import android.content.Context;
import h5.a;
import io.flutter.embedding.engine.a;
import io.flutter.plugin.platform.w;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<io.flutter.embedding.engine.a> f22777a = new ArrayList();

    class a implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.flutter.embedding.engine.a f22778a;

        a(io.flutter.embedding.engine.a aVar) {
            this.f22778a = aVar;
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
            d.this.f22777a.remove(this.f22778a);
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f22780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a.b f22781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f22782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<String> f22783d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private w f22784e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f22785f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f22786g = false;

        public b(Context context) {
            this.f22780a = context;
        }

        public boolean a() {
            return this.f22785f;
        }

        public Context b() {
            return this.f22780a;
        }

        public a.b c() {
            return this.f22781b;
        }

        public List<String> d() {
            return this.f22783d;
        }

        public String e() {
            return this.f22782c;
        }

        public w f() {
            return this.f22784e;
        }

        public boolean g() {
            return this.f22786g;
        }

        public b h(boolean z7) {
            this.f22785f = z7;
            return this;
        }

        public b i(a.b bVar) {
            this.f22781b = bVar;
            return this;
        }

        public b j(List<String> list) {
            this.f22783d = list;
            return this;
        }

        public b k(String str) {
            this.f22782c = str;
            return this;
        }

        public b l(boolean z7) {
            this.f22786g = z7;
            return this;
        }
    }

    public d(Context context, String[] strArr) {
        j5.d dVarC = g5.a.e().c();
        if (dVarC.k()) {
            return;
        }
        dVarC.m(context.getApplicationContext());
        dVarC.f(context.getApplicationContext(), strArr);
    }

    public io.flutter.embedding.engine.a a(b bVar) {
        io.flutter.embedding.engine.a aVarY;
        Context contextB = bVar.b();
        a.b bVarC = bVar.c();
        String strE = bVar.e();
        List<String> listD = bVar.d();
        w wVarF = bVar.f();
        if (wVarF == null) {
            wVarF = new w();
        }
        w wVar = wVarF;
        boolean zA = bVar.a();
        boolean zG = bVar.g();
        a.b bVarA = bVarC == null ? a.b.a() : bVarC;
        if (this.f22777a.size() == 0) {
            aVarY = b(contextB, wVar, zA, zG);
            if (strE != null) {
                aVarY.n().c(strE);
            }
            aVarY.j().j(bVarA, listD);
        } else {
            aVarY = this.f22777a.get(0).y(contextB, bVarA, strE, listD, wVar, zA, zG);
        }
        this.f22777a.add(aVarY);
        aVarY.e(new a(aVarY));
        return aVarY;
    }

    io.flutter.embedding.engine.a b(Context context, w wVar, boolean z7, boolean z8) {
        return new io.flutter.embedding.engine.a(context, null, null, wVar, null, z7, z8, this);
    }
}
