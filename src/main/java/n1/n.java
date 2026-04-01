package n1;

import com.google.auto.value.AutoValue;
import n1.c;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
abstract class n {

    @AutoValue.Builder
    public static abstract class a {
        public abstract n a();

        abstract a b(l1.b bVar);

        abstract a c(l1.c<?> cVar);

        abstract a d(l1.e<?, byte[]> eVar);

        public abstract a e(o oVar);

        public abstract a f(String str);
    }

    n() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract l1.b b();

    abstract l1.c<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    abstract l1.e<?, byte[]> e();

    public abstract o f();

    public abstract String g();
}
