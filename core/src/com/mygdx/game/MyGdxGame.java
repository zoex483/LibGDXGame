package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture myImg;

	int count;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		myImg = new Texture("mypic.png");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 1, 1, 1);

		float x = Gdx.input.getX() - myImg.getWidth() / 2;
		float y = Gdx.graphics.getHeight() - Gdx.input.getY() - myImg.getHeight()/2;

		if(Gdx.input.isButtonJustPressed(Input.Buttons.LEFT)){
			count++;
		}

		Gdx.graphics.setTitle("Button pressed " + count + " times");

		batch.begin();
		batch.draw(img, 0, 0);
		batch.draw(myImg, x, y);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
