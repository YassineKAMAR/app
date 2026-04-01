package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class y13 extends t13 {
    public y13(l13 l13Var, HashSet hashSet, JSONObject jSONObject, long j8) {
        super(l13Var, hashSet, jSONObject, j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.u13
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        i03 i03VarA;
        if (!TextUtils.isEmpty(str) && (i03VarA = i03.a()) != null) {
            for (uz2 uz2Var : i03VarA.c()) {
                if (this.f14916c.contains(uz2Var.h())) {
                    uz2Var.g().f(str, this.f14918e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (c13.g(this.f14917d, this.f15443b.a())) {
            return null;
        }
        this.f15443b.e(this.f14917d);
        return this.f14917d.toString();
    }

    @Override // com.google.android.gms.internal.ads.u13, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
