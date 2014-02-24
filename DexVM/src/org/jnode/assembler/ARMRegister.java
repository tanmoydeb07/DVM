/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jnode.assembler;

/**
 *
 * @author TONGO
 */
public class ARMRegister implements ARMConstants {
    /*
     * 32-bit GPR registers
     */

    public static final GPR32 R0 = new GPR32("r0", 0);
    public static final GPR32 R1 = new GPR32("r1", 3);
    public static final GPR32 R2 = new GPR32("r2", 1);
    public static final GPR32 R3 = new GPR32("r3", 2);
    public static final GPR32 R4 = new GPR32("r4", 4);
    public static final GPR32 R5 = new GPR32("r5", 5);
    public static final GPR32 R6 = new GPR32("r6", 6);
    public static final GPR32 R7 = new GPR32("r7", 7);
    private String name;
    private final int nr;
    private final int size;

    public ARMRegister(String name, int size, int nr) {
        this.name = name;
        this.nr = nr;
        this.size = size;
    }

    /**
     * Returns the name.
     *
     * @return String
     */
    public final String getName() {
        return name;
    }

    /**
     * Returns the nr.
     *
     * @return int
     */
    public final int getNr() {
        return nr;
    }

    /**
     * Returns the size of this register
     *
     * @return int
     * @see X86Constants#BITS8
     * @see X86Constants#BITS16
     * @see X86Constants#BITS32
     */
    public final int getSize() {
        return size;
    }

    public final String toString() {
        return name;
    }

    public abstract static class GPR extends ARMRegister {

        /**
         * @param name
         * @param size
         * @param nr
         */
        public GPR(String name, int size, int nr) {
            super(name, size, nr);
        }
    }

    public static class GPR32 extends GPR {

        /**
         * @param name
         * @param nr
         */
        public GPR32(String name, int nr) {
            super(name, ARMConstants.BITS32, nr);
        }
    }
}
