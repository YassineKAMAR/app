package w6;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f27128a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f27129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f27130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f27131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f27132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f27133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f27134g;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.q.e(charsetForName, "forName(\"UTF-8\")");
        f27129b = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        kotlin.jvm.internal.q.e(charsetForName2, "forName(\"UTF-16\")");
        f27130c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        kotlin.jvm.internal.q.e(charsetForName3, "forName(\"UTF-16BE\")");
        f27131d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        kotlin.jvm.internal.q.e(charsetForName4, "forName(\"UTF-16LE\")");
        f27132e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        kotlin.jvm.internal.q.e(charsetForName5, "forName(\"US-ASCII\")");
        f27133f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.q.e(charsetForName6, "forName(\"ISO-8859-1\")");
        f27134g = charsetForName6;
    }

    private d() {
    }
}
