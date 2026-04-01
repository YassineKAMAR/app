package m3;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f24771b = new HashMap();

    public l1(Context context) {
        this.f24770a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences.Editor d(String str) {
        if (!this.f24771b.containsKey(str)) {
            this.f24771b.put(str, this.f24770a.getSharedPreferences(str, 0).edit());
        }
        return (SharedPreferences.Editor) this.f24771b.get(str);
    }

    public final void b() {
        Iterator it = this.f24771b.values().iterator();
        while (it.hasNext()) {
            ((SharedPreferences.Editor) it.next()).apply();
        }
    }

    public final boolean c(String str, Object obj) {
        String str2;
        float fFloatValue;
        k1 k1VarA = m1.a(this.f24770a, str);
        if (k1VarA == null) {
            return false;
        }
        SharedPreferences.Editor editorD = d(k1VarA.f24761a);
        if (obj instanceof Integer) {
            editorD.putInt(k1VarA.f24762b, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof Long) {
            editorD.putLong(k1VarA.f24762b, ((Long) obj).longValue());
            return true;
        }
        if (obj instanceof Double) {
            str2 = k1VarA.f24762b;
            fFloatValue = ((Double) obj).floatValue();
        } else {
            if (!(obj instanceof Float)) {
                if (obj instanceof Boolean) {
                    editorD.putBoolean(k1VarA.f24762b, ((Boolean) obj).booleanValue());
                    return true;
                }
                if (!(obj instanceof String)) {
                    return false;
                }
                editorD.putString(k1VarA.f24762b, (String) obj);
                return true;
            }
            str2 = k1VarA.f24762b;
            fFloatValue = ((Float) obj).floatValue();
        }
        editorD.putFloat(str2, fFloatValue);
        return true;
    }
}
