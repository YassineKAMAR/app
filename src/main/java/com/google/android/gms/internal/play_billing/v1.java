package com.google.android.gms.internal.play_billing;

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
public final class v1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v1 f19703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v1 f19704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v1 f19705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v1 f19706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v1 f19707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v1 f19708i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v1 f19709j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v1 f19710k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v1 f19711l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final v1 f19712m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ v1[] f19713n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f19714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f19715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f19716c;

    static {
        v1 v1Var = new v1("VOID", 0, Void.class, Void.class, null);
        f19703d = v1Var;
        Class cls = Integer.TYPE;
        v1 v1Var2 = new v1("INT", 1, cls, Integer.class, 0);
        f19704e = v1Var2;
        v1 v1Var3 = new v1("LONG", 2, Long.TYPE, Long.class, 0L);
        f19705f = v1Var3;
        v1 v1Var4 = new v1("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f19706g = v1Var4;
        v1 v1Var5 = new v1("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f19707h = v1Var5;
        v1 v1Var6 = new v1("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f19708i = v1Var6;
        v1 v1Var7 = new v1("STRING", 6, String.class, String.class, "");
        f19709j = v1Var7;
        v1 v1Var8 = new v1("BYTE_STRING", 7, n0.class, n0.class, n0.f19633b);
        f19710k = v1Var8;
        v1 v1Var9 = new v1("ENUM", 8, cls, Integer.class, null);
        f19711l = v1Var9;
        v1 v1Var10 = new v1("MESSAGE", 9, Object.class, Object.class, null);
        f19712m = v1Var10;
        f19713n = new v1[]{v1Var, v1Var2, v1Var3, v1Var4, v1Var5, v1Var6, v1Var7, v1Var8, v1Var9, v1Var10};
    }

    private v1(String str, int i8, Class cls, Class cls2, Object obj) {
        this.f19714a = cls;
        this.f19715b = cls2;
        this.f19716c = obj;
    }

    public static v1[] values() {
        return (v1[]) f19713n.clone();
    }

    public final Class a() {
        return this.f19715b;
    }
}
