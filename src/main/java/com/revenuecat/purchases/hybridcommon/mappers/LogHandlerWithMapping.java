package com.revenuecat.purchases.hybridcommon.mappers;

import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import e6.i0;
import e6.x;
import f6.k0;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.q;
import p6.l;

/* JADX INFO: loaded from: classes.dex */
public final class LogHandlerWithMapping implements LogHandler {
    private final l<Map<String, String>, i0> callback;

    /* JADX WARN: Multi-variable type inference failed */
    public LogHandlerWithMapping(l<? super Map<String, String>, i0> callback) {
        q.f(callback, "callback");
        this.callback = callback;
    }

    private final void invokeCallback(LogLevel logLevel, String str) {
        l<Map<String, String>, i0> lVar = this.callback;
        String upperCase = logLevel.name().toUpperCase(Locale.ROOT);
        q.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        lVar.invoke(k0.g(x.a("logLevel", upperCase), x.a("message", str)));
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void d(String tag, String msg) {
        q.f(tag, "tag");
        q.f(msg, "msg");
        invokeCallback(LogLevel.DEBUG, msg);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void e(String tag, String msg, Throwable th) {
        q.f(tag, "tag");
        q.f(msg, "msg");
        if (th != null) {
            String str = msg + ". Throwable: " + th;
            if (str != null) {
                msg = str;
            }
        }
        invokeCallback(LogLevel.ERROR, msg);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void i(String tag, String msg) {
        q.f(tag, "tag");
        q.f(msg, "msg");
        invokeCallback(LogLevel.INFO, msg);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void v(String tag, String msg) {
        q.f(tag, "tag");
        q.f(msg, "msg");
        invokeCallback(LogLevel.VERBOSE, msg);
    }

    @Override // com.revenuecat.purchases.LogHandler
    public void w(String tag, String msg) {
        q.f(tag, "tag");
        q.f(msg, "msg");
        invokeCallback(LogLevel.WARN, msg);
    }
}
