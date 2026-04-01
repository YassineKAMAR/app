package x2;

import a3.r0;
import a3.s0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile s0 f27298e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Context f27300g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final x f27294a = new r(v.H0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final x f27295b = new s(v.H0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final x f27296c = new t(v.H0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final x f27297d = new u(v.H0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f27299f = new Object();

    static j0 a(String str, v vVar, boolean z7, boolean z8) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, vVar, z7, z8);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static j0 b(String str, boolean z7, boolean z8, boolean z9) {
        return g(str, z7, false, false, true);
    }

    static /* synthetic */ String c(boolean z7, String str, v vVar) {
        String str2 = true != (!z7 && f(str, vVar, true, false).f27276a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestB = e3.a.b("SHA-256");
        a3.o.j(messageDigestB);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, e3.j.a(messageDigestB.digest(vVar.k3())), Boolean.valueOf(z7), "12451000.false");
    }

    static synchronized void d(Context context) {
        if (f27300g != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f27300g = context.getApplicationContext();
        }
    }

    static boolean e() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                h();
                return f27298e.r();
            } catch (RemoteException | DynamiteModule.a e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return false;
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static j0 f(final String str, final v vVar, final boolean z7, boolean z8) {
        try {
            h();
            a3.o.j(f27300g);
            try {
                return f27298e.U3(new e0(str, vVar, z7, z8), g3.b.k3(f27300g.getPackageManager())) ? j0.b() : new h0(new Callable() { // from class: x2.q
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return z.c(z7, str, vVar);
                    }
                }, null);
            } catch (RemoteException e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                return j0.d("module call", e8);
            }
        } catch (DynamiteModule.a e9) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
            return j0.d("module init: ".concat(String.valueOf(e9.getMessage())), e9);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, g3.a] */
    private static j0 g(String str, boolean z7, boolean z8, boolean z9, boolean z10) {
        String strConcat;
        j0 j0VarD;
        a0 a0Var;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            a3.o.j(f27300g);
            try {
                h();
                a0Var = new a0(str, z7, false, g3.b.k3(f27300g), false, true);
            } catch (DynamiteModule.a e8) {
                e = e8;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                strConcat = "module init: ".concat(String.valueOf(e.getMessage()));
            }
            try {
                c0 c0VarM2 = z10 ? f27298e.m2(a0Var) : f27298e.L1(a0Var);
                if (c0VarM2.i()) {
                    j0VarD = j0.f(c0VarM2.n());
                } else {
                    String strG = c0VarM2.g();
                    PackageManager.NameNotFoundException nameNotFoundException = c0VarM2.p() == 4 ? new PackageManager.NameNotFoundException() : null;
                    if (strG == null) {
                        strG = "error checking package certificate";
                    }
                    j0VarD = j0.g(c0VarM2.n(), c0VarM2.p(), strG, nameNotFoundException);
                }
            } catch (RemoteException e9) {
                e = e9;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                strConcat = "module call";
                j0VarD = j0.d(strConcat, e);
            }
            return j0VarD;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static void h() {
        if (f27298e != null) {
            return;
        }
        a3.o.j(f27300g);
        synchronized (f27299f) {
            if (f27298e == null) {
                f27298e = r0.v0(DynamiteModule.e(f27300g, DynamiteModule.f4915f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
