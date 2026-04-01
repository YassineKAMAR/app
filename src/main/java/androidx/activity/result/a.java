package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0008a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f350b;

    /* JADX INFO: renamed from: androidx.activity.result.a$a, reason: collision with other inner class name */
    class C0008a implements Parcelable.Creator<a> {
        C0008a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(int i8, Intent intent) {
        this.f349a = i8;
        this.f350b = intent;
    }

    a(Parcel parcel) {
        this.f349a = parcel.readInt();
        this.f350b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public static String d(int i8) {
        return i8 != -1 ? i8 != 0 ? String.valueOf(i8) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent b() {
        return this.f350b;
    }

    public int c() {
        return this.f349a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + d(this.f349a) + ", data=" + this.f350b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f349a);
        parcel.writeInt(this.f350b == null ? 0 : 1);
        Intent intent = this.f350b;
        if (intent != null) {
            intent.writeToParcel(parcel, i8);
        }
    }
}
