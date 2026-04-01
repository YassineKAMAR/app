package l2;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f24361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f24362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c2.d f24364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f24365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f24366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Double f24367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f24368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f24369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private z1.y f24370j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f24371k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f24372l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f24373m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object f24374n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Bundle f24375o = new Bundle();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f24376p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f24377q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f24378r;

    public final void A(boolean z7) {
        this.f24376p = z7;
    }

    public final void B(String str) {
        this.f24369i = str;
    }

    public final void C(Double d8) {
        this.f24367g = d8;
    }

    public final void D(String str) {
        this.f24368h = str;
    }

    public abstract void E(View view, Map<String, View> map, Map<String, View> map2);

    public void F(View view) {
    }

    public final View G() {
        return this.f24373m;
    }

    public final z1.y H() {
        return this.f24370j;
    }

    public final Object I() {
        return this.f24374n;
    }

    public final void J(Object obj) {
        this.f24374n = obj;
    }

    public final void K(z1.y yVar) {
        this.f24370j = yVar;
    }

    public View a() {
        return this.f24372l;
    }

    public final String b() {
        return this.f24366f;
    }

    public final String c() {
        return this.f24363c;
    }

    public final String d() {
        return this.f24365e;
    }

    public float e() {
        return 0.0f;
    }

    public float f() {
        return 0.0f;
    }

    public final Bundle g() {
        return this.f24375o;
    }

    public final String h() {
        return this.f24361a;
    }

    public final c2.d i() {
        return this.f24364d;
    }

    public final List<c2.d> j() {
        return this.f24362b;
    }

    public float k() {
        return this.f24378r;
    }

    public final boolean l() {
        return this.f24377q;
    }

    public final boolean m() {
        return this.f24376p;
    }

    public final String n() {
        return this.f24369i;
    }

    public final Double o() {
        return this.f24367g;
    }

    public final String p() {
        return this.f24368h;
    }

    public void q(View view) {
    }

    public boolean r() {
        return this.f24371k;
    }

    public void s() {
    }

    public final void t(String str) {
        this.f24366f = str;
    }

    public final void u(String str) {
        this.f24363c = str;
    }

    public final void v(String str) {
        this.f24365e = str;
    }

    public final void w(String str) {
        this.f24361a = str;
    }

    public final void x(c2.d dVar) {
        this.f24364d = dVar;
    }

    public final void y(List<c2.d> list) {
        this.f24362b = list;
    }

    public final void z(boolean z7) {
        this.f24377q = z7;
    }
}
