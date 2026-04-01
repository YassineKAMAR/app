package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r<R> implements m<R>, Serializable {
    private final int arity;

    public r(int i8) {
        this.arity = i8;
    }

    @Override // kotlin.jvm.internal.m
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strF = z.f(this);
        q.e(strF, "renderLambdaToString(this)");
        return strF;
    }
}
