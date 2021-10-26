package moleFarm.pattern.iterator.conc;

import moleFarm.MoleFarmBlock;
import moleFarm.pattern.iterator.Iterator;

import java.util.List;

public class FarmIterator implements Iterator {

    private List<MoleFarmBlock> farmBlockList;
    private int index = 0;

    public FarmIterator(List<MoleFarmBlock> list) {
        this.farmBlockList = list;
    }

    @Override
    public MoleFarmBlock first() {
        index = 0;
        MoleFarmBlock block = farmBlockList.get(index);
        return block;
    }

    @Override
    public MoleFarmBlock next() {
        MoleFarmBlock block = null;
        if (this.hasNext()) {
            block = farmBlockList.get(index++);
        }
        return block;
    }

    @Override
    public boolean hasNext() {
        return index < farmBlockList.size();
    }

    public MoleFarmBlock getByIndex(int index_) {
        if (index_ < 0 || index_ >= farmBlockList.size()) {
            throw new IndexOutOfBoundsException("索引超出范围！");
        } else {
            this.index = index_;
            System.out.println("农田块" + index + "：");
            return farmBlockList.get(index);
        }
    }
}
