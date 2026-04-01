package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.mf;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class t6 implements Callable<List<na>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f20503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f20504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ a6 f20505c;

    t6(a6 a6Var, lb lbVar, Bundle bundle) {
        this.f20505c = a6Var;
        this.f20503a = lbVar;
        this.f20504b = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<na> call() {
        this.f20505c.f19787a.o0();
        va vaVar = this.f20505c.f19787a;
        lb lbVar = this.f20503a;
        Bundle bundle = this.f20504b;
        vaVar.u().i();
        if (!mf.a() || !vaVar.c0().B(lbVar.f20210a, e0.L0) || lbVar.f20210a == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    vaVar.t().G().a("Uri sources and timestamps do not match");
                } else {
                    for (int i8 = 0; i8 < intArray.length; i8++) {
                        m mVarE0 = vaVar.e0();
                        String str = lbVar.f20210a;
                        int i9 = intArray[i8];
                        long j8 = longArray[i8];
                        a3.o.f(str);
                        mVarE0.i();
                        mVarE0.s();
                        try {
                            int iDelete = mVarE0.B().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i9), String.valueOf(j8)});
                            mVarE0.t().K().d("Pruned " + iDelete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i9), Long.valueOf(j8));
                        } catch (SQLiteException e8) {
                            mVarE0.t().G().c("Error pruning trigger URIs. appId", n4.v(str), e8);
                        }
                    }
                }
            }
        }
        return vaVar.e0().K0(lbVar.f20210a);
    }
}
