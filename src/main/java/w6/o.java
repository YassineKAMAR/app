package w6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class o extends n {

    static final class a extends kotlin.jvm.internal.r implements p6.l<String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27159a = new a();

        a() {
            super(1);
        }

        @Override // p6.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String line) {
            kotlin.jvm.internal.q.f(line, "line");
            return line;
        }
    }

    static final class b extends kotlin.jvm.internal.r implements p6.l<String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27160a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f27160a = str;
        }

        @Override // p6.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String line) {
            kotlin.jvm.internal.q.f(line, "line");
            return this.f27160a + line;
        }
    }

    private static final p6.l<String, String> b(String str) {
        return str.length() == 0 ? a.f27159a : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                i8 = -1;
                break;
            }
            if (!w6.b.c(str.charAt(i8))) {
                break;
            }
            i8++;
        }
        return i8 == -1 ? str.length() : i8;
    }

    public static final String d(String str, String newIndent) {
        String strInvoke;
        kotlin.jvm.internal.q.f(str, "<this>");
        kotlin.jvm.internal.q.f(newIndent, "newIndent");
        List<String> listS = w.S(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS) {
            if (!v.p((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(f6.p.m(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(c((String) it.next())));
        }
        Integer num = (Integer) f6.w.J(arrayList2);
        int i8 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listS.size());
        p6.l<String, String> lVarB = b(newIndent);
        int iF = f6.o.f(listS);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listS) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                f6.o.l();
            }
            String str2 = (String) obj2;
            if ((i8 == 0 || i8 == iF) && v.p(str2)) {
                str2 = null;
            } else {
                String strS0 = y.s0(str2, iIntValue);
                if (strS0 != null && (strInvoke = lVarB.invoke(strS0)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i8 = i9;
        }
        String string = ((StringBuilder) f6.w.D(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        kotlin.jvm.internal.q.e(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    public static String e(String str) {
        kotlin.jvm.internal.q.f(str, "<this>");
        return d(str, "");
    }
}
