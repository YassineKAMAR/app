package w6;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27155b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f27156a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(String pattern) {
        kotlin.jvm.internal.q.f(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        kotlin.jvm.internal.q.e(patternCompile, "compile(pattern)");
        this(patternCompile);
    }

    public j(Pattern nativePattern) {
        kotlin.jvm.internal.q.f(nativePattern, "nativePattern");
        this.f27156a = nativePattern;
    }

    public final h a(CharSequence input) {
        kotlin.jvm.internal.q.f(input, "input");
        Matcher matcher = this.f27156a.matcher(input);
        kotlin.jvm.internal.q.e(matcher, "nativePattern.matcher(input)");
        return k.c(matcher, input);
    }

    public final boolean b(CharSequence input) {
        kotlin.jvm.internal.q.f(input, "input");
        return this.f27156a.matcher(input).matches();
    }

    public final String c(CharSequence input, String replacement) {
        kotlin.jvm.internal.q.f(input, "input");
        kotlin.jvm.internal.q.f(replacement, "replacement");
        String strReplaceAll = this.f27156a.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.q.e(strReplaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return strReplaceAll;
    }

    public String toString() {
        String string = this.f27156a.toString();
        kotlin.jvm.internal.q.e(string, "nativePattern.toString()");
        return string;
    }
}
