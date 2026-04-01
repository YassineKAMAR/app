package h2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import z1.v;

/* JADX INFO: loaded from: classes.dex */
public final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bundle f22281a = new Bundle();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f22282b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22283c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22284d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bundle f22285e = new Bundle();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bundle f22286f = new Bundle();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f22287g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22288h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f22289i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f22290j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f22291k = 60000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f22292l = v.b.DEFAULT.a();

    public final r4 a() {
        Bundle bundle = this.f22285e;
        Bundle bundle2 = this.f22281a;
        Bundle bundle3 = this.f22286f;
        return new r4(8, -1L, bundle2, -1, this.f22282b, this.f22283c, this.f22284d, false, null, null, null, null, bundle, bundle3, this.f22287g, null, null, false, null, this.f22288h, this.f22289i, this.f22290j, this.f22291k, null, this.f22292l);
    }

    public final s4 b(Bundle bundle) {
        this.f22281a = bundle;
        return this;
    }

    public final s4 c(int i8) {
        this.f22291k = i8;
        return this;
    }

    public final s4 d(boolean z7) {
        this.f22283c = z7;
        return this;
    }

    public final s4 e(List list) {
        this.f22282b = list;
        return this;
    }

    public final s4 f(String str) {
        this.f22289i = str;
        return this;
    }

    public final s4 g(int i8) {
        this.f22284d = i8;
        return this;
    }

    public final s4 h(int i8) {
        this.f22288h = i8;
        return this;
    }
}
