package f3;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import e3.m;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f21704a;

    public d(Context context) {
        this.f21704a = context;
    }

    public int a(String str) {
        return this.f21704a.checkCallingOrSelfPermission(str);
    }

    @ResultIgnorabilityUnspecified
    public int b(String str, String str2) {
        return this.f21704a.getPackageManager().checkPermission(str, str2);
    }

    @ResultIgnorabilityUnspecified
    public ApplicationInfo c(String str, int i8) {
        return this.f21704a.getPackageManager().getApplicationInfo(str, i8);
    }

    public CharSequence d(String str) {
        return this.f21704a.getPackageManager().getApplicationLabel(this.f21704a.getPackageManager().getApplicationInfo(str, 0));
    }

    @ResultIgnorabilityUnspecified
    public androidx.core.util.e<CharSequence, Drawable> e(String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.f21704a.getPackageManager().getApplicationInfo(str, 0);
        return androidx.core.util.e.a(this.f21704a.getPackageManager().getApplicationLabel(applicationInfo), this.f21704a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @ResultIgnorabilityUnspecified
    public PackageInfo f(String str, int i8) {
        return this.f21704a.getPackageManager().getPackageInfo(str, i8);
    }

    public boolean g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return b.a(this.f21704a);
        }
        if (!m.i() || (nameForUid = this.f21704a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f21704a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    public final boolean h(int i8, String str) {
        if (m.d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f21704a.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i8, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f21704a.getPackageManager().getPackagesForUid(i8);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
