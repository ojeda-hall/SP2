public abstract class Title {
    protected String literatureType;
    protected int copies;
    protected static final double RATE = 0.067574;

    public Title(String literatureType, int copies) {
        this.literatureType = literatureType;
        this.copies = copies;
    }

    public double calculateRoyalties() {
        double points = this.calculatePoints();
        return points * 0.067574;
    }

    protected abstract double calculatePoints();

    protected double calculateLiteraturePoints() {
        double var10000;
        switch (this.literatureType) {
            case "BI":
            case "TE":
                var10000 = (double)3.0F;
                break;
            case "LYRIK":
                var10000 = (double)6.0F;
                break;
            case "SKØN":
                var10000 = 1.7;
                break;
            case "FAG":
                var10000 = (double)1.0F;
                break;
            default:
                var10000 = (double)0.0F;
        }

        return var10000;
    }
}
