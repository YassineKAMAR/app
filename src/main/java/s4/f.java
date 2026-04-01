package s4;

import com.google.auto.value.AutoValue;
import s4.b;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class f {

    @AutoValue.Builder
    public static abstract class a {
        public abstract f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j8);
    }

    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new b.C0168b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
