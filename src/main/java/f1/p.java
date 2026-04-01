package f1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f21649s = x0.j.f("WorkSpec");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n.a<List<Object>, List<Object>> f21650t = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x0.s f21652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f21654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.work.b f21655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.work.b f21656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f21657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f21658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f21659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x0.b f21660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x0.a f21662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f21663m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f21664n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f21665o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f21666p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f21667q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public x0.n f21668r;

    class a implements n.a<List<Object>, List<Object>> {
        a() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f21669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public x0.s f21670b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f21670b != bVar.f21670b) {
                return false;
            }
            return this.f21669a.equals(bVar.f21669a);
        }

        public int hashCode() {
            return (this.f21669a.hashCode() * 31) + this.f21670b.hashCode();
        }
    }

    public p(p pVar) {
        this.f21652b = x0.s.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f3105c;
        this.f21655e = bVar;
        this.f21656f = bVar;
        this.f21660j = x0.b.f27167i;
        this.f21662l = x0.a.EXPONENTIAL;
        this.f21663m = 30000L;
        this.f21666p = -1L;
        this.f21668r = x0.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f21651a = pVar.f21651a;
        this.f21653c = pVar.f21653c;
        this.f21652b = pVar.f21652b;
        this.f21654d = pVar.f21654d;
        this.f21655e = new androidx.work.b(pVar.f21655e);
        this.f21656f = new androidx.work.b(pVar.f21656f);
        this.f21657g = pVar.f21657g;
        this.f21658h = pVar.f21658h;
        this.f21659i = pVar.f21659i;
        this.f21660j = new x0.b(pVar.f21660j);
        this.f21661k = pVar.f21661k;
        this.f21662l = pVar.f21662l;
        this.f21663m = pVar.f21663m;
        this.f21664n = pVar.f21664n;
        this.f21665o = pVar.f21665o;
        this.f21666p = pVar.f21666p;
        this.f21667q = pVar.f21667q;
        this.f21668r = pVar.f21668r;
    }

    public p(String str, String str2) {
        this.f21652b = x0.s.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f3105c;
        this.f21655e = bVar;
        this.f21656f = bVar;
        this.f21660j = x0.b.f27167i;
        this.f21662l = x0.a.EXPONENTIAL;
        this.f21663m = 30000L;
        this.f21666p = -1L;
        this.f21668r = x0.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f21651a = str;
        this.f21653c = str2;
    }

    public long a() {
        if (c()) {
            return this.f21664n + Math.min(18000000L, this.f21662l == x0.a.LINEAR ? this.f21663m * ((long) this.f21661k) : (long) Math.scalb(this.f21663m, this.f21661k - 1));
        }
        if (!d()) {
            long jCurrentTimeMillis = this.f21664n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f21657g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j8 = this.f21664n;
        long j9 = j8 == 0 ? jCurrentTimeMillis2 + this.f21657g : j8;
        long j10 = this.f21659i;
        long j11 = this.f21658h;
        if (j10 != j11) {
            return j9 + j11 + (j8 == 0 ? j10 * (-1) : 0L);
        }
        return j9 + (j8 != 0 ? j11 : 0L);
    }

    public boolean b() {
        return !x0.b.f27167i.equals(this.f21660j);
    }

    public boolean c() {
        return this.f21652b == x0.s.ENQUEUED && this.f21661k > 0;
    }

    public boolean d() {
        return this.f21658h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f21657g != pVar.f21657g || this.f21658h != pVar.f21658h || this.f21659i != pVar.f21659i || this.f21661k != pVar.f21661k || this.f21663m != pVar.f21663m || this.f21664n != pVar.f21664n || this.f21665o != pVar.f21665o || this.f21666p != pVar.f21666p || this.f21667q != pVar.f21667q || !this.f21651a.equals(pVar.f21651a) || this.f21652b != pVar.f21652b || !this.f21653c.equals(pVar.f21653c)) {
            return false;
        }
        String str = this.f21654d;
        if (str == null ? pVar.f21654d == null : str.equals(pVar.f21654d)) {
            return this.f21655e.equals(pVar.f21655e) && this.f21656f.equals(pVar.f21656f) && this.f21660j.equals(pVar.f21660j) && this.f21662l == pVar.f21662l && this.f21668r == pVar.f21668r;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((this.f21651a.hashCode() * 31) + this.f21652b.hashCode()) * 31) + this.f21653c.hashCode()) * 31;
        String str = this.f21654d;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f21655e.hashCode()) * 31) + this.f21656f.hashCode()) * 31;
        long j8 = this.f21657g;
        int i8 = (iHashCode2 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f21658h;
        int i9 = (i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f21659i;
        int iHashCode3 = (((((((i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f21660j.hashCode()) * 31) + this.f21661k) * 31) + this.f21662l.hashCode()) * 31;
        long j11 = this.f21663m;
        int i10 = (iHashCode3 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f21664n;
        int i11 = (i10 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f21665o;
        int i12 = (i11 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f21666p;
        return ((((i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + (this.f21667q ? 1 : 0)) * 31) + this.f21668r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f21651a + "}";
    }
}
