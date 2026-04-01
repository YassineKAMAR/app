package n7;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f25171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f25173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f25174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f25175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f25176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f25177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f25178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f25179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private p7.c f25180m;

    public d(a json) {
        kotlin.jvm.internal.q.f(json, "json");
        this.f25168a = json.e().e();
        this.f25169b = json.e().f();
        this.f25170c = json.e().g();
        this.f25171d = json.e().l();
        this.f25172e = json.e().b();
        this.f25173f = json.e().h();
        this.f25174g = json.e().i();
        this.f25175h = json.e().d();
        this.f25176i = json.e().k();
        this.f25177j = json.e().c();
        this.f25178k = json.e().a();
        this.f25179l = json.e().j();
        this.f25180m = json.a();
    }

    public final f a() {
        if (this.f25176i && !kotlin.jvm.internal.q.b(this.f25177j, "type")) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
        }
        if (this.f25173f) {
            if (!kotlin.jvm.internal.q.b(this.f25174g, "    ")) {
                String str = this.f25174g;
                boolean z7 = false;
                int i8 = 0;
                while (true) {
                    boolean z8 = true;
                    if (i8 >= str.length()) {
                        z7 = true;
                        break;
                    }
                    char cCharAt = str.charAt(i8);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        z8 = false;
                    }
                    if (!z8) {
                        break;
                    }
                    i8++;
                }
                if (!z7) {
                    throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f25174g).toString());
                }
            }
        } else if (!kotlin.jvm.internal.q.b(this.f25174g, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
        }
        return new f(this.f25168a, this.f25170c, this.f25171d, this.f25172e, this.f25173f, this.f25169b, this.f25174g, this.f25175h, this.f25176i, this.f25177j, this.f25178k, this.f25179l);
    }

    public final p7.c b() {
        return this.f25180m;
    }

    public final void c(boolean z7) {
        this.f25170c = z7;
    }
}
