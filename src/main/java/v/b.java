package v;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends r.d {

    public static class a extends b {
        @Override // v.b
        public void b(View view, float f8) {
        }

        public void c(View view, float f8, double d8, double d9) {
            view.setRotation(a(f8) + ((float) Math.toDegrees(Math.atan2(d9, d8))));
        }
    }

    public abstract void b(View view, float f8);
}
