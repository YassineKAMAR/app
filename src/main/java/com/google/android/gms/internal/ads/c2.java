package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c2 {
    public static int a(int i8) {
        int i9 = 0;
        while (i8 > 0) {
            i8 >>>= 1;
            i9++;
        }
        return i9;
    }

    public static td0 b(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            String str = (String) list.get(i8);
            int i9 = nz2.f12300a;
            String[] strArrSplit = str.split(com.amazon.a.a.o.b.f.f3943b, 2);
            if (strArrSplit.length != 2) {
                pf2.f("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(s3.b(new dq2(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e8) {
                    pf2.g("VorbisUtil", "Failed to parse vorbis picture", e8);
                }
            } else {
                arrayList.add(new g5(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new td0(arrayList);
    }

    public static z1 c(dq2 dq2Var, boolean z7, boolean z8) throws yh0 {
        if (z7) {
            d(3, dq2Var, false);
        }
        String strH = dq2Var.H((int) dq2Var.A(), x73.f17098c);
        int length = strH.length();
        long jA = dq2Var.A();
        String[] strArr = new String[(int) jA];
        int length2 = length + 15;
        for (int i8 = 0; i8 < jA; i8++) {
            String strH2 = dq2Var.H((int) dq2Var.A(), x73.f17098c);
            strArr[i8] = strH2;
            length2 = length2 + 4 + strH2.length();
        }
        if (z8 && (dq2Var.u() & 1) == 0) {
            throw yh0.a("framing bit expected to be set", null);
        }
        return new z1(strH, strArr, length2 + 1);
    }

    public static boolean d(int i8, dq2 dq2Var, boolean z7) throws yh0 {
        if (dq2Var.j() < 7) {
            if (z7) {
                return false;
            }
            throw yh0.a("too short header: " + dq2Var.j(), null);
        }
        if (dq2Var.u() != i8) {
            if (z7) {
                return false;
            }
            throw yh0.a("expected header type ".concat(String.valueOf(Integer.toHexString(i8))), null);
        }
        if (dq2Var.u() == 118 && dq2Var.u() == 111 && dq2Var.u() == 114 && dq2Var.u() == 98 && dq2Var.u() == 105 && dq2Var.u() == 115) {
            return true;
        }
        if (z7) {
            return false;
        }
        throw yh0.a("expected characters 'vorbis'", null);
    }
}
