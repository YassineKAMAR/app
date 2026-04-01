package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseIntArray f3034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Parcel f3035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f3036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f3037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f3038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f3039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f3040j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f3041k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new p.a(), new p.a(), new p.a());
    }

    private b(Parcel parcel, int i8, int i9, String str, p.a<String, Method> aVar, p.a<String, Method> aVar2, p.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f3034d = new SparseIntArray();
        this.f3039i = -1;
        this.f3041k = -1;
        this.f3035e = parcel;
        this.f3036f = i8;
        this.f3037g = i9;
        this.f3040j = i8;
        this.f3038h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f3035e.writeInt(-1);
        } else {
            this.f3035e.writeInt(bArr.length);
            this.f3035e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f3035e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i8) {
        this.f3035e.writeInt(i8);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f3035e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f3035e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i8 = this.f3039i;
        if (i8 >= 0) {
            int i9 = this.f3034d.get(i8);
            int iDataPosition = this.f3035e.dataPosition();
            this.f3035e.setDataPosition(i9);
            this.f3035e.writeInt(iDataPosition - i9);
            this.f3035e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f3035e;
        int iDataPosition = parcel.dataPosition();
        int i8 = this.f3040j;
        if (i8 == this.f3036f) {
            i8 = this.f3037g;
        }
        return new b(parcel, iDataPosition, i8, this.f3038h + "  ", this.f3031a, this.f3032b, this.f3033c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f3035e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int i8 = this.f3035e.readInt();
        if (i8 < 0) {
            return null;
        }
        byte[] bArr = new byte[i8];
        this.f3035e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f3035e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i8) {
        while (this.f3040j < this.f3037g) {
            int i9 = this.f3041k;
            if (i9 == i8) {
                return true;
            }
            if (String.valueOf(i9).compareTo(String.valueOf(i8)) > 0) {
                return false;
            }
            this.f3035e.setDataPosition(this.f3040j);
            int i10 = this.f3035e.readInt();
            this.f3041k = this.f3035e.readInt();
            this.f3040j += i10;
        }
        return this.f3041k == i8;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f3035e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T q() {
        return (T) this.f3035e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f3035e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i8) {
        a();
        this.f3039i = i8;
        this.f3034d.put(i8, this.f3035e.dataPosition());
        E(0);
        E(i8);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z7) {
        this.f3035e.writeInt(z7 ? 1 : 0);
    }
}
