package bar.status.com.statusbarsamsung;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

public class SimpleOpenGlView extends GLSurfaceView {
    private InternetRender mRender;

    public SimpleOpenGlView(Context context) {
        super(context);
        initParameters(context);
    }

    public SimpleOpenGlView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initParameters(context);
    }

    private void initParameters(Context context) {
        mRender = new InternetRender(context);
        setEGLContextClientVersion(2);
        setRenderer(mRender);
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }

    public  void  stopRender(){
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }

    public void startRender(){
        setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
    }
}
