package q;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class i implements Comparable<i> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f25699r = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25701b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f25705f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    a f25709j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25702c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f25703d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25704e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25706g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float[] f25707h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float[] f25708i = new float[9];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    b[] f25710k = new b[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f25711l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25712m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f25713n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f25714o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f25715p = 0.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    HashSet<b> f25716q = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f25709j = aVar;
    }

    static void d() {
        f25699r++;
    }

    public final void a(b bVar) {
        int i8 = 0;
        while (true) {
            int i9 = this.f25711l;
            if (i8 >= i9) {
                b[] bVarArr = this.f25710k;
                if (i9 >= bVarArr.length) {
                    this.f25710k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f25710k;
                int i10 = this.f25711l;
                bVarArr2[i10] = bVar;
                this.f25711l = i10 + 1;
                return;
            }
            if (this.f25710k[i8] == bVar) {
                return;
            } else {
                i8++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f25702c - iVar.f25702c;
    }

    public final void e(b bVar) {
        int i8 = this.f25711l;
        int i9 = 0;
        while (i9 < i8) {
            if (this.f25710k[i9] == bVar) {
                while (i9 < i8 - 1) {
                    b[] bVarArr = this.f25710k;
                    int i10 = i9 + 1;
                    bVarArr[i9] = bVarArr[i10];
                    i9 = i10;
                }
                this.f25711l--;
                return;
            }
            i9++;
        }
    }

    public void g() {
        this.f25701b = null;
        this.f25709j = a.UNKNOWN;
        this.f25704e = 0;
        this.f25702c = -1;
        this.f25703d = -1;
        this.f25705f = 0.0f;
        this.f25706g = false;
        this.f25713n = false;
        this.f25714o = -1;
        this.f25715p = 0.0f;
        int i8 = this.f25711l;
        for (int i9 = 0; i9 < i8; i9++) {
            this.f25710k[i9] = null;
        }
        this.f25711l = 0;
        this.f25712m = 0;
        this.f25700a = false;
        Arrays.fill(this.f25708i, 0.0f);
    }

    public void h(d dVar, float f8) {
        this.f25705f = f8;
        this.f25706g = true;
        this.f25713n = false;
        this.f25714o = -1;
        this.f25715p = 0.0f;
        int i8 = this.f25711l;
        this.f25703d = -1;
        for (int i9 = 0; i9 < i8; i9++) {
            this.f25710k[i9].A(dVar, this, false);
        }
        this.f25711l = 0;
    }

    public void i(a aVar, String str) {
        this.f25709j = aVar;
    }

    public final void n(d dVar, b bVar) {
        int i8 = this.f25711l;
        for (int i9 = 0; i9 < i8; i9++) {
            this.f25710k[i9].B(dVar, bVar, false);
        }
        this.f25711l = 0;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f25701b != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f25701b);
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f25702c);
        }
        return sb.toString();
    }
}
