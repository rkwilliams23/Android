import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GameManager extends SurfaceView implements SurfaceHolder.Callback {
  
  private MainThread thread;
  
  public GameManager(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

@Override
  public void surfaceCreated(SurfaceHolder holder) {
    thread = new MainThread(holder, gameManager: this);
    thread.setRunning(true);
    thread.start();
  }
  
  @Override
  public void surfaceDestroyed(SurfaceHolder holder) {
  }
}
