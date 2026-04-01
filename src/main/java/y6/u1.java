package y6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u1 extends b0 {
    public abstract u1 h0();

    protected final String i0() {
        u1 u1VarH0;
        u1 u1VarC = s0.c();
        if (this == u1VarC) {
            return "Dispatchers.Main";
        }
        try {
            u1VarH0 = u1VarC.h0();
        } catch (UnsupportedOperationException unused) {
            u1VarH0 = null;
        }
        if (this == u1VarH0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // y6.b0
    public String toString() {
        String strI0 = i0();
        if (strI0 != null) {
            return strI0;
        }
        return i0.a(this) + '@' + i0.b(this);
    }
}
