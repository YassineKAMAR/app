package androidx.room;

import android.content.Context;
import androidx.room.h;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import q0.c;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.InterfaceC0159c f2799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f2800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h.d f2802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<h.b> f2803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h.c f2805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f2806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f2807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f2810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set<Integer> f2811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f2812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final File f2813o;

    public a(Context context, String str, c.InterfaceC0159c interfaceC0159c, h.d dVar, List<h.b> list, boolean z7, h.c cVar, Executor executor, Executor executor2, boolean z8, boolean z9, boolean z10, Set<Integer> set, String str2, File file) {
        this.f2799a = interfaceC0159c;
        this.f2800b = context;
        this.f2801c = str;
        this.f2802d = dVar;
        this.f2803e = list;
        this.f2804f = z7;
        this.f2805g = cVar;
        this.f2806h = executor;
        this.f2807i = executor2;
        this.f2808j = z8;
        this.f2809k = z9;
        this.f2810l = z10;
        this.f2811m = set;
        this.f2812n = str2;
        this.f2813o = file;
    }

    public boolean a(int i8, int i9) {
        Set<Integer> set;
        return !((i8 > i9) && this.f2810l) && this.f2809k && ((set = this.f2811m) == null || !set.contains(Integer.valueOf(i8)));
    }
}
