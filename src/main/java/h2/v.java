package h2;

import com.google.android.gms.internal.ads.jg0;
import com.google.android.gms.internal.ads.n80;
import com.google.android.gms.internal.ads.ux;
import com.google.android.gms.internal.ads.vc0;
import com.google.android.gms.internal.ads.vx;
import com.google.android.gms.internal.ads.wg0;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final v f22306f = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jg0 f22307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f22308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wg0 f22310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Random f22311e;

    protected v() {
        jg0 jg0Var = new jg0();
        t tVar = new t(new q4(), new o4(), new q3(), new ux(), new vc0(), new n80(), new vx());
        String strH = jg0.h();
        wg0 wg0Var = new wg0(0, 233702000, true, false, false);
        Random random = new Random();
        this.f22307a = jg0Var;
        this.f22308b = tVar;
        this.f22309c = strH;
        this.f22310d = wg0Var;
        this.f22311e = random;
    }

    public static t a() {
        return f22306f.f22308b;
    }

    public static jg0 b() {
        return f22306f.f22307a;
    }

    public static wg0 c() {
        return f22306f.f22310d;
    }

    public static String d() {
        return f22306f.f22309c;
    }

    public static Random e() {
        return f22306f.f22311e;
    }
}
