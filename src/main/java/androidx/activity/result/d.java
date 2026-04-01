package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IntentSender f351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f354d;

    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i8) {
            return new d[i8];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IntentSender f355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Intent f356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f358d;

        public b(PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }

        public b(IntentSender intentSender) {
            this.f355a = intentSender;
        }

        public d a() {
            return new d(this.f355a, this.f356b, this.f357c, this.f358d);
        }
    }

    d(IntentSender intentSender, Intent intent, int i8, int i9) {
        this.f351a = intentSender;
        this.f352b = intent;
        this.f353c = i8;
        this.f354d = i9;
    }

    d(Parcel parcel) {
        this.f351a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f352b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f353c = parcel.readInt();
        this.f354d = parcel.readInt();
    }

    public Intent b() {
        return this.f352b;
    }

    public int c() {
        return this.f353c;
    }

    public int d() {
        return this.f354d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IntentSender e() {
        return this.f351a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(this.f351a, i8);
        parcel.writeParcelable(this.f352b, i8);
        parcel.writeInt(this.f353c);
        parcel.writeInt(this.f354d);
    }
}
