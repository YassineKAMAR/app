package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.az3;
import com.google.android.gms.internal.ads.yy3;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class az3<MessageType extends az3<MessageType, BuilderType>, BuilderType extends yy3<MessageType, BuilderType>> implements k24 {
    protected int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    protected static void d(Iterable iterable, List list) {
        byte[] bArr = k14.f9887d;
        iterable.getClass();
        if (iterable instanceof r14) {
            List listO = ((r14) iterable).o();
            r14 r14Var = (r14) list;
            int size = list.size();
            for (Object obj : listO) {
                if (obj == null) {
                    String str = "Element at index " + (r14Var.size() - size) + " is null.";
                    int size2 = r14Var.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(str);
                        }
                        r14Var.remove(size2);
                    }
                } else if (obj instanceof rz3) {
                    r14Var.s((rz3) obj);
                } else {
                    r14Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof r24) {
            list.addAll(iterable);
            return;
        }
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        throw new NullPointerException(str2);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj2);
            }
        }
    }

    int b(e34 e34Var) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.k24
    public final rz3 c() {
        try {
            int i8 = i();
            rz3 rz3Var = rz3.f14393b;
            byte[] bArr = new byte[i8];
            h04 h04VarD = h04.d(bArr, 0, i8);
            e(h04VarD);
            h04VarD.e();
            return new nz3(bArr);
        } catch (IOException e8) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e8);
        }
    }

    public final void f(OutputStream outputStream) {
        int i8 = i();
        int i9 = h04.f8589d;
        if (i8 > 4096) {
            i8 = 4096;
        }
        f04 f04Var = new f04(outputStream, i8);
        e(f04Var);
        f04Var.h();
    }

    public final byte[] g() {
        try {
            int i8 = i();
            byte[] bArr = new byte[i8];
            h04 h04VarD = h04.d(bArr, 0, i8);
            e(h04VarD);
            h04VarD.e();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e8);
        }
    }
}
