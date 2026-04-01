package w5;

import android.graphics.drawable.ColorDrawable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ColorDrawable f27120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorDrawable f27121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f27122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Double f27123d;

    public c(ColorDrawable colorDrawable, ColorDrawable colorDrawable2, a aVar, Double d8) {
        this.f27120a = colorDrawable;
        this.f27121b = colorDrawable2;
        this.f27122c = aVar;
        this.f27123d = d8;
    }

    public ColorDrawable a() {
        return this.f27121b;
    }

    public a b() {
        return this.f27122c;
    }

    public Float c() {
        Double d8 = this.f27123d;
        if (d8 == null) {
            return null;
        }
        return Float.valueOf(d8.floatValue());
    }

    public ColorDrawable d() {
        return this.f27120a;
    }

    public boolean equals(Object obj) {
        ColorDrawable colorDrawable;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        ColorDrawable colorDrawable2 = this.f27120a;
        return ((colorDrawable2 == null && cVar.f27120a == null) || colorDrawable2.getColor() == cVar.f27120a.getColor()) && (((colorDrawable = this.f27121b) == null && cVar.f27121b == null) || colorDrawable.getColor() == cVar.f27121b.getColor()) && Objects.equals(this.f27123d, cVar.f27123d) && Objects.equals(this.f27122c, cVar.f27122c);
    }

    public int hashCode() {
        ColorDrawable colorDrawable = this.f27120a;
        Integer numValueOf = colorDrawable == null ? null : Integer.valueOf(colorDrawable.getColor());
        ColorDrawable colorDrawable2 = this.f27121b;
        return Objects.hash(numValueOf, colorDrawable2 != null ? Integer.valueOf(colorDrawable2.getColor()) : null, this.f27123d, this.f27122c);
    }
}
