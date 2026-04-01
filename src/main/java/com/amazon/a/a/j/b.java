package com.amazon.a.a.j;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3708a = "RESPONSE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f3709b = "RESET_OFFSET";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f3710d = "RECEIPT_STRING";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f3711e = "KIWI_EXECUTION_RESULT_CODE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f3712f = "RECEIPT_DELIVERED";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f3713g = "PURCHASE_REQUEST_ID";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f3714h = "userId";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f3715i = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Object> f3716c = new HashMap();

    public Object a(String str) {
        return this.f3716c.get(str);
    }

    public void a() {
        this.f3716c.clear();
    }

    public void a(Object obj) {
        if (!f3715i && obj == null) {
            throw new AssertionError();
        }
        this.f3716c.put(f3708a, obj);
    }

    public void a(String str, Object obj) {
        this.f3716c.put(str, obj);
    }

    public boolean a(Class cls) {
        return b(f3708a) && a(f3708a).getClass().equals(cls);
    }

    public Object b() {
        return this.f3716c.get(f3708a);
    }

    public boolean b(String str) {
        return this.f3716c.containsKey(str);
    }

    public Object c(String str) {
        return this.f3716c.remove(str);
    }

    public void c() {
        this.f3716c.remove(f3708a);
    }
}
