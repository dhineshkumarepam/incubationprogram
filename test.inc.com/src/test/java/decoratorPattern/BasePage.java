package decoratorPattern;

class BasePage implements PageComponent {
    private int rank;

    public BasePage(int rank) {
        this.rank = rank;
    }

    @Override
    public int calculateRank() {
        return rank;
    }
}

