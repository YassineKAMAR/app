package w5;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.ads.nativetemplates.TemplateView;
import java.util.Objects;
import k1.a;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final d f27114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ColorDrawable f27115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final c f27116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final c f27117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final c f27118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final c f27119f;

    public b(d dVar, ColorDrawable colorDrawable, c cVar, c cVar2, c cVar3, c cVar4) {
        this.f27114a = dVar;
        this.f27115b = colorDrawable;
        this.f27116c = cVar;
        this.f27117d = cVar2;
        this.f27118e = cVar3;
        this.f27119f = cVar4;
    }

    public k1.a a() {
        a.C0139a c0139a = new a.C0139a();
        ColorDrawable colorDrawable = this.f27115b;
        if (colorDrawable != null) {
            c0139a.f(colorDrawable);
        }
        c cVar = this.f27116c;
        if (cVar != null) {
            if (cVar.a() != null) {
                c0139a.b(this.f27116c.a());
            }
            if (this.f27116c.d() != null) {
                c0139a.e(this.f27116c.d().getColor());
            }
            if (this.f27116c.b() != null) {
                c0139a.d(this.f27116c.b().d());
            }
            if (this.f27116c.c() != null) {
                c0139a.c(this.f27116c.c().floatValue());
            }
        }
        c cVar2 = this.f27117d;
        if (cVar2 != null) {
            if (cVar2.a() != null) {
                c0139a.g(this.f27117d.a());
            }
            if (this.f27117d.d() != null) {
                c0139a.j(this.f27117d.d().getColor());
            }
            if (this.f27117d.b() != null) {
                c0139a.i(this.f27117d.b().d());
            }
            if (this.f27117d.c() != null) {
                c0139a.h(this.f27117d.c().floatValue());
            }
        }
        c cVar3 = this.f27118e;
        if (cVar3 != null) {
            if (cVar3.a() != null) {
                c0139a.k(this.f27118e.a());
            }
            if (this.f27118e.d() != null) {
                c0139a.n(this.f27118e.d().getColor());
            }
            if (this.f27118e.b() != null) {
                c0139a.m(this.f27118e.b().d());
            }
            if (this.f27118e.c() != null) {
                c0139a.l(this.f27118e.c().floatValue());
            }
        }
        c cVar4 = this.f27119f;
        if (cVar4 != null) {
            if (cVar4.a() != null) {
                c0139a.o(this.f27119f.a());
            }
            if (this.f27119f.d() != null) {
                c0139a.r(this.f27119f.d().getColor());
            }
            if (this.f27119f.b() != null) {
                c0139a.q(this.f27119f.b().d());
            }
            if (this.f27119f.c() != null) {
                c0139a.p(this.f27119f.c().floatValue());
            }
        }
        return c0139a.a();
    }

    public TemplateView b(Context context) {
        TemplateView templateView = (TemplateView) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.f27114a.d(), (ViewGroup) null);
        templateView.setStyles(a());
        return templateView;
    }

    public c c() {
        return this.f27116c;
    }

    public ColorDrawable d() {
        return this.f27115b;
    }

    public c e() {
        return this.f27117d;
    }

    public boolean equals(Object obj) {
        ColorDrawable colorDrawable;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f27114a == bVar.f27114a && (((colorDrawable = this.f27115b) == null && bVar.f27115b == null) || colorDrawable.getColor() == bVar.f27115b.getColor()) && Objects.equals(this.f27116c, bVar.f27116c) && Objects.equals(this.f27117d, bVar.f27117d) && Objects.equals(this.f27118e, bVar.f27118e) && Objects.equals(this.f27119f, bVar.f27119f);
    }

    public c f() {
        return this.f27118e;
    }

    public d g() {
        return this.f27114a;
    }

    public c h() {
        return this.f27119f;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        ColorDrawable colorDrawable = this.f27115b;
        objArr[0] = colorDrawable == null ? null : Integer.valueOf(colorDrawable.getColor());
        objArr[1] = this.f27116c;
        objArr[2] = this.f27117d;
        objArr[3] = this.f27118e;
        objArr[4] = this.f27119f;
        return Objects.hash(objArr);
    }
}
