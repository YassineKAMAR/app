package com.amazon.a.a.h;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b implements Serializable, Iterable<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f3633a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f3634b = new ArrayList();

    public void a(a aVar) {
        this.f3634b.add(aVar);
    }

    public boolean a() {
        return this.f3634b.isEmpty();
    }

    public Collection<a> b() {
        return this.f3634b;
    }

    public int c() {
        return this.f3634b.size();
    }

    @Override // java.lang.Iterable
    public Iterator<a> iterator() {
        return this.f3634b.iterator();
    }

    public String toString() {
        return "MetricBatch: [" + this.f3634b + "]";
    }
}
