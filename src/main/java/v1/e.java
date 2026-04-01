package v1;

import com.google.auto.value.AutoValue;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import v1.a;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final e f26783a = a().f(10485760).d(RCHTTPStatusCodes.SUCCESS).b(10000).c(604800000).e(81920).a();

    @AutoValue.Builder
    static abstract class a {
        a() {
        }

        abstract e a();

        abstract a b(int i8);

        abstract a c(long j8);

        abstract a d(int i8);

        abstract a e(int i8);

        abstract a f(long j8);
    }

    e() {
    }

    static a a() {
        return new a.b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();
}
