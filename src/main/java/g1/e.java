package g1;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21884a = x0.j.f("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z7) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z7 ? 1 : 2, 1);
            x0.j jVarC = x0.j.c();
            String str = f21884a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z7 ? "enabled" : "disabled";
            jVarC.a(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e8) {
            x0.j jVarC2 = x0.j.c();
            String str2 = f21884a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z7 ? "enabled" : "disabled";
            jVarC2.a(str2, String.format("%s could not be %s", objArr2), e8);
        }
    }
}
