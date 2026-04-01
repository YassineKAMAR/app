package androidx.profileinstaller;

import com.revenuecat.purchases.common.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f2770a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final byte[] f2771b = {112, 114, 109, 0};

    private static void A(InputStream inputStream) {
        e.h(inputStream);
        int iJ = e.j(inputStream);
        if (iJ == 6 || iJ == 7) {
            return;
        }
        while (iJ > 0) {
            e.j(inputStream);
            for (int iJ2 = e.j(inputStream); iJ2 > 0; iJ2--) {
                e.h(inputStream);
            }
            iJ--;
        }
    }

    static boolean B(OutputStream outputStream, byte[] bArr, d[] dVarArr) throws IOException {
        if (Arrays.equals(bArr, o.f2782a)) {
            N(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, o.f2783b)) {
            M(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, o.f2785d)) {
            K(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, o.f2784c)) {
            L(outputStream, dVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, o.f2786e)) {
            return false;
        }
        J(outputStream, dVarArr);
        return true;
    }

    private static void C(OutputStream outputStream, d dVar) throws IOException {
        int iIntValue = 0;
        for (int i8 : dVar.f2751h) {
            Integer numValueOf = Integer.valueOf(i8);
            e.p(outputStream, numValueOf.intValue() - iIntValue);
            iIntValue = numValueOf.intValue();
        }
    }

    private static p D(d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            e.p(byteArrayOutputStream, dVarArr.length);
            int i8 = 2;
            for (d dVar : dVarArr) {
                e.q(byteArrayOutputStream, dVar.f2746c);
                e.q(byteArrayOutputStream, dVar.f2747d);
                e.q(byteArrayOutputStream, dVar.f2750g);
                String strJ = j(dVar.f2744a, dVar.f2745b, o.f2782a);
                int iK = e.k(strJ);
                e.p(byteArrayOutputStream, iK);
                i8 = i8 + 4 + 4 + 4 + 2 + (iK * 1);
                e.n(byteArrayOutputStream, strJ);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i8 == byteArray.length) {
                p pVar = new p(f.DEX_FILES, i8, byteArray, false);
                byteArrayOutputStream.close();
                return pVar;
            }
            throw e.c("Expected size " + i8 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static void E(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f2770a);
        outputStream.write(bArr);
    }

    private static void F(OutputStream outputStream, d dVar) throws IOException {
        I(outputStream, dVar);
        C(outputStream, dVar);
        H(outputStream, dVar);
    }

    private static void G(OutputStream outputStream, d dVar, String str) throws IOException {
        e.p(outputStream, e.k(str));
        e.p(outputStream, dVar.f2748e);
        e.q(outputStream, dVar.f2749f);
        e.q(outputStream, dVar.f2746c);
        e.q(outputStream, dVar.f2750g);
        e.n(outputStream, str);
    }

    private static void H(OutputStream outputStream, d dVar) throws IOException {
        byte[] bArr = new byte[k(dVar.f2750g)];
        for (Map.Entry<Integer, Integer> entry : dVar.f2752i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                z(bArr, 2, iIntValue, dVar);
            }
            if ((iIntValue2 & 4) != 0) {
                z(bArr, 4, iIntValue, dVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void I(OutputStream outputStream, d dVar) throws IOException {
        int i8 = 0;
        for (Map.Entry<Integer, Integer> entry : dVar.f2752i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                e.p(outputStream, iIntValue - i8);
                e.p(outputStream, 0);
                i8 = iIntValue;
            }
        }
    }

    private static void J(OutputStream outputStream, d[] dVarArr) throws IOException {
        e.p(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            String strJ = j(dVar.f2744a, dVar.f2745b, o.f2786e);
            e.p(outputStream, e.k(strJ));
            e.p(outputStream, dVar.f2752i.size());
            e.p(outputStream, dVar.f2751h.length);
            e.q(outputStream, dVar.f2746c);
            e.n(outputStream, strJ);
            Iterator<Integer> it = dVar.f2752i.keySet().iterator();
            while (it.hasNext()) {
                e.p(outputStream, it.next().intValue());
            }
            for (int i8 : dVar.f2751h) {
                e.p(outputStream, i8);
            }
        }
    }

    private static void K(OutputStream outputStream, d[] dVarArr) throws IOException {
        e.r(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            int size = dVar.f2752i.size() * 4;
            String strJ = j(dVar.f2744a, dVar.f2745b, o.f2785d);
            e.p(outputStream, e.k(strJ));
            e.p(outputStream, dVar.f2751h.length);
            e.q(outputStream, size);
            e.q(outputStream, dVar.f2746c);
            e.n(outputStream, strJ);
            Iterator<Integer> it = dVar.f2752i.keySet().iterator();
            while (it.hasNext()) {
                e.p(outputStream, it.next().intValue());
                e.p(outputStream, 0);
            }
            for (int i8 : dVar.f2751h) {
                e.p(outputStream, i8);
            }
        }
    }

    private static void L(OutputStream outputStream, d[] dVarArr) throws IOException {
        byte[] bArrB = b(dVarArr, o.f2784c);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, bArrB);
    }

    private static void M(OutputStream outputStream, d[] dVarArr) throws IOException {
        byte[] bArrB = b(dVarArr, o.f2783b);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, bArrB);
    }

    private static void N(OutputStream outputStream, d[] dVarArr) throws IOException {
        O(outputStream, dVarArr);
    }

    private static void O(OutputStream outputStream, d[] dVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(dVarArr));
        arrayList.add(c(dVarArr));
        arrayList.add(d(dVarArr));
        long length2 = ((long) o.f2782a.length) + ((long) f2770a.length) + 4 + ((long) (arrayList.size() * 16));
        e.q(outputStream, arrayList.size());
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            p pVar = (p) arrayList.get(i8);
            e.q(outputStream, pVar.f2789a.c());
            e.q(outputStream, length2);
            if (pVar.f2792d) {
                byte[] bArr = pVar.f2791c;
                long length3 = bArr.length;
                byte[] bArrB = e.b(bArr);
                arrayList2.add(bArrB);
                e.q(outputStream, bArrB.length);
                e.q(outputStream, length3);
                length = bArrB.length;
            } else {
                arrayList2.add(pVar.f2791c);
                e.q(outputStream, pVar.f2791c.length);
                e.q(outputStream, 0L);
                length = pVar.f2791c.length;
            }
            length2 += (long) length;
        }
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            outputStream.write((byte[]) arrayList2.get(i9));
        }
    }

    private static int a(d dVar) {
        Iterator<Map.Entry<Integer, Integer>> it = dVar.f2752i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= it.next().getValue().intValue();
        }
        return iIntValue;
    }

    private static byte[] b(d[] dVarArr, byte[] bArr) throws IOException {
        int i8 = 0;
        int iK = 0;
        for (d dVar : dVarArr) {
            iK += e.k(j(dVar.f2744a, dVar.f2745b, bArr)) + 16 + (dVar.f2748e * 2) + dVar.f2749f + k(dVar.f2750g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iK);
        if (Arrays.equals(bArr, o.f2784c)) {
            int length = dVarArr.length;
            while (i8 < length) {
                d dVar2 = dVarArr[i8];
                G(byteArrayOutputStream, dVar2, j(dVar2.f2744a, dVar2.f2745b, bArr));
                F(byteArrayOutputStream, dVar2);
                i8++;
            }
        } else {
            for (d dVar3 : dVarArr) {
                G(byteArrayOutputStream, dVar3, j(dVar3.f2744a, dVar3.f2745b, bArr));
            }
            int length2 = dVarArr.length;
            while (i8 < length2) {
                F(byteArrayOutputStream, dVarArr[i8]);
                i8++;
            }
        }
        if (byteArrayOutputStream.size() == iK) {
            return byteArrayOutputStream.toByteArray();
        }
        throw e.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iK);
    }

    private static p c(d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i8 = 0;
        for (int i9 = 0; i9 < dVarArr.length; i9++) {
            try {
                d dVar = dVarArr[i9];
                e.p(byteArrayOutputStream, i9);
                e.p(byteArrayOutputStream, dVar.f2748e);
                i8 = i8 + 2 + 2 + (dVar.f2748e * 2);
                C(byteArrayOutputStream, dVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i8 == byteArray.length) {
            p pVar = new p(f.CLASSES, i8, byteArray, true);
            byteArrayOutputStream.close();
            return pVar;
        }
        throw e.c("Expected size " + i8 + ", does not match actual size " + byteArray.length);
    }

    private static p d(d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i8 = 0;
        for (int i9 = 0; i9 < dVarArr.length; i9++) {
            try {
                d dVar = dVarArr[i9];
                int iA = a(dVar);
                byte[] bArrE = e(dVar);
                byte[] bArrF = f(dVar);
                e.p(byteArrayOutputStream, i9);
                int length = bArrE.length + 2 + bArrF.length;
                e.q(byteArrayOutputStream, length);
                e.p(byteArrayOutputStream, iA);
                byteArrayOutputStream.write(bArrE);
                byteArrayOutputStream.write(bArrF);
                i8 = i8 + 2 + 4 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i8 == byteArray.length) {
            p pVar = new p(f.METHODS, i8, byteArray, true);
            byteArrayOutputStream.close();
            return pVar;
        }
        throw e.c("Expected size " + i8 + ", does not match actual size " + byteArray.length);
    }

    private static byte[] e(d dVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] f(d dVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, "!") : Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR.equals(str2) ? str.replace("!", Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR) : str;
    }

    private static String h(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    private static d i(d[] dVarArr, String str) {
        if (dVarArr.length <= 0) {
            return null;
        }
        String strH = h(str);
        for (int i8 = 0; i8 < dVarArr.length; i8++) {
            if (dVarArr[i8].f2745b.equals(strH)) {
                return dVarArr[i8];
            }
        }
        return null;
    }

    private static String j(String str, String str2, byte[] bArr) {
        String strA = o.a(bArr);
        if (str.length() <= 0) {
            return g(str2, strA);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)) {
            return g(str2, strA);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + o.a(bArr) + str2;
    }

    private static int k(int i8) {
        return y(i8 * 2) / 8;
    }

    private static int l(int i8, int i9, int i10) {
        if (i8 == 1) {
            throw e.c("HOT methods are not stored in the bitmap");
        }
        if (i8 == 2) {
            return i9;
        }
        if (i8 == 4) {
            return i9 + i10;
        }
        throw e.c("Unexpected flag: " + i8);
    }

    private static int[] m(InputStream inputStream, int i8) {
        int[] iArr = new int[i8];
        int iH = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            iH += e.h(inputStream);
            iArr[i9] = iH;
        }
        return iArr;
    }

    private static int n(BitSet bitSet, int i8, int i9) {
        int i10 = bitSet.get(l(2, i8, i9)) ? 2 : 0;
        return bitSet.get(l(4, i8, i9)) ? i10 | 4 : i10;
    }

    static byte[] o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, e.d(inputStream, bArr.length))) {
            return e.d(inputStream, o.f2783b.length);
        }
        throw e.c("Invalid magic");
    }

    private static void p(InputStream inputStream, d dVar) {
        int iAvailable = inputStream.available() - dVar.f2749f;
        int iH = 0;
        while (inputStream.available() > iAvailable) {
            iH += e.h(inputStream);
            dVar.f2752i.put(Integer.valueOf(iH), 1);
            for (int iH2 = e.h(inputStream); iH2 > 0; iH2--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw e.c("Read too much data during profile line parse");
        }
    }

    static d[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, d[] dVarArr) {
        if (Arrays.equals(bArr, o.f2787f)) {
            if (Arrays.equals(o.f2782a, bArr2)) {
                throw e.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return r(inputStream, bArr, dVarArr);
        }
        if (Arrays.equals(bArr, o.f2788g)) {
            return t(inputStream, bArr2, dVarArr);
        }
        throw e.c("Unsupported meta version");
    }

    static d[] r(InputStream inputStream, byte[] bArr, d[] dVarArr) throws IOException {
        if (!Arrays.equals(bArr, o.f2787f)) {
            throw e.c("Unsupported meta version");
        }
        int iJ = e.j(inputStream);
        byte[] bArrE = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            d[] dVarArrS = s(byteArrayInputStream, iJ, dVarArr);
            byteArrayInputStream.close();
            return dVarArrS;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static d[] s(InputStream inputStream, int i8, d[] dVarArr) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i8 != dVarArr.length) {
            throw e.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i8];
        int[] iArr = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int iH = e.h(inputStream);
            iArr[i9] = e.h(inputStream);
            strArr[i9] = e.f(inputStream, iH);
        }
        for (int i10 = 0; i10 < i8; i10++) {
            d dVar = dVarArr[i10];
            if (!dVar.f2745b.equals(strArr[i10])) {
                throw e.c("Order of dexfiles in metadata did not match baseline");
            }
            int i11 = iArr[i10];
            dVar.f2748e = i11;
            dVar.f2751h = m(inputStream, i11);
        }
        return dVarArr;
    }

    static d[] t(InputStream inputStream, byte[] bArr, d[] dVarArr) throws IOException {
        int iH = e.h(inputStream);
        byte[] bArrE = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            d[] dVarArrU = u(byteArrayInputStream, bArr, iH, dVarArr);
            byteArrayInputStream.close();
            return dVarArrU;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static d[] u(InputStream inputStream, byte[] bArr, int i8, d[] dVarArr) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i8 != dVarArr.length) {
            throw e.c("Mismatched number of dex files found in metadata");
        }
        for (int i9 = 0; i9 < i8; i9++) {
            e.h(inputStream);
            String strF = e.f(inputStream, e.h(inputStream));
            long jI = e.i(inputStream);
            int iH = e.h(inputStream);
            d dVarI = i(dVarArr, strF);
            if (dVarI == null) {
                throw e.c("Missing profile key: " + strF);
            }
            dVarI.f2747d = jI;
            int[] iArrM = m(inputStream, iH);
            if (Arrays.equals(bArr, o.f2786e)) {
                dVarI.f2748e = iH;
                dVarI.f2751h = iArrM;
            }
        }
        return dVarArr;
    }

    private static void v(InputStream inputStream, d dVar) {
        BitSet bitSetValueOf = BitSet.valueOf(e.d(inputStream, e.a(dVar.f2750g * 2)));
        int i8 = 0;
        while (true) {
            int i9 = dVar.f2750g;
            if (i8 >= i9) {
                return;
            }
            int iN = n(bitSetValueOf, i8, i9);
            if (iN != 0) {
                Integer num = dVar.f2752i.get(Integer.valueOf(i8));
                if (num == null) {
                    num = 0;
                }
                dVar.f2752i.put(Integer.valueOf(i8), Integer.valueOf(iN | num.intValue()));
            }
            i8++;
        }
    }

    static d[] w(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, o.f2783b)) {
            throw e.c("Unsupported version");
        }
        int iJ = e.j(inputStream);
        byte[] bArrE = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            d[] dVarArrX = x(byteArrayInputStream, str, iJ);
            byteArrayInputStream.close();
            return dVarArrX;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static d[] x(InputStream inputStream, String str, int i8) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        d[] dVarArr = new d[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int iH = e.h(inputStream);
            int iH2 = e.h(inputStream);
            long jI = e.i(inputStream);
            dVarArr[i9] = new d(str, e.f(inputStream, iH), e.i(inputStream), 0L, iH2, (int) jI, (int) e.i(inputStream), new int[iH2], new TreeMap());
        }
        for (int i10 = 0; i10 < i8; i10++) {
            d dVar = dVarArr[i10];
            p(inputStream, dVar);
            dVar.f2751h = m(inputStream, dVar.f2748e);
            v(inputStream, dVar);
        }
        return dVarArr;
    }

    private static int y(int i8) {
        return ((i8 + 8) - 1) & (-8);
    }

    private static void z(byte[] bArr, int i8, int i9, d dVar) {
        int iL = l(i8, i9, dVar.f2750g);
        int i10 = iL / 8;
        bArr[i10] = (byte) ((1 << (iL % 8)) | bArr[i10]);
    }
}
