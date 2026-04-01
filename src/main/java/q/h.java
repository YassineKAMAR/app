package q;

import java.util.Arrays;
import java.util.Comparator;
import q.b;

/* JADX INFO: loaded from: classes.dex */
public class h extends q.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i[] f25690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i[] f25691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    b f25693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    c f25694l;

    class a implements Comparator<i> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f25702c - iVar2.f25702c;
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f25696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        h f25697b;

        public b(h hVar) {
            this.f25697b = hVar;
        }

        public boolean a(i iVar, float f8) {
            boolean z7 = true;
            if (!this.f25696a.f25700a) {
                for (int i8 = 0; i8 < 9; i8++) {
                    float f9 = iVar.f25708i[i8];
                    if (f9 != 0.0f) {
                        float f10 = f9 * f8;
                        if (Math.abs(f10) < 1.0E-4f) {
                            f10 = 0.0f;
                        }
                        this.f25696a.f25708i[i8] = f10;
                    } else {
                        this.f25696a.f25708i[i8] = 0.0f;
                    }
                }
                return true;
            }
            for (int i9 = 0; i9 < 9; i9++) {
                float[] fArr = this.f25696a.f25708i;
                float f11 = fArr[i9] + (iVar.f25708i[i9] * f8);
                fArr[i9] = f11;
                if (Math.abs(f11) < 1.0E-4f) {
                    this.f25696a.f25708i[i9] = 0.0f;
                } else {
                    z7 = false;
                }
            }
            if (z7) {
                h.this.G(this.f25696a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f25696a = iVar;
        }

        public final boolean c() {
            for (int i8 = 8; i8 >= 0; i8--) {
                float f8 = this.f25696a.f25708i[i8];
                if (f8 > 0.0f) {
                    return false;
                }
                if (f8 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            int i8 = 8;
            while (true) {
                if (i8 < 0) {
                    break;
                }
                float f8 = iVar.f25708i[i8];
                float f9 = this.f25696a.f25708i[i8];
                if (f9 == f8) {
                    i8--;
                } else if (f9 < f8) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f25696a.f25708i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f25696a != null) {
                for (int i8 = 0; i8 < 9; i8++) {
                    str = str + this.f25696a.f25708i[i8] + " ";
                }
            }
            return str + "] " + this.f25696a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f25689g = 128;
        this.f25690h = new i[128];
        this.f25691i = new i[128];
        this.f25692j = 0;
        this.f25693k = new b(this);
        this.f25694l = cVar;
    }

    private final void F(i iVar) {
        int i8;
        int i9 = this.f25692j + 1;
        i[] iVarArr = this.f25690h;
        if (i9 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f25690h = iVarArr2;
            this.f25691i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f25690h;
        int i10 = this.f25692j;
        iVarArr3[i10] = iVar;
        int i11 = i10 + 1;
        this.f25692j = i11;
        if (i11 > 1 && iVarArr3[i11 - 1].f25702c > iVar.f25702c) {
            int i12 = 0;
            while (true) {
                i8 = this.f25692j;
                if (i12 >= i8) {
                    break;
                }
                this.f25691i[i12] = this.f25690h[i12];
                i12++;
            }
            Arrays.sort(this.f25691i, 0, i8, new a());
            for (int i13 = 0; i13 < this.f25692j; i13++) {
                this.f25690h[i13] = this.f25691i[i13];
            }
        }
        iVar.f25700a = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i8 = 0;
        while (i8 < this.f25692j) {
            if (this.f25690h[i8] == iVar) {
                while (true) {
                    int i9 = this.f25692j;
                    if (i8 >= i9 - 1) {
                        this.f25692j = i9 - 1;
                        iVar.f25700a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f25690h;
                        int i10 = i8 + 1;
                        iVarArr[i8] = iVarArr[i10];
                        i8 = i10;
                    }
                }
            } else {
                i8++;
            }
        }
    }

    @Override // q.b
    public void B(d dVar, q.b bVar, boolean z7) {
        i iVar = bVar.f25651a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f25655e;
        int iB = aVar.b();
        for (int i8 = 0; i8 < iB; i8++) {
            i iVarC = aVar.c(i8);
            float fG = aVar.g(i8);
            this.f25693k.b(iVarC);
            if (this.f25693k.a(iVar, fG)) {
                F(iVarC);
            }
            this.f25652b += bVar.f25652b * fG;
        }
        G(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    @Override // q.b, q.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q.i a(q.d r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = -1
        L3:
            int r2 = r4.f25692j
            if (r0 >= r2) goto L30
            q.i[] r2 = r4.f25690h
            r2 = r2[r0]
            int r3 = r2.f25702c
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2d
        L12:
            q.h$b r3 = r4.f25693k
            r3.b(r2)
            q.h$b r2 = r4.f25693k
            if (r1 != r5) goto L22
            boolean r2 = r2.c()
            if (r2 == 0) goto L2d
            goto L2c
        L22:
            q.i[] r3 = r4.f25690h
            r3 = r3[r1]
            boolean r2 = r2.d(r3)
            if (r2 == 0) goto L2d
        L2c:
            r1 = r0
        L2d:
            int r0 = r0 + 1
            goto L3
        L30:
            if (r1 != r5) goto L34
            r5 = 0
            return r5
        L34:
            q.i[] r5 = r4.f25690h
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q.h.a(q.d, boolean[]):q.i");
    }

    @Override // q.b, q.d.a
    public void c(i iVar) {
        this.f25693k.b(iVar);
        this.f25693k.e();
        iVar.f25708i[iVar.f25704e] = 1.0f;
        F(iVar);
    }

    @Override // q.b, q.d.a
    public void clear() {
        this.f25692j = 0;
        this.f25652b = 0.0f;
    }

    @Override // q.b, q.d.a
    public boolean isEmpty() {
        return this.f25692j == 0;
    }

    @Override // q.b
    public String toString() {
        String str = " goal -> (" + this.f25652b + ") : ";
        for (int i8 = 0; i8 < this.f25692j; i8++) {
            this.f25693k.b(this.f25690h[i8]);
            str = str + this.f25693k + " ";
        }
        return str;
    }
}
