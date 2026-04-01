package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;
import com.google.android.gms.internal.measurement.y8.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class y8<MessageType extends y8<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends f7<MessageType, BuilderType> {
    private static Map<Object, y8<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected bc zzb = bc.k();

    protected static class a<T extends y8<T, ?>> extends j7<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T f19402b;

        public a(T t7) {
            this.f19402b = t7;
        }
    }

    public static abstract class b<MessageType extends y8<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends h7<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MessageType f19403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected MessageType f19404b;

        protected b(MessageType messagetype) {
            this.f19403a = messagetype;
            if (messagetype.E()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f19404b = (MessageType) messagetype.y();
        }

        private static <MessageType> void l(MessageType messagetype, MessageType messagetype2) {
            za.a().c(messagetype).g(messagetype, messagetype2);
        }

        private final BuilderType q(byte[] bArr, int i8, int i9, l8 l8Var) throws k9 {
            if (!this.f19404b.E()) {
                p();
            }
            try {
                za.a().c(this.f19404b).e(this.f19404b, bArr, 0, i9, new n7(l8Var));
                return this;
            } catch (k9 e8) {
                throw e8;
            } catch (IOException e9) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e9);
            } catch (IndexOutOfBoundsException unused) {
                throw k9.f();
            }
        }

        @Override // com.google.android.gms.internal.measurement.h7
        public /* synthetic */ Object clone() {
            b bVar = (b) this.f19403a.q(e.f19409e, null, null);
            bVar.f19404b = (MessageType) f();
            return bVar;
        }

        @Override // com.google.android.gms.internal.measurement.oa
        public final boolean e() {
            return y8.u(this.f19404b, false);
        }

        @Override // com.google.android.gms.internal.measurement.h7
        public final /* synthetic */ h7 h(byte[] bArr, int i8, int i9) {
            return q(bArr, 0, i9, l8.f18924c);
        }

        @Override // com.google.android.gms.internal.measurement.h7
        public final /* synthetic */ h7 i(byte[] bArr, int i8, int i9, l8 l8Var) {
            return q(bArr, 0, i9, l8Var);
        }

        public final BuilderType k(MessageType messagetype) {
            if (this.f19403a.equals(messagetype)) {
                return this;
            }
            if (!this.f19404b.E()) {
                p();
            }
            l(this.f19404b, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.measurement.pa
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public MessageType f() {
            if (!this.f19404b.E()) {
                return this.f19404b;
            }
            this.f19404b.C();
            return this.f19404b;
        }

        protected final void o() {
            if (this.f19404b.E()) {
                return;
            }
            p();
        }

        protected void p() {
            MessageType messagetype = (MessageType) this.f19403a.y();
            l(messagetype, this.f19404b);
            this.f19404b = messagetype;
        }

        @Override // com.google.android.gms.internal.measurement.pa
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final MessageType d() {
            MessageType messagetype = (MessageType) f();
            if (messagetype.e()) {
                return messagetype;
            }
            throw new zb(messagetype);
        }
    }

    static final class c implements t8<c> {
        @Override // com.google.android.gms.internal.measurement.t8
        public final pa b(pa paVar, ma maVar) {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.t8
        public final ua f(ua uaVar, ua uaVar2) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.t8
        public final int j() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.t8
        public final qc k() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.t8
        public final ad l() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.t8
        public final boolean m() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.t8
        public final boolean p() {
            throw new NoSuchMethodError();
        }
    }

    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends y8<MessageType, BuilderType> implements oa {
        protected r8<c> zzc = r8.i();

        final r8<c> F() {
            if (this.zzc.r()) {
                this.zzc = (r8) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public enum e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f19405a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f19406b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f19407c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f19408d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f19409e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f19410f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f19411g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ int[] f19412h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) f19412h.clone();
        }
    }

    public static class f<ContainingType extends ma, Type> extends m8<ContainingType, Type> {
    }

    protected static i9 A() {
        return aa.g();
    }

    protected static <E> h9<E> B() {
        return db.i();
    }

    private final int m() {
        return za.a().c(this).b(this);
    }

    static <T extends y8<?, ?>> T n(Class<T> cls) {
        y8<?, ?> y8Var = zzc.get(cls);
        if (y8Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                y8Var = zzc.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (y8Var == null) {
            y8Var = (T) ((y8) jc.b(cls)).q(e.f19410f, null, null);
            if (y8Var == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, y8Var);
        }
        return (T) y8Var;
    }

    protected static <E> h9<E> o(h9<E> h9Var) {
        int size = h9Var.size();
        return h9Var.b(size == 0 ? 10 : size << 1);
    }

    protected static i9 p(i9 i9Var) {
        int size = i9Var.size();
        return i9Var.b(size == 0 ? 10 : size << 1);
    }

    protected static Object r(ma maVar, String str, Object[] objArr) {
        return new bb(maVar, str, objArr);
    }

    static Object s(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e8);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static <T extends y8<?, ?>> void t(Class<T> cls, T t7) {
        t7.D();
        zzc.put(cls, t7);
    }

    protected static final <T extends y8<T, ?>> boolean u(T t7, boolean z7) {
        byte bByteValue = ((Byte) t7.q(e.f19405a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = za.a().c(t7).d(t7);
        if (z7) {
            t7.q(e.f19406b, zD ? t7 : null, null);
        }
        return zD;
    }

    private final int v(eb<?> ebVar) {
        return ebVar == null ? za.a().c(this).a(this) : ebVar.a(this);
    }

    protected static f9 z() {
        return c9.g();
    }

    protected final void C() {
        za.a().c(this).f(this);
        D();
    }

    final void D() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final boolean E() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.f7
    final int a(eb ebVar) {
        if (!E()) {
            if (i() != Integer.MAX_VALUE) {
                return i();
            }
            int iV = v(ebVar);
            l(iV);
            return iV;
        }
        int iV2 = v(ebVar);
        if (iV2 >= 0) {
            return iV2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iV2);
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final /* synthetic */ ma c() {
        return (y8) q(e.f19410f, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.oa
    public final boolean e() {
        return u(this, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return za.a().c(this).h(this, (y8) obj);
        }
        return false;
    }

    public int hashCode() {
        if (E()) {
            return m();
        }
        if (this.zza == 0) {
            this.zza = m();
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.f7
    final int i() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.f7
    final void l(int i8) {
        if (i8 >= 0) {
            this.zzd = (i8 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final /* synthetic */ pa l0() {
        return ((b) q(e.f19409e, null, null)).k(this);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final /* synthetic */ pa m0() {
        return (b) q(e.f19409e, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void n0(h8 h8Var) {
        za.a().c(this).c(this, k8.P(h8Var));
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final int o0() {
        return a(null);
    }

    protected abstract Object q(int i8, Object obj, Object obj2);

    public String toString() {
        return ra.a(this, super.toString());
    }

    protected final <MessageType extends y8<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType w() {
        return (BuilderType) q(e.f19409e, null, null);
    }

    public final BuilderType x() {
        return (BuilderType) ((b) q(e.f19409e, null, null)).k(this);
    }

    final MessageType y() {
        return (MessageType) q(e.f19408d, null, null);
    }
}
