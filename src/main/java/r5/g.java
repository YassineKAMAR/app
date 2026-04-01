package r5;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import s5.k;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.k f25939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f25940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.c f25941c;

    class a implements k.c {
        a() {
        }

        @Override // s5.k.c
        public void onMethodCall(s5.j jVar, k.d dVar) {
            if (g.this.f25940b == null) {
                return;
            }
            String str = jVar.f26252a;
            str.hashCode();
            if (!str.equals("Localization.getStringResource")) {
                dVar.c();
                return;
            }
            JSONObject jSONObject = (JSONObject) jVar.b();
            try {
                dVar.a(g.this.f25940b.a(jSONObject.getString(SubscriberAttributeKt.JSON_NAME_KEY), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
            } catch (JSONException e8) {
                dVar.b("error", e8.getMessage(), null);
            }
        }
    }

    public interface b {
        String a(String str, String str2);
    }

    public g(h5.a aVar) {
        a aVar2 = new a();
        this.f25941c = aVar2;
        s5.k kVar = new s5.k(aVar, "flutter/localization", s5.g.f26251a);
        this.f25939a = kVar;
        kVar.e(aVar2);
    }

    public void b(List<Locale> list) {
        g5.b.f("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale locale : list) {
            g5.b.f("LocalizationChannel", "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(locale.getScript());
            arrayList.add(locale.getVariant());
        }
        this.f25939a.c("setLocale", arrayList);
    }

    public void c(b bVar) {
        this.f25940b = bVar;
    }
}
