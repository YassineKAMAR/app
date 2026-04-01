package com.google.android.gms.internal.play_billing;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class j4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j4 f19585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j4 f19586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j4 f19587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j4 f19588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j4 f19589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j4 f19590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j4 f19591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j4 f19592i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j4 f19593j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j4 f19594k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j4 f19595l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final j4 f19596m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j4 f19597n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j4 f19598o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final j4 f19599p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final j4 f19600q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j4 f19601r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final j4 f19602s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ j4[] f19603t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k4 f19604a;

    static {
        j4 j4Var = new j4("DOUBLE", 0, k4.DOUBLE, 1);
        f19585b = j4Var;
        j4 j4Var2 = new j4("FLOAT", 1, k4.FLOAT, 5);
        f19586c = j4Var2;
        k4 k4Var = k4.LONG;
        j4 j4Var3 = new j4("INT64", 2, k4Var, 0);
        f19587d = j4Var3;
        j4 j4Var4 = new j4("UINT64", 3, k4Var, 0);
        f19588e = j4Var4;
        k4 k4Var2 = k4.INT;
        j4 j4Var5 = new j4("INT32", 4, k4Var2, 0);
        f19589f = j4Var5;
        j4 j4Var6 = new j4("FIXED64", 5, k4Var, 1);
        f19590g = j4Var6;
        j4 j4Var7 = new j4("FIXED32", 6, k4Var2, 5);
        f19591h = j4Var7;
        j4 j4Var8 = new j4("BOOL", 7, k4.BOOLEAN, 0);
        f19592i = j4Var8;
        j4 j4Var9 = new j4("STRING", 8, k4.STRING, 2);
        f19593j = j4Var9;
        k4 k4Var3 = k4.MESSAGE;
        j4 j4Var10 = new j4("GROUP", 9, k4Var3, 3);
        f19594k = j4Var10;
        j4 j4Var11 = new j4("MESSAGE", 10, k4Var3, 2);
        f19595l = j4Var11;
        j4 j4Var12 = new j4("BYTES", 11, k4.BYTE_STRING, 2);
        f19596m = j4Var12;
        j4 j4Var13 = new j4("UINT32", 12, k4Var2, 0);
        f19597n = j4Var13;
        j4 j4Var14 = new j4("ENUM", 13, k4.ENUM, 0);
        f19598o = j4Var14;
        j4 j4Var15 = new j4("SFIXED32", 14, k4Var2, 5);
        f19599p = j4Var15;
        j4 j4Var16 = new j4("SFIXED64", 15, k4Var, 1);
        f19600q = j4Var16;
        j4 j4Var17 = new j4("SINT32", 16, k4Var2, 0);
        f19601r = j4Var17;
        j4 j4Var18 = new j4("SINT64", 17, k4Var, 0);
        f19602s = j4Var18;
        f19603t = new j4[]{j4Var, j4Var2, j4Var3, j4Var4, j4Var5, j4Var6, j4Var7, j4Var8, j4Var9, j4Var10, j4Var11, j4Var12, j4Var13, j4Var14, j4Var15, j4Var16, j4Var17, j4Var18};
    }

    private j4(String str, int i8, k4 k4Var, int i9) {
        this.f19604a = k4Var;
    }

    public static j4[] values() {
        return (j4[]) f19603t.clone();
    }

    public final k4 a() {
        return this.f19604a;
    }
}
