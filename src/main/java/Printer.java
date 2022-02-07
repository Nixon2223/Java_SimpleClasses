public class Printer {
    private int sheets;
    private int toner;

    public Printer(int sheets, int toner){
        this.toner = toner;
        this.sheets = sheets;
    }

    public int getSheets() {
        return this.sheets;
    }

    public int getToner(){
        return this.toner;
    }

    public void print(int sheets, int copies){
        int totalSheets = sheets * copies;
        if (totalSheets <= this.sheets && toner >= totalSheets){
            this.sheets -= totalSheets;
            this.toner -= totalSheets;
        }
    }
}
