package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class t74 implements Iterator, Closeable, id {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final hd f14992g = new s74("eof ");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a84 f14993h = a84.b(t74.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ed f14994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected u74 f14995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    hd f14996c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f14997d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f14998e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f14999f = new ArrayList();

    public void close() {
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final hd next() {
        hd hdVarA;
        hd hdVar = this.f14996c;
        if (hdVar != null && hdVar != f14992g) {
            this.f14996c = null;
            return hdVar;
        }
        u74 u74Var = this.f14995b;
        if (u74Var == null || this.f14997d >= this.f14998e) {
            this.f14996c = f14992g;
            throw new NoSuchElementException();
        }
        try {
            synchronized (u74Var) {
                this.f14995b.b(this.f14997d);
                hdVarA = this.f14994a.a(this.f14995b, this);
                this.f14997d = this.f14995b.k();
            }
            return hdVarA;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List h() {
        return (this.f14995b == null || this.f14996c == f14992g) ? this.f14999f : new z74(this.f14999f, this);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        hd hdVar = this.f14996c;
        if (hdVar == f14992g) {
            return false;
        }
        if (hdVar != null) {
            return true;
        }
        try {
            this.f14996c = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f14996c = f14992g;
            return false;
        }
    }

    public final void o(u74 u74Var, long j8, ed edVar) {
        this.f14995b = u74Var;
        this.f14997d = u74Var.k();
        u74Var.b(u74Var.k() + j8);
        this.f14998e = u74Var.k();
        this.f14994a = edVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i8 = 0; i8 < this.f14999f.size(); i8++) {
            if (i8 > 0) {
                sb.append(";");
            }
            sb.append(((hd) this.f14999f.get(i8)).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
