package p;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<K, V> f25429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25436h;

    public f(int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f25431c = i8;
        this.f25429a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int f(K k8, V v7) {
        int iG = g(k8, v7);
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException("Negative size: " + k8 + com.amazon.a.a.o.b.f.f3943b + v7);
    }

    protected V a(K k8) {
        return null;
    }

    protected void b(boolean z7, K k8, V v7, V v8) {
    }

    public final V c(K k8) {
        V vPut;
        if (k8 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v7 = this.f25429a.get(k8);
            if (v7 != null) {
                this.f25435g++;
                return v7;
            }
            this.f25436h++;
            V vA = a(k8);
            if (vA == null) {
                return null;
            }
            synchronized (this) {
                this.f25433e++;
                vPut = this.f25429a.put(k8, vA);
                if (vPut != null) {
                    this.f25429a.put(k8, vPut);
                } else {
                    this.f25430b += f(k8, vA);
                }
            }
            if (vPut != null) {
                b(false, k8, vA, vPut);
                return vPut;
            }
            i(this.f25431c);
            return vA;
        }
    }

    public final V d(K k8, V v7) {
        V vPut;
        if (k8 == null || v7 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f25432d++;
            this.f25430b += f(k8, v7);
            vPut = this.f25429a.put(k8, v7);
            if (vPut != null) {
                this.f25430b -= f(k8, vPut);
            }
        }
        if (vPut != null) {
            b(false, k8, vPut, v7);
        }
        i(this.f25431c);
        return vPut;
    }

    public final V e(K k8) {
        V vRemove;
        if (k8 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            vRemove = this.f25429a.remove(k8);
            if (vRemove != null) {
                this.f25430b -= f(k8, vRemove);
            }
        }
        if (vRemove != null) {
            b(false, k8, vRemove, null);
        }
        return vRemove;
    }

    protected int g(K k8, V v7) {
        return 1;
    }

    public final synchronized Map<K, V> h() {
        return new LinkedHashMap(this.f25429a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f25430b     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<K, V> r0 = r4.f25429a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r4.f25430b     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r4.f25430b     // Catch: java.lang.Throwable -> L71
            if (r0 <= r5) goto L50
            java.util.LinkedHashMap<K, V> r0 = r4.f25429a     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r4.f25429a     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<K, V> r2 = r4.f25429a     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f25430b     // Catch: java.lang.Throwable -> L71
            int r3 = r4.f(r1, r0)     // Catch: java.lang.Throwable -> L71
            int r2 = r2 - r3
            r4.f25430b = r2     // Catch: java.lang.Throwable -> L71
            int r2 = r4.f25434f     // Catch: java.lang.Throwable -> L71
            r3 = 1
            int r2 = r2 + r3
            r4.f25434f = r2     // Catch: java.lang.Throwable -> L71
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            r2 = 0
            r4.b(r3, r1, r0, r2)
            goto L0
        L50:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L71
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f.i(int):void");
    }

    public final synchronized String toString() {
        int i8;
        int i9;
        i8 = this.f25435g;
        i9 = this.f25436h + i8;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f25431c), Integer.valueOf(this.f25435g), Integer.valueOf(this.f25436h), Integer.valueOf(i9 != 0 ? (i8 * 100) / i9 : 0));
    }
}
