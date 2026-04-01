package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w extends e implements u6.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24323a;

    public w() {
        this.f24323a = false;
    }

    public w(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, (i8 & 1) == 1);
        this.f24323a = (i8 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.e
    public u6.b compute() {
        return this.f24323a ? this : super.compute();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.e
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public u6.h getReflected() {
        if (this.f24323a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        return (u6.h) super.getReflected();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            return getOwner().equals(wVar.getOwner()) && getName().equals(wVar.getName()) && getSignature().equals(wVar.getSignature()) && q.b(getBoundReceiver(), wVar.getBoundReceiver());
        }
        if (obj instanceof u6.h) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        u6.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
