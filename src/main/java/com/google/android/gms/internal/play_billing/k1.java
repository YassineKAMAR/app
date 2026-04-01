package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.k1;
import com.google.android.gms.internal.play_billing.n1;

/* JADX INFO: loaded from: classes.dex */
public class k1<MessageType extends n1<MessageType, BuilderType>, BuilderType extends k1<MessageType, BuilderType>> extends w<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n1 f19607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected n1 f19608b;

    protected k1(MessageType messagetype) {
        this.f19607a = messagetype;
        if (messagetype.t()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f19608b = messagetype.g();
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final k1 clone() {
        k1 k1Var = (k1) this.f19607a.u(5, null, null);
        k1Var.f19608b = m();
        return k1Var;
    }

    public final MessageType h() {
        MessageType messagetype = (MessageType) m();
        if (messagetype.r()) {
            return messagetype;
        }
        throw new s3(messagetype);
    }

    @Override // com.google.android.gms.internal.play_billing.q2
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public MessageType m() {
        if (!this.f19608b.t()) {
            return (MessageType) this.f19608b;
        }
        this.f19608b.l();
        return (MessageType) this.f19608b;
    }

    protected final void l() {
        if (this.f19608b.t()) {
            return;
        }
        o();
    }

    protected void o() {
        n1 n1VarG = this.f19607a.g();
        z2.a().b(n1VarG.getClass()).e(n1VarG, this.f19608b);
        this.f19608b = n1VarG;
    }
}
