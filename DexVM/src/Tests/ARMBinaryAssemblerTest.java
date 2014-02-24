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
        int i= ba.compileSUB(3, 1, 2);
        System.out.println("TD: ADD in Binary:" + Integer.toBinaryString(i));
        System.out.println("TD: ADD:0x"+ Integer.toHexString(i).toUpperCase());
    }
    public static void main(String args[])
    {
        ARMBinaryAssemblerTest  binary = new ARMBinaryAssemblerTest();
    }
    
    
}
