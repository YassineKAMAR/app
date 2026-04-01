package io.flutter.plugin.platform;

import android.content.Context;
import android.view.MotionEvent;
import io.flutter.embedding.android.k;

/* JADX INFO: loaded from: classes.dex */
public class d extends io.flutter.embedding.android.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f22945g;

    public d(Context context, int i8, int i9, a aVar) {
        super(context, i8, i9, k.b.overlay);
        this.f22945g = aVar;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        a aVar = this.f22945g;
        if (aVar == null || !aVar.a(motionEvent, true)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }
}
