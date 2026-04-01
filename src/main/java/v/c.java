package v;

import android.view.View;
import r.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends e {

    public static class a extends c {
        @Override // v.c
        public void b(View view, float f8) {
        }

        public void c(View view, float f8, double d8, double d9) {
            view.setRotation(a(f8) + ((float) Math.toDegrees(Math.atan2(d9, d8))));
        }
    }

    public abstract void b(View view, float f8);
}
