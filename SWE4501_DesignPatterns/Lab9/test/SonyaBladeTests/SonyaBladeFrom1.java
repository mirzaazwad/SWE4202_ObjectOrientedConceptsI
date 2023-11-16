package Lab9.State.SonyaBladeTests;

import Lab9.State.Players.IPlayer;
import Lab9.State.Players.SonyaBlade;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SonyaBladeFrom1 {
    private IPlayer player;
    @BeforeEach
    public void init(){
        this.player=new SonyaBlade();
    }

    @Test
    public void testSwitch1to2(){
        String state=this.player.getState().onSwitchMartialArts2();
        assertEquals(state,"Switching to Tae Kwon Do");
        assertEquals(this.player.getState().toString(),"Tae Kwon Do");
    }

    @Test
    public void testSwitch1to1(){
        String state=this.player.getState().onSwitchMartialArts1();
        assertEquals(state,"Continue using Kenpo");
        assertEquals(this.player.getState().toString(),"Kenpo");
    }

    @Test
    public void testSwitch1to3(){
        String state=this.player.getState().onSwitchWeaponsMartialArts();
        assertEquals(state,"Switching to Kali Sticks");
        assertEquals(this.player.getState().toString(),"Kali Sticks");
    }
}
