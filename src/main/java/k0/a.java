package k0;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.c;
import androidx.privacysandbox.ads.adservices.topics.f;
import e6.i0;
import e6.t;
import h6.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import p6.p;
import y6.e0;
import y6.f0;
import y6.g;
import y6.s0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f24173a = new b(null);

    /* JADX INFO: renamed from: k0.a$a, reason: collision with other inner class name */
    private static final class C0137a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f f24174b;

        /* JADX INFO: renamed from: k0.a$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1", f = "TopicsManagerFutures.kt", l = {56}, m = "invokeSuspend")
        static final class C0138a extends l implements p<e0, d<? super c>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24175a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.privacysandbox.ads.adservices.topics.b f24177c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0138a(androidx.privacysandbox.ads.adservices.topics.b bVar, d<? super C0138a> dVar) {
                super(2, dVar);
                this.f24177c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<i0> create(Object obj, d<?> dVar) {
                return C0137a.this.new C0138a(this.f24177c, dVar);
            }

            @Override // p6.p
            public final Object invoke(e0 e0Var, d<? super c> dVar) {
                return ((C0138a) create(e0Var, dVar)).invokeSuspend(i0.f21430a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = i6.d.e();
                int i8 = this.f24175a;
                if (i8 == 0) {
                    t.b(obj);
                    f fVar = C0137a.this.f24174b;
                    androidx.privacysandbox.ads.adservices.topics.b bVar = this.f24177c;
                    this.f24175a = 1;
                    obj = fVar.a(bVar, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return obj;
            }
        }

        public C0137a(f mTopicsManager) {
            q.f(mTopicsManager, "mTopicsManager");
            this.f24174b = mTopicsManager;
        }

        @Override // k0.a
        public x3.d<c> b(androidx.privacysandbox.ads.adservices.topics.b request) {
            q.f(request, "request");
            return i0.b.c(g.b(f0.a(s0.c()), null, null, new C0138a(request, null), 3, null), null, 1, null);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(j jVar) {
            this();
        }

        public final a a(Context context) {
            q.f(context, "context");
            f fVarA = f.f2723a.a(context);
            if (fVarA != null) {
                return new C0137a(fVarA);
            }
            return null;
        }
    }

    public static final a a(Context context) {
        return f24173a.a(context);
    }

    public abstract x3.d<c> b(androidx.privacysandbox.ads.adservices.topics.b bVar);
}
