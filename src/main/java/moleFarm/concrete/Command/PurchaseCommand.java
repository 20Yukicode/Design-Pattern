package moleFarm.concrete.Command;

/**
 * 具体命令
 * 仓库发送请求，向商店进货
 */
public class PurchaseCommand {
    //命令接收方，预期为商店，待完善
    private Object receiver;

    PurchaseCommand(){
        receiver = new Object();
    }
    //我有点纠结，命令发送方和接收方到底哪个设为仓库比较好
    public void execute(){
        //receiver.action();
    }
}
