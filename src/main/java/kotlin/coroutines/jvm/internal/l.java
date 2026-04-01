package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l extends d implements m<Object> {
    private final int arity;

    public l(int i8) {
        this(i8, null);
    }

    public l(int i8, h6.d<Object> dVar) {
        super(dVar);
        this.arity = i8;
    }

    @Override // kotlin.jvm.internal.m
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strE = z.e(this);
        q.e(strE, "renderLambdaToString(this)");
        return strE;
    }
}
