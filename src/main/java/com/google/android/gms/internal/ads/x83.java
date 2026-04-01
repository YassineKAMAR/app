package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
abstract class x83 extends q73 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final CharSequence f17125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final w73 f17126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f17127e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f17128f = Integer.MAX_VALUE;

    protected x83(z83 z83Var, CharSequence charSequence) {
        this.f17126d = z83Var.f18114a;
        this.f17125c = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.q73
    protected final /* bridge */ /* synthetic */ Object a() {
        int iC;
        int i8 = this.f17127e;
        while (true) {
            int i9 = this.f17127e;
            if (i9 == -1) {
                b();
                return null;
            }
            int iD = d(i9);
            if (iD == -1) {
                iD = this.f17125c.length();
                this.f17127e = -1;
                iC = -1;
            } else {
                iC = c(iD);
                this.f17127e = iC;
            }
            if (iC != i8) {
                if (i8 < iD) {
                    this.f17125c.charAt(i8);
                }
                if (i8 < iD) {
                    this.f17125c.charAt(iD - 1);
                }
                int i10 = this.f17128f;
                if (i10 == 1) {
                    iD = this.f17125c.length();
                    this.f17127e = -1;
                    if (iD > i8) {
                        this.f17125c.charAt(iD - 1);
                    }
                } else {
                    this.f17128f = i10 - 1;
                }
                return this.f17125c.subSequence(i8, iD).toString();
            }
            int i11 = iC + 1;
            this.f17127e = i11;
            if (i11 > this.f17125c.length()) {
                this.f17127e = -1;
            }
        }
    }

    abstract int c(int i8);

    abstract int d(int i8);
}
