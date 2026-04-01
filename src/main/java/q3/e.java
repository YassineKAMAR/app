package q3;

import com.google.android.gms.common.api.Scope;
import y2.a;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.g<r3.a> f25805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.g<r3.a> f25806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a.AbstractC0191a<r3.a, a> f25807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final a.AbstractC0191a<r3.a, d> f25808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Scope f25809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Scope f25810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final y2.a<a> f25811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y2.a<d> f25812h;

    static {
        a.g<r3.a> gVar = new a.g<>();
        f25805a = gVar;
        a.g<r3.a> gVar2 = new a.g<>();
        f25806b = gVar2;
        b bVar = new b();
        f25807c = bVar;
        c cVar = new c();
        f25808d = cVar;
        f25809e = new Scope("profile");
        f25810f = new Scope("email");
        f25811g = new y2.a<>("SignIn.API", bVar, gVar);
        f25812h = new y2.a<>("SignIn.INTERNAL_API", cVar, gVar2);
    }
}
