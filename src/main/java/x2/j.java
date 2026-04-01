package x2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.errorprone.annotations.RestrictedInheritance;

/* JADX INFO: loaded from: classes.dex */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static j f27272c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f27274b;

    public j(Context context) {
        this.f27273a = context.getApplicationContext();
    }

    public static j a(Context context) {
        a3.o.j(context);
        synchronized (j.class) {
            if (f27272c == null) {
                z.d(context);
                f27272c = new j(context);
            }
        }
        return f27272c;
    }

    static final v d(PackageInfo packageInfo, v... vVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        w wVar = new w(packageInfo.signatures[0].toByteArray());
        for (int i8 = 0; i8 < vVarArr.length; i8++) {
            if (vVarArr[i8].equals(wVar)) {
                return vVarArr[i8];
            }
        }
        return null;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z7) {
        if (z7 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z7 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z7 ? d(packageInfo, y.f27293a) : d(packageInfo, y.f27293a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final j0 f(String str, boolean z7, boolean z8) {
        j0 j0VarC;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return j0.c("null pkg");
        }
        if (str.equals(this.f27274b)) {
            return j0.b();
        }
        if (z.e()) {
            j0VarC = z.b(str, i.e(this.f27273a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f27273a.getPackageManager().getPackageInfo(str, 64);
                boolean zE = i.e(this.f27273a);
                if (packageInfo != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        str2 = "single cert required";
                    } else {
                        w wVar = new w(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        j0 j0VarA = z.a(str3, wVar, zE, false);
                        if (!j0VarA.f27276a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !z.a(str3, wVar, false, true).f27276a) {
                            j0VarC = j0VarA;
                        } else {
                            str2 = "debuggable release cert app rejected";
                        }
                    }
                    j0VarC = j0.c(str2);
                } else {
                    j0VarC = j0.c(str2);
                }
            } catch (PackageManager.NameNotFoundException e8) {
                return j0.d("no pkg ".concat(str), e8);
            }
        }
        if (j0VarC.f27276a) {
            this.f27274b = str;
        }
        return j0VarC;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (i.e(this.f27273a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i8) {
        j0 j0VarC;
        int length;
        String[] packagesForUid = this.f27273a.getPackageManager().getPackagesForUid(i8);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            j0VarC = null;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    a3.o.j(j0VarC);
                    break;
                }
                j0VarC = f(packagesForUid[i9], false, false);
                if (j0VarC.f27276a) {
                    break;
                }
                i9++;
            }
        } else {
            j0VarC = j0.c("no pkgs");
        }
        j0VarC.e();
        return j0VarC.f27276a;
    }
}
