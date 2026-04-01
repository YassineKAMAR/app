package com.amazon.c.a.a;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f4087a = String.format("A valid instance of %s is required to have at least one non-blank ID, either developerId or certificateId, and at least one non-blank name, either developerName or commonName.", e.class.getSimpleName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4088b = String.format("A valid instance of %s is required to have a certificate ID.", e.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f4089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f4090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f4091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f4092f;

    public static String a() {
        return f4087a;
    }

    public static String b() {
        return f4088b;
    }

    public e a(String str) {
        this.f4089c = str;
        return this;
    }

    public void b(String str) {
        this.f4089c = str;
    }

    public e c(String str) {
        this.f4090d = str;
        return this;
    }

    public boolean c() {
        return (StringUtils.isBlank(e()) || StringUtils.isBlank(f())) ? false : true;
    }

    public void d(String str) {
        this.f4090d = str;
    }

    public boolean d() {
        return !StringUtils.isBlank(e());
    }

    public e e(String str) {
        this.f4091e = str;
        return this;
    }

    public String e() {
        return StringUtils.isBlank(this.f4091e) ? this.f4089c : this.f4091e;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return new EqualsBuilder().append(this.f4091e, eVar.f4091e).append(this.f4092f, eVar.f4092f).append(this.f4089c, eVar.f4089c).append(this.f4090d, eVar.f4090d).isEquals();
    }

    public String f() {
        return StringUtils.isBlank(this.f4092f) ? this.f4090d : this.f4092f;
    }

    public void f(String str) {
        this.f4091e = str;
    }

    public e g(String str) {
        this.f4092f = str;
        return this;
    }

    public String g() {
        return this.f4089c;
    }

    public String h() {
        return this.f4090d;
    }

    public void h(String str) {
        this.f4092f = str;
    }

    public int hashCode() {
        return new HashCodeBuilder().append(this.f4091e).append(this.f4092f).append(this.f4089c).append(this.f4090d).toHashCode();
    }

    public String i() {
        return this.f4091e;
    }

    public String j() {
        return this.f4092f;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
