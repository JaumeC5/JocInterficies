package com.rtypelite.game;

import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by jcompany on 12/18/2017.
 */

public class InputProcesador extends InputAdapter {

    private MainCharacter personaje;
    private Vector2 lastTouch = new Vector2();


    public InputProcesador(MainCharacter k)
    {
        personaje = k;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button){
        lastTouch.set(screenX, screenY);
        return true;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer){
        Vector2 newTouch = new Vector2(screenX, screenY);
        Vector2 delta = newTouch.cpy().sub(lastTouch);
        lastTouch = newTouch;
        if (delta.y < 0) {
            personaje.goUp();
        }
        else {
            personaje.goDown();
        }
        return true;
    }

}
