package m7;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class q1 {
    public static final void a(int i8, int i9, k7.f descriptor) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i10 = (~i8) & i9;
        for (int i11 = 0; i11 < 32; i11++) {
            if ((i10 & 1) != 0) {
                arrayList.add(descriptor.g(i11));
            }
            i10 >>>= 1;
        }
        throw new i7.c(arrayList, descriptor.a());
    }
}
