package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e implements u6.b, Serializable {
    public static final Object NO_RECEIVER = a.f24300a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient u6.b reflected;
    private final String signature;

    private static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f24300a = new a();

        private a() {
        }
    }

    public e() {
        this(NO_RECEIVER);
    }

    protected e(Object obj) {
        this(obj, null, null, null, false);
    }

    protected e(Object obj, Class cls, String str, String str2, boolean z7) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z7;
    }

    @Override // u6.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // u6.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public u6.b compute() {
        u6.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        u6.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    protected abstract u6.b computeReflected();

    @Override // u6.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public u6.e getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? z.c(cls) : z.b(cls);
    }

    @Override // u6.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    protected u6.b getReflected() {
        u6.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute;
        }
        throw new o6.b();
    }

    @Override // u6.b
    public u6.i getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // u6.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // u6.b
    public u6.l getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // u6.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // u6.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // u6.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // u6.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
