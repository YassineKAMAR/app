package io.flutter.view;

import android.graphics.SurfaceTexture;
import android.media.Image;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
public interface TextureRegistry {

    @Keep
    public interface ImageTextureEntry {
        Image acquireLatestImage();

        long id();

        void pushImage(Image image);

        void release();
    }

    public interface a {
        void a();
    }

    public interface b {
        void onTrimMemory(int i8);
    }

    public interface c {
        void a(b bVar);

        SurfaceTexture b();

        void c(a aVar);

        long id();
    }

    ImageTextureEntry a();

    c b();
}
