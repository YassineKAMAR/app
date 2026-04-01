package v2;

import a3.o;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.revenuecat.purchases.common.Constants;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lock f26844c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f26845d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lock f26846a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f26847b;

    a(Context context) {
        this.f26847b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        o.j(context);
        Lock lock = f26844c;
        lock.lock();
        try {
            if (f26845d == null) {
                f26845d = new a(context.getApplicationContext());
            }
            a aVar = f26845d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f26844c.unlock();
            throw th;
        }
    }

    private static final String d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        sb.append(str2);
        return sb.toString();
    }

    public GoogleSignInAccount b() {
        String strC;
        String strC2 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strC2) || (strC = c(d("googleSignInAccount", strC2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.B(strC);
        } catch (JSONException unused) {
            return null;
        }
    }

    protected final String c(String str) {
        this.f26846a.lock();
        try {
            return this.f26847b.getString(str, null);
        } finally {
            this.f26846a.unlock();
        }
    }
}
