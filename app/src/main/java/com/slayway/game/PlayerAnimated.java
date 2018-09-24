package com.slayway.game;

import android.graphics.Bitmap;
import android.graphics.Rect;

public class PlayerAnimated {

   private static final String TAG = PlayerAnimated.class.getSimpleName();

   private Bitmap bitmap; // png с игроком, в котором лежат все кадры
   private Rect sourceRect; // прямоугольная область, очерчивающая нужный кадр
   private int frameNr; // число кадров в анимации
   private int currentFrame; // текущий кадр
   private long frameTicker; //время обновления последнего кадра
   private int framePeriod; // сколько миллисекунд должно пройти перед сменой кадра(1000/fps), где fps - число кадров спрайта

   private int spriteWidth; // ширина спрайта
   private int spriteHeight; // высота спрайта

   private int x;// X (верхний левый угол картинки)
   private int y;// Y (верхний левый угол картинки)

   public PlayerAnimated(Bitmap bitmap, int x, int y, int width, int height, int fps, int frameCount){
       this.bitmap= bitmap;
       this.x= x;
       this.y= y;
       currentFrame=0;
       frameNr = frameCount;
       spriteWidth = bitmap.getWidth()/ frameCount;
       spriteHeight = bitmap.getHeight();
       sourceRect = new Rect(0,0, spriteWidth, spriteHeight);
       framePeriod =1000/ fps;
       frameTicker = 0l;
   }

}
