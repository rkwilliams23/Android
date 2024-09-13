package com.devtides.a2048clone;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class GameManager extends SurfaceView implements SurfaceHolder.Callback {
  
  private MainThread thread;
  
  public GameManager(Context context, AttributeSet attrs) {
    super(context, attrs);
    getHolder().addCallback(this);
  }

@Override
  public void surfaceCreated(SurfaceHolder holder) {
    thread = new MainThread(holder, gameManager: this);
    thread.setRunning(true);
    thread.start();
  }

  @Override
  public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
    thread.setSurfaceHolder(holder);
  }
  
  @Override
  public void surfaceDestroyed(SurfaceHolder holder) {
    boolean retry = true;
    while (retry) {
      try {
        thread.setRunning(false);
        thread.join();
        retry = flase;
      } catch(InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void update(){
    //System.out.println( x: "Test2048Clone Update");
  }

  @Override
  public void draw(Canvas canvas) {
    super.draw(canvas);
    //System.out.println("Test2048Clone draw")
  }
}
