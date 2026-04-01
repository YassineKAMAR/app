package x6;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f27331b = new d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f27332c = new d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f27333d = new d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f27334e = new d("SECONDS", 3, TimeUnit.SECONDS);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f27335f = new d("MINUTES", 4, TimeUnit.MINUTES);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f27336g = new d("HOURS", 5, TimeUnit.HOURS);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f27337h = new d("DAYS", 6, TimeUnit.DAYS);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ d[] f27338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ j6.a f27339j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeUnit f27340a;

    static {
        d[] dVarArrA = a();
        f27338i = dVarArrA;
        f27339j = j6.b.a(dVarArrA);
    }

    private d(String str, int i8, TimeUnit timeUnit) {
        this.f27340a = timeUnit;
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f27331b, f27332c, f27333d, f27334e, f27335f, f27336g, f27337h};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f27338i.clone();
    }

    public final TimeUnit c() {
        return this.f27340a;
    }
}
