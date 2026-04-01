package com.google.android.gms.internal.ads;

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
public final class o14 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o14 f12331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o14 f12332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o14 f12333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o14 f12334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o14 f12335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o14 f12336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o14 f12337j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o14 f12338k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o14 f12339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final o14 f12340m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ o14[] f12341n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f12342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f12343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f12344c;

    static {
        o14 o14Var = new o14("VOID", 0, Void.class, Void.class, null);
        f12331d = o14Var;
        Class cls = Integer.TYPE;
        o14 o14Var2 = new o14("INT", 1, cls, Integer.class, 0);
        f12332e = o14Var2;
        o14 o14Var3 = new o14("LONG", 2, Long.TYPE, Long.class, 0L);
        f12333f = o14Var3;
        o14 o14Var4 = new o14("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f12334g = o14Var4;
        o14 o14Var5 = new o14("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f12335h = o14Var5;
        o14 o14Var6 = new o14("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f12336i = o14Var6;
        o14 o14Var7 = new o14("STRING", 6, String.class, String.class, "");
        f12337j = o14Var7;
        o14 o14Var8 = new o14("BYTE_STRING", 7, rz3.class, rz3.class, rz3.f14393b);
        f12338k = o14Var8;
        o14 o14Var9 = new o14("ENUM", 8, cls, Integer.class, null);
        f12339l = o14Var9;
        o14 o14Var10 = new o14("MESSAGE", 9, Object.class, Object.class, null);
        f12340m = o14Var10;
        f12341n = new o14[]{o14Var, o14Var2, o14Var3, o14Var4, o14Var5, o14Var6, o14Var7, o14Var8, o14Var9, o14Var10};
    }

    private o14(String str, int i8, Class cls, Class cls2, Object obj) {
        this.f12342a = cls;
        this.f12343b = cls2;
        this.f12344c = obj;
    }

    public static o14[] values() {
        return (o14[]) f12341n.clone();
    }

    public final Class a() {
        return this.f12343b;
    }
}
