package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import c4.e;
import com.google.firebase.components.ComponentRegistrar;
import d4.b;
import f4.c;
import f4.h;
import f4.r;
import java.util.Arrays;
import java.util.List;
import m4.d;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<c<?>> getComponents() {
        return Arrays.asList(c.e(d4.a.class).b(r.i(e.class)).b(r.i(Context.class)).b(r.i(d.class)).e(new h() { // from class: com.google.firebase.analytics.connector.internal.a
            @Override // f4.h
            public final Object a(f4.e eVar) {
                return b.a((e) eVar.a(e.class), (Context) eVar.a(Context.class), (d) eVar.a(d.class));
            }
        }).d().c(), v4.h.b("fire-analytics", "21.5.0"));
    }
}
