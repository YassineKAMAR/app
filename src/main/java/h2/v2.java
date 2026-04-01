package h2;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.qg0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Date f22320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f22321h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f22324k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f22325l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f22327n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f22328o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet f22314a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bundle f22315b = new Bundle();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f22316c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet f22317d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bundle f22318e = new Bundle();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet f22319f = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f22322i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f22323j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f22326m = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f22329p = 60000;

    public final void A(String str) {
        this.f22317d.add(str);
    }

    public final void B(String str) {
        this.f22317d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    @Deprecated
    public final void C(Date date) {
        this.f22320g = date;
    }

    public final void D(String str) {
        this.f22321h = str;
    }

    @Deprecated
    public final void a(int i8) {
        this.f22323j = i8;
    }

    public final void b(int i8) {
        this.f22329p = i8;
    }

    @Deprecated
    public final void c(boolean z7) {
        this.f22327n = z7;
    }

    public final void d(List list) {
        this.f22322i.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                qg0.g("neighboring content URL should not be null or empty");
            } else {
                this.f22322i.add(str);
            }
        }
    }

    public final void e(String str) {
        this.f22324k = str;
    }

    public final void f(String str) {
        this.f22325l = str;
    }

    @Deprecated
    public final void g(boolean z7) {
        this.f22326m = z7 ? 1 : 0;
    }

    public final void x(String str, String str2) {
        this.f22318e.putString(str, str2);
    }

    public final void y(String str) {
        this.f22314a.add(str);
    }

    public final void z(Class cls, Bundle bundle) {
        this.f22315b.putBundle(cls.getName(), bundle);
    }
}
