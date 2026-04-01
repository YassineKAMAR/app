package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.d;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f2506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f2507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f2508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f2509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f2510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f2511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f2512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f2513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f2514i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Bundle f2515j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f2516k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final int f2517l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Bundle f2518m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Fragment f2519n;

    static class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i8) {
            return new m[i8];
        }
    }

    m(Parcel parcel) {
        this.f2506a = parcel.readString();
        this.f2507b = parcel.readString();
        this.f2508c = parcel.readInt() != 0;
        this.f2509d = parcel.readInt();
        this.f2510e = parcel.readInt();
        this.f2511f = parcel.readString();
        this.f2512g = parcel.readInt() != 0;
        this.f2513h = parcel.readInt() != 0;
        this.f2514i = parcel.readInt() != 0;
        this.f2515j = parcel.readBundle();
        this.f2516k = parcel.readInt() != 0;
        this.f2518m = parcel.readBundle();
        this.f2517l = parcel.readInt();
    }

    m(Fragment fragment) {
        this.f2506a = fragment.getClass().getName();
        this.f2507b = fragment.f2340e;
        this.f2508c = fragment.f2354m;
        this.f2509d = fragment.f2363v;
        this.f2510e = fragment.f2364w;
        this.f2511f = fragment.f2365x;
        this.f2512g = fragment.A;
        this.f2513h = fragment.f2353l;
        this.f2514i = fragment.f2367z;
        this.f2515j = fragment.f2342f;
        this.f2516k = fragment.f2366y;
        this.f2517l = fragment.f2341e0.ordinal();
    }

    public Fragment b(ClassLoader classLoader, g gVar) {
        Fragment fragment;
        Bundle bundle;
        if (this.f2519n == null) {
            Bundle bundle2 = this.f2515j;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
            }
            Fragment fragmentA = gVar.a(classLoader, this.f2506a);
            this.f2519n = fragmentA;
            fragmentA.h1(this.f2515j);
            Bundle bundle3 = this.f2518m;
            if (bundle3 != null) {
                bundle3.setClassLoader(classLoader);
                fragment = this.f2519n;
                bundle = this.f2518m;
            } else {
                fragment = this.f2519n;
                bundle = new Bundle();
            }
            fragment.f2334b = bundle;
            Fragment fragment2 = this.f2519n;
            fragment2.f2340e = this.f2507b;
            fragment2.f2354m = this.f2508c;
            fragment2.f2356o = true;
            fragment2.f2363v = this.f2509d;
            fragment2.f2364w = this.f2510e;
            fragment2.f2365x = this.f2511f;
            fragment2.A = this.f2512g;
            fragment2.f2353l = this.f2513h;
            fragment2.f2367z = this.f2514i;
            fragment2.f2366y = this.f2516k;
            fragment2.f2341e0 = d.b.values()[this.f2517l];
            if (j.H) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f2519n);
            }
        }
        return this.f2519n;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2506a);
        sb.append(" (");
        sb.append(this.f2507b);
        sb.append(")}:");
        if (this.f2508c) {
            sb.append(" fromLayout");
        }
        if (this.f2510e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2510e));
        }
        String str = this.f2511f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f2511f);
        }
        if (this.f2512g) {
            sb.append(" retainInstance");
        }
        if (this.f2513h) {
            sb.append(" removing");
        }
        if (this.f2514i) {
            sb.append(" detached");
        }
        if (this.f2516k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f2506a);
        parcel.writeString(this.f2507b);
        parcel.writeInt(this.f2508c ? 1 : 0);
        parcel.writeInt(this.f2509d);
        parcel.writeInt(this.f2510e);
        parcel.writeString(this.f2511f);
        parcel.writeInt(this.f2512g ? 1 : 0);
        parcel.writeInt(this.f2513h ? 1 : 0);
        parcel.writeInt(this.f2514i ? 1 : 0);
        parcel.writeBundle(this.f2515j);
        parcel.writeInt(this.f2516k ? 1 : 0);
        parcel.writeBundle(this.f2518m);
        parcel.writeInt(this.f2517l);
    }
}
