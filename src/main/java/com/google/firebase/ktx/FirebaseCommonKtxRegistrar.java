package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import f4.e;
import f4.e0;
import f4.h;
import f4.r;
import f6.o;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.q;
import y6.b0;
import y6.d1;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a<T> implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a<T> f20863a = new a<>();

        @Override // f4.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b0 a(e eVar) {
            Object objF = eVar.f(e0.a(e4.a.class, Executor.class));
            q.e(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return d1.a((Executor) objF);
        }
    }

    public static final class b<T> implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b<T> f20864a = new b<>();

        @Override // f4.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b0 a(e eVar) {
            Object objF = eVar.f(e0.a(e4.c.class, Executor.class));
            q.e(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return d1.a((Executor) objF);
        }
    }

    public static final class c<T> implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c<T> f20865a = new c<>();

        @Override // f4.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b0 a(e eVar) {
            Object objF = eVar.f(e0.a(e4.b.class, Executor.class));
            q.e(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return d1.a((Executor) objF);
        }
    }

    public static final class d<T> implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d<T> f20866a = new d<>();

        @Override // f4.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b0 a(e eVar) {
            Object objF = eVar.f(e0.a(e4.d.class, Executor.class));
            q.e(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return d1.a((Executor) objF);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<f4.c<?>> getComponents() {
        f4.c cVarC = f4.c.c(e0.a(e4.a.class, b0.class)).b(r.h(e0.a(e4.a.class, Executor.class))).e(a.f20863a).c();
        q.e(cVarC, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        f4.c cVarC2 = f4.c.c(e0.a(e4.c.class, b0.class)).b(r.h(e0.a(e4.c.class, Executor.class))).e(b.f20864a).c();
        q.e(cVarC2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        f4.c cVarC3 = f4.c.c(e0.a(e4.b.class, b0.class)).b(r.h(e0.a(e4.b.class, Executor.class))).e(c.f20865a).c();
        q.e(cVarC3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        f4.c cVarC4 = f4.c.c(e0.a(e4.d.class, b0.class)).b(r.h(e0.a(e4.d.class, Executor.class))).e(d.f20866a).c();
        q.e(cVarC4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return o.g(cVarC, cVarC2, cVarC3, cVarC4);
    }
}
