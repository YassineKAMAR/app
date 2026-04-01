package com.amazon.a.a.i;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f3656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a[] f3657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f3658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f3659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f3660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f3661i;

    public enum a {
        DEFAULT,
        HELP,
        DEEPLINK
    }

    public c(String str, String str2, String str3, boolean z7) {
        this(str, str2, str3, z7, false);
    }

    public c(String str, String str2, String str3, boolean z7, boolean z8) {
        this(str, str2, new String[]{str3}, new a[]{a.DEFAULT}, z7, z8, 0);
    }

    public c(String str, String str2, String[] strArr, a[] aVarArr, boolean z7, boolean z8, int i8) {
        this(new String[]{str}, str2, strArr, aVarArr, z7, z8, i8);
    }

    public c(String[] strArr, String str, String[] strArr2, a[] aVarArr, boolean z7, boolean z8, int i8) {
        this(strArr, str, strArr2, aVarArr, z7, z8, i8, -1);
    }

    public c(String[] strArr, String str, String[] strArr2, a[] aVarArr, boolean z7, boolean z8, int i8, int i9) {
        String str2 = strArr[0];
        this.f3653a = str2;
        if (strArr.length > 1) {
            this.f3654b = strArr[1];
        } else {
            this.f3654b = str2;
        }
        this.f3655c = str;
        this.f3656d = strArr2;
        this.f3657e = aVarArr;
        this.f3658f = z7;
        this.f3659g = z8;
        this.f3660h = i8;
        this.f3661i = i9;
    }

    public String a() {
        return this.f3656d[this.f3660h];
    }

    public String[] b() {
        return this.f3656d;
    }

    public a[] c() {
        return this.f3657e;
    }

    public String d() {
        return this.f3655c;
    }

    public String e() {
        return this.f3654b;
    }

    public String f() {
        return this.f3653a;
    }

    public int g() {
        return this.f3661i;
    }

    public boolean h() {
        return this.f3658f;
    }

    public boolean i() {
        return this.f3659g;
    }

    public String toString() {
        return "PromptContent: [ title:" + this.f3653a + ", message: " + this.f3655c + ", label: " + this.f3656d[0] + ", visible: " + this.f3658f + ", shouldShowFixup: " + this.f3659g + "]";
    }
}
