package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class v80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f16037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CharSequence f16038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CharSequence f16039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f16040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f16041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f16042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f16043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Integer f16044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Integer f16045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f16046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Boolean f16047k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f16048l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f16049m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f16050n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Integer f16051o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Integer f16052p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Integer f16053q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f16054r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f16055s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f16056t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private CharSequence f16057u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private CharSequence f16058v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Integer f16059w;

    public v80() {
    }

    /* synthetic */ v80(ra0 ra0Var, c80 c80Var) {
        this.f16037a = ra0Var.f14005a;
        this.f16038b = ra0Var.f14006b;
        this.f16039c = ra0Var.f14007c;
        this.f16040d = ra0Var.f14008d;
        this.f16041e = ra0Var.f14009e;
        this.f16042f = ra0Var.f14010f;
        this.f16043g = ra0Var.f14011g;
        this.f16044h = ra0Var.f14012h;
        this.f16045i = ra0Var.f14013i;
        this.f16046j = ra0Var.f14014j;
        this.f16047k = ra0Var.f14015k;
        this.f16048l = ra0Var.f14017m;
        this.f16049m = ra0Var.f14018n;
        this.f16050n = ra0Var.f14019o;
        this.f16051o = ra0Var.f14020p;
        this.f16052p = ra0Var.f14021q;
        this.f16053q = ra0Var.f14022r;
        this.f16054r = ra0Var.f14023s;
        this.f16055s = ra0Var.f14024t;
        this.f16056t = ra0Var.f14025u;
        this.f16057u = ra0Var.f14026v;
        this.f16058v = ra0Var.f14027w;
        this.f16059w = ra0Var.f14028x;
    }

    public final v80 A(CharSequence charSequence) {
        this.f16057u = charSequence;
        return this;
    }

    public final v80 B(Integer num) {
        this.f16050n = num;
        return this;
    }

    public final v80 C(Integer num) {
        this.f16049m = num;
        return this;
    }

    public final v80 D(Integer num) {
        this.f16048l = num;
        return this;
    }

    public final v80 E(Integer num) {
        this.f16053q = num;
        return this;
    }

    public final v80 F(Integer num) {
        this.f16052p = num;
        return this;
    }

    public final v80 G(Integer num) {
        this.f16051o = num;
        return this;
    }

    public final v80 H(CharSequence charSequence) {
        this.f16058v = charSequence;
        return this;
    }

    public final v80 I(CharSequence charSequence) {
        this.f16037a = charSequence;
        return this;
    }

    public final v80 J(Integer num) {
        this.f16045i = num;
        return this;
    }

    public final v80 K(Integer num) {
        this.f16044h = num;
        return this;
    }

    public final v80 L(CharSequence charSequence) {
        this.f16054r = charSequence;
        return this;
    }

    public final ra0 M() {
        return new ra0(this);
    }

    public final v80 s(byte[] bArr, int i8) {
        if (this.f16042f == null || nz2.e(Integer.valueOf(i8), 3) || !nz2.e(this.f16043g, 3)) {
            this.f16042f = (byte[]) bArr.clone();
            this.f16043g = Integer.valueOf(i8);
        }
        return this;
    }

    public final v80 t(ra0 ra0Var) {
        if (ra0Var == null) {
            return this;
        }
        CharSequence charSequence = ra0Var.f14005a;
        if (charSequence != null) {
            this.f16037a = charSequence;
        }
        CharSequence charSequence2 = ra0Var.f14006b;
        if (charSequence2 != null) {
            this.f16038b = charSequence2;
        }
        CharSequence charSequence3 = ra0Var.f14007c;
        if (charSequence3 != null) {
            this.f16039c = charSequence3;
        }
        CharSequence charSequence4 = ra0Var.f14008d;
        if (charSequence4 != null) {
            this.f16040d = charSequence4;
        }
        CharSequence charSequence5 = ra0Var.f14009e;
        if (charSequence5 != null) {
            this.f16041e = charSequence5;
        }
        byte[] bArr = ra0Var.f14010f;
        if (bArr != null) {
            Integer num = ra0Var.f14011g;
            this.f16042f = (byte[]) bArr.clone();
            this.f16043g = num;
        }
        Integer num2 = ra0Var.f14012h;
        if (num2 != null) {
            this.f16044h = num2;
        }
        Integer num3 = ra0Var.f14013i;
        if (num3 != null) {
            this.f16045i = num3;
        }
        Integer num4 = ra0Var.f14014j;
        if (num4 != null) {
            this.f16046j = num4;
        }
        Boolean bool = ra0Var.f14015k;
        if (bool != null) {
            this.f16047k = bool;
        }
        Integer num5 = ra0Var.f14016l;
        if (num5 != null) {
            this.f16048l = num5;
        }
        Integer num6 = ra0Var.f14017m;
        if (num6 != null) {
            this.f16048l = num6;
        }
        Integer num7 = ra0Var.f14018n;
        if (num7 != null) {
            this.f16049m = num7;
        }
        Integer num8 = ra0Var.f14019o;
        if (num8 != null) {
            this.f16050n = num8;
        }
        Integer num9 = ra0Var.f14020p;
        if (num9 != null) {
            this.f16051o = num9;
        }
        Integer num10 = ra0Var.f14021q;
        if (num10 != null) {
            this.f16052p = num10;
        }
        Integer num11 = ra0Var.f14022r;
        if (num11 != null) {
            this.f16053q = num11;
        }
        CharSequence charSequence6 = ra0Var.f14023s;
        if (charSequence6 != null) {
            this.f16054r = charSequence6;
        }
        CharSequence charSequence7 = ra0Var.f14024t;
        if (charSequence7 != null) {
            this.f16055s = charSequence7;
        }
        CharSequence charSequence8 = ra0Var.f14025u;
        if (charSequence8 != null) {
            this.f16056t = charSequence8;
        }
        CharSequence charSequence9 = ra0Var.f14026v;
        if (charSequence9 != null) {
            this.f16057u = charSequence9;
        }
        CharSequence charSequence10 = ra0Var.f14027w;
        if (charSequence10 != null) {
            this.f16058v = charSequence10;
        }
        Integer num12 = ra0Var.f14028x;
        if (num12 != null) {
            this.f16059w = num12;
        }
        return this;
    }

    public final v80 u(CharSequence charSequence) {
        this.f16040d = charSequence;
        return this;
    }

    public final v80 v(CharSequence charSequence) {
        this.f16039c = charSequence;
        return this;
    }

    public final v80 w(CharSequence charSequence) {
        this.f16038b = charSequence;
        return this;
    }

    public final v80 x(CharSequence charSequence) {
        this.f16055s = charSequence;
        return this;
    }

    public final v80 y(CharSequence charSequence) {
        this.f16056t = charSequence;
        return this;
    }

    public final v80 z(CharSequence charSequence) {
        this.f16041e = charSequence;
        return this;
    }
}
