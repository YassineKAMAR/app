package a6;

import android.util.Log;
import l5.a;

/* JADX INFO: loaded from: classes.dex */
public final class j implements l5.a, m5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i f237a;

    @Override // m5.a
    public void onAttachedToActivity(m5.c cVar) {
        i iVar = this.f237a;
        if (iVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            iVar.l(cVar.g());
        }
    }

    @Override // l5.a
    public void onAttachedToEngine(a.b bVar) {
        this.f237a = new i(bVar.a());
        g.g(bVar.b(), this.f237a);
    }

    @Override // m5.a
    public void onDetachedFromActivity() {
        i iVar = this.f237a;
        if (iVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            iVar.l(null);
        }
    }

    @Override // m5.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // l5.a
    public void onDetachedFromEngine(a.b bVar) {
        if (this.f237a == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
        } else {
            g.g(bVar.b(), null);
            this.f237a = null;
        }
    }

    @Override // m5.a
    public void onReattachedToActivityForConfigChanges(m5.c cVar) {
        onAttachedToActivity(cVar);
    }
}
