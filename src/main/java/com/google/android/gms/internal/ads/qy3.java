package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
final class qy3 extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ry3 f13808a;

    qy3(ry3 ry3Var) {
        this.f13808a = ry3Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) ey3.f7545c.a(this.f13808a.f14382b);
            mac.init(this.f13808a.f14383c);
            return mac;
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }
}
