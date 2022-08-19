package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

//task1
public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	int clk;
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {

		ScreenUtils.clear(1, 0, 0, 1);
		float x = (Gdx.graphics.getWidth() - img.getWidth())/2 ;
		//float y = Gdx.graphics.getHeight()-Gdx.input.getY()- img.getHeight()/2;
		if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)) clk++;
		Gdx.graphics.setTitle("Clicked" +clk+ "times");
		batch.begin();
		batch.draw(img, x, 0);
		//batch.draw(img, x, y);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
