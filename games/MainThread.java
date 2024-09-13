package com.devtides.a2048clone;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

public class ManinThread extends Threads {
  
  private SurfaceHolder surfaceHolder;
  private GameManager gameManager;
  private int targetFPS = 60;
  private Canvas canvas;
  private boolean running;
  
  public MainThread(SurfaceHolder surfaceHolder, GameManager gameManager) {
    super();
    this.surfaceHolder = surfaceHolder;
    this.gameManager = gameManager;
  }
  
  public void setRunning(boolean isRunning) {
    running = isRunning;
  }
  
  public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
    this.surfaceHolder = surfaceHolder;
  }
}
