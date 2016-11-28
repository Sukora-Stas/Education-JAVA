package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Sukora Stas.
 */
public class Hero {
    private Texture texture;
    private Vector2 position;
    private float speed;
    private int fireCounter;
    private int fireRate;
    private int hp;

    public Hero(Vector2 position) {
        texture = new Texture("ship80x60.tga");
        speed = 6.0f;
        this.position = position;
        fireRate = 5;
        hp = 3;
    }

    public void render(SpriteBatch batch) {
        batch.setColor(1, 1 - (3 - hp) * 0.3f, 1 - (3 - hp) * 0.3f, 1);
        batch.draw(texture, position.x, position.y);
        batch.setColor(1, 1, 1, 1);
    }

    public void recreate() {
        position = new Vector2(150, 350);
        hp = 3;
    }

    public void getDamage(int dmg) {
        hp -= dmg;
        if (hp <= 0) {
            recreate();
        }
    }

    public Vector2 getPosition() {
        return position;
    }

    public void update() {
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            position.y += speed;
            if (position.y > Gdx.graphics.getHeight()) position.y = -40;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            position.x -= speed;
            if (position.x < 0) position.x = 0;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            position.x += speed;
            if (position.x > Gdx.graphics.getWidth() - 80) position.x = Gdx.graphics.getWidth() - 80;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            position.y -= speed;
            if (position.y < -40) position.y = Gdx.graphics.getHeight();
        }
        if (Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
            fireCounter++;
            if (fireCounter > fireRate) {
                fireCounter = 0;
                for (int i = 0; i < MyGdxGame.bullets.length; i++) {
                    if (!MyGdxGame.bullets[i].isActive()) {
                        MyGdxGame.bullets[i].setup(position.x, position.y);
                        break;
                    }
                }
            }
        }
    }
}