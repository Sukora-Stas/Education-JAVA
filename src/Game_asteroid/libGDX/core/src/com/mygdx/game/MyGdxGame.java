package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class MyGdxGame extends ApplicationAdapter {
    SpriteBatch batch;
    Background bg;
    Hero hero;
    private final int AST_COUNT = 30;
    Asteroid[] asteroids;
    Asteroid asteroid;
    private final int MAX_BULLETS = 20;
    public static Bullet[] bullets;
    private Texture texBullet;
    private final int MAX_FXES = 20;
    public static MyFX[] fxes;


    @Override
    public void create() {
        batch = new SpriteBatch();
        bg = new Background();
        hero = new Hero(new Vector2(150, 350));
        asteroids = new Asteroid[AST_COUNT];
        for (int i = 0; i < AST_COUNT; i++) {
            asteroids[i] = new Asteroid();
        }
        bullets = new Bullet[MAX_BULLETS];
        for (int i = 0; i < MAX_BULLETS; i++) {
            bullets[i] = new Bullet();
        }
        texBullet = new Texture("core/assets/bullet20.png");
        fxes = new MyFX[MAX_FXES];
        for (int i = 0; i < MAX_FXES; i++) {
            fxes[i] = new MyFX();
        }
    }

    @Override
    public void render() {
        update();
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        bg.render(batch);
        for (int i = 0; i < AST_COUNT; i++) {
            asteroids[i].render(batch);
        }
        hero.render(batch);
        for (int i = 0; i < MAX_BULLETS; i++) {
            if (bullets[i].isActive())
                batch.draw(texBullet, bullets[i].getPosition().x + 45, bullets[i].getPosition().y + 18);
        }
        for (int i = 0; i < MAX_FXES; i++) {
            fxes[i].render(batch);
        }
        batch.end();
    }

    public void update() {
        bg.update();
        hero.update();
        for (int i = 0; i < AST_COUNT; i++) {
            asteroids[i].update();
        }
        for (int i = 0; i < MAX_BULLETS; i++) {
            if (bullets[i].isActive())
                bullets[i].update();
        }
        for (int j = 0; j < AST_COUNT; j++) { //уничтожение героя
            if (asteroids[j].getRect().contains(hero.getPosition())) {
                hero.getDamage(1);   //жизнь у героя
                asteroids[j].recreate();
            }
        }
        for (int i = 0; i < MAX_BULLETS; i++) {
            if (bullets[i].isActive()) {
                for (int j = 0; j < AST_COUNT; j++) {
                    if (asteroids[j].getRect().contains(bullets[i].getPosition())) {
                        // asteroids[j].recreate();
                        asteroids[j].getDamage(1);   //жизнь у астеройдов
                        bullets[i].destroy();
                        for (int k = 0; k < MAX_FXES; k++) {
                            if (!fxes[k].isActive()) {
                                fxes[k].setup(bullets[i].getPosition().x, bullets[i].getPosition().y);
                                break;
                            }
                        }
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < MAX_FXES; i++) {
            fxes[i].update();
        }
    }
}