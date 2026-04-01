package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rs {
    static List a() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, ut.c("gad:dynamite_module:experiment_id", ""));
        c(arrayList, fu.f8037a);
        c(arrayList, fu.f8038b);
        c(arrayList, fu.f8039c);
        c(arrayList, fu.f8040d);
        c(arrayList, fu.f8041e);
        c(arrayList, fu.f8057u);
        c(arrayList, fu.f8042f);
        c(arrayList, fu.f8049m);
        c(arrayList, fu.f8050n);
        c(arrayList, fu.f8051o);
        c(arrayList, fu.f8052p);
        c(arrayList, fu.f8053q);
        c(arrayList, fu.f8054r);
        c(arrayList, fu.f8055s);
        c(arrayList, fu.f8056t);
        c(arrayList, fu.f8043g);
        c(arrayList, fu.f8044h);
        c(arrayList, fu.f8045i);
        c(arrayList, fu.f8046j);
        c(arrayList, fu.f8047k);
        c(arrayList, fu.f8048l);
        return arrayList;
    }

    static List b() {
        ArrayList arrayList = new ArrayList();
        c(arrayList, uu.f15876a);
        return arrayList;
    }

    private static void c(List list, ut utVar) {
        String str = (String) utVar.e();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
