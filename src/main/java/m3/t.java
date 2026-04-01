package m3;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import t3.c;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final c2 f24816d = c2.x("IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f24817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f24818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f24819c;

    t(Application application) {
        this.f24817a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.f24818b = sharedPreferences;
        this.f24819c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.emptySet()));
    }

    public final int a() {
        return this.f24818b.getInt("consent_status", 0);
    }

    public final Map b() {
        String strValueOf;
        String str;
        String string;
        Application application = this.f24817a;
        Set<String> stringSet = this.f24818b.getStringSet("stored_info", c2.w());
        if (stringSet.isEmpty()) {
            stringSet = f24816d;
        }
        HashMap map = new HashMap();
        for (String str2 : stringSet) {
            k1 k1VarA = m1.a(application, str2);
            if (k1VarA == null) {
                strValueOf = String.valueOf(str2);
                str = "Fetching request info: failed for key: ";
            } else {
                Object obj = application.getSharedPreferences(k1VarA.f24761a, 0).getAll().get(k1VarA.f24762b);
                if (obj == null) {
                    strValueOf = String.valueOf(str2);
                    str = "Stored info not exists: ";
                } else {
                    if (obj instanceof Boolean) {
                        string = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        string = obj.toString();
                    } else if (obj instanceof String) {
                        string = (String) obj;
                    } else {
                        strValueOf = String.valueOf(str2);
                        str = "Failed to fetch stored info: ";
                    }
                    map.put(str2, string);
                }
            }
            Log.d("UserMessagingPlatform", str.concat(strValueOf));
        }
        return map;
    }

    public final Set c() {
        return this.f24819c;
    }

    public final void d() {
        m1.b(this.f24817a, this.f24819c);
        this.f24819c.clear();
        this.f24818b.edit().remove("stored_info").remove("consent_status").remove("consent_type").apply();
    }

    public final void e() {
        this.f24818b.edit().putStringSet("written_values", this.f24819c).apply();
    }

    public final void f(int i8) {
        this.f24818b.edit().putInt("consent_status", i8).apply();
    }

    public final void g(c.EnumC0176c enumC0176c) {
        this.f24818b.edit().putString("privacy_options_requirement_status", enumC0176c.name()).apply();
    }

    public final void h(Set set) {
        this.f24818b.edit().putStringSet("stored_info", set).apply();
    }
}
