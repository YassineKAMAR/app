package x6;

import com.revenuecat.purchases.common.UtilsKt;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import t6.i;
import t6.l;
import w6.w;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Comparable<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0190a f27324b = new C0190a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f27325c = n(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f27326d = c.j(4611686018427387903L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f27327e = c.j(-4611686018427387903L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f27328a;

    /* JADX INFO: renamed from: x6.a$a, reason: collision with other inner class name */
    public static final class C0190a {
        private C0190a() {
        }

        public /* synthetic */ C0190a(j jVar) {
            this();
        }

        public final long a() {
            return a.f27326d;
        }

        public final long b() {
            return a.f27325c;
        }

        public final long c(String value) {
            q.f(value, "value");
            try {
                return c.p(value, true);
            } catch (IllegalArgumentException e8) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e8);
            }
        }
    }

    private /* synthetic */ a(long j8) {
        this.f27328a = j8;
    }

    private static final d A(long j8) {
        return F(j8) ? d.f27331b : d.f27333d;
    }

    private static final long B(long j8) {
        return j8 >> 1;
    }

    public static int C(long j8) {
        return androidx.privacysandbox.ads.adservices.topics.d.a(j8);
    }

    public static final boolean D(long j8) {
        return !G(j8);
    }

    private static final boolean E(long j8) {
        return (((int) j8) & 1) == 1;
    }

    private static final boolean F(long j8) {
        return (((int) j8) & 1) == 0;
    }

    public static final boolean G(long j8) {
        return j8 == f27326d || j8 == f27327e;
    }

    public static final boolean H(long j8) {
        return j8 < 0;
    }

    public static final long I(long j8, long j9) {
        if (G(j8)) {
            if (D(j9) || (j9 ^ j8) >= 0) {
                return j8;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (G(j9)) {
            return j9;
        }
        if ((((int) j8) & 1) != (((int) j9) & 1)) {
            return E(j8) ? d(j8, B(j8), B(j9)) : d(j8, B(j9), B(j8));
        }
        long jB = B(j8) + B(j9);
        return F(j8) ? c.m(jB) : c.k(jB);
    }

    public static final String J(long j8) {
        StringBuilder sb = new StringBuilder();
        if (H(j8)) {
            sb.append('-');
        }
        sb.append("PT");
        long jQ = q(j8);
        long jT = t(jQ);
        int iX = x(jQ);
        int iZ = z(jQ);
        int iY = y(jQ);
        if (G(j8)) {
            jT = 9999999999999L;
        }
        boolean z7 = true;
        boolean z8 = jT != 0;
        boolean z9 = (iZ == 0 && iY == 0) ? false : true;
        if (iX == 0 && (!z9 || !z8)) {
            z7 = false;
        }
        if (z8) {
            sb.append(jT);
            sb.append('H');
        }
        if (z7) {
            sb.append(iX);
            sb.append('M');
        }
        if (z9 || (!z8 && !z7)) {
            e(j8, sb, iZ, iY, 9, "S", true);
        }
        String string = sb.toString();
        q.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final long K(long j8, d unit) {
        q.f(unit, "unit");
        if (j8 == f27326d) {
            return Long.MAX_VALUE;
        }
        if (j8 == f27327e) {
            return Long.MIN_VALUE;
        }
        return e.b(B(j8), A(j8), unit);
    }

    public static String L(long j8) {
        int i8;
        long j9;
        StringBuilder sb;
        int i9;
        int i10;
        String str;
        boolean z7;
        if (j8 == 0) {
            return "0s";
        }
        if (j8 == f27326d) {
            return "Infinity";
        }
        if (j8 == f27327e) {
            return "-Infinity";
        }
        boolean zH = H(j8);
        StringBuilder sb2 = new StringBuilder();
        if (zH) {
            sb2.append('-');
        }
        long jQ = q(j8);
        long jS = s(jQ);
        int iR = r(jQ);
        int iX = x(jQ);
        int iZ = z(jQ);
        int iY = y(jQ);
        int i11 = 0;
        boolean z8 = jS != 0;
        boolean z9 = iR != 0;
        boolean z10 = iX != 0;
        boolean z11 = (iZ == 0 && iY == 0) ? false : true;
        if (z8) {
            sb2.append(jS);
            sb2.append('d');
            i11 = 1;
        }
        if (z9 || (z8 && (z10 || z11))) {
            int i12 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(iR);
            sb2.append('h');
            i11 = i12;
        }
        if (z10 || (z11 && (z9 || z8))) {
            int i13 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(iX);
            sb2.append('m');
            i11 = i13;
        }
        if (z11) {
            int i14 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            if (iZ != 0 || z8 || z9 || z10) {
                i8 = 9;
                j9 = j8;
                sb = sb2;
                i9 = iZ;
                i10 = iY;
                str = "s";
                z7 = false;
            } else {
                if (iY >= 1000000) {
                    i9 = iY / UtilsKt.MICROS_MULTIPLIER;
                    i10 = iY % UtilsKt.MICROS_MULTIPLIER;
                    i8 = 6;
                    z7 = false;
                    str = "ms";
                } else if (iY >= 1000) {
                    i9 = iY / 1000;
                    i10 = iY % 1000;
                    i8 = 3;
                    z7 = false;
                    str = "us";
                } else {
                    sb2.append(iY);
                    sb2.append("ns");
                    i11 = i14;
                }
                j9 = j8;
                sb = sb2;
            }
            e(j9, sb, i9, i10, i8, str, z7);
            i11 = i14;
        }
        if (zH && i11 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String string = sb2.toString();
        q.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final long M(long j8) {
        return c.i(-B(j8), ((int) j8) & 1);
    }

    private static final long d(long j8, long j9, long j10) {
        long jO = c.o(j10);
        long j11 = j9 + jO;
        if (!new i(-4611686018426L, 4611686018426L).i(j11)) {
            return c.j(l.g(j11, -4611686018427387903L, 4611686018427387903L));
        }
        return c.l(c.n(j11) + (j10 - c.n(jO)));
    }

    private static final void e(long j8, StringBuilder sb, int i8, int i9, int i10, String str, boolean z7) {
        sb.append(i8);
        if (i9 != 0) {
            sb.append('.');
            String strU = w.U(String.valueOf(i9), i10, '0');
            int i11 = -1;
            int length = strU.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i12 = length - 1;
                    if (strU.charAt(length) != '0') {
                        i11 = length;
                        break;
                    } else if (i12 < 0) {
                        break;
                    } else {
                        length = i12;
                    }
                }
            }
            int i13 = i11 + 1;
            if (z7 || i13 >= 3) {
                i13 = ((i13 + 2) / 3) * 3;
            }
            sb.append((CharSequence) strU, 0, i13);
            q.e(sb, "this.append(value, startIndex, endIndex)");
        }
        sb.append(str);
    }

    public static final /* synthetic */ a g(long j8) {
        return new a(j8);
    }

    public static int i(long j8, long j9) {
        long j10 = j8 ^ j9;
        if (j10 < 0 || (((int) j10) & 1) == 0) {
            return q.h(j8, j9);
        }
        int i8 = (((int) j8) & 1) - (((int) j9) & 1);
        return H(j8) ? -i8 : i8;
    }

    public static long n(long j8) {
        if (b.a()) {
            if (F(j8)) {
                if (!new i(-4611686018426999999L, 4611686018426999999L).i(B(j8))) {
                    throw new AssertionError(B(j8) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new i(-4611686018427387903L, 4611686018427387903L).i(B(j8))) {
                    throw new AssertionError(B(j8) + " ms is out of milliseconds range");
                }
                if (new i(-4611686018426L, 4611686018426L).i(B(j8))) {
                    throw new AssertionError(B(j8) + " ms is denormalized");
                }
            }
        }
        return j8;
    }

    public static boolean o(long j8, Object obj) {
        return (obj instanceof a) && j8 == ((a) obj).N();
    }

    public static final long q(long j8) {
        return H(j8) ? M(j8) : j8;
    }

    public static final int r(long j8) {
        if (G(j8)) {
            return 0;
        }
        return (int) (t(j8) % ((long) 24));
    }

    public static final long s(long j8) {
        return K(j8, d.f27337h);
    }

    public static final long t(long j8) {
        return K(j8, d.f27336g);
    }

    public static final long u(long j8) {
        return (E(j8) && D(j8)) ? B(j8) : K(j8, d.f27333d);
    }

    public static final long v(long j8) {
        return K(j8, d.f27335f);
    }

    public static final long w(long j8) {
        return K(j8, d.f27334e);
    }

    public static final int x(long j8) {
        if (G(j8)) {
            return 0;
        }
        return (int) (v(j8) % ((long) 60));
    }

    public static final int y(long j8) {
        if (G(j8)) {
            return 0;
        }
        boolean zE = E(j8);
        long jB = B(j8);
        return (int) (zE ? c.n(jB % ((long) 1000)) : jB % ((long) 1000000000));
    }

    public static final int z(long j8) {
        if (G(j8)) {
            return 0;
        }
        return (int) (w(j8) % ((long) 60));
    }

    public final /* synthetic */ long N() {
        return this.f27328a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(a aVar) {
        return h(aVar.N());
    }

    public boolean equals(Object obj) {
        return o(this.f27328a, obj);
    }

    public int h(long j8) {
        return i(this.f27328a, j8);
    }

    public int hashCode() {
        return C(this.f27328a);
    }

    public String toString() {
        return L(this.f27328a);
    }
}
