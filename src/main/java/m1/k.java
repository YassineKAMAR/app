package m1;

import com.google.auto.value.AutoValue;
import m1.e;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class k {

    @AutoValue.Builder
    public static abstract class a {
        public abstract k a();

        public abstract a b(m1.a aVar);

        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f24552a;

        b(int i8) {
            this.f24552a = i8;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract m1.a b();

    public abstract b c();
}
