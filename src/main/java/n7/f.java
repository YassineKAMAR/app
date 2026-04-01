package n7;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f25181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f25182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f25184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f25185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f25186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f25187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f25188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f25189i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f25190j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f25191k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f25192l;

    public f(boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String prettyPrintIndent, boolean z13, boolean z14, String classDiscriminator, boolean z15, boolean z16) {
        kotlin.jvm.internal.q.f(prettyPrintIndent, "prettyPrintIndent");
        kotlin.jvm.internal.q.f(classDiscriminator, "classDiscriminator");
        this.f25181a = z7;
        this.f25182b = z8;
        this.f25183c = z9;
        this.f25184d = z10;
        this.f25185e = z11;
        this.f25186f = z12;
        this.f25187g = prettyPrintIndent;
        this.f25188h = z13;
        this.f25189i = z14;
        this.f25190j = classDiscriminator;
        this.f25191k = z15;
        this.f25192l = z16;
    }

    public /* synthetic */ f(boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str, boolean z13, boolean z14, String str2, boolean z15, boolean z16, int i8, kotlin.jvm.internal.j jVar) {
        this((i8 & 1) != 0 ? false : z7, (i8 & 2) != 0 ? false : z8, (i8 & 4) != 0 ? false : z9, (i8 & 8) != 0 ? false : z10, (i8 & 16) != 0 ? false : z11, (i8 & 32) != 0 ? true : z12, (i8 & 64) != 0 ? "    " : str, (i8 & 128) != 0 ? false : z13, (i8 & 256) != 0 ? false : z14, (i8 & 512) != 0 ? "type" : str2, (i8 & 1024) == 0 ? z15 : false, (i8 & 2048) == 0 ? z16 : true);
    }

    public final boolean a() {
        return this.f25191k;
    }

    public final boolean b() {
        return this.f25184d;
    }

    public final String c() {
        return this.f25190j;
    }

    public final boolean d() {
        return this.f25188h;
    }

    public final boolean e() {
        return this.f25181a;
    }

    public final boolean f() {
        return this.f25186f;
    }

    public final boolean g() {
        return this.f25182b;
    }

    public final boolean h() {
        return this.f25185e;
    }

    public final String i() {
        return this.f25187g;
    }

    public final boolean j() {
        return this.f25192l;
    }

    public final boolean k() {
        return this.f25189i;
    }

    public final boolean l() {
        return this.f25183c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f25181a + ", ignoreUnknownKeys=" + this.f25182b + ", isLenient=" + this.f25183c + ", allowStructuredMapKeys=" + this.f25184d + ", prettyPrint=" + this.f25185e + ", explicitNulls=" + this.f25186f + ", prettyPrintIndent='" + this.f25187g + "', coerceInputValues=" + this.f25188h + ", useArrayPolymorphism=" + this.f25189i + ", classDiscriminator='" + this.f25190j + "', allowSpecialFloatingPointValues=" + this.f25191k + ')';
    }
}
