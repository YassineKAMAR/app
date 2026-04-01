package q;

import java.util.Arrays;
import q.b;

/* JADX INFO: loaded from: classes.dex */
public class j implements b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static float f25723n = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25724a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25725b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25726c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f25727d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int[] f25728e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int[] f25729f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float[] f25730g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int[] f25731h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int[] f25732i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f25733j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f25734k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f25735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final c f25736m;

    j(b bVar, c cVar) {
        this.f25735l = bVar;
        this.f25736m = cVar;
        clear();
    }

    private void l(i iVar, int i8) {
        int[] iArr;
        int i9 = iVar.f25702c % this.f25726c;
        int[] iArr2 = this.f25727d;
        int i10 = iArr2[i9];
        if (i10 == -1) {
            iArr2[i9] = i8;
        } else {
            while (true) {
                iArr = this.f25728e;
                int i11 = iArr[i10];
                if (i11 == -1) {
                    break;
                } else {
                    i10 = i11;
                }
            }
            iArr[i10] = i8;
        }
        this.f25728e[i8] = -1;
    }

    private void m(int i8, i iVar, float f8) {
        this.f25729f[i8] = iVar.f25702c;
        this.f25730g[i8] = f8;
        this.f25731h[i8] = -1;
        this.f25732i[i8] = -1;
        iVar.a(this.f25735l);
        iVar.f25712m++;
        this.f25733j++;
    }

    private int n() {
        for (int i8 = 0; i8 < this.f25725b; i8++) {
            if (this.f25729f[i8] == -1) {
                return i8;
            }
        }
        return -1;
    }

    private void o() {
        int i8 = this.f25725b * 2;
        this.f25729f = Arrays.copyOf(this.f25729f, i8);
        this.f25730g = Arrays.copyOf(this.f25730g, i8);
        this.f25731h = Arrays.copyOf(this.f25731h, i8);
        this.f25732i = Arrays.copyOf(this.f25732i, i8);
        this.f25728e = Arrays.copyOf(this.f25728e, i8);
        for (int i9 = this.f25725b; i9 < i8; i9++) {
            this.f25729f[i9] = -1;
            this.f25728e[i9] = -1;
        }
        this.f25725b = i8;
    }

    private void q(int i8, i iVar, float f8) {
        int iN = n();
        m(iN, iVar, f8);
        if (i8 != -1) {
            this.f25731h[iN] = i8;
            int[] iArr = this.f25732i;
            iArr[iN] = iArr[i8];
            iArr[i8] = iN;
        } else {
            this.f25731h[iN] = -1;
            if (this.f25733j > 0) {
                this.f25732i[iN] = this.f25734k;
                this.f25734k = iN;
            } else {
                this.f25732i[iN] = -1;
            }
        }
        int i9 = this.f25732i[iN];
        if (i9 != -1) {
            this.f25731h[i9] = iN;
        }
        l(iVar, iN);
    }

    private void r(i iVar) {
        int[] iArr;
        int i8;
        int i9 = iVar.f25702c;
        int i10 = i9 % this.f25726c;
        int[] iArr2 = this.f25727d;
        int i11 = iArr2[i10];
        if (i11 == -1) {
            return;
        }
        if (this.f25729f[i11] == i9) {
            int[] iArr3 = this.f25728e;
            iArr2[i10] = iArr3[i11];
            iArr3[i11] = -1;
            return;
        }
        while (true) {
            iArr = this.f25728e;
            i8 = iArr[i11];
            if (i8 == -1 || this.f25729f[i8] == i9) {
                break;
            } else {
                i11 = i8;
            }
        }
        if (i8 == -1 || this.f25729f[i8] != i9) {
            return;
        }
        iArr[i11] = iArr[i8];
        iArr[i8] = -1;
    }

    @Override // q.b.a
    public void a(i iVar, float f8) {
        float f9 = f25723n;
        if (f8 > (-f9) && f8 < f9) {
            d(iVar, true);
            return;
        }
        if (this.f25733j == 0) {
            m(0, iVar, f8);
            l(iVar, 0);
            this.f25734k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f25730g[iP] = f8;
            return;
        }
        if (this.f25733j + 1 >= this.f25725b) {
            o();
        }
        int i8 = this.f25733j;
        int i9 = this.f25734k;
        int i10 = -1;
        for (int i11 = 0; i11 < i8; i11++) {
            int i12 = this.f25729f[i9];
            int i13 = iVar.f25702c;
            if (i12 == i13) {
                this.f25730g[i9] = f8;
                return;
            }
            if (i12 < i13) {
                i10 = i9;
            }
            i9 = this.f25732i[i9];
            if (i9 == -1) {
                break;
            }
        }
        q(i10, iVar, f8);
    }

    @Override // q.b.a
    public int b() {
        return this.f25733j;
    }

    @Override // q.b.a
    public i c(int i8) {
        int i9 = this.f25733j;
        if (i9 == 0) {
            return null;
        }
        int i10 = this.f25734k;
        for (int i11 = 0; i11 < i9; i11++) {
            if (i11 == i8 && i10 != -1) {
                return this.f25736m.f25660d[this.f25729f[i10]];
            }
            i10 = this.f25732i[i10];
            if (i10 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // q.b.a
    public void clear() {
        int i8 = this.f25733j;
        for (int i9 = 0; i9 < i8; i9++) {
            i iVarC = c(i9);
            if (iVarC != null) {
                iVarC.e(this.f25735l);
            }
        }
        for (int i10 = 0; i10 < this.f25725b; i10++) {
            this.f25729f[i10] = -1;
            this.f25728e[i10] = -1;
        }
        for (int i11 = 0; i11 < this.f25726c; i11++) {
            this.f25727d[i11] = -1;
        }
        this.f25733j = 0;
        this.f25734k = -1;
    }

    @Override // q.b.a
    public float d(i iVar, boolean z7) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f8 = this.f25730g[iP];
        if (this.f25734k == iP) {
            this.f25734k = this.f25732i[iP];
        }
        this.f25729f[iP] = -1;
        int[] iArr = this.f25731h;
        int i8 = iArr[iP];
        if (i8 != -1) {
            int[] iArr2 = this.f25732i;
            iArr2[i8] = iArr2[iP];
        }
        int i9 = this.f25732i[iP];
        if (i9 != -1) {
            iArr[i9] = iArr[iP];
        }
        this.f25733j--;
        iVar.f25712m--;
        if (z7) {
            iVar.e(this.f25735l);
        }
        return f8;
    }

    @Override // q.b.a
    public boolean e(i iVar) {
        return p(iVar) != -1;
    }

    @Override // q.b.a
    public void f() {
        int i8 = this.f25733j;
        int i9 = this.f25734k;
        for (int i10 = 0; i10 < i8; i10++) {
            float[] fArr = this.f25730g;
            fArr[i9] = fArr[i9] * (-1.0f);
            i9 = this.f25732i[i9];
            if (i9 == -1) {
                return;
            }
        }
    }

    @Override // q.b.a
    public float g(int i8) {
        int i9 = this.f25733j;
        int i10 = this.f25734k;
        for (int i11 = 0; i11 < i9; i11++) {
            if (i11 == i8) {
                return this.f25730g[i10];
            }
            i10 = this.f25732i[i10];
            if (i10 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // q.b.a
    public void h(i iVar, float f8, boolean z7) {
        float f9 = f25723n;
        if (f8 <= (-f9) || f8 >= f9) {
            int iP = p(iVar);
            if (iP == -1) {
                a(iVar, f8);
                return;
            }
            float[] fArr = this.f25730g;
            float f10 = fArr[iP] + f8;
            fArr[iP] = f10;
            float f11 = f25723n;
            if (f10 <= (-f11) || f10 >= f11) {
                return;
            }
            fArr[iP] = 0.0f;
            d(iVar, z7);
        }
    }

    @Override // q.b.a
    public float i(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f25730g[iP];
        }
        return 0.0f;
    }

    @Override // q.b.a
    public float j(b bVar, boolean z7) {
        float fI = i(bVar.f25651a);
        d(bVar.f25651a, z7);
        j jVar = (j) bVar.f25655e;
        int iB = jVar.b();
        int i8 = 0;
        int i9 = 0;
        while (i8 < iB) {
            int i10 = jVar.f25729f[i9];
            if (i10 != -1) {
                h(this.f25736m.f25660d[i10], jVar.f25730g[i9] * fI, z7);
                i8++;
            }
            i9++;
        }
        return fI;
    }

    @Override // q.b.a
    public void k(float f8) {
        int i8 = this.f25733j;
        int i9 = this.f25734k;
        for (int i10 = 0; i10 < i8; i10++) {
            float[] fArr = this.f25730g;
            fArr[i9] = fArr[i9] / f8;
            i9 = this.f25732i[i9];
            if (i9 == -1) {
                return;
            }
        }
    }

    public int p(i iVar) {
        if (this.f25733j != 0 && iVar != null) {
            int i8 = iVar.f25702c;
            int i9 = this.f25727d[i8 % this.f25726c];
            if (i9 == -1) {
                return -1;
            }
            if (this.f25729f[i9] == i8) {
                return i9;
            }
            do {
                i9 = this.f25728e[i9];
                if (i9 == -1) {
                    break;
                }
            } while (this.f25729f[i9] != i8);
            if (i9 != -1 && this.f25729f[i9] == i8) {
                return i9;
            }
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb;
        String str = hashCode() + " { ";
        int i8 = this.f25733j;
        for (int i9 = 0; i9 < i8; i9++) {
            i iVarC = c(i9);
            if (iVarC != null) {
                String str2 = str + iVarC + " = " + g(i9) + " ";
                int iP = p(iVarC);
                String str3 = str2 + "[p: ";
                if (this.f25731h[iP] != -1) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(this.f25736m.f25660d[this.f25729f[this.f25731h[iP]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("none");
                }
                String str4 = sb.toString() + ", n: ";
                str = (this.f25732i[iP] != -1 ? str4 + this.f25736m.f25660d[this.f25729f[this.f25732i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
