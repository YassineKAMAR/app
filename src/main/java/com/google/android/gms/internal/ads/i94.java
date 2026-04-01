package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class i94 extends ji3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f9111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final DatagramPacket f9112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Uri f9113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private DatagramSocket f9114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MulticastSocket f9115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InetAddress f9116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f9117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f9118l;

    public i94(int i8) {
        super(true);
        byte[] bArr = new byte[2000];
        this.f9111e = bArr;
        this.f9112f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.gms.internal.ads.wl4
    public final int H(byte[] bArr, int i8, int i9) throws h94 {
        if (i9 == 0) {
            return 0;
        }
        if (this.f9118l == 0) {
            try {
                DatagramSocket datagramSocket = this.f9114h;
                datagramSocket.getClass();
                datagramSocket.receive(this.f9112f);
                int length = this.f9112f.getLength();
                this.f9118l = length;
                F(length);
            } catch (SocketTimeoutException e8) {
                throw new h94(e8, 2002);
            } catch (IOException e9) {
                throw new h94(e9, 2001);
            }
        }
        int length2 = this.f9112f.getLength();
        int i10 = this.f9118l;
        int iMin = Math.min(i10, i9);
        System.arraycopy(this.f9111e, length2 - i10, bArr, i8, iMin);
        this.f9118l -= iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final long b(ut3 ut3Var) throws h94 {
        Uri uri = ut3Var.f15867a;
        this.f9113g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f9113g.getPort();
        d(ut3Var);
        try {
            this.f9116j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f9116j, port);
            if (this.f9116j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f9115i = multicastSocket;
                multicastSocket.joinGroup(this.f9116j);
                this.f9114h = this.f9115i;
            } else {
                this.f9114h = new DatagramSocket(inetSocketAddress);
            }
            this.f9114h.setSoTimeout(8000);
            this.f9117k = true;
            e(ut3Var);
            return -1L;
        } catch (IOException e8) {
            throw new h94(e8, 2001);
        } catch (SecurityException e9) {
            throw new h94(e9, 2006);
        }
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final Uri l() {
        return this.f9113g;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final void p() {
        this.f9113g = null;
        MulticastSocket multicastSocket = this.f9115i;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f9116j;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f9115i = null;
        }
        DatagramSocket datagramSocket = this.f9114h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f9114h = null;
        }
        this.f9116j = null;
        this.f9118l = 0;
        if (this.f9117k) {
            this.f9117k = false;
            c();
        }
    }
}
