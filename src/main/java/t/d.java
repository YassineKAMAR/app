package t;

import com.revenuecat.purchases.common.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.i;
import u.o;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f26365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f26366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f26367f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    q.i f26370i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet<d> f26362a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26368g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f26369h = Integer.MIN_VALUE;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26371a;

        static {
            int[] iArr = new int[b.values().length];
            f26371a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26371a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26371a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26371a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26371a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26371a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26371a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26371a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26371a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f26365d = eVar;
        this.f26366e = bVar;
    }

    public boolean a(d dVar, int i8, int i9, boolean z7) {
        if (dVar == null) {
            p();
            return true;
        }
        if (!z7 && !o(dVar)) {
            return false;
        }
        this.f26367f = dVar;
        if (dVar.f26362a == null) {
            dVar.f26362a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f26367f.f26362a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f26368g = i8;
        this.f26369h = i9;
        return true;
    }

    public void b(int i8, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f26362a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                u.i.a(it.next().f26365d, i8, arrayList, oVar);
            }
        }
    }

    public HashSet<d> c() {
        return this.f26362a;
    }

    public int d() {
        if (this.f26364c) {
            return this.f26363b;
        }
        return 0;
    }

    public int e() {
        d dVar;
        if (this.f26365d.T() == 8) {
            return 0;
        }
        return (this.f26369h == Integer.MIN_VALUE || (dVar = this.f26367f) == null || dVar.f26365d.T() != 8) ? this.f26368g : this.f26369h;
    }

    public final d f() {
        switch (a.f26371a[this.f26366e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f26365d.Q;
            case 3:
                return this.f26365d.O;
            case 4:
                return this.f26365d.R;
            case 5:
                return this.f26365d.P;
            default:
                throw new AssertionError(this.f26366e.name());
        }
    }

    public e g() {
        return this.f26365d;
    }

    public q.i h() {
        return this.f26370i;
    }

    public d i() {
        return this.f26367f;
    }

    public b j() {
        return this.f26366e;
    }

    public boolean k() {
        HashSet<d> hashSet = this.f26362a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().n()) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f26362a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean m() {
        return this.f26364c;
    }

    public boolean n() {
        return this.f26367f != null;
    }

    public boolean o(d dVar) {
        if (dVar == null) {
            return false;
        }
        b bVarJ = dVar.j();
        b bVar = this.f26366e;
        if (bVarJ == bVar) {
            return bVar != b.BASELINE || (dVar.g().X() && g().X());
        }
        switch (a.f26371a[bVar.ordinal()]) {
            case 1:
                return (bVarJ == b.BASELINE || bVarJ == b.CENTER_X || bVarJ == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z7 = bVarJ == b.LEFT || bVarJ == b.RIGHT;
                if (dVar.g() instanceof g) {
                    return z7 || bVarJ == b.CENTER_X;
                }
                return z7;
            case 4:
            case 5:
                boolean z8 = bVarJ == b.TOP || bVarJ == b.BOTTOM;
                if (dVar.g() instanceof g) {
                    return z8 || bVarJ == b.CENTER_Y;
                }
                return z8;
            case 6:
                return (bVarJ == b.LEFT || bVarJ == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f26366e.name());
        }
    }

    public void p() {
        HashSet<d> hashSet;
        d dVar = this.f26367f;
        if (dVar != null && (hashSet = dVar.f26362a) != null) {
            hashSet.remove(this);
            if (this.f26367f.f26362a.size() == 0) {
                this.f26367f.f26362a = null;
            }
        }
        this.f26362a = null;
        this.f26367f = null;
        this.f26368g = 0;
        this.f26369h = Integer.MIN_VALUE;
        this.f26364c = false;
        this.f26363b = 0;
    }

    public void q() {
        this.f26364c = false;
        this.f26363b = 0;
    }

    public void r(q.c cVar) {
        q.i iVar = this.f26370i;
        if (iVar == null) {
            this.f26370i = new q.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.g();
        }
    }

    public void s(int i8) {
        this.f26363b = i8;
        this.f26364c = true;
    }

    public String toString() {
        return this.f26365d.r() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + this.f26366e.toString();
    }
}
