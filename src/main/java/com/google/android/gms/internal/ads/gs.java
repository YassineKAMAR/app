package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class gs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f8483a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f8484b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f8485c = new ArrayList();

    public final List a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f8484b.iterator();
        while (it.hasNext()) {
            String str = (String) h2.y.c().b((fs) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(rs.a());
        return arrayList;
    }

    public final List b() {
        List listA = a();
        Iterator it = this.f8485c.iterator();
        while (it.hasNext()) {
            String str = (String) h2.y.c().b((fs) it.next());
            if (!TextUtils.isEmpty(str)) {
                listA.add(str);
            }
        }
        listA.addAll(rs.b());
        return listA;
    }

    public final void c(fs fsVar) {
        this.f8484b.add(fsVar);
    }

    public final void d(fs fsVar) {
        this.f8483a.add(fsVar);
    }

    public final void e(SharedPreferences.Editor editor, int i8, JSONObject jSONObject) {
        for (fs fsVar : this.f8483a) {
            if (fsVar.e() == 1) {
                fsVar.d(editor, fsVar.a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            qg0.d("Flag Json is null.");
        }
    }
}
