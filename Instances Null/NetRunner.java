class NetRunner{
    public static void main(String[] args){

        Net net = new Net();
        NetRun netRun = new NetRun();
        netRun.showDetails(net);
        net = null;
        netRun.showDetails(net);
    }
}