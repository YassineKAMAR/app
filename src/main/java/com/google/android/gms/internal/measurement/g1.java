package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public final class g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Method f18711b = e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Method f18712c = d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JobScheduler f18713a;

    private g1(JobScheduler jobScheduler) {
        this.f18713a = jobScheduler;
    }

    private static int a() {
        Method method = f18712c;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, new Object[0]);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e8) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e8);
                }
            }
        }
        return 0;
    }

    private final int b(JobInfo jobInfo, String str, int i8, String str2) {
        Method method = f18711b;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(this.f18713a, jobInfo, str, Integer.valueOf(i8), str2);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e8) {
                Log.e(str2, "error calling scheduleAsPackage", e8);
            }
        }
        return this.f18713a.schedule(jobInfo);
    }

    public static int c(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) u3.h.i((JobScheduler) context.getSystemService("jobscheduler"));
        return (f18711b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) ? jobScheduler.schedule(jobInfo) : new g1(jobScheduler).b(jobInfo, str, a(), str2);
    }

    private static Method d() {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No myUserId method available");
            return null;
        }
    }

    private static Method e() {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            return null;
        }
    }
}
