package com.rtypelite.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Stage;

import java.util.ArrayList;
import java.util.Vector;


public class RTypeLite extends Game {

	private InputProcesador inputprac;
	private Stage stage;

	private AssetManager manager;
	private AssetsManager assets;
	private EnemyManager enemiesM;
	private ShotsManager shotsM;

	public static MainCharacter player;
	private GreenEnemy gEnemy;
	private OrangeEnemy oEnemy;


	//public static Vector<Enemy> enemies = new Vector<Enemy>();


	@Override
	public void create () {
		stage = new Stage();
		assets = new AssetsManager();
		enemiesM = new EnemyManager(assets, stage);
		shotsM = new ShotsManager(assets, stage);

		manager = new AssetManager();
		manager.load("spaceship.png", Texture.class);
		manager.load("enemyOrange2.png", Texture.class);
		manager.load("enemyGreen2.png", Texture.class);
		manager.finishLoading();

		//Player
		player = new MainCharacter(assets.texturePlayer);
		stage.addActor(player);
		player.setRotation(270);
		player.setPosition(20, Gdx.graphics.getHeight() / 2);

		stage.addActor(shotsM);
		stage.addActor(enemiesM);

		inputprac = new InputProcesador(player);
		Gdx.input.setInputProcessor(inputprac);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		super.render();

		stage.draw();

		stage.act();


	}
	
	@Override
	public void dispose () {
		super.dispose();
		assets.texturePlayer.dispose();
		assets.textureGreenEnemy.dispose();
		assets.textureOrangeEnemy.dispose();
		stage.dispose();

	}

}
