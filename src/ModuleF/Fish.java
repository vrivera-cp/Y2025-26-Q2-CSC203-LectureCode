package ModuleF;

public class Fish {
    private String scientificName;
    private String commonName;
    private int conservationStatus;

    public Fish(String scientificName, String commonName, int conservationStatus) {
        this.scientificName = scientificName;
        this.commonName = commonName;
        this.conservationStatus = conservationStatus;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public int getConservationStatus() {
        return conservationStatus;
    }

    public void setConservationStatus(int conservationStatus) {
        this.conservationStatus = conservationStatus;
    }

    public int getUpdatedStatus(int delta) {
        return conservationStatus + delta;
    }

    public String toString() {
        return String.format("Fish(%-24s, %-24s, %-2d)", scientificName, commonName, conservationStatus);
    }
}
