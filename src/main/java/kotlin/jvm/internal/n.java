package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public class n extends e implements m, u6.f {
    private final int arity;
    private final int flags;

    public n(int i8) {
        this(i8, e.NO_RECEIVER, null, null, null, 0);
    }

    public n(int i8, Object obj) {
        this(i8, obj, null, null, null, 0);
    }

    public n(int i8, Object obj, Class cls, String str, String str2, int i9) {
        super(obj, cls, str, str2, (i9 & 1) == 1);
        this.arity = i8;
        this.flags = i9 >> 1;
    }

    @Override // kotlin.jvm.internal.e
    protected u6.b computeReflected() {
        return z.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return getName().equals(nVar.getName()) && getSignature().equals(nVar.getSignature()) && this.flags == nVar.flags && this.arity == nVar.arity && q.b(getBoundReceiver(), nVar.getBoundReceiver()) && q.b(getOwner(), nVar.getOwner());
        }
        if (obj instanceof u6.f) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.m
    public int getArity() {
        return this.arity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.e
    public u6.f getReflected() {
        return (u6.f) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // u6.f
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // u6.f
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // u6.f
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // u6.f
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.e, u6.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        u6.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
