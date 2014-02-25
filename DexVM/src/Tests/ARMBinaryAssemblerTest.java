/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;


import org.jnode.assembler.ARMBinaryAssembler;
/**
 *
 * @author TONGO
 */
public class ARMBinaryAssemblerTest {

    public ARMBinaryAssemblerTest() {
        ARMBinaryAssembler ba = new ARMBinaryAssembler();
        int i= ba.compileADD(0, 1, 2);
        System.out.println("TD: ADD in Binary:" + Integer.toBinaryString(i));
        System.out.println("TD: ADD:0x"+ Integer.toHexString(i).toUpperCase());
		
		int j= ba.compileADC(0, 1, 2);
        System.out.println("TD: ADC in Binary:" + Integer.toBinaryString(j));
        System.out.println("TD: ADC:0x"+ Integer.toHexString(j).toUpperCase());
		
		int k= ba.compileAND(0, 1, 2);
        System.out.println("TD: AND in Binary:" + Integer.toBinaryString(k));
        System.out.println("TD: AND:0x"+ Integer.toHexString(k).toUpperCase());
		
	    int l= ba.compileORR(0, 1, 2);
        System.out.println("TD: ORR in Binary:" + Integer.toBinaryString(l));
        System.out.println("TD: ORR:0x"+ Integer.toHexString(l).toUpperCase());
		 
		int m= ba.compileEOR(0, 1, 2);
        System.out.println("TD: EOR in Binary:" + Integer.toBinaryString(m));
        System.out.println("TD: EOR:0x"+ Integer.toHexString(m).toUpperCase());
		
		int n= ba.compileRSB(0, 1, 2);
        System.out.println("TD: RSB in Binary:" + Integer.toBinaryString(n));
        System.out.println("TD: RSB:0x"+ Integer.toHexString(n).toUpperCase());
    }
    public static void main(String args[])
    {
        ARMBinaryAssemblerTest  binary = new ARMBinaryAssemblerTest();
    }
    
    
}
