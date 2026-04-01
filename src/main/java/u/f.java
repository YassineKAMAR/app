package u;

import com.revenuecat.purchases.common.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p f26570d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f26572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26573g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f26567a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26568b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26569c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a f26571e = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f26574h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    g f26575i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f26576j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    List<d> f26577k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    List<f> f26578l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f26570d = pVar;
    }

    @Override // u.d
    public void a(d dVar) {
        Iterator<f> it = this.f26578l.iterator();
        while (it.hasNext()) {
            if (!it.next().f26576j) {
                return;
            }
        }
        this.f26569c = true;
        d dVar2 = this.f26567a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f26568b) {
            this.f26570d.a(this);
            return;
        }
        f fVar = null;
        int i8 = 0;
        for (f fVar2 : this.f26578l) {
            if (!(fVar2 instanceof g)) {
                i8++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i8 == 1 && fVar.f26576j) {
            g gVar = this.f26575i;
            if (gVar != null) {
                if (!gVar.f26576j) {
                    return;
                } else {
                    this.f26572f = this.f26574h * gVar.f26573g;
                }
            }
            d(fVar.f26573g + this.f26572f);
        }
        d dVar3 = this.f26567a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f26577k.add(dVar);
        if (this.f26576j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f26578l.clear();
        this.f26577k.clear();
        this.f26576j = false;
        this.f26573g = 0;
        this.f26569c = false;
        this.f26568b = false;
    }

    public void d(int i8) {
        if (this.f26576j) {
            return;
        }
        this.f26576j = true;
        this.f26573g = i8;
        for (d dVar : this.f26577k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26570d.f26621b.r());
        sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        sb.append(this.f26571e);
        sb.append("(");
        sb.append(this.f26576j ? Integer.valueOf(this.f26573g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f26578l.size());
        sb.append(":d=");
        sb.append(this.f26577k.size());
        sb.append(">");
        return sb.toString();
    }
}
