package d5;

import b5.d0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements e {
    private Boolean j(String str) {
        Object objC = c(str);
        if (objC instanceof Boolean) {
            return (Boolean) objC;
        }
        return null;
    }

    private String l() {
        return (String) c("sql");
    }

    private List<Object> m() {
        return (List) c("arguments");
    }

    @Override // d5.e
    public d0 d() {
        return new d0(l(), m());
    }

    @Override // d5.e
    public boolean e() {
        return Boolean.TRUE.equals(c("noResult"));
    }

    @Override // d5.e
    public Integer f() {
        return (Integer) c("transactionId");
    }

    @Override // d5.e
    public boolean g() {
        return h("transactionId") && f() == null;
    }

    @Override // d5.e
    public Boolean i() {
        return j("inTransaction");
    }

    public boolean k() {
        return Boolean.TRUE.equals(c("continueOnError"));
    }

    public String toString() {
        return "" + getMethod() + " " + l() + " " + m();
    }
}
