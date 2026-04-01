package j2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f23982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double[] f23983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double[] f23984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f23985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23986e;

    /* synthetic */ j0(h0 h0Var, i0 i0Var) {
        int size = h0Var.f23973b.size();
        this.f23982a = (String[]) h0Var.f23972a.toArray(new String[size]);
        this.f23983b = c(h0Var.f23973b);
        this.f23984c = c(h0Var.f23974c);
        this.f23985d = new int[size];
        this.f23986e = 0;
    }

    private static final double[] c(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i8 = 0; i8 < size; i8++) {
            dArr[i8] = ((Double) list.get(i8)).doubleValue();
        }
        return dArr;
    }

    public final List a() {
        j0 j0Var = this;
        ArrayList arrayList = new ArrayList(j0Var.f23982a.length);
        int i8 = 0;
        while (true) {
            String[] strArr = j0Var.f23982a;
            if (i8 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i8];
            double[] dArr = j0Var.f23984c;
            double[] dArr2 = j0Var.f23983b;
            int[] iArr = j0Var.f23985d;
            double d8 = dArr[i8];
            double d9 = dArr2[i8];
            int i9 = iArr[i8];
            arrayList.add(new g0(str, d8, d9, ((double) i9) / ((double) j0Var.f23986e), i9));
            i8++;
            j0Var = this;
        }
    }

    public final void b(double d8) {
        this.f23986e++;
        int i8 = 0;
        while (true) {
            double[] dArr = this.f23984c;
            if (i8 >= dArr.length) {
                return;
            }
            double d9 = dArr[i8];
            if (d9 <= d8 && d8 < this.f23983b[i8]) {
                int[] iArr = this.f23985d;
                iArr[i8] = iArr[i8] + 1;
            }
            if (d8 < d9) {
                return;
            } else {
                i8++;
            }
        }
    }
}
