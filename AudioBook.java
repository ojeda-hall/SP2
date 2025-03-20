public class AudioBook extends Title {
    private int durationInMinutes;

    public AudioBook(String literatureType, int copies, int durationInMinutes) {
        super(literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    protected double calculatePoints() {
        double var10000;
        switch (this.literatureType) {
            case "BI":
            case "TE":
                var10000 = (double)1.5F;
                break;
            case "LYRIK":
                var10000 = (double)3.0F;
                break;
            case "SKØN":
                var10000 = 0.85;
                break;
            case "FAG":
                var10000 = (double)0.5F;
                break;
            default:
                var10000 = (double)0.0F;
        }

        double literaturePoint = var10000;
        return (double)this.durationInMinutes * (double)0.5F * literaturePoint * (double)this.copies;
    }
}