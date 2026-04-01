package w6;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class y extends x {
    public static String s0(String str, int i8) {
        kotlin.jvm.internal.q.f(str, "<this>");
        if (i8 >= 0) {
            String strSubstring = str.substring(t6.l.d(i8, str.length()));
            kotlin.jvm.internal.q.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static String t0(String str, int i8) {
        kotlin.jvm.internal.q.f(str, "<this>");
        if (i8 >= 0) {
            return x0(str, t6.l.b(str.length() - i8, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static char u0(CharSequence charSequence) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }

    public static char v0(CharSequence charSequence) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(w.E(charSequence));
    }

    public static char w0(CharSequence charSequence) {
        kotlin.jvm.internal.q.f(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static final String x0(String str, int i8) {
        kotlin.jvm.internal.q.f(str, "<this>");
        if (i8 >= 0) {
            String strSubstring = str.substring(0, t6.l.d(i8, str.length()));
            kotlin.jvm.internal.q.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }
}
