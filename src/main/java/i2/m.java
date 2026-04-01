package i2;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes.dex */
final class m extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final j2.v f22509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f22510b;

    public m(Context context, String str, String str2, String str3) {
        super(context);
        j2.v vVar = new j2.v(context, str);
        this.f22509a = vVar;
        vVar.o(str2);
        vVar.n(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f22510b) {
            return false;
        }
        this.f22509a.m(motionEvent);
        return false;
    }
}
