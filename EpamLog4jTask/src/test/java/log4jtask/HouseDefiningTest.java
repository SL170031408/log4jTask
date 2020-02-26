package log4jtask;

import static org.junit.Assert.*;


import org.junit.Test;


public class HouseDefiningTest {
    HouseDefining t=new HouseDefining();
    
	@Test
	public void testCost() {
		assertEquals(475000.0,t.cost("It_ is_High_Standard_Material" , 190, "fully automated home"),0);
		assertEquals(649000.0,t.cost("It_is_StandardMaterials",145,"not"),0);
		assertEquals(836500.0,t.cost("It_is_above standard materials",125,"not"),0);
		assertEquals(1032700.0,t.cost("It_is_high standard",109,"not"),0);

}
}