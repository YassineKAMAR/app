package g2;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class n implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f21977a;

    n(s sVar) {
        this.f21977a = sVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        s sVar = this.f21977a;
        if (sVar.f21993h == null) {
            return false;
        }
        sVar.f21993h.d(motionEvent);
        return false;
    }
}
