package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class m9 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m9 f18950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m9 f18951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m9 f18952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m9 f18953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m9 f18954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m9 f18955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m9 f18956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m9 f18957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final m9 f18958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m9 f18959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ m9[] f18960n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f18961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<?> f18962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f18963c;

    static {
        m9 m9Var = new m9("VOID", 0, Void.class, Void.class, null);
        f18950d = m9Var;
        Class cls = Integer.TYPE;
        m9 m9Var2 = new m9("INT", 1, cls, Integer.class, 0);
        f18951e = m9Var2;
        m9 m9Var3 = new m9("LONG", 2, Long.TYPE, Long.class, 0L);
        f18952f = m9Var3;
        m9 m9Var4 = new m9("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f18953g = m9Var4;
        m9 m9Var5 = new m9("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f18954h = m9Var5;
        m9 m9Var6 = new m9("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f18955i = m9Var6;
        m9 m9Var7 = new m9("STRING", 6, String.class, String.class, "");
        f18956j = m9Var7;
        m9 m9Var8 = new m9("BYTE_STRING", 7, o7.class, o7.class, o7.f19004b);
        f18957k = m9Var8;
        m9 m9Var9 = new m9("ENUM", 8, cls, Integer.class, null);
        f18958l = m9Var9;
        m9 m9Var10 = new m9("MESSAGE", 9, Object.class, Object.class, null);
        f18959m = m9Var10;
        f18960n = new m9[]{m9Var, m9Var2, m9Var3, m9Var4, m9Var5, m9Var6, m9Var7, m9Var8, m9Var9, m9Var10};
    }

    private m9(String str, int i8, Class cls, Class cls2, Object obj) {
        this.f18961a = cls;
        this.f18962b = cls2;
        this.f18963c = obj;
    }

    public static m9[] values() {
        return (m9[]) f18960n.clone();
    }

    public final Class<?> a() {
        return this.f18962b;
    }
}
