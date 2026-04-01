package m0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import q0.e;

/* JADX INFO: loaded from: classes.dex */
public class c implements e, q0.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final TreeMap<Integer, c> f24437i = new TreeMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f24438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long[] f24439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final double[] f24440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String[] f24441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final byte[][] f24442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f24443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f24444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f24445h;

    private c(int i8) {
        this.f24444g = i8;
        int i9 = i8 + 1;
        this.f24443f = new int[i9];
        this.f24439b = new long[i9];
        this.f24440c = new double[i9];
        this.f24441d = new String[i9];
        this.f24442e = new byte[i9][];
    }

    public static c d(String str, int i8) {
        TreeMap<Integer, c> treeMap = f24437i;
        synchronized (treeMap) {
            Map.Entry<Integer, c> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i8));
            if (entryCeilingEntry == null) {
                c cVar = new c(i8);
                cVar.h(str, i8);
                return cVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            c value = entryCeilingEntry.getValue();
            value.h(str, i8);
            return value;
        }
    }

    private static void j() {
        TreeMap<Integer, c> treeMap = f24437i;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator<Integer> it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i8 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i8;
        }
    }

    @Override // q0.d
    public void A(int i8, long j8) {
        this.f24443f[i8] = 2;
        this.f24439b[i8] = j8;
    }

    @Override // q0.d
    public void F(int i8, byte[] bArr) {
        this.f24443f[i8] = 5;
        this.f24442e[i8] = bArr;
    }

    @Override // q0.d
    public void S(int i8) {
        this.f24443f[i8] = 1;
    }

    @Override // q0.e
    public void a(q0.d dVar) {
        for (int i8 = 1; i8 <= this.f24445h; i8++) {
            int i9 = this.f24443f[i8];
            if (i9 == 1) {
                dVar.S(i8);
            } else if (i9 == 2) {
                dVar.A(i8, this.f24439b[i8]);
            } else if (i9 == 3) {
                dVar.v(i8, this.f24440c[i8]);
            } else if (i9 == 4) {
                dVar.p(i8, this.f24441d[i8]);
            } else if (i9 == 5) {
                dVar.F(i8, this.f24442e[i8]);
            }
        }
    }

    @Override // q0.e
    public String c() {
        return this.f24438a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    void h(String str, int i8) {
        this.f24438a = str;
        this.f24445h = i8;
    }

    public void o() {
        TreeMap<Integer, c> treeMap = f24437i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f24444g), this);
            j();
        }
    }

    @Override // q0.d
    public void p(int i8, String str) {
        this.f24443f[i8] = 4;
        this.f24441d[i8] = str;
    }

    @Override // q0.d
    public void v(int i8, double d8) {
        this.f24443f[i8] = 3;
        this.f24440c[i8] = d8;
    }
}
