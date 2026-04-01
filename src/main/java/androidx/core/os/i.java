package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocaleList f2082a;

    i(Object obj) {
        this.f2082a = (LocaleList) obj;
    }

    @Override // androidx.core.os.h
    public Object a() {
        return this.f2082a;
    }

    public boolean equals(Object obj) {
        return this.f2082a.equals(((h) obj).a());
    }

    @Override // androidx.core.os.h
    public Locale get(int i8) {
        return this.f2082a.get(i8);
    }

    public int hashCode() {
        return this.f2082a.hashCode();
    }

    @Override // androidx.core.os.h
    public int size() {
        return this.f2082a.size();
    }

    public String toString() {
        return this.f2082a.toString();
    }
}
