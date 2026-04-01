package com.google.android.gms.internal.ads;

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
public final class m44 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m44 f11159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m44 f11160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m44 f11161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m44 f11162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m44 f11163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m44 f11164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m44 f11165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m44 f11166i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m44 f11167j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m44 f11168k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final m44 f11169l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m44 f11170m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final m44 f11171n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m44 f11172o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m44 f11173p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final m44 f11174q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m44 f11175r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final m44 f11176s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ m44[] f11177t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n44 f11178a;

    static {
        m44 m44Var = new m44("DOUBLE", 0, n44.DOUBLE, 1);
        f11159b = m44Var;
        m44 m44Var2 = new m44("FLOAT", 1, n44.FLOAT, 5);
        f11160c = m44Var2;
        n44 n44Var = n44.LONG;
        m44 m44Var3 = new m44("INT64", 2, n44Var, 0);
        f11161d = m44Var3;
        m44 m44Var4 = new m44("UINT64", 3, n44Var, 0);
        f11162e = m44Var4;
        n44 n44Var2 = n44.INT;
        m44 m44Var5 = new m44("INT32", 4, n44Var2, 0);
        f11163f = m44Var5;
        m44 m44Var6 = new m44("FIXED64", 5, n44Var, 1);
        f11164g = m44Var6;
        m44 m44Var7 = new m44("FIXED32", 6, n44Var2, 5);
        f11165h = m44Var7;
        m44 m44Var8 = new m44("BOOL", 7, n44.BOOLEAN, 0);
        f11166i = m44Var8;
        m44 m44Var9 = new m44("STRING", 8, n44.STRING, 2);
        f11167j = m44Var9;
        n44 n44Var3 = n44.MESSAGE;
        m44 m44Var10 = new m44("GROUP", 9, n44Var3, 3);
        f11168k = m44Var10;
        m44 m44Var11 = new m44("MESSAGE", 10, n44Var3, 2);
        f11169l = m44Var11;
        m44 m44Var12 = new m44("BYTES", 11, n44.BYTE_STRING, 2);
        f11170m = m44Var12;
        m44 m44Var13 = new m44("UINT32", 12, n44Var2, 0);
        f11171n = m44Var13;
        m44 m44Var14 = new m44("ENUM", 13, n44.ENUM, 0);
        f11172o = m44Var14;
        m44 m44Var15 = new m44("SFIXED32", 14, n44Var2, 5);
        f11173p = m44Var15;
        m44 m44Var16 = new m44("SFIXED64", 15, n44Var, 1);
        f11174q = m44Var16;
        m44 m44Var17 = new m44("SINT32", 16, n44Var2, 0);
        f11175r = m44Var17;
        m44 m44Var18 = new m44("SINT64", 17, n44Var, 0);
        f11176s = m44Var18;
        f11177t = new m44[]{m44Var, m44Var2, m44Var3, m44Var4, m44Var5, m44Var6, m44Var7, m44Var8, m44Var9, m44Var10, m44Var11, m44Var12, m44Var13, m44Var14, m44Var15, m44Var16, m44Var17, m44Var18};
    }

    private m44(String str, int i8, n44 n44Var, int i9) {
        this.f11178a = n44Var;
    }

    public static m44[] values() {
        return (m44[]) f11177t.clone();
    }

    public final n44 a() {
        return this.f11178a;
    }
}
