package e6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f21435a = new o("SYNCHRONIZED", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f21436b = new o("PUBLICATION", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f21437c = new o("NONE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ o[] f21438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ j6.a f21439e;

    static {
        o[] oVarArrA = a();
        f21438d = oVarArrA;
        f21439e = j6.b.a(oVarArrA);
    }

    private o(String str, int i8) {
    }

    private static final /* synthetic */ o[] a() {
        return new o[]{f21435a, f21436b, f21437c};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f21438d.clone();
    }
}
