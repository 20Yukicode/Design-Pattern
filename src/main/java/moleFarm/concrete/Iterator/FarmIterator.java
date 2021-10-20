package moleFarm.concrete.Iterator;

import moleFarm.common.Iterator;
import moleFarm.common.MoleFarmBlock;

import java.util.List;

public class FarmIterator implements Iterator {

    private List<MoleFarmBlock> farmBlockList;
    private int index=0;
    public FarmIterator(List<MoleFarmBlock>list){
        this.farmBlockList=list;
    }
    @Override
    public MoleFarmBlock first() {
        index=0;
        MoleFarmBlock block = farmBlockList.get(index);
        return block;
    }

    @Override
    public MoleFarmBlock next() {
        MoleFarmBlock block = null;
        if(this.hasNext()){
            block = farmBlockList.get(index++);
        }
        return block;
    }

    @Override
    public boolean hasNext() {
        if(index>=farmBlockList.size()){
            return false;
        }
        return true;
    }
}
