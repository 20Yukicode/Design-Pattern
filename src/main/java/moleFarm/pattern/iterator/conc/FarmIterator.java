package moleFarm.pattern.iterator.conc;

import moleFarm.MoleFarmBlock;
import moleFarm.pattern.iterator.Iterator;

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
        return index < farmBlockList.size();
    }
}
