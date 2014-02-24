/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jnode.assembler;

/**
 *
 * @author TONGO
 */
public interface ARMConstants {

    // Opcodes
    static final int AND = 0;//0000
    static final int EOR = 1;//0001
    static final int SUB = 2;//0010
    static final int RSB = 3;//0011
    static final int ADD = 4;//0100
    static final int ADC = 5;//0101
    static final int SBC = 6;//0110
    static final int RSC = 7;//0111
    static final int TST = 8;//1000
    static final int TEQ = 9;//1001
    static final int CMP = 10;//1010
    static final int CMN = 11;
    static final int ORR = 12;
    static final int MOV = 13;
    static final int BIC = 14;
    static final int MVN = 15;
    //Condition Fields
    public static final int equal = 0;
    public static final int never = 1;
    public static final int carrySet = 2;
    public static final int carryClear = 3;
    public static final int minus = 4;
    public static final int plus = 5;
    public static final int overflowSet = 6;
    public static final int overflowClear = 7;
    public static final int higher = 8;
    public static final int lowerOrSame = 9;
    public static final int greaterOrEqual = 10;
    public static final int lessThan = 11;
    public static final int greaterThan = 12;
    public static final int lessThanOrEqual = 13;
    public static final int always = 14;

    
    public static final int BITS32 = 0x00000004;

    public static enum Mode {
        // processor modes for bits 0-1 of PSR

        USR_MODE, // user
        FIQ_MODE, // fast interrupt request
        IRQ_MODE, // interrupt request
        SVC_MODE, // supervisor
    }

    public static final class State {

        private final int operandSize;
        /**
         * Use 32-bit code
         */
        public static final State CODE32 = new State(BITS32);

        private State(int operandSize) {
            this.operandSize = operandSize;
        }

        public boolean is32() {
            return (operandSize == BITS32);
        }

        public boolean is16() {
            return false;
        }

        public boolean isARMState() {
            return true;
        }

        public boolean isThumbState() {
            return false;
        }

        public boolean isThumb2State() {
            return false;
        }

        /**
         * Gets the size of this mode.
         *
         * @return BITS32 or BITS 16
         */
        public int getSize() {
            return operandSize;
        }
    }
}
