package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.k1;
import com.google.android.gms.internal.play_billing.n1;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class n1<MessageType extends n1<MessageType, BuilderType>, BuilderType extends k1<MessageType, BuilderType>> extends x<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected u3 zzc = u3.c();

    static n1 f(Class cls) {
        Map map = zzb;
        n1 n1Var = (n1) map.get(cls);
        if (n1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                n1Var = (n1) map.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (n1Var == null) {
            n1Var = (n1) ((n1) d4.j(cls)).u(6, null, null);
            if (n1Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, n1Var);
        }
        return n1Var;
    }

    protected static n1 h(n1 n1Var, byte[] bArr, a1 a1Var) throws u1 {
        n1 n1VarW = w(n1Var, bArr, 0, bArr.length, a1Var);
        if (n1VarW == null || n1VarW.r()) {
            return n1VarW;
        }
        u1 u1VarA = new s3(n1VarW).a();
        u1VarA.f(n1VarW);
        throw u1VarA;
    }

    static Object i(Method method, Object obj, Object... objArr) {
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

    protected static Object j(r2 r2Var, String str, Object[] objArr) {
        return new a3(r2Var, str, objArr);
    }

    protected static void p(Class cls, n1 n1Var) {
        n1Var.o();
        zzb.put(cls, n1Var);
    }

    private final int v(b3 b3Var) {
        return z2.a().b(getClass()).a(this);
    }

    private static n1 w(n1 n1Var, byte[] bArr, int i8, int i9, a1 a1Var) throws u1 {
        n1 n1VarG = n1Var.g();
        try {
            b3 b3VarB = z2.a().b(n1VarG.getClass());
            b3VarB.h(n1VarG, bArr, 0, i9, new a0(a1Var));
            b3VarB.c(n1VarG);
            return n1VarG;
        } catch (s3 e8) {
            u1 u1VarA = e8.a();
            u1VarA.f(n1VarG);
            throw u1VarA;
        } catch (u1 e9) {
            e9.f(n1VarG);
            throw e9;
        } catch (IOException e10) {
            if (e10.getCause() instanceof u1) {
                throw ((u1) e10.getCause());
            }
            u1 u1Var = new u1(e10);
            u1Var.f(n1VarG);
            throw u1Var;
        } catch (IndexOutOfBoundsException unused) {
            u1 u1VarG = u1.g();
            u1VarG.f(n1VarG);
            throw u1VarG;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.x
    final int a(b3 b3Var) {
        if (t()) {
            int iA = b3Var.a(this);
            if (iA >= 0) {
                return iA;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iA);
        }
        int i8 = this.zzd & Integer.MAX_VALUE;
        if (i8 != Integer.MAX_VALUE) {
            return i8;
        }
        int iA2 = b3Var.a(this);
        if (iA2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iA2;
            return iA2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iA2);
    }

    @Override // com.google.android.gms.internal.play_billing.r2
    public final void c(v0 v0Var) {
        z2.a().b(getClass()).g(this, w0.J(v0Var));
    }

    final int d() {
        return z2.a().b(getClass()).b(this);
    }

    protected final k1 e() {
        return (k1) u(5, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return z2.a().b(getClass()).f(this, (n1) obj);
    }

    final n1 g() {
        return (n1) u(4, null, null);
    }

    public final int hashCode() {
        if (t()) {
            return d();
        }
        int i8 = this.zza;
        if (i8 != 0) {
            return i8;
        }
        int iD = d();
        this.zza = iD;
        return iD;
    }

    protected final void l() {
        z2.a().b(getClass()).c(this);
        o();
    }

    @Override // com.google.android.gms.internal.play_billing.r2
    public final int m() {
        int iV;
        if (t()) {
            iV = v(null);
            if (iV < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + iV);
            }
        } else {
            iV = this.zzd & Integer.MAX_VALUE;
            if (iV == Integer.MAX_VALUE) {
                iV = v(null);
                if (iV < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + iV);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iV;
            }
        }
        return iV;
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final /* synthetic */ r2 n() {
        return (n1) u(6, null, null);
    }

    final void o() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void q(int i8) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean r() {
        byte bByteValue = ((Byte) u(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = z2.a().b(getClass()).d(this);
        u(2, true != zD ? null : this, null);
        return zD;
    }

    @Override // com.google.android.gms.internal.play_billing.r2
    public final /* synthetic */ q2 s() {
        return (k1) u(5, null, null);
    }

    final boolean t() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final String toString() {
        return t2.a(this, super.toString());
    }

    protected abstract Object u(int i8, Object obj, Object obj2);
}
