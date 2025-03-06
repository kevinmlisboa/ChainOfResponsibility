public class WasteManagementSystem {
    public static void main(String[] args) {
        WasteCollectionChain wasteCollection = new WasteCollectionChain();

        WasteContainer organicBin = new WasteContainer("organic", 100);
        WasteContainer recyclableBin = new WasteContainer("recyclable", 80);
        WasteContainer hazardousBin = new WasteContainer("hazardous", 90);
        WasteContainer unknownBin = new WasteContainer("unknown", 60);

        System.out.println("Processing Waste Collection Requests:");
        wasteCollection.collectWaste(organicBin);
        wasteCollection.collectWaste(recyclableBin);
        wasteCollection.collectWaste(hazardousBin);
        wasteCollection.collectWaste(unknownBin); 
    }
}
