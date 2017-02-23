package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Sukora Stas.
 */
public class Asteroid {
    private static Texture texture;
    private Vector2 position;
    private float speed;
    private float ang;
    private Rectangle rect;
    private int hp;
    private float size;

    public Rectangle getRect() {
        return rect;
    }

    public Asteroid() {
        if (texture == null)
            texture = new Texture("core/assets/asteroid60.tga");
        speed = 1.0f + (float) Math.random() * 7.0f;
        position = new Vector2(1280 + (float) Math.random() * 640, (float) Math.random() * 720);
        ang = (float) Math.random() * 360;
        rect = new Rectangle(position.x, position.y, 60, 60);
        hp = 3;
        size = 0.5f + (float) Math.random() * 1.2f;
    }

    public void render(SpriteBatch batch) {
        batch.setColor(1, 1 - (3 - hp) * 0.3f, 1 - (3 - hp) * 0.3f, 1);
        batch.draw(texture, position.x+30, position.y+30, 30, 30, 60, 60, size, size, ang, 0, 0, 60, 60, false, false);
        batch.setColor(1, 1, 1, 1);
    }

    public void recreate() {
        position.x = 1280 + (float) Math.random() * 640;
        position.y = (float) Math.random() * 720;
        hp = 3;
        size = 0.5f + (float) Math.random() * 1.2f;
    }

    public void getDamage(int dmg) {
        hp -= dmg;
        if (hp <= 0) {
            recreate();
        }
    }

    public void update() {
        position.x -= speed;
        ang += speed;
        if (position.x < -90) {
            recreate();
        }
        rect.x = position.x;
        rect.y = position.y;
    }

}
