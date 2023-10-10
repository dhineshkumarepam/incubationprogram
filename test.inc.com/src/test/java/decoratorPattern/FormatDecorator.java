package decoratorPattern;

class FormatDecorator implements PageComponent {
    private PageComponent page;
    private int formatRank;

    public FormatDecorator(PageComponent page, String formatName, int formatRank) {
        this.page = page;
        this.formatRank = formatRank;
    }

    @Override
    public int calculateRank() {
        return page.calculateRank() + formatRank;
    }
}

