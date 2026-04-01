package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public interface ch {
    void a(View view);

    void b(StackTraceElement[] stackTraceElementArr);

    String c(Context context);

    @Deprecated
    void d(int i8, int i9, int i10);

    String e(Context context, String str, View view, Activity activity);

    void f(MotionEvent motionEvent);

    String g(Context context, View view, Activity activity);

    String h(Context context, String str, View view);
}
