package y2;

import a3.c;
import a3.o;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import y2.a.d;
import y2.f;

/* JADX INFO: loaded from: classes.dex */
public final class a<O extends d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0191a<?, O> f27422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g<?> f27423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27424c;

    /* JADX INFO: renamed from: y2.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0191a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, a3.d dVar, O o8, f.a aVar, f.b bVar) {
            return (T) b(context, looper, dVar, o8, aVar, bVar);
        }

        public T b(Context context, Looper looper, a3.d dVar, O o8, z2.c cVar, z2.h hVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f27425a = new c(null);

        /* JADX INFO: renamed from: y2.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0192a extends d {
            Account b();
        }

        public interface b extends d {
            GoogleSignInAccount a();
        }

        public static final class c implements d {
            private c() {
            }

            /* synthetic */ c(m mVar) {
            }
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        void a(a3.i iVar, Set<Scope> set);

        Set<Scope> b();

        void c(String str);

        boolean d();

        String e();

        void f();

        boolean g();

        void h(c.InterfaceC0001c interfaceC0001c);

        void i(c.e eVar);

        boolean j();

        int k();

        x2.d[] l();

        String m();

        boolean o();
    }

    public static final class g<C extends f> extends c<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> a(String str, AbstractC0191a<C, O> abstractC0191a, g<C> gVar) {
        o.k(abstractC0191a, "Cannot construct an Api with a null ClientBuilder");
        o.k(gVar, "Cannot construct an Api with a null ClientKey");
        this.f27424c = str;
        this.f27422a = abstractC0191a;
        this.f27423b = gVar;
    }

    public final AbstractC0191a<?, O> a() {
        return this.f27422a;
    }

    public final String b() {
        return this.f27424c;
    }
}
