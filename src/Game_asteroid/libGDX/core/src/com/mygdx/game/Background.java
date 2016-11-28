package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Sukora Stas.
 */
public class Background {
    class Star {
        private Vector2 position; // позиция Х и У
        private float speed;       //скорость движения

        public Star() {
            position = new Vector2((float) Math.random() * 1280, (float) Math.random() * 720);
            speed = 1.0f + (float) Math.random() * 9.0f;  //разная скорость
            //speed = 5.0f;
        }

        public void update() {
            position.x -= speed;
            //  position.y += (float)Math.sin(position.x/100.0f); //движение частиц
            if (position.x < -10) {
                position.x = 1300;
                position.y = (float) Math.random() * 720;
            }
        }
    }

    private final int STARS_COUNT = 220;
    private Star[] stars;
    private Texture texture;
    private Texture textureStar;

    public Background() {
        texture = new Texture("staticback.jpg");
        textureStar = new Texture("star12.tga");
        stars = new Star[STARS_COUNT];
        for (int i = 0; i < STARS_COUNT; i++) {
            stars[i] = new Star();
        }
    }

    public void render(SpriteBatch batch) {
        batch.draw(texture, 0, 0);
        for (int i = 0; i < STARS_COUNT; i++) {
            // batch.setColor(stars[i].position.x/1280f,stars[i].position.y/720f,0,1); //изменение цвета
            batch.draw(textureStar, stars[i].position.x, stars[i].position.y);
        }
    }

    public void update() {
        for (int i = 0; i < STARS_COUNT; i++) {
            stars[i].update();
        }
    }
}
