package u1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes.dex */
public class d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v1.d f26645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f26646c;

    public d(Context context, v1.d dVar, f fVar) {
        this.f26644a = context;
        this.f26645b = dVar;
        this.f26646c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i8, int i9) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i10 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i8) {
                return i10 >= i9;
            }
        }
        return false;
    }

    @Override // u1.x
    public void a(n1.o oVar, int i8, boolean z7) {
        ComponentName componentName = new ComponentName(this.f26644a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f26644a.getSystemService("jobscheduler");
        int iC = c(oVar);
        if (!z7 && d(jobScheduler, iC, i8)) {
            r1.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long jK = this.f26645b.K(oVar);
        JobInfo.Builder builderC = this.f26646c.c(new JobInfo.Builder(iC, componentName), oVar.d(), jK, i8);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i8);
        persistableBundle.putString("backendName", oVar.b());
        persistableBundle.putInt("priority", y1.a.a(oVar.d()));
        if (oVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        r1.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(iC), Long.valueOf(this.f26646c.g(oVar.d(), jK, i8)), Long.valueOf(jK), Integer.valueOf(i8));
        jobScheduler.schedule(builderC.build());
    }

    @Override // u1.x
    public void b(n1.o oVar, int i8) {
        a(oVar, i8, false);
    }

    int c(n1.o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f26644a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(y1.a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }
}
