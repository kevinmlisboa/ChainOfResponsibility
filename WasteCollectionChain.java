public class WasteCollectionChain {
    private WasteCollector firstCollector;

    public WasteCollectionChain() {
        this.firstCollector = new OrganicCollector();
        WasteCollector recyclableCollector = new RecycleCollector();
        WasteCollector hazardousCollector = new HazardousCollector();

        firstCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);
    }

    public void collectWaste(WasteContainer container) {
        firstCollector.collectWaste(container);
    }
}
