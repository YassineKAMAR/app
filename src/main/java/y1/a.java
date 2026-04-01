package y1;

import android.util.SparseArray;
import java.util.HashMap;
import l1.d;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseArray<d> f27420a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap<d, Integer> f27421b;

    static {
        HashMap<d, Integer> map = new HashMap<>();
        f27421b = map;
        map.put(d.DEFAULT, 0);
        f27421b.put(d.VERY_LOW, 1);
        f27421b.put(d.HIGHEST, 2);
        for (d dVar : f27421b.keySet()) {
            f27420a.append(f27421b.get(dVar).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = f27421b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i8) {
        d dVar = f27420a.get(i8);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i8);
    }
}
