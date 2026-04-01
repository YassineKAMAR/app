package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class x13 extends t13 {
    public x13(l13 l13Var, HashSet hashSet, JSONObject jSONObject, long j8) {
        super(l13Var, hashSet, jSONObject, j8);
    }

    private final void c(String str) {
        i03 i03VarA = i03.a();
        if (i03VarA != null) {
            for (uz2 uz2Var : i03VarA.c()) {
                if (this.f14916c.contains(uz2Var.h())) {
                    uz2Var.g().d(str, this.f14918e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.u13
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        c(str);
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f14917d.toString();
    }

    @Override // com.google.android.gms.internal.ads.u13, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        c(str);
        super.onPostExecute(str);
    }
}
