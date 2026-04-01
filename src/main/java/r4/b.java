package r4;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import c4.e;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.common.Constants;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f25897c = {"*", "FCM", "GCM", ""};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f25898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25899b;

    public b(e eVar) {
        this.f25898a = eVar.l().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f25899b = b(eVar);
    }

    private String a(String str, String str2) {
        return "|T|" + str + f.f3944c + str2;
    }

    private static String b(e eVar) {
        String strF = eVar.q().f();
        if (strF != null) {
            return strF;
        }
        String strC = eVar.q().c();
        if (!strC.startsWith("1:") && !strC.startsWith("2:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e8) {
            Log.w("ContentValues", "Invalid key stored " + e8);
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.f25898a) {
            string = this.f25898a.getString("|S|id", null);
        }
        return string;
    }

    private String h() {
        synchronized (this.f25898a) {
            String string = this.f25898a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey publicKeyE = e(string);
            if (publicKeyE == null) {
                return null;
            }
            return c(publicKeyE);
        }
    }

    public String f() {
        synchronized (this.f25898a) {
            String strG = g();
            if (strG != null) {
                return strG;
            }
            return h();
        }
    }

    public String i() {
        synchronized (this.f25898a) {
            for (String str : f25897c) {
                String string = this.f25898a.getString(a(this.f25899b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
