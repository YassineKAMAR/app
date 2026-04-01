package com.amazon.a.a.l;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f3720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Intent f3723d;

    public a(Activity activity, int i8, int i9, Intent intent) {
        this.f3720a = activity;
        this.f3721b = i8;
        this.f3722c = i9;
        this.f3723d = intent;
    }

    public Activity a() {
        return this.f3720a;
    }

    public int b() {
        return this.f3721b;
    }

    public Intent c() {
        return this.f3723d;
    }

    public int d() {
        return this.f3722c;
    }

    public String toString() {
        return "ActivtyResult: [ requestCode: " + this.f3721b + ", resultCode: " + this.f3722c + ", activity: " + this.f3720a + ", intent: " + this.f3723d + "]";
    }
}
