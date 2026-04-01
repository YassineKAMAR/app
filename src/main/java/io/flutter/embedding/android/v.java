package io.flutter.embedding.android;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f22708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f22709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f22710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f22711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f22712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f22713f;

    public enum a {
        kDown(0),
        kUp(1),
        kRepeat(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f22718a;

        a(long j8) {
            this.f22718a = j8;
        }

        public long a() {
            return this.f22718a;
        }
    }

    ByteBuffer a() {
        try {
            String str = this.f22713f;
            byte[] bytes = str == null ? null : str.getBytes("UTF-8");
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(length + 48);
            byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocateDirect.putLong(length);
            byteBufferAllocateDirect.putLong(this.f22708a);
            byteBufferAllocateDirect.putLong(this.f22709b.a());
            byteBufferAllocateDirect.putLong(this.f22710c);
            byteBufferAllocateDirect.putLong(this.f22711d);
            byteBufferAllocateDirect.putLong(this.f22712e ? 1L : 0L);
            if (bytes != null) {
                byteBufferAllocateDirect.put(bytes);
            }
            return byteBufferAllocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }
}
