package a4;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b8 : bArr) {
            int i8 = b8 & 255;
            sb.append("0123456789abcdef".charAt(i8 / 16));
            sb.append("0123456789abcdef".charAt(i8 % 16));
        }
        return sb.toString();
    }
}
