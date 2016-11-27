package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class MyGdxGame extends ApplicationAdapter {
    SpriteBatch batch;
    Background bg;
    Hero hero;
    private final int AST_COUNT = 20;
    Asteroid[] asteroids;

    @Override
    public void create() {
        batch = new SpriteBatch();
        bg = new Background();
        hero = new Hero(new Vector2(100, 100));
        asteroids = new Asteroid[AST_COUNT];
        for (int i = 0; i < AST_COUNT; i++) {
            asteroids[i] = new Asteroid();
        }
    }

    @Override
    public void render() {
        update();
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        bg.render(batch);
        hero.render(batch);
        for (int i = 0; i < AST_COUNT; i++) {
            asteroids[i].render(batch);
        }

        batch.end();
    }

    public void update() {
        bg.update();
        hero.update();
        for (int i = 0; i < AST_COUNT; i++) {
            asteroids[i].update();
        }
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
