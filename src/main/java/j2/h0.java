package j2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f23972a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f23973b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f23974c = new ArrayList();

    public final h0 a(String str, double d8, double d9) {
        int i8 = 0;
        while (i8 < this.f23972a.size()) {
            double dDoubleValue = ((Double) this.f23974c.get(i8)).doubleValue();
            double dDoubleValue2 = ((Double) this.f23973b.get(i8)).doubleValue();
            if (d8 < dDoubleValue || (dDoubleValue == d8 && d9 < dDoubleValue2)) {
                break;
            }
            i8++;
        }
        this.f23972a.add(i8, str);
        this.f23974c.add(i8, Double.valueOf(d8));
        this.f23973b.add(i8, Double.valueOf(d9));
        return this;
    }

    public final j0 b() {
        return new j0(this, null);
    }
}
