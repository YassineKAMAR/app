package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ac2 implements ni2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h2.w4 f5198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f5199c;

    public ac2(Context context, h2.w4 w4Var, List list) {
        this.f5197a = context;
        this.f5198b = w4Var;
        this.f5199c = list;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        Bundle bundle = (Bundle) obj;
        if (((Boolean) nu.f12260a.e()).booleanValue()) {
            Bundle bundle2 = new Bundle();
            g2.t.r();
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.f5197a.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && (componentName = runningTaskInfo.topActivity) != null) {
                    className = componentName.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle2.putString("activity", className);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("width", this.f5198b.f22355e);
            bundle3.putInt("height", this.f5198b.f22352b);
            bundle2.putBundle("size", bundle3);
            if (!this.f5199c.isEmpty()) {
                List list = this.f5199c;
                bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
