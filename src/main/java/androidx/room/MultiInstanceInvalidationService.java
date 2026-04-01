package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.c;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f2793a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final HashMap<Integer, String> f2794b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final RemoteCallbackList<androidx.room.b> f2795c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c.a f2796d = new b();

    class a extends RemoteCallbackList<androidx.room.b> {
        a() {
        }

        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(androidx.room.b bVar, Object obj) {
            MultiInstanceInvalidationService.this.f2794b.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    class b extends c.a {
        b() {
        }

        @Override // androidx.room.c
        public void C5(androidx.room.b bVar, int i8) {
            synchronized (MultiInstanceInvalidationService.this.f2795c) {
                MultiInstanceInvalidationService.this.f2795c.unregister(bVar);
                MultiInstanceInvalidationService.this.f2794b.remove(Integer.valueOf(i8));
            }
        }

        @Override // androidx.room.c
        public int V1(androidx.room.b bVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f2795c) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i8 = multiInstanceInvalidationService.f2793a + 1;
                multiInstanceInvalidationService.f2793a = i8;
                if (multiInstanceInvalidationService.f2795c.register(bVar, Integer.valueOf(i8))) {
                    MultiInstanceInvalidationService.this.f2794b.put(Integer.valueOf(i8), str);
                    return i8;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f2793a--;
                return 0;
            }
        }

        @Override // androidx.room.c
        public void i5(int i8, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f2795c) {
                String str = MultiInstanceInvalidationService.this.f2794b.get(Integer.valueOf(i8));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = MultiInstanceInvalidationService.this.f2795c.beginBroadcast();
                for (int i9 = 0; i9 < iBeginBroadcast; i9++) {
                    try {
                        int iIntValue = ((Integer) MultiInstanceInvalidationService.this.f2795c.getBroadcastCookie(i9)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f2794b.get(Integer.valueOf(iIntValue));
                        if (i8 != iIntValue && str.equals(str2)) {
                            try {
                                ((androidx.room.b) MultiInstanceInvalidationService.this.f2795c.getBroadcastItem(i9)).q1(strArr);
                            } catch (RemoteException e8) {
                                Log.w("ROOM", "Error invoking a remote callback", e8);
                            }
                        }
                    } finally {
                        MultiInstanceInvalidationService.this.f2795c.finishBroadcast();
                    }
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f2796d;
    }
}
