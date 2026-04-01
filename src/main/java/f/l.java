package f;

/* JADX INFO: loaded from: classes.dex */
class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static l f21567d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f21568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f21569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21570c;

    l() {
    }

    static l b() {
        if (f21567d == null) {
            f21567d = new l();
        }
        return f21567d;
    }

    public void a(long j8, double d8, double d9) {
        double d10 = (0.01720197f * ((j8 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d10) * 0.03341960161924362d) + d10 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = ((double) (Math.round(((double) (r3 - 9.0E-4f)) - r9) + 9.0E-4f)) + ((-d9) / 360.0d) + (Math.sin(d10) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d11 = 0.01745329238474369d * d8;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d11) * Math.sin(dAsin))) / (Math.cos(d11) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f21570c = 1;
        } else {
            if (dSin2 > -1.0d) {
                double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
                this.f21568a = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
                long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
                this.f21569b = jRound;
                if (jRound >= j8 || this.f21568a <= j8) {
                    this.f21570c = 1;
                    return;
                } else {
                    this.f21570c = 0;
                    return;
                }
            }
            this.f21570c = 0;
        }
        this.f21568a = -1L;
        this.f21569b = -1L;
    }
}
