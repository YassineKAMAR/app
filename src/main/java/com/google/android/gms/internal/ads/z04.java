package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.w04;
import com.google.android.gms.internal.ads.z04;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class z04<MessageType extends z04<MessageType, BuilderType>, BuilderType extends w04<MessageType, BuilderType>> extends az3<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected w34 zzc = w34.c();

    static Object A(Method method, Object obj, Object... objArr) {
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

    protected static Object B(k24 k24Var, String str, Object[] objArr) {
        return new u24(k24Var, str, objArr);
    }

    protected static void E(Class cls, z04 z04Var) {
        z04Var.D();
        zzb.put(cls, z04Var);
    }

    private static z04 K(z04 z04Var) throws m14 {
        if (z04Var == null || z04Var.G()) {
            return z04Var;
        }
        m14 m14VarA = new u34(z04Var).a();
        m14VarA.h(z04Var);
        throw m14VarA;
    }

    private static z04 L(z04 z04Var, byte[] bArr, int i8, int i9, m04 m04Var) throws m14 {
        z04 z04VarO = z04Var.o();
        try {
            e34 e34VarB = s24.a().b(z04VarO.getClass());
            e34VarB.g(z04VarO, bArr, 0, i9, new dz3(m04Var));
            e34VarB.c(z04VarO);
            return z04VarO;
        } catch (m14 e8) {
            e = e8;
            if (e.l()) {
                e = new m14(e);
            }
            e.h(z04VarO);
            throw e;
        } catch (u34 e9) {
            m14 m14VarA = e9.a();
            m14VarA.h(z04VarO);
            throw m14VarA;
        } catch (IOException e10) {
            if (e10.getCause() instanceof m14) {
                throw ((m14) e10.getCause());
            }
            m14 m14Var = new m14(e10);
            m14Var.h(z04VarO);
            throw m14Var;
        } catch (IndexOutOfBoundsException unused) {
            m14 m14VarJ = m14.j();
            m14VarJ.h(z04VarO);
            throw m14VarJ;
        }
    }

    private final int j(e34 e34Var) {
        return s24.a().b(getClass()).a(this);
    }

    static z04 n(Class cls) {
        Map map = zzb;
        z04 z04Var = (z04) map.get(cls);
        if (z04Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                z04Var = (z04) map.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (z04Var == null) {
            z04Var = (z04) ((z04) g44.o(cls)).J(6, null, null);
            if (z04Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, z04Var);
        }
        return z04Var;
    }

    protected static z04 p(z04 z04Var, rz3 rz3Var) throws m14 {
        m04 m04Var = m04.f11116c;
        zz3 zz3VarZ = rz3Var.z();
        z04 z04VarO = z04Var.o();
        try {
            e34 e34VarB = s24.a().b(z04VarO.getClass());
            e34VarB.i(z04VarO, b04.U(zz3VarZ), m04Var);
            e34VarB.c(z04VarO);
            try {
                zz3VarZ.B(0);
                K(z04VarO);
                K(z04VarO);
                return z04VarO;
            } catch (m14 e8) {
                e8.h(z04VarO);
                throw e8;
            }
        } catch (m14 e9) {
            e = e9;
            if (e.l()) {
                e = new m14(e);
            }
            e.h(z04VarO);
            throw e;
        } catch (u34 e10) {
            m14 m14VarA = e10.a();
            m14VarA.h(z04VarO);
            throw m14VarA;
        } catch (IOException e11) {
            if (e11.getCause() instanceof m14) {
                throw ((m14) e11.getCause());
            }
            m14 m14Var = new m14(e11);
            m14Var.h(z04VarO);
            throw m14Var;
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof m14) {
                throw ((m14) e12.getCause());
            }
            throw e12;
        }
    }

    protected static z04 q(z04 z04Var, byte[] bArr) throws m14 {
        z04 z04VarL = L(z04Var, bArr, 0, bArr.length, m04.f11116c);
        K(z04VarL);
        return z04VarL;
    }

    protected static z04 r(z04 z04Var, rz3 rz3Var, m04 m04Var) throws m14 {
        zz3 zz3VarZ = rz3Var.z();
        z04 z04VarO = z04Var.o();
        try {
            e34 e34VarB = s24.a().b(z04VarO.getClass());
            e34VarB.i(z04VarO, b04.U(zz3VarZ), m04Var);
            e34VarB.c(z04VarO);
            try {
                zz3VarZ.B(0);
                K(z04VarO);
                return z04VarO;
            } catch (m14 e8) {
                e8.h(z04VarO);
                throw e8;
            }
        } catch (m14 e9) {
            e = e9;
            if (e.l()) {
                e = new m14(e);
            }
            e.h(z04VarO);
            throw e;
        } catch (u34 e10) {
            m14 m14VarA = e10.a();
            m14VarA.h(z04VarO);
            throw m14VarA;
        } catch (IOException e11) {
            if (e11.getCause() instanceof m14) {
                throw ((m14) e11.getCause());
            }
            m14 m14Var = new m14(e11);
            m14Var.h(z04VarO);
            throw m14Var;
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof m14) {
                throw ((m14) e12.getCause());
            }
            throw e12;
        }
    }

    protected static z04 s(z04 z04Var, InputStream inputStream, m04 m04Var) throws m14 {
        zz3 zz3VarG = zz3.g(inputStream, 4096);
        z04 z04VarO = z04Var.o();
        try {
            e34 e34VarB = s24.a().b(z04VarO.getClass());
            e34VarB.i(z04VarO, b04.U(zz3VarG), m04Var);
            e34VarB.c(z04VarO);
            K(z04VarO);
            return z04VarO;
        } catch (m14 e8) {
            e = e8;
            if (e.l()) {
                e = new m14(e);
            }
            e.h(z04VarO);
            throw e;
        } catch (u34 e9) {
            m14 m14VarA = e9.a();
            m14VarA.h(z04VarO);
            throw m14VarA;
        } catch (IOException e10) {
            if (e10.getCause() instanceof m14) {
                throw ((m14) e10.getCause());
            }
            m14 m14Var = new m14(e10);
            m14Var.h(z04VarO);
            throw m14Var;
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof m14) {
                throw ((m14) e11.getCause());
            }
            throw e11;
        }
    }

    protected static z04 t(z04 z04Var, byte[] bArr, m04 m04Var) throws m14 {
        z04 z04VarL = L(z04Var, bArr, 0, bArr.length, m04Var);
        K(z04VarL);
        return z04VarL;
    }

    protected static f14 u() {
        return b14.g();
    }

    protected static f14 v(f14 f14Var) {
        int size = f14Var.size();
        return f14Var.f(size == 0 ? 10 : size + size);
    }

    protected static i14 w() {
        return y14.g();
    }

    protected static i14 x(i14 i14Var) {
        int size = i14Var.size();
        return i14Var.f(size == 0 ? 10 : size + size);
    }

    protected static j14 y() {
        return t24.e();
    }

    protected static j14 z(j14 j14Var) {
        int size = j14Var.size();
        return j14Var.f(size == 0 ? 10 : size + size);
    }

    protected final void C() {
        s24.a().b(getClass()).c(this);
        D();
    }

    final void D() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void F(int i8) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean G() {
        byte bByteValue = ((Byte) J(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = s24.a().b(getClass()).d(this);
        J(2, true != zD ? null : this, null);
        return zD;
    }

    final boolean H() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    final int I() {
        return s24.a().b(getClass()).b(this);
    }

    protected abstract Object J(int i8, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.az3
    final int b(e34 e34Var) {
        if (H()) {
            int iA = e34Var.a(this);
            if (iA >= 0) {
                return iA;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iA);
        }
        int i8 = this.zzd & Integer.MAX_VALUE;
        if (i8 != Integer.MAX_VALUE) {
            return i8;
        }
        int iA2 = e34Var.a(this);
        if (iA2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iA2;
            return iA2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iA2);
    }

    @Override // com.google.android.gms.internal.ads.k24
    public final void e(h04 h04Var) {
        s24.a().b(getClass()).h(this, i04.l(h04Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return s24.a().b(getClass()).f(this, (z04) obj);
    }

    @Override // com.google.android.gms.internal.ads.l24
    public final /* synthetic */ k24 h() {
        return (z04) J(6, null, null);
    }

    public final int hashCode() {
        if (H()) {
            return I();
        }
        int i8 = this.zza;
        if (i8 != 0) {
            return i8;
        }
        int I = I();
        this.zza = I;
        return I;
    }

    @Override // com.google.android.gms.internal.ads.k24
    public final int i() {
        int iJ;
        if (H()) {
            iJ = j(null);
            if (iJ < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + iJ);
            }
        } else {
            iJ = this.zzd & Integer.MAX_VALUE;
            if (iJ == Integer.MAX_VALUE) {
                iJ = j(null);
                if (iJ < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + iJ);
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iJ;
            }
        }
        return iJ;
    }

    @Override // com.google.android.gms.internal.ads.k24
    public final /* synthetic */ j24 k() {
        return (w04) J(5, null, null);
    }

    protected final w04 l() {
        return (w04) J(5, null, null);
    }

    public final w04 m() {
        w04 w04Var = (w04) J(5, null, null);
        w04Var.o(this);
        return w04Var;
    }

    final z04 o() {
        return (z04) J(4, null, null);
    }

    public final String toString() {
        return m24.a(this, super.toString());
    }
}
