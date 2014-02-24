/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jnode.assembler;

import org.jnode.assembler.ARMAssembler.DataProcessInstInfo;

/**
 *
 * @author TONGO
 */
public class ARMBinaryAssembler extends ARMAssembler implements ARMConstants, ARMOperation {

    
    public ARMBinaryAssembler() {}
    /**
     * ADD, SUB, RSB, ADC, SBC, and RSC Add, subtract, and reverse subtract,
     * each with or without carry. Syntax: op{cond}{S} Rd, Rn, Operand2 where:
     * op is one of ADD, SUB, RSB, ADC, SBC, or RSC. cond is an optional
     * condition code (see Conditional execution on page 4-4). S is an optional
     * suffix. If S is specified, the condition code flags are updated on the
     * result of the operation (see Conditional execution on page 4-4). Rd is
     * the ARM register for the result. Rn is the ARM register holding the first
     * operand. Operand2 is a flexible second operand. See Flexible second
     * operand on page 4-24 for details of the options. Usage The ADD
     * instruction adds the values in Rn and Operand2. The SUB instruction
     * subtracts the value of Operand2 from the value in Rn. The RSB (Reverse
     * SuBtract) instruction subtracts the value in Rn from the value of
     * Operand2. This is useful because of the wide range of options for
     * Operand2. ADC, SBC, and RSC are used to synthesize multiword arithmetic
     * (see Multiword arithmetic examples on page 4-28). The ADC (ADd with
     * Carry) instruction adds the values in Rn and Operand2, together with the
     * carry flag. The SBC (SuBtract with Carry) instruction subtracts the value
     * of Operand2 from the value in Rn. If the carry flag is clear, the result
     * is reduced by one. The RSC (Reverse Subtract with Carry) instruction
     * subtracts the value in Rn from the value of Operand2. If the carry flag
     * is clear, the result is reduced by one.
     *
     * @param Rn
     * @param Rd
     * @return
     */
    /**
     * The ADD instruction adds the values in Rn and Operand2.
     *
     */
    public int compileADD(int Rd, int Rn, int Rm) {
        DataProcessInstInfo data = new DataProcessInstInfo();
        data.cond = ARMConstants.always;
        data.imm = 0;
        data.opCode = ARMConstants.ADD;
        data.setConditionField = 0;
        data.Rd = Rd;
        data.Rn = Rn;
        data.shift= 0;
        data.Rm = Rm;

        int result = data.processDataProcessingInstructionSets();

        return result;
    }

    /**
     * The SUB instruction subtracts the value of Operand2 from the value in Rn.
     */
    public int compileSUB(int Rd, int Rn, int Rm) {
        DataProcessInstInfo data = new DataProcessInstInfo();
        data.cond = ARMConstants.always;
        data.imm = 0;
        data.opCode = ARMConstants.SUB;
        data.setConditionField = 0;
        data.Rd = Rd;
        data.Rn = Rn;
        data.shift = 0;
        data.Rm = Rm;

        int result = data.processDataProcessingInstructionSets();
        return result;
    }

    /**
     * The RSB (Reverse SuBtract) instruction subtracts the value in Rn from the
     * value of Operand2. This is useful because of the wide range of options
     * for Operand2.
     */
    public int compileRSB(int Rd, int Rn, int Rm) {

        DataProcessInstInfo data = new DataProcessInstInfo();
        data.opCode = ARMConstants.RSB;
        data.cond = ARMConstants.MVN;
        data.setConditionField = 0;
        data.Rd = Rd;
        data.Rn = Rn;
        data.shift = 0;
        data.Rm = Rm;

        int result = data.processDataProcessingInstructionSets();
        return result;
    }

    /**
     * The ADC (ADd with Carry) instruction adds the values in Rn and Operand2,
     * together with the carry flag. Hex Code :E0A11002 Binary Code
     * :1110-0000-1010-0001-0001-0000-0000-0010
     * 
     */
    public int compileADC(int Rd, int Rn, int Rm) {
        DataProcessInstInfo data = new DataProcessInstInfo();
        data.opCode = ARMConstants.ADC;
        data.cond = ARMConstants.always;
        data.setConditionField = 0;
        data.Rd = Rd;
        data.Rn = Rn;
        data.shift = 0;
        data.Rm = Rm;

        int result = data.processDataProcessingInstructionSets();
        return result;
    }

    /**
     * The SBC (SuBtract with Carry) instruction subtracts the value of Operand2
     * from the value in Rn. If the carry flag is clear, the result is reduced
     * by one.
     */
    public int compileSBC(int Rd, int Rn, int Rm) {
        DataProcessInstInfo data = new DataProcessInstInfo();
        data.opCode = ARMConstants.SBC;
        data.cond = ARMConstants.always;
        data.setConditionField = 0;
        data.Rd = Rd;
        data.Rn = Rn;
        data.shift = 0;
        data.Rm = Rm;

        int result = data.processDataProcessingInstructionSets();
        return result;
    }

    /**
     *
     * The SBC (SuBtract with Carry) instruction subtracts the value of Operand2
     * from the value in Rn. If the carry flag is clear, the result is reduced
     * by one.
     */
    public int compileSBCC(int Rd, int Rn, int Rm) {
        
        DataProcessInstInfo data = new DataProcessInstInfo();
        data.opCode = ARMConstants.SBC;
        data.cond = ARMConstants.carryClear;
        data.setConditionField = 0;
        data.Rd = Rd;
        data.Rn = Rn;
        data.shift= 0;
        data.Rm = Rm;

        int result = data.processDataProcessingInstructionSets();
        return result;
    }
    
    
    //Logical Operations
    public int compileAND(int Rd, int Rn, int Rm){
        DataProcessInstInfo data = new DataProcessInstInfo();
        data.opCode = ARMConstants.AND;
        data.cond = ARMConstants.MVN;
        data.setConditionField = 0;
        data.Rd = Rd;
        data.Rn = Rn;
        data.shift = 0;
        data.Rm = Rm;

        int result = data.processDataProcessingInstructionSets();
        return result;
    }
    
       public int compileORR(int Rd, int Rn, int Rm){
        DataProcessInstInfo data = new DataProcessInstInfo();
        data.opCode = ARMConstants.ORR;
        data.cond = ARMConstants.MVN;
        data.setConditionField = 0;
        data.Rd = Rd;
        data.Rn = Rn;
        data.shift = 0;
        data.Rm = Rm;

        int result = data.processDataProcessingInstructionSets();
        return result;
    }
    
}
