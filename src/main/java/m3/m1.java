package m3;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class m1 {
    public static k1 a(Context context, String str) {
        String strConcat;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("/", -1);
        int length = strArrSplit.length;
        if (length != 1) {
            if (length == 2) {
                strConcat = strArrSplit[0];
                str2 = strArrSplit[1];
            }
            return null;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        str2 = strArrSplit[0];
        strConcat = strValueOf.concat("_preferences");
        if (!TextUtils.isEmpty(strConcat) && !TextUtils.isEmpty(str2)) {
            return new k1(strConcat, str2);
        }
        return null;
    }

    public static void b(Context context, Set set) {
        l1 l1Var = new l1(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            k1 k1VarA = a(context, str);
            if (k1VarA == null) {
                Log.d("UserMessagingPlatform", "clearKeys: unable to process key: ".concat(String.valueOf(str)));
            } else {
                l1Var.d(k1VarA.f24761a).remove(k1VarA.f24762b);
            }
        }
        l1Var.b();
    }
}
