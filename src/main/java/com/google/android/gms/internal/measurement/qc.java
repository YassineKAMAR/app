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
public class qc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qc f19083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final qc f19084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final qc f19085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final qc f19086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final qc f19087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final qc f19088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final qc f19089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final qc f19090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final qc f19091k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final qc f19092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final qc f19093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final qc f19094n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final qc f19095o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final qc f19096p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final qc f19097q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final qc f19098r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final qc f19099s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final qc f19100t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ qc[] f19101u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ad f19102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19103b;

    static {
        qc qcVar = new qc("DOUBLE", 0, ad.DOUBLE, 1);
        f19083c = qcVar;
        qc qcVar2 = new qc("FLOAT", 1, ad.FLOAT, 5);
        f19084d = qcVar2;
        ad adVar = ad.LONG;
        qc qcVar3 = new qc("INT64", 2, adVar, 0);
        f19085e = qcVar3;
        qc qcVar4 = new qc("UINT64", 3, adVar, 0);
        f19086f = qcVar4;
        ad adVar2 = ad.INT;
        qc qcVar5 = new qc("INT32", 4, adVar2, 0);
        f19087g = qcVar5;
        qc qcVar6 = new qc("FIXED64", 5, adVar, 1);
        f19088h = qcVar6;
        qc qcVar7 = new qc("FIXED32", 6, adVar2, 5);
        f19089i = qcVar7;
        qc qcVar8 = new qc("BOOL", 7, ad.BOOLEAN, 0);
        f19090j = qcVar8;
        int i8 = 2;
        pc pcVar = new pc("STRING", ad.STRING);
        f19091k = pcVar;
        ad adVar3 = ad.MESSAGE;
        rc rcVar = new rc("GROUP", adVar3);
        f19092l = rcVar;
        tc tcVar = new tc("MESSAGE", adVar3);
        f19093m = tcVar;
        vc vcVar = new vc("BYTES", ad.BYTE_STRING);
        f19094n = vcVar;
        qc qcVar9 = new qc("UINT32", 12, adVar2, 0);
        f19095o = qcVar9;
        qc qcVar10 = new qc("ENUM", 13, ad.ENUM, 0);
        f19096p = qcVar10;
        qc qcVar11 = new qc("SFIXED32", 14, adVar2, 5);
        f19097q = qcVar11;
        qc qcVar12 = new qc("SFIXED64", 15, adVar, 1);
        f19098r = qcVar12;
        qc qcVar13 = new qc("SINT32", 16, adVar2, 0);
        f19099s = qcVar13;
        qc qcVar14 = new qc("SINT64", 17, adVar, 0);
        f19100t = qcVar14;
        f19101u = new qc[]{qcVar, qcVar2, qcVar3, qcVar4, qcVar5, qcVar6, qcVar7, qcVar8, pcVar, rcVar, tcVar, vcVar, qcVar9, qcVar10, qcVar11, qcVar12, qcVar13, qcVar14};
    }

    private qc(String str, int i8, ad adVar, int i9) {
        this.f19102a = adVar;
        this.f19103b = i9;
    }

    public static qc[] values() {
        return (qc[]) f19101u.clone();
    }

    public final ad a() {
        return this.f19102a;
    }
}
