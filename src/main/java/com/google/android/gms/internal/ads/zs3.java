package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class zs3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList f18477a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ws3 f18478b = ws3.f16937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f18479c = null;

    public final zs3 a(sh3 sh3Var, int i8, String str, String str2) {
        ArrayList arrayList = this.f18477a;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new bt3(sh3Var, i8, str, str2, null));
        return this;
    }

    public final zs3 b(ws3 ws3Var) {
        if (this.f18477a == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.f18478b = ws3Var;
        return this;
    }

    public final zs3 c(int i8) {
        if (this.f18477a == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.f18479c = Integer.valueOf(i8);
        return this;
    }

    public final dt3 d() throws GeneralSecurityException {
        if (this.f18477a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.f18479c;
        if (num != null) {
            int iIntValue = num.intValue();
            ArrayList arrayList = this.f18477a;
            int size = arrayList.size();
            int i8 = 0;
            while (i8 < size) {
                int iA = ((bt3) arrayList.get(i8)).a();
                i8++;
                if (iA == iIntValue) {
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        dt3 dt3Var = new dt3(this.f18478b, Collections.unmodifiableList(this.f18477a), this.f18479c, null);
        this.f18477a = null;
        return dt3Var;
    }
}
