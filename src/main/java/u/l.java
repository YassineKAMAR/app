package u;

import t.e;
import u.f;
import u.p;

/* JADX INFO: loaded from: classes.dex */
public class l extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int[] f26592k = new int[2];

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26593a;

        static {
            int[] iArr = new int[p.b.values().length];
            f26593a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26593a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26593a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(t.e eVar) {
        super(eVar);
        this.f26627h.f26571e = f.a.LEFT;
        this.f26628i.f26571e = f.a.RIGHT;
        this.f26625f = 0;
    }

    private void q(int[] iArr, int i8, int i9, int i10, int i11, float f8, int i12) {
        int i13 = i9 - i8;
        int i14 = i11 - i10;
        if (i12 != -1) {
            if (i12 == 0) {
                iArr[0] = (int) ((i14 * f8) + 0.5f);
                iArr[1] = i14;
                return;
            } else {
                if (i12 != 1) {
                    return;
                }
                iArr[0] = i13;
                iArr[1] = (int) ((i13 * f8) + 0.5f);
                return;
            }
        }
        int i15 = (int) ((i14 * f8) + 0.5f);
        int i16 = (int) ((i13 / f8) + 0.5f);
        if (i15 <= i13) {
            iArr[0] = i15;
            iArr[1] = i14;
        } else if (i16 <= i14) {
            iArr[0] = i13;
            iArr[1] = i16;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0299, code lost:
    
        if (r14 != 1) goto L134;
     */
    @Override // u.p, u.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(u.d r17) {
        /*
            Method dump skipped, instruction units count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.l.a(u.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01ba  */
    @Override // u.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void d() {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.l.d():void");
    }

    @Override // u.p
    public void e() {
        f fVar = this.f26627h;
        if (fVar.f26576j) {
            this.f26621b.j1(fVar.f26573g);
        }
    }

    @Override // u.p
    void f() {
        this.f26622c = null;
        this.f26627h.c();
        this.f26628i.c();
        this.f26624e.c();
        this.f26626g = false;
    }

    @Override // u.p
    boolean m() {
        return this.f26623d != e.b.MATCH_CONSTRAINT || this.f26621b.f26426w == 0;
    }

    void r() {
        this.f26626g = false;
        this.f26627h.c();
        this.f26627h.f26576j = false;
        this.f26628i.c();
        this.f26628i.f26576j = false;
        this.f26624e.f26576j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f26621b.r();
    }
}
