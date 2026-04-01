package v;

import android.view.View;
import r.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends f {

    public static class a extends d {
        @Override // v.d
        public boolean b(View view, float f8, long j8, r.c cVar) {
            return this.f25837h;
        }

        public boolean c(View view, r.c cVar, float f8, long j8, double d8, double d9) {
            view.setRotation(a(f8, j8, view, cVar) + ((float) Math.toDegrees(Math.atan2(d9, d8))));
            return this.f25837h;
        }
    }

    public float a(float f8, long j8, View view, r.c cVar) {
        this.f25830a.c(f8, this.f25836g);
        float[] fArr = this.f25836g;
        float f9 = fArr[1];
        if (f9 == 0.0f) {
            this.f25837h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f25839j)) {
            throw null;
        }
        this.f25839j = (float) ((((double) this.f25839j) + (((j8 - this.f25838i) * 1.0E-9d) * ((double) f9))) % 1.0d);
        throw null;
    }

    public abstract boolean b(View view, float f8, long j8, r.c cVar);
}
