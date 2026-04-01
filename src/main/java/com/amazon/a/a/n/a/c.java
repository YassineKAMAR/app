package com.amazon.a.a.n.a;

import android.os.Binder;
import android.os.RemoteException;
import com.amazon.d.a.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RemoteException f3779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f3780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.amazon.d.a.h f3781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.amazon.d.a.f f3782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.amazon.d.a.g f3783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f3784g = Binder.getCallingUid();

    public c(com.amazon.d.a.f fVar) {
        this.f3782e = fVar;
        try {
            this.f3778a = fVar.a();
        } catch (RemoteException e8) {
            this.f3779b = e8;
        }
    }

    public c(com.amazon.d.a.g gVar) {
        this.f3783f = gVar;
    }

    public c(com.amazon.d.a.h hVar) {
        this.f3781d = hVar;
        try {
            this.f3778a = hVar.a();
        } catch (RemoteException e8) {
            this.f3779b = e8;
        }
    }

    public c(j jVar) {
        this.f3780c = jVar;
        try {
            this.f3778a = jVar.a();
        } catch (RemoteException e8) {
            this.f3779b = e8;
        }
    }

    public String a() throws RemoteException {
        RemoteException remoteException = this.f3779b;
        if (remoteException == null) {
            return this.f3778a;
        }
        throw remoteException;
    }

    public j b() {
        return this.f3780c;
    }

    public com.amazon.d.a.h c() {
        return this.f3781d;
    }

    public com.amazon.d.a.f d() {
        return this.f3782e;
    }

    public com.amazon.d.a.g e() {
        return this.f3783f;
    }

    public int f() {
        return this.f3784g;
    }

    public String toString() {
        return "CommandResult: [CallingUid: " + this.f3784g + ", SuccessResult: " + this.f3780c + ", FailureResult: " + this.f3781d + ", DecisionResult: " + this.f3782e + ", ExceptionResult: " + this.f3783f + "]";
    }
}
