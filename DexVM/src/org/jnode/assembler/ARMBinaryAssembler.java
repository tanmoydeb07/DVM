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
public class ARMBinaryAssembler extends ARMAssembler implements ARMConstants, ARMOperation
{

	public ARMBinaryAssembler()
	{
	}

	//Arithmatic Operations
	/**
	 * The ADD instruction adds the values in Rn and Operand2.
	 *
	 */
	public int compileADD(int Rd, int Rn, int Rm)
	{
		DataProcessInstInfo data = new DataProcessInstInfo();
		data.cond = ARMConstants.always;
		data.imm = 0;
		data.opCode = ARMConstants.ADD;
		data.setConditionField = 0;
		data.Rd = Rd;
		data.Rn = Rn;
		data.shift = 0;
		data.Rm = Rm;

		int result = data.processDataProcessingInstructionSets();

		return result;
	}

	/**
	 * The SUB instruction subtracts the value of Operand2 from the value in Rn.
	 */
	public int compileSUB(int Rd, int Rn, int Rm)
	{
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
	public int compileRSB(int Rd, int Rn, int Rm)
	{
		DataProcessInstInfo data = new DataProcessInstInfo();
		data.cond = ARMConstants.always;
		data.imm = 0;
		data.opCode = ARMConstants.RSB;
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
	public int compileADC(int Rd, int Rn, int Rm)
	{
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
	public int compileSBC(int Rd, int Rn, int Rm)
	{
		DataProcessInstInfo data = new DataProcessInstInfo();
		data.cond = ARMConstants.always;
		data.imm = 0;
		data.opCode = ARMConstants.SBC;
		data.setConditionField = 0;
		data.Rd = Rd;
		data.Rn = Rn;
		data.shift = 0;
		data.Rm = Rm;
		int result = data.processDataProcessingInstructionSets();
		return result;
	}

	public int compileRSC(int Rd, int Rn, int Rm)
	{
		DataProcessInstInfo data = new DataProcessInstInfo();
		data.cond = ARMConstants.always;
		data.imm = 0;
		data.opCode = ARMConstants.RSC;
		data.setConditionField = 0;
		data.Rd = Rd;
		data.Rn = Rn;
		data.shift = 0;
		data.Rm = Rm;
		int result = data.processDataProcessingInstructionSets();
		return result;
	}

	public int compileORR(int Rd, int Rn, int Rm)
	{
		DataProcessInstInfo data = new DataProcessInstInfo();
		data.cond = ARMConstants.always;
		data.imm = 0;
		data.opCode = ARMConstants.ORR;
		data.setConditionField = 0;
		data.Rd = Rd;
		data.Rn = Rn;
		data.shift = 0;
		data.Rm = Rm;
		int result = data.processDataProcessingInstructionSets();
		return result;
	}

	public int compileEOR(int Rd, int Rn, int Rm)
	{
		DataProcessInstInfo data = new DataProcessInstInfo();
		data.cond = ARMConstants.always;
		data.imm = 0;
		data.opCode = ARMConstants.EOR;
		data.setConditionField = 0;
		data.Rd = Rd;
		data.Rn = Rn;
		data.shift = 0;
		data.Rm = Rm;
		int result = data.processDataProcessingInstructionSets();
		return result;
	}
	
	public int compileAND(int Rd, int Rn, int Rm)
	{
		DataProcessInstInfo data = new DataProcessInstInfo();
		data.cond = ARMConstants.always;
		data.imm = 0;
		data.opCode = ARMConstants.AND;
		data.setConditionField = 0;
		data.Rd = Rd;
		data.Rn = Rn;
		data.shift = 0;
		data.Rm = Rm;
		int result = data.processDataProcessingInstructionSets();
		return result;
	}
	
	
	//Compare Operations
	public int compileCMP(int Rd, int Rn, int Rm)
	{
		DataProcessInstInfo data = new DataProcessInstInfo();
		data.cond = ARMConstants.always;
		data.imm = 0;
		data.opCode = ARMConstants.CMP;
		data.setConditionField = 0;
		data.Rd = Rd;
		data.Rn = Rn;
		data.shift = 0;
		data.Rm = Rm;
		int result = data.processDataProcessingInstructionSets();
		return result;
	}
	
	public int compileCMN(int Rd, int Rn, int Rm)
	{
		DataProcessInstInfo data = new DataProcessInstInfo();
		data.cond = ARMConstants.always;
		data.imm = 0;
		data.opCode = ARMConstants.CMN;
		data.setConditionField = 0;
		data.Rd = Rd;
		data.Rn = Rn;
		data.shift = 0;
		data.Rm = Rm;
		int result = data.processDataProcessingInstructionSets();
		return result;
	}
	
	//Move operaions
	public int compileMOV(int Rd, int Rn, int Rm)
	{
		DataProcessInstInfo data = new DataProcessInstInfo();
		data.cond = ARMConstants.always;
		data.imm = 0;
		data.opCode = ARMConstants.MOV;
		data.setConditionField = 0;
		data.Rd = Rd;
		data.Rn = Rn;
		data.shift = 0;
		data.Rm = Rm;
		int result = data.processDataProcessingInstructionSets();
		return result;
	}
	
	public int compileMVN(int Rd, int Rn, int Rm)
	{
		DataProcessInstInfo data = new DataProcessInstInfo();
		data.cond = ARMConstants.always;
		data.imm = 0;
		data.opCode = ARMConstants.MVN;
		data.setConditionField = 0;
		data.Rd = Rd;
		data.Rn = Rn;
		data.shift = 0;
		data.Rm = Rm;
		int result = data.processDataProcessingInstructionSets();
		return result;
	}
	
	/**
	 * bic
	 * Bitwise bit clear
	 */
	public int compileBIC(int Rd, int Rn, int Rm)
	{
		DataProcessInstInfo data = new DataProcessInstInfo();
		data.cond = ARMConstants.always;
		data.imm = 0;
		data.opCode = ARMConstants.BIC;
		data.setConditionField = 0;
		data.Rd = Rd;
		data.Rn = Rn;
		data.shift = 0;
		data.Rm = Rm;
		int result = data.processDataProcessingInstructionSets();
		return result;
	}
	
	
	//Immiediate Value based Instructions
	//I bit is 1
	/**
	 * The ADD instruction adds the values in Rn and Operand2.
	 *
	 */
	public int compileADDImm(int Rd, int Rn, int Imm)
	{
		DataProcessInstInfo data = new DataProcessInstInfo();
		data.cond = ARMConstants.always;
		data.imm = 1;
		data.opCode = ARMConstants.ADD;
		data.setConditionField = 0;
		data.Rd = Rd;
		data.Rn = Rn;
		data.shift = 0;
		data.Rm = Imm;

		int result = data.processDataProcessingInstructionSets();

		return result;
	}
	
	public int compileADCImm(int Rd, int Rn, int Imm)
	{
		DataProcessInstInfo data = new DataProcessInstInfo();
		data.opCode = ARMConstants.ADC;
		data.cond = ARMConstants.always;
		data.setConditionField = 0;
		data.Rd = Rd;
		data.Rn = Rn;
		data.shift = 0;
		data.Rm = Imm;

		int result = data.processDataProcessingInstructionSets();
		return result;
	}
	
	public int compileANDImm(int Rd, int Rn, int Imm)
	{
		DataProcessInstInfo data = new DataProcessInstInfo();
		data.cond = ARMConstants.always;
		data.imm = 0;
		data.opCode = ARMConstants.AND;
		data.setConditionField = 0;
		data.Rd = Rd;
		data.Rn = Rn;
		data.shift = 0;
		data.Rm = Imm;
		int result = data.processDataProcessingInstructionSets();
		return result;
	}
	
	public int compileMOVImm(int Rd, int Rn, int Imm)
	{
		DataProcessInstInfo data = new DataProcessInstInfo();
		data.cond = ARMConstants.always;
		data.imm = 0;
		data.opCode = ARMConstants.MOV;
		data.setConditionField = 0;
		data.Rd = Rd;
		data.Rn = Rn;
		data.shift = 0;
		data.Rm = Imm;
		int result = data.processDataProcessingInstructionSets();
		return result;
	}

	public int compileORRImm(int Rd, int Rn, int Imm)
	{
		DataProcessInstInfo data = new DataProcessInstInfo();
		data.cond = ARMConstants.always;
		data.imm = 0;
		data.opCode = ARMConstants.ORR;
		data.setConditionField = 0;
		data.Rd = Rd;
		data.Rn = Rn;
		data.shift = 0;
		data.Rm = Imm;
		int result = data.processDataProcessingInstructionSets();
		return result;
	}
	
	//

}
