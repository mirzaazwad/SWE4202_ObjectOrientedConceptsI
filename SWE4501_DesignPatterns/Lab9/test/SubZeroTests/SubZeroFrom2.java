package Lab9.State.SubZeroTests;

import Lab9.State.Players.IPlayer;
import Lab9.State.Players.SubZero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubZeroFrom2 {
    private IPlayer player;
    @BeforeEach
    public void init(){
        this.player=new SubZero();
        this.player.getState().onSwitchMartialArts2();
    }

    @Test
    public void testSwitch2to2(){
        String state=this.player.getState().onSwitchMartialArts2();
        assertEquals(state,"Continue using Dragon");
        assertEquals(this.player.getState().toString(),"Dragon");
    }

    @Test
    public void testSwitch2to1(){
        String state=this.player.getState().onSwitchMartialArts1();
        assertEquals(state,"Switching to Shotokan");
        assertEquals(this.player.getState().toString(),"Shotokan");
    }

    @Test
    public void testSwitch2o3(){
        String state=this.player.getState().onSwitchWeaponsMartialArts();
        assertEquals(state,"Switching to Kori Blade");
        assertEquals(this.player.getState().toString(),"Kori Blade");
    }
}
