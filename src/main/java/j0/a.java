package j0;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import e6.i0;
import e6.t;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import l0.c;
import p6.p;
import x3.d;
import y6.e0;
import y6.f0;
import y6.g;
import y6.s0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f23875a = new b(null);

    /* JADX INFO: renamed from: j0.a$a, reason: collision with other inner class name */
    private static final class C0133a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l0.c f23876b;

        /* JADX INFO: renamed from: j0.a$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", f = "MeasurementManagerFutures.kt", l = {122}, m = "invokeSuspend")
        static final class C0134a extends l implements p<e0, h6.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f23877a;

            C0134a(l0.a aVar, h6.d<? super C0134a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final h6.d<i0> create(Object obj, h6.d<?> dVar) {
                return C0133a.this.new C0134a(null, dVar);
            }

            @Override // p6.p
            public final Object invoke(e0 e0Var, h6.d<? super i0> dVar) {
                return ((C0134a) create(e0Var, dVar)).invokeSuspend(i0.f21430a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = i6.d.e();
                int i8 = this.f23877a;
                if (i8 == 0) {
                    t.b(obj);
                    l0.c cVar = C0133a.this.f23876b;
                    this.f23877a = 1;
                    if (cVar.a(null, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return i0.f21430a;
            }
        }

        /* JADX INFO: renamed from: j0.a$a$b */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {169}, m = "invokeSuspend")
        static final class b extends l implements p<e0, h6.d<? super Integer>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f23879a;

            b(h6.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final h6.d<i0> create(Object obj, h6.d<?> dVar) {
                return C0133a.this.new b(dVar);
            }

            @Override // p6.p
            public final Object invoke(e0 e0Var, h6.d<? super Integer> dVar) {
                return ((b) create(e0Var, dVar)).invokeSuspend(i0.f21430a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = i6.d.e();
                int i8 = this.f23879a;
                if (i8 == 0) {
                    t.b(obj);
                    l0.c cVar = C0133a.this.f23876b;
                    this.f23879a = 1;
                    obj = cVar.b(this);
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

        /* JADX INFO: renamed from: j0.a$a$c */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {133}, m = "invokeSuspend")
        static final class c extends l implements p<e0, h6.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f23881a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Uri f23883c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ InputEvent f23884d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, h6.d<? super c> dVar) {
                super(2, dVar);
                this.f23883c = uri;
                this.f23884d = inputEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final h6.d<i0> create(Object obj, h6.d<?> dVar) {
                return C0133a.this.new c(this.f23883c, this.f23884d, dVar);
            }

            @Override // p6.p
            public final Object invoke(e0 e0Var, h6.d<? super i0> dVar) {
                return ((c) create(e0Var, dVar)).invokeSuspend(i0.f21430a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = i6.d.e();
                int i8 = this.f23881a;
                if (i8 == 0) {
                    t.b(obj);
                    l0.c cVar = C0133a.this.f23876b;
                    Uri uri = this.f23883c;
                    InputEvent inputEvent = this.f23884d;
                    this.f23881a = 1;
                    if (cVar.c(uri, inputEvent, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return i0.f21430a;
            }
        }

        /* JADX INFO: renamed from: j0.a$a$d */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {141}, m = "invokeSuspend")
        static final class d extends l implements p<e0, h6.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f23885a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Uri f23887c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Uri uri, h6.d<? super d> dVar) {
                super(2, dVar);
                this.f23887c = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final h6.d<i0> create(Object obj, h6.d<?> dVar) {
                return C0133a.this.new d(this.f23887c, dVar);
            }

            @Override // p6.p
            public final Object invoke(e0 e0Var, h6.d<? super i0> dVar) {
                return ((d) create(e0Var, dVar)).invokeSuspend(i0.f21430a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = i6.d.e();
                int i8 = this.f23885a;
                if (i8 == 0) {
                    t.b(obj);
                    l0.c cVar = C0133a.this.f23876b;
                    Uri uri = this.f23887c;
                    this.f23885a = 1;
                    if (cVar.d(uri, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return i0.f21430a;
            }
        }

        /* JADX INFO: renamed from: j0.a$a$e */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {151}, m = "invokeSuspend")
        static final class e extends l implements p<e0, h6.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f23888a;

            e(l0.d dVar, h6.d<? super e> dVar2) {
                super(2, dVar2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final h6.d<i0> create(Object obj, h6.d<?> dVar) {
                return C0133a.this.new e(null, dVar);
            }

            @Override // p6.p
            public final Object invoke(e0 e0Var, h6.d<? super i0> dVar) {
                return ((e) create(e0Var, dVar)).invokeSuspend(i0.f21430a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = i6.d.e();
                int i8 = this.f23888a;
                if (i8 == 0) {
                    t.b(obj);
                    l0.c cVar = C0133a.this.f23876b;
                    this.f23888a = 1;
                    if (cVar.e(null, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return i0.f21430a;
            }
        }

        /* JADX INFO: renamed from: j0.a$a$f */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {161}, m = "invokeSuspend")
        static final class f extends l implements p<e0, h6.d<? super i0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f23890a;

            f(l0.e eVar, h6.d<? super f> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final h6.d<i0> create(Object obj, h6.d<?> dVar) {
                return C0133a.this.new f(null, dVar);
            }

            @Override // p6.p
            public final Object invoke(e0 e0Var, h6.d<? super i0> dVar) {
                return ((f) create(e0Var, dVar)).invokeSuspend(i0.f21430a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = i6.d.e();
                int i8 = this.f23890a;
                if (i8 == 0) {
                    t.b(obj);
                    l0.c cVar = C0133a.this.f23876b;
                    this.f23890a = 1;
                    if (cVar.f(null, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return i0.f21430a;
            }
        }

        public C0133a(l0.c mMeasurementManager) {
            q.f(mMeasurementManager, "mMeasurementManager");
            this.f23876b = mMeasurementManager;
        }

        @Override // j0.a
        public x3.d<Integer> b() {
            return i0.b.c(g.b(f0.a(s0.a()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // j0.a
        public x3.d<i0> c(Uri attributionSource, InputEvent inputEvent) {
            q.f(attributionSource, "attributionSource");
            return i0.b.c(g.b(f0.a(s0.a()), null, null, new c(attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        @Override // j0.a
        public x3.d<i0> d(Uri trigger) {
            q.f(trigger, "trigger");
            return i0.b.c(g.b(f0.a(s0.a()), null, null, new d(trigger, null), 3, null), null, 1, null);
        }

        public x3.d<i0> f(l0.a deletionRequest) {
            q.f(deletionRequest, "deletionRequest");
            return i0.b.c(g.b(f0.a(s0.a()), null, null, new C0134a(deletionRequest, null), 3, null), null, 1, null);
        }

        public x3.d<i0> g(l0.d request) {
            q.f(request, "request");
            return i0.b.c(g.b(f0.a(s0.a()), null, null, new e(request, null), 3, null), null, 1, null);
        }

        public x3.d<i0> h(l0.e request) {
            q.f(request, "request");
            return i0.b.c(g.b(f0.a(s0.a()), null, null, new f(request, null), 3, null), null, 1, null);
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
            c cVarA = c.f24338a.a(context);
            if (cVarA != null) {
                return new C0133a(cVarA);
            }
            return null;
        }
    }

    public static final a a(Context context) {
        return f23875a.a(context);
    }

    public abstract d<Integer> b();

    public abstract d<i0> c(Uri uri, InputEvent inputEvent);

    public abstract d<i0> d(Uri uri);
}
