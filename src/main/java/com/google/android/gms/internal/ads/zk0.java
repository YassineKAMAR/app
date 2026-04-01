package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
final class zk0 extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SSLSocketFactory f18264a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ al0 f18265b;

    zk0(al0 al0Var) {
        this.f18265b = al0Var;
    }

    private final Socket a(Socket socket) throws SocketException {
        al0 al0Var = this.f18265b;
        if (al0Var.f5322s > 0) {
            socket.setReceiveBufferSize(al0Var.f5322s);
        }
        this.f18265b.f5323t.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i8) throws IOException {
        Socket socketCreateSocket = this.f18264a.createSocket(str, i8);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i8, InetAddress inetAddress, int i9) throws IOException {
        Socket socketCreateSocket = this.f18264a.createSocket(str, i8, inetAddress, i9);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i8) throws IOException {
        Socket socketCreateSocket = this.f18264a.createSocket(inetAddress, i8);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i8, InetAddress inetAddress2, int i9) throws IOException {
        Socket socketCreateSocket = this.f18264a.createSocket(inetAddress, i8, inetAddress2, i9);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i8, boolean z7) throws IOException {
        Socket socketCreateSocket = this.f18264a.createSocket(socket, str, i8, z7);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f18264a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f18264a.getSupportedCipherSuites();
    }
}
