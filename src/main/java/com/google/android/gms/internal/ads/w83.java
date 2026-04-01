package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class w83 implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ CharSequence f16655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ z83 f16656b;

    w83(z83 z83Var, CharSequence charSequence) {
        this.f16656b = z83Var;
        this.f16655a = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f16656b.g(this.f16655a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        a83.b(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
