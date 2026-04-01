package o1;

import com.google.auto.value.AutoValue;
import o1.a;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class f {

    @AutoValue.Builder
    public static abstract class a {
        public abstract f a();

        public abstract a b(Iterable<n1.i> iterable);

        public abstract a c(byte[] bArr);
    }

    public static a a() {
        return new a.b();
    }

    public abstract Iterable<n1.i> b();

    public abstract byte[] c();
}
