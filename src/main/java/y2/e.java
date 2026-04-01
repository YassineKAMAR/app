package y2;

import a3.d;
import a3.o;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import y2.a;
import y2.a.d;
import z2.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class e<O extends a.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y2.a<O> f27430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final O f27431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z2.b<O> f27432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Looper f27433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f27434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f f27435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z2.j f27436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.b f27437j;

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f27438c = new C0193a().a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z2.j f27439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Looper f27440b;

        /* JADX INFO: renamed from: y2.e$a$a, reason: collision with other inner class name */
        public static class C0193a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private z2.j f27441a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Looper f27442b;

            public a a() {
                if (this.f27441a == null) {
                    this.f27441a = new z2.a();
                }
                if (this.f27442b == null) {
                    this.f27442b = Looper.getMainLooper();
                }
                return new a(this.f27441a, this.f27442b);
            }
        }

        private a(z2.j jVar, Account account, Looper looper) {
            this.f27439a = jVar;
            this.f27440b = looper;
        }
    }

    private e(Context context, Activity activity, y2.a<O> aVar, O o8, a aVar2) {
        o.k(context, "Null context is not permitted.");
        o.k(aVar, "Api must not be null.");
        o.k(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f27428a = context.getApplicationContext();
        String str = null;
        if (e3.m.k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f27429b = str;
        this.f27430c = aVar;
        this.f27431d = o8;
        this.f27433f = aVar2.f27440b;
        z2.b<O> bVarA = z2.b.a(aVar, o8, str);
        this.f27432e = bVarA;
        this.f27435h = new z2.o(this);
        com.google.android.gms.common.api.internal.b bVarX = com.google.android.gms.common.api.internal.b.x(this.f27428a);
        this.f27437j = bVarX;
        this.f27434g = bVarX.m();
        this.f27436i = aVar2.f27439a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            com.google.android.gms.common.api.internal.f.u(activity, bVarX, bVarA);
        }
        bVarX.b(this);
    }

    public e(Context context, y2.a<O> aVar, O o8, a aVar2) {
        this(context, null, aVar, o8, aVar2);
    }

    private final <TResult, A extends a.b> s3.h<TResult> k(int i8, com.google.android.gms.common.api.internal.c<A, TResult> cVar) {
        s3.i iVar = new s3.i();
        this.f27437j.D(this, i8, cVar, iVar, this.f27436i);
        return iVar.a();
    }

    protected d.a c() {
        Account accountB;
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        d.a aVar = new d.a();
        O o8 = this.f27431d;
        if (!(o8 instanceof a.d.b) || (googleSignInAccountA2 = ((a.d.b) o8).a()) == null) {
            O o9 = this.f27431d;
            accountB = o9 instanceof a.d.InterfaceC0192a ? ((a.d.InterfaceC0192a) o9).b() : null;
        } else {
            accountB = googleSignInAccountA2.g();
        }
        aVar.d(accountB);
        O o10 = this.f27431d;
        aVar.c((!(o10 instanceof a.d.b) || (googleSignInAccountA = ((a.d.b) o10).a()) == null) ? Collections.emptySet() : googleSignInAccountA.y());
        aVar.e(this.f27428a.getClass().getName());
        aVar.b(this.f27428a.getPackageName());
        return aVar;
    }

    public <TResult, A extends a.b> s3.h<TResult> d(com.google.android.gms.common.api.internal.c<A, TResult> cVar) {
        return k(2, cVar);
    }

    public <TResult, A extends a.b> s3.h<TResult> e(com.google.android.gms.common.api.internal.c<A, TResult> cVar) {
        return k(0, cVar);
    }

    public final z2.b<O> f() {
        return this.f27432e;
    }

    protected String g() {
        return this.f27429b;
    }

    public final int h() {
        return this.f27434g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f i(Looper looper, com.google.android.gms.common.api.internal.m<O> mVar) {
        a.f fVarA = ((a.AbstractC0191a) o.j(this.f27430c.a())).a(this.f27428a, looper, c().a(), this.f27431d, mVar, mVar);
        String strG = g();
        if (strG != null && (fVarA instanceof a3.c)) {
            ((a3.c) fVarA).P(strG);
        }
        if (strG != null && (fVarA instanceof z2.g)) {
            ((z2.g) fVarA).r(strG);
        }
        return fVarA;
    }

    public final z j(Context context, Handler handler) {
        return new z(context, handler, c().a());
    }
}
