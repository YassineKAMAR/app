package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f7;
import com.google.android.gms.internal.measurement.h7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f7<MessageType extends f7<MessageType, BuilderType>, BuilderType extends h7<MessageType, BuilderType>> implements ma {
    protected int zza = 0;

    protected static <T> void h(Iterable<T> iterable, List<? super T> list) {
        a9.e(iterable);
        if (iterable instanceof r9) {
            List<?> listK = ((r9) iterable).k();
            r9 r9Var = (r9) list;
            int size = list.size();
            for (Object obj : listK) {
                if (obj == null) {
                    String str = "Element at index " + (r9Var.size() - size) + " is null.";
                    for (int size2 = r9Var.size() - 1; size2 >= size; size2--) {
                        r9Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof o7) {
                    r9Var.r((o7) obj);
                } else {
                    r9Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof xa) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size3 = list.size();
        for (T t7 : iterable) {
            if (t7 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list.add(t7);
        }
    }

    int a(eb ebVar) {
        int i8 = i();
        if (i8 != -1) {
            return i8;
        }
        int iA = ebVar.a(this);
        l(iA);
        return iA;
    }

    int i() {
        throw new UnsupportedOperationException();
    }

    public final byte[] k() {
        try {
            byte[] bArr = new byte[o0()];
            h8 h8VarH = h8.H(bArr);
            n0(h8VarH);
            h8VarH.I();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final o7 k0() {
        try {
            x7 x7VarA = o7.A(o0());
            n0(x7VarA.b());
            return x7VarA.a();
        } catch (IOException e8) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e8);
        }
    }

    void l(int i8) {
        throw new UnsupportedOperationException();
    }
}
