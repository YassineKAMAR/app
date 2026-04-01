package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w73 f18114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y83 f18115b;

    private z83(y83 y83Var) {
        v73 v73Var = v73.f16035b;
        this.f18115b = y83Var;
        this.f18114a = v73Var;
    }

    public static z83 b(int i8) {
        return new z83(new v83(4000));
    }

    public static z83 c(w73 w73Var) {
        return new z83(new t83(w73Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator g(CharSequence charSequence) {
        return this.f18115b.a(this, charSequence);
    }

    public final Iterable d(CharSequence charSequence) {
        charSequence.getClass();
        return new w83(this, charSequence);
    }

    public final List f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itG = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itG.hasNext()) {
            arrayList.add((String) itG.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
