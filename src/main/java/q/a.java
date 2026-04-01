package q;

import java.util.Arrays;
import q.b;

/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static float f25639l = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f25641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f25642c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f25640a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25643d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f25644e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f25645f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f25646g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f25647h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25648i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25649j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f25650k = false;

    a(b bVar, c cVar) {
        this.f25641b = bVar;
        this.f25642c = cVar;
    }

    @Override // q.b.a
    public final void a(i iVar, float f8) {
        if (f8 == 0.0f) {
            d(iVar, true);
            return;
        }
        int i8 = this.f25648i;
        if (i8 == -1) {
            this.f25648i = 0;
            this.f25647h[0] = f8;
            this.f25645f[0] = iVar.f25702c;
            this.f25646g[0] = -1;
            iVar.f25712m++;
            iVar.a(this.f25641b);
            this.f25640a++;
            if (this.f25650k) {
                return;
            }
            int i9 = this.f25649j + 1;
            this.f25649j = i9;
            int[] iArr = this.f25645f;
            if (i9 >= iArr.length) {
                this.f25650k = true;
                this.f25649j = iArr.length - 1;
                return;
            }
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i8 != -1 && i11 < this.f25640a; i11++) {
            int i12 = this.f25645f[i8];
            int i13 = iVar.f25702c;
            if (i12 == i13) {
                this.f25647h[i8] = f8;
                return;
            }
            if (i12 < i13) {
                i10 = i8;
            }
            i8 = this.f25646g[i8];
        }
        int length = this.f25649j;
        int i14 = length + 1;
        if (this.f25650k) {
            int[] iArr2 = this.f25645f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i14;
        }
        int[] iArr3 = this.f25645f;
        if (length >= iArr3.length && this.f25640a < iArr3.length) {
            int i15 = 0;
            while (true) {
                int[] iArr4 = this.f25645f;
                if (i15 >= iArr4.length) {
                    break;
                }
                if (iArr4[i15] == -1) {
                    length = i15;
                    break;
                }
                i15++;
            }
        }
        int[] iArr5 = this.f25645f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i16 = this.f25643d * 2;
            this.f25643d = i16;
            this.f25650k = false;
            this.f25649j = length - 1;
            this.f25647h = Arrays.copyOf(this.f25647h, i16);
            this.f25645f = Arrays.copyOf(this.f25645f, this.f25643d);
            this.f25646g = Arrays.copyOf(this.f25646g, this.f25643d);
        }
        this.f25645f[length] = iVar.f25702c;
        this.f25647h[length] = f8;
        int[] iArr6 = this.f25646g;
        if (i10 != -1) {
            iArr6[length] = iArr6[i10];
            iArr6[i10] = length;
        } else {
            iArr6[length] = this.f25648i;
            this.f25648i = length;
        }
        iVar.f25712m++;
        iVar.a(this.f25641b);
        int i17 = this.f25640a + 1;
        this.f25640a = i17;
        if (!this.f25650k) {
            this.f25649j++;
        }
        int[] iArr7 = this.f25645f;
        if (i17 >= iArr7.length) {
            this.f25650k = true;
        }
        if (this.f25649j >= iArr7.length) {
            this.f25650k = true;
            this.f25649j = iArr7.length - 1;
        }
    }

    @Override // q.b.a
    public int b() {
        return this.f25640a;
    }

    @Override // q.b.a
    public i c(int i8) {
        int i9 = this.f25648i;
        for (int i10 = 0; i9 != -1 && i10 < this.f25640a; i10++) {
            if (i10 == i8) {
                return this.f25642c.f25660d[this.f25645f[i9]];
            }
            i9 = this.f25646g[i9];
        }
        return null;
    }

    @Override // q.b.a
    public final void clear() {
        int i8 = this.f25648i;
        for (int i9 = 0; i8 != -1 && i9 < this.f25640a; i9++) {
            i iVar = this.f25642c.f25660d[this.f25645f[i8]];
            if (iVar != null) {
                iVar.e(this.f25641b);
            }
            i8 = this.f25646g[i8];
        }
        this.f25648i = -1;
        this.f25649j = -1;
        this.f25650k = false;
        this.f25640a = 0;
    }

    @Override // q.b.a
    public final float d(i iVar, boolean z7) {
        if (this.f25644e == iVar) {
            this.f25644e = null;
        }
        int i8 = this.f25648i;
        if (i8 == -1) {
            return 0.0f;
        }
        int i9 = 0;
        int i10 = -1;
        while (i8 != -1 && i9 < this.f25640a) {
            if (this.f25645f[i8] == iVar.f25702c) {
                if (i8 == this.f25648i) {
                    this.f25648i = this.f25646g[i8];
                } else {
                    int[] iArr = this.f25646g;
                    iArr[i10] = iArr[i8];
                }
                if (z7) {
                    iVar.e(this.f25641b);
                }
                iVar.f25712m--;
                this.f25640a--;
                this.f25645f[i8] = -1;
                if (this.f25650k) {
                    this.f25649j = i8;
                }
                return this.f25647h[i8];
            }
            i9++;
            i10 = i8;
            i8 = this.f25646g[i8];
        }
        return 0.0f;
    }

    @Override // q.b.a
    public boolean e(i iVar) {
        int i8 = this.f25648i;
        if (i8 == -1) {
            return false;
        }
        for (int i9 = 0; i8 != -1 && i9 < this.f25640a; i9++) {
            if (this.f25645f[i8] == iVar.f25702c) {
                return true;
            }
            i8 = this.f25646g[i8];
        }
        return false;
    }

    @Override // q.b.a
    public void f() {
        int i8 = this.f25648i;
        for (int i9 = 0; i8 != -1 && i9 < this.f25640a; i9++) {
            float[] fArr = this.f25647h;
            fArr[i8] = fArr[i8] * (-1.0f);
            i8 = this.f25646g[i8];
        }
    }

    @Override // q.b.a
    public float g(int i8) {
        int i9 = this.f25648i;
        for (int i10 = 0; i9 != -1 && i10 < this.f25640a; i10++) {
            if (i10 == i8) {
                return this.f25647h[i9];
            }
            i9 = this.f25646g[i9];
        }
        return 0.0f;
    }

    @Override // q.b.a
    public void h(i iVar, float f8, boolean z7) {
        float f9 = f25639l;
        if (f8 <= (-f9) || f8 >= f9) {
            int i8 = this.f25648i;
            if (i8 == -1) {
                this.f25648i = 0;
                this.f25647h[0] = f8;
                this.f25645f[0] = iVar.f25702c;
                this.f25646g[0] = -1;
                iVar.f25712m++;
                iVar.a(this.f25641b);
                this.f25640a++;
                if (this.f25650k) {
                    return;
                }
                int i9 = this.f25649j + 1;
                this.f25649j = i9;
                int[] iArr = this.f25645f;
                if (i9 >= iArr.length) {
                    this.f25650k = true;
                    this.f25649j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i10 = -1;
            for (int i11 = 0; i8 != -1 && i11 < this.f25640a; i11++) {
                int i12 = this.f25645f[i8];
                int i13 = iVar.f25702c;
                if (i12 == i13) {
                    float[] fArr = this.f25647h;
                    float f10 = fArr[i8] + f8;
                    float f11 = f25639l;
                    if (f10 > (-f11) && f10 < f11) {
                        f10 = 0.0f;
                    }
                    fArr[i8] = f10;
                    if (f10 == 0.0f) {
                        if (i8 == this.f25648i) {
                            this.f25648i = this.f25646g[i8];
                        } else {
                            int[] iArr2 = this.f25646g;
                            iArr2[i10] = iArr2[i8];
                        }
                        if (z7) {
                            iVar.e(this.f25641b);
                        }
                        if (this.f25650k) {
                            this.f25649j = i8;
                        }
                        iVar.f25712m--;
                        this.f25640a--;
                        return;
                    }
                    return;
                }
                if (i12 < i13) {
                    i10 = i8;
                }
                i8 = this.f25646g[i8];
            }
            int length = this.f25649j;
            int i14 = length + 1;
            if (this.f25650k) {
                int[] iArr3 = this.f25645f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i14;
            }
            int[] iArr4 = this.f25645f;
            if (length >= iArr4.length && this.f25640a < iArr4.length) {
                int i15 = 0;
                while (true) {
                    int[] iArr5 = this.f25645f;
                    if (i15 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i15] == -1) {
                        length = i15;
                        break;
                    }
                    i15++;
                }
            }
            int[] iArr6 = this.f25645f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i16 = this.f25643d * 2;
                this.f25643d = i16;
                this.f25650k = false;
                this.f25649j = length - 1;
                this.f25647h = Arrays.copyOf(this.f25647h, i16);
                this.f25645f = Arrays.copyOf(this.f25645f, this.f25643d);
                this.f25646g = Arrays.copyOf(this.f25646g, this.f25643d);
            }
            this.f25645f[length] = iVar.f25702c;
            this.f25647h[length] = f8;
            int[] iArr7 = this.f25646g;
            if (i10 != -1) {
                iArr7[length] = iArr7[i10];
                iArr7[i10] = length;
            } else {
                iArr7[length] = this.f25648i;
                this.f25648i = length;
            }
            iVar.f25712m++;
            iVar.a(this.f25641b);
            this.f25640a++;
            if (!this.f25650k) {
                this.f25649j++;
            }
            int i17 = this.f25649j;
            int[] iArr8 = this.f25645f;
            if (i17 >= iArr8.length) {
                this.f25650k = true;
                this.f25649j = iArr8.length - 1;
            }
        }
    }

    @Override // q.b.a
    public final float i(i iVar) {
        int i8 = this.f25648i;
        for (int i9 = 0; i8 != -1 && i9 < this.f25640a; i9++) {
            if (this.f25645f[i8] == iVar.f25702c) {
                return this.f25647h[i8];
            }
            i8 = this.f25646g[i8];
        }
        return 0.0f;
    }

    @Override // q.b.a
    public float j(b bVar, boolean z7) {
        float fI = i(bVar.f25651a);
        d(bVar.f25651a, z7);
        b.a aVar = bVar.f25655e;
        int iB = aVar.b();
        for (int i8 = 0; i8 < iB; i8++) {
            i iVarC = aVar.c(i8);
            h(iVarC, aVar.i(iVarC) * fI, z7);
        }
        return fI;
    }

    @Override // q.b.a
    public void k(float f8) {
        int i8 = this.f25648i;
        for (int i9 = 0; i8 != -1 && i9 < this.f25640a; i9++) {
            float[] fArr = this.f25647h;
            fArr[i8] = fArr[i8] / f8;
            i8 = this.f25646g[i8];
        }
    }

    public String toString() {
        int i8 = this.f25648i;
        String str = "";
        for (int i9 = 0; i8 != -1 && i9 < this.f25640a; i9++) {
            str = ((str + " -> ") + this.f25647h[i8] + " : ") + this.f25642c.f25660d[this.f25645f[i8]];
            i8 = this.f25646g[i8];
        }
        return str;
    }
}
