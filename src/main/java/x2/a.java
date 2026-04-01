package x2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f27231a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockingQueue f27232b = new LinkedBlockingQueue();

    @ResultIgnorabilityUnspecified
    public IBinder a(long j8, TimeUnit timeUnit) throws TimeoutException {
        a3.o.i("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f27231a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f27231a = true;
        IBinder iBinder = (IBinder) this.f27232b.poll(j8, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f27232b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
