package u6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f26747a = new k("INVARIANT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f26748b = new k("IN", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f26749c = new k("OUT", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ k[] f26750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ j6.a f26751e;

    static {
        k[] kVarArrA = a();
        f26750d = kVarArrA;
        f26751e = j6.b.a(kVarArrA);
    }

    private k(String str, int i8) {
    }

    private static final /* synthetic */ k[] a() {
        return new k[]{f26747a, f26748b, f26749c};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f26750d.clone();
    }
}
