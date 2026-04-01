package m0;

import androidx.room.h;
import q0.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<T> extends d {
    public a(h hVar) {
        super(hVar);
    }

    protected abstract void g(f fVar, T t7);

    public final void h(T t7) {
        f fVarA = a();
        try {
            g(fVarA, t7);
            fVarA.c0();
        } finally {
            f(fVarA);
        }
    }
}
