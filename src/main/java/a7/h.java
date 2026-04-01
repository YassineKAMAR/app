package a7;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int i8, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i8, obj, obj2)) {
            if (atomicReferenceArray.get(i8) != obj) {
                return false;
            }
        }
        return true;
    }
}
