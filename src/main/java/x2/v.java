package x2;

import a3.n0;
import a3.q1;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
abstract class v extends q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27289a;

    protected v(byte[] bArr) {
        a3.o.a(bArr.length == 25);
        this.f27289a = Arrays.hashCode(bArr);
    }

    protected static byte[] H0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e8) {
            throw new AssertionError(e8);
        }
    }

    public final boolean equals(Object obj) {
        g3.a aVarP;
        if (obj != null && (obj instanceof n0)) {
            try {
                n0 n0Var = (n0) obj;
                if (n0Var.l() == this.f27289a && (aVarP = n0Var.p()) != null) {
                    return Arrays.equals(k3(), (byte[]) g3.b.H0(aVarP));
                }
                return false;
            } catch (RemoteException e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f27289a;
    }

    abstract byte[] k3();

    @Override // a3.n0
    public final int l() {
        return this.f27289a;
    }

    @Override // a3.n0
    public final g3.a p() {
        return g3.b.k3(k3());
    }
}
