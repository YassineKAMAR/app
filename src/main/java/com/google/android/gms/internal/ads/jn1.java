package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jn1 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j2.v f9724a;

    public jn1(Context context, View view, j2.v vVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f9724a = vVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f9724a.m(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            KeyEvent.Callback childAt = getChildAt(i8);
            if (childAt != null && (childAt instanceof fm0)) {
                arrayList.add((fm0) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((fm0) arrayList.get(i9)).destroy();
        }
    }
}
