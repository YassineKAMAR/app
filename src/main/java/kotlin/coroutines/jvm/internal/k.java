package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k extends j implements m<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24293a;

    public k(int i8, h6.d<Object> dVar) {
        super(dVar);
        this.f24293a = i8;
    }

    @Override // kotlin.jvm.internal.m
    public int getArity() {
        return this.f24293a;
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
