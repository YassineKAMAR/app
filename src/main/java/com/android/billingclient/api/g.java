package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f4527a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f4528a = new HashSet();

        public a a(int i8) {
            this.f4528a.add(Integer.valueOf(i8));
            return this;
        }

        public g b() {
            return new g(this.f4528a, null);
        }
    }

    /* synthetic */ g(Set set, j1.k0 k0Var) {
        this.f4527a = new ArrayList(Collections.unmodifiableList(new ArrayList(set)));
    }

    public static a a() {
        return new a();
    }

    final ArrayList b() {
        return this.f4527a;
    }
}
