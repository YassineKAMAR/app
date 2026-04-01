package n6;

import java.io.File;
import kotlin.jvm.internal.q;
import w6.w;

/* JADX INFO: loaded from: classes2.dex */
class g {
    private static final int a(String str) {
        int iJ;
        int iJ2 = w.J(str, File.separatorChar, 0, false, 4, null);
        if (iJ2 != 0) {
            if (iJ2 > 0 && str.charAt(iJ2 - 1) == ':') {
                return iJ2 + 1;
            }
            if (iJ2 == -1 && w.B(str, ':', false, 2, null)) {
                return str.length();
            }
            return 0;
        }
        if (str.length() > 1) {
            char cCharAt = str.charAt(1);
            char c8 = File.separatorChar;
            if (cCharAt == c8 && (iJ = w.J(str, c8, 2, false, 4, null)) >= 0) {
                int iJ3 = w.J(str, File.separatorChar, iJ + 1, false, 4, null);
                return iJ3 >= 0 ? iJ3 + 1 : str.length();
            }
        }
        return 1;
    }

    public static final boolean b(File file) {
        q.f(file, "<this>");
        String path = file.getPath();
        q.e(path, "path");
        return a(path) > 0;
    }
}
