package u1;

import android.app.job.JobInfo;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import u1.c;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private x1.a f26649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<l1.d, b> f26650b = new HashMap();

        public a a(l1.d dVar, b bVar) {
            this.f26650b.put(dVar, bVar);
            return this;
        }

        public f b() {
            if (this.f26649a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f26650b.keySet().size() < l1.d.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<l1.d, b> map = this.f26650b;
            this.f26650b = new HashMap();
            return f.d(this.f26649a, map);
        }

        public a c(x1.a aVar) {
            this.f26649a = aVar;
            return this;
        }
    }

    @AutoValue
    public static abstract class b {

        @AutoValue.Builder
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j8);

            public abstract a c(Set<c> set);

            public abstract a d(long j8);
        }

        public static a a() {
            return new c.b().c(Collections.emptySet());
        }

        abstract long b();

        abstract Set<c> c();

        abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i8, long j8) {
        return (long) (Math.pow(3.0d, i8 - 1) * j8 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j8 > 1 ? j8 : 2L) * ((long) r7))));
    }

    public static a b() {
        return new a();
    }

    static f d(x1.a aVar, Map<l1.d, b> map) {
        return new u1.b(aVar, map);
    }

    public static f f(x1.a aVar) {
        return b().a(l1.d.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(l1.d.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(l1.d.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, l1.d dVar, long j8, int i8) {
        builder.setMinimumLatency(g(dVar, j8, i8));
        j(builder, h().get(dVar).c());
        return builder;
    }

    abstract x1.a e();

    public long g(l1.d dVar, long j8, int i8) {
        long jA = j8 - e().a();
        b bVar = h().get(dVar);
        return Math.min(Math.max(a(i8, bVar.b()), jA), bVar.d());
    }

    abstract Map<l1.d, b> h();
}
