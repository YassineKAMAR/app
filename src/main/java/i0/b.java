package i0;

import androidx.concurrent.futures.c;
import e6.i0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.l;
import x3.d;
import y6.l0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    static final class a extends r implements l<Throwable, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a<T> f22479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0<T> f22480b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c.a<T> aVar, l0<? extends T> l0Var) {
            super(1);
            this.f22479a = aVar;
            this.f22480b = l0Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void a(Throwable th) {
            if (th == null) {
                this.f22479a.b((T) this.f22480b.j());
            } else if (th instanceof CancellationException) {
                this.f22479a.c();
            } else {
                this.f22479a.e(th);
            }
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Throwable th) {
            a(th);
            return i0.f21430a;
        }
    }

    public static final <T> d<T> b(final l0<? extends T> l0Var, final Object obj) {
        q.f(l0Var, "<this>");
        d<T> dVarA = c.a(new c.InterfaceC0016c() { // from class: i0.a
            @Override // androidx.concurrent.futures.c.InterfaceC0016c
            public final Object a(c.a aVar) {
                return b.d(l0Var, obj, aVar);
            }
        });
        q.e(dVarA, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return dVarA;
    }

    public static /* synthetic */ d c(l0 l0Var, Object obj, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(l0Var, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(l0 this_asListenableFuture, Object obj, c.a completer) {
        q.f(this_asListenableFuture, "$this_asListenableFuture");
        q.f(completer, "completer");
        this_asListenableFuture.G(new a(completer, this_asListenableFuture));
        return obj;
    }
}
