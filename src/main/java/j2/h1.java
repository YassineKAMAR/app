package j2;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class h1 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ i1 f23976b;

    public h1(i1 i1Var, String str) {
        this.f23976b = i1Var;
        this.f23975a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f23976b) {
            for (g1 g1Var : this.f23976b.f23979b) {
                String str2 = this.f23975a;
                Map map = g1Var.f23970a;
                if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                    g2.t.q().h().B(false);
                }
            }
        }
    }
}
