package m1;

import com.google.auto.value.AutoValue;
import m1.f;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class l {

    @AutoValue.Builder
    public static abstract class a {
        public abstract l a();

        public abstract a b(Integer num);

        public abstract a c(long j8);

        public abstract a d(long j8);

        public abstract a e(o oVar);

        abstract a f(byte[] bArr);

        abstract a g(String str);

        public abstract a h(long j8);
    }

    private static a a() {
        return new f.b();
    }

    public static a i(String str) {
        return a().g(str);
    }

    public static a j(byte[] bArr) {
        return a().f(bArr);
    }

    public abstract Integer b();

    public abstract long c();

    public abstract long d();

    public abstract o e();

    public abstract byte[] f();

    public abstract String g();

    public abstract long h();
}
