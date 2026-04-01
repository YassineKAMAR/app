package u6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f26752a = new l("PUBLIC", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f26753b = new l("PROTECTED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f26754c = new l("INTERNAL", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f26755d = new l("PRIVATE", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ l[] f26756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ j6.a f26757f;

    static {
        l[] lVarArrA = a();
        f26756e = lVarArrA;
        f26757f = j6.b.a(lVarArrA);
    }

    private l(String str, int i8) {
    }

    private static final /* synthetic */ l[] a() {
        return new l[]{f26752a, f26753b, f26754c, f26755d};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f26756e.clone();
    }
}
