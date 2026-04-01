package a3;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Account f57a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Scope> f58b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<Scope> f59c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<y2.a<?>, z> f60d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f61e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View f62f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f63g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f64h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q3.a f65i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f66j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Account f67a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p.b<Scope> f68b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f69c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f70d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private q3.a f71e = q3.a.f25795k;

        public d a() {
            return new d(this.f67a, this.f68b, null, 0, null, this.f69c, this.f70d, this.f71e, false);
        }

        public a b(String str) {
            this.f69c = str;
            return this;
        }

        public final a c(Collection<Scope> collection) {
            if (this.f68b == null) {
                this.f68b = new p.b<>();
            }
            this.f68b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f67a = account;
            return this;
        }

        public final a e(String str) {
            this.f70d = str;
            return this;
        }
    }

    public d(Account account, Set<Scope> set, Map<y2.a<?>, z> map, int i8, View view, String str, String str2, q3.a aVar, boolean z7) {
        this.f57a = account;
        Set<Scope> setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f58b = setEmptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f60d = map;
        this.f62f = view;
        this.f61e = i8;
        this.f63g = str;
        this.f64h = str2;
        this.f65i = aVar == null ? q3.a.f25795k : aVar;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator<z> it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().f177a);
        }
        this.f59c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f57a;
    }

    public Account b() {
        Account account = this.f57a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set<Scope> c() {
        return this.f59c;
    }

    public String d() {
        return this.f63g;
    }

    public Set<Scope> e() {
        return this.f58b;
    }

    public final q3.a f() {
        return this.f65i;
    }

    public final Integer g() {
        return this.f66j;
    }

    public final String h() {
        return this.f64h;
    }

    public final void i(Integer num) {
        this.f66j = num;
    }
}
