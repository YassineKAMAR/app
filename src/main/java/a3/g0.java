package a3;

import android.content.Context;
import android.util.SparseIntArray;
import y2.a;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseIntArray f96a = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x2.f f97b;

    public g0(x2.f fVar) {
        o.j(fVar);
        this.f97b = fVar;
    }

    public final int a(Context context, int i8) {
        return this.f96a.get(i8, -1);
    }

    public final int b(Context context, a.f fVar) {
        o.j(context);
        o.j(fVar);
        int i8 = 0;
        if (!fVar.j()) {
            return 0;
        }
        int iK = fVar.k();
        int iA = a(context, iK);
        if (iA == -1) {
            int i9 = 0;
            while (true) {
                if (i9 >= this.f96a.size()) {
                    i8 = -1;
                    break;
                }
                int iKeyAt = this.f96a.keyAt(i9);
                if (iKeyAt > iK && this.f96a.get(iKeyAt) == 0) {
                    break;
                }
                i9++;
            }
            iA = i8 == -1 ? this.f97b.h(context, iK) : i8;
            this.f96a.put(iK, iA);
        }
        return iA;
    }

    public final void c() {
        this.f96a.clear();
    }
}
