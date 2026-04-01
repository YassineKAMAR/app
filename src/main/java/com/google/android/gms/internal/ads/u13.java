package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes.dex */
public abstract class u13 extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v13 f15442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final l13 f15443b;

    public u13(l13 l13Var) {
        this.f15443b = l13Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        v13 v13Var = this.f15442a;
        if (v13Var != null) {
            v13Var.a(this);
        }
    }

    public final void b(v13 v13Var) {
        this.f15442a = v13Var;
    }
}
