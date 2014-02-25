/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jnode.assembler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;

/**
 *
 * @author TONGO
 */
public class ARMAssembler extends NativeStream implements ARMConstants {

    /**
     * Current mode is ARM Mode 32Bit mode
     */
    protected final boolean armMode;
    //protected final ARMCpuID cpuId;
    //protected final Mode mode;

    public ARMAssembler() {
        this.armMode = true;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long getBaseAddr() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getLength() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public byte[] getBytes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void writeTo(OutputStream os) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ObjectRef getObjectRef(Object key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<? extends ObjectRef> getObjectRefs() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<?> getUnresolvedObjectRefs() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean hasUnresolvedObjectRefs() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ObjectRef setObjectRef(Object label) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void set64(int offset, long value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void set32(int offset, int value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void set16(int offset, int value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void set8(int offset, int value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setWord(int offset, long word) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void write64(long value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void write32(int value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void write16(int value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void write8(int value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void writeWord(long word) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void write(byte[] data, int ofs, int len) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void writeObjectRef(Object object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public class DataProcessInstInfo {

        public int cond;
        public int imm;
        public int opCode;
        public int setConditionField;
        public int Rn;
        public int Rd;
        public int shift;
        public int Rm;

        public DataProcessInstInfo() {
            cond = -1;
            imm = 0;
            opCode = 0;
            setConditionField = 0;
            Rn = 0;
            Rd = 0;
            shift = 0;
            Rm = 0;
        }

        /**
         * 31 28 27 26 25 24 21 20 19 16 15 12 11 0
         *
         *
         * @return
         */
        public int processDataProcessingInstructionSets() {
            int result = 0;

            result = result | (this.cond << 28);
            result = result | (this.imm << 25);
            result = result | (this.opCode << 21);
            result = result | (this.setConditionField << 19);
            result = result | (this.Rn << 16);
            result = result | (this.Rd << 11);
            result = result | (this.shift<< 3);
            result = result | (this.Rm);

            return result;
        }
    }

    public class BranchInstrInfo {
        
        public int cond;
        private final int opCode = 5;
        public int linkBit;
        public int offset;
        
        public BranchInstrInfo()
        {
            
        }
        
        public int processBranchInstInfo(BranchInstrInfo branchInstrInfo)
        {
            int result = 0;
            
			result = result | (branchInstrInfo.cond << 28);
			result = result | (branchInstrInfo.opCode << 26);
			result = result | (branchInstrInfo.linkBit << 25);
            result = result | (branchInstrInfo.offset);
                      
            return result;
        }        
    }

    /*
     * 
     */
    public class DataTransferInfo {
        int C, I, P, U, B, W, L, Rn, Rd, offset;
        
        public DataTransferInfo()
        {
            
        }
        
        public int processDataTransferInfo(DataTransferInfo trans)
        {
            int result = 0;
            
            result = result | trans.offset;
            result = result | (trans.Rd << 12);
            result = result | (trans.Rn << 16);
            result = result | (trans.L << 19);
            result = result | (trans.W << 20);
            result = result | (trans.B << 21);
            result = result | (trans.U << 22);
            result = result | (trans.P << 23);
            result = result | (trans.I << 24);
            result = result | (01 << 25);
            result = result | (trans.C << 28);
            return result;
        }
    }
    //@Override
    //public abstract void writeTo(OutputStream os);
    
    //public abstract void writeToOffset(OutputStream os, int offset);
}
