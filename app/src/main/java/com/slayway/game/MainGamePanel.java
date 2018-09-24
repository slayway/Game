package com.slayway.game;
import android.view.SurfaceView;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceHolder;

public class MainGamePanel extends SurfaceView implements
            SurfaceHolder.Callback {

        public MainGamePanel(Context context) {
            super(context);
            // Добавляем этот класс, как содержащий функцию обратного
            // вызова для взаимодействия с событиями
            getHolder().addCallback(this);
            // делаем GamePanel focusable, чтобы она могла обрабатывать сообщения
            setFocusable(true);
        }

        @Override
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        }

        @Override
        public void surfaceCreated(SurfaceHolder holder) {
        }

        @Override
        public void surfaceDestroyed(SurfaceHolder holder) {
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            return super.onTouchEvent(event);
        }

        @Override
        protected void onDraw(Canvas canvas) {
        }
}


