package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class un0 extends MutableContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f15777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f15778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f15779c;

    public un0(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final Activity a() {
        return this.f15777a;
    }

    public final Context b() {
        return this.f15779c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f15779c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f15778b = applicationContext;
        this.f15777a = context instanceof Activity ? (Activity) context : null;
        this.f15779c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f15777a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f15778b.startActivity(intent);
        }
    }
}
