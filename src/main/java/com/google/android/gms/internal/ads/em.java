package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class em {
    static long a(long j8, int i8) {
        if (i8 == 1) {
            return j8;
        }
        int i9 = i8 >> 1;
        long j9 = (j8 * j8) % 1073807359;
        return ((i8 & 1) == 0 ? a(j9, i9) : j8 * (a(j9, i9) % 1073807359)) % 1073807359;
    }

    static String b(String[] strArr, int i8, int i9) {
        int i10 = i9 + i8;
        if (strArr.length < i10) {
            qg0.d("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i11 = i10 - 1;
            if (i8 >= i11) {
                sb.append(strArr[i11]);
                return sb.toString();
            }
            sb.append(strArr[i8]);
            sb.append(' ');
            i8++;
        }
    }

    public static void c(String[] strArr, int i8, int i9, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            d(i8, e(strArr, 0, length), b(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jE = e(strArr, 0, 6);
        d(i8, jE, b(strArr, 0, 6), 6, priorityQueue);
        int i10 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i10 >= length2 - 5) {
                return;
            }
            long jA = am.a(strArr[i10 - 1]);
            long jA2 = am.a(strArr[i10 + 5]);
            String strB = b(strArr, i10, 6);
            jE = ((((((jE + 1073807359) - ((a(16785407L, 5) * ((jA + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((jA2 + 2147483647L) % 1073807359)) % 1073807359;
            d(i8, jE, strB, length2, priorityQueue);
            i10++;
        }
    }

    static void d(int i8, long j8, String str, int i9, PriorityQueue priorityQueue) {
        dm dmVar = new dm(j8, str, i9);
        if ((priorityQueue.size() != i8 || (((dm) priorityQueue.peek()).f6806c <= dmVar.f6806c && ((dm) priorityQueue.peek()).f6804a <= dmVar.f6804a)) && !priorityQueue.contains(dmVar)) {
            priorityQueue.add(dmVar);
            if (priorityQueue.size() > i8) {
                priorityQueue.poll();
            }
        }
    }

    private static long e(String[] strArr, int i8, int i9) {
        long jA = (((long) am.a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i10 = 1; i10 < i9; i10++) {
            jA = (((jA * 16785407) % 1073807359) + ((((long) am.a(strArr[i10])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return jA;
    }
}
