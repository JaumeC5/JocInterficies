package com.rtypelite.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;



public class RTypeLite extends ApplicationAdapter {

	private InputProcesador inputprac;



	SpriteBatch batch;
	//Texture img;
	//Texture imgprota;
	//Sprite prota;

	Texture imgspaceship;
	Sprite spaceship;
	Texture imgspace;
	Sprite space;

	MainCharacter ship;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		//img = new Texture("badlogic.jpg");

		//imgprota = new Texture("badlogic.jpg");
		//prota = new Sprite(imgprota);

		imgspace = new Texture("space.png");
		space = new Sprite(imgspace);

		imgspaceship = new Texture("spaceship.png");
		spaceship = new Sprite(imgspaceship);
		spaceship.setScale(0.2f, 0.2f);
		spaceship.setPosition(0,0);

		ship = new MainCharacter();

		inputprac = new InputProcesador(ship); //ship es un MainCharacter
		Gdx.input.setInputProcessor(inputprac);

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		//prota.setPosition(Gdx.graphics.getWidth()/2 - prota.getWidth()/2, Gdx.graphics.getHeight()/2 - prota.getHeight()/2);
		//input();



		batch.begin();
		space.draw(batch);
		//batch.draw(imgprota, 0, 0);
		//prota.draw(batch);
		spaceship.draw(batch);

		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		//imgprota.dispose();
	}

	public void input(){
		if (Gdx.input.isTouched()){
			if(Gdx.input.getX() < Gdx.graphics.getWidth()/2){
				//prota.setRotation(prota.getRotation() + 5);
			}
			else {
				//prota.setRotation(prota.getRotation() - 5);
			}
		}
	}



}
