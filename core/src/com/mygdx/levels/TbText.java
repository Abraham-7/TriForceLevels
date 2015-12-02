package com.mygdx.levels;

import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class TbText extends TextButton{
    int nch=0;
    String _text;
    public TbText(String text, Skin skin) {
        super(text, skin);
        _text = text;
        this.addListener(new ClickListener(){
            public void clicked(InputEvent e,float x,float y){
                System.out.println(_text);
                if(_text .equals("Easy")){
                    nch=1;
                    System.out.println(nch);
                }else if (_text.equals("Medium")){
                    nch=2;
                    System.out.println(nch);
                }else if(_text.equals("Hard")){
                    nch=3;
                    System.out.println(nch);

                }else if(_text.equals("Impossible")){
                    nch=4;
                    System.out.println(nch);
                }

            }
        } );
    }
}